package com.example.demo.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.http.HttpScheme;
import org.eclipse.jetty.http.HttpVersion;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;
import java.io.Serializable;

/**
 * @author: JNS
 * @date: 2021年09月08日 0:28
 */
@Configuration
public class JettyConfig implements Serializable {
    @Autowired
    private ServerConfig serverConfig;
    public static final Logger logger = LogManager.getLogger(JettyConfig.class);

    /**
     * 通过构造工厂造1个jetty
     */
    @Bean
    public ServletWebServerFactory servletContainer() {
        JettyServletWebServerFactory jetty = new JettyServletWebServerFactory();
        try {
            customizeJetty(jetty);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return jetty;
    }

    /**
     * 为jetty服务器开通http端口和https,并配置线程
     */

    public void customizeJetty(JettyServletWebServerFactory container) {
        try {
            container.addServerCustomizers((Server server) -> {
                //配置线程
                threadPool(server);
                // 添加HTTP配置
                ServerConnector connector = new ServerConnector(server);
                connector.setPort(8888);
                // 添加HTTPS配置
                SslContextFactory sslContextFactory = new SslContextFactory();
                sslContextFactory.setKeyStorePath(serverConfig.getPath());
                sslContextFactory.setKeyStorePassword(serverConfig.getPassword());
                HttpConfiguration config = new HttpConfiguration();
                config.setSecureScheme(HttpScheme.HTTPS.asString());
                config.addCustomizer(new SecureRequestCustomizer());
                ServerConnector sslConnector = new ServerConnector(
                        server,
                        new SslConnectionFactory(sslContextFactory, HttpVersion.HTTP_1_1.asString()),
                        new HttpConnectionFactory(config));
                sslConnector.setPort(serverConfig.getPort());
                server.setConnectors(new Connector[]{connector, sslConnector});
            });
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    /**
     * jetty线程配置
     */
    private void threadPool(Server server) {
        try {
            // connections
            final QueuedThreadPool threadPool = server.getBean(QueuedThreadPool.class);
            //默认最大线程连接数200
            threadPool.setMaxThreads(300);
            //默认最小线程连接数8
            threadPool.setMinThreads(15);
            //默认线程最大空闲时间60000ms
            threadPool.setIdleTimeout(60000);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    /**
     * 配置文件上传
     */
    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        try {
            //  单个数据大小
            factory.setMaxFileSize(DataSize.parse("100MB"));
            /// 总上传数据大小
            factory.setMaxRequestSize(DataSize.parse("200MB"));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return factory.createMultipartConfig();
    }
}