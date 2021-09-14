package com.giao.wuhu.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 代码执行耗时统计工具
 *
 * @author jns
 * @version 1.0
 * @date 2021/9/6 17:51
 */
public class TimerStat implements Serializable {

    /**
     * 当前线程绑定ThreadLocal
     */
    private static final ThreadLocal<List<Long>> TIMER_STAT_THREAD_LOCAL = new ThreadLocal();

    /**
     * 耗时统计-开始
     *
     * @return time 开始时间
     */
    public static long start() {
        // 系统当前时间
        long time = System.currentTimeMillis();
        // 从threadLocal取值
        List<Long> times = TIMER_STAT_THREAD_LOCAL.get();
        // 第一次统计耗时
        if (Objects.isNull(times)) {
            times = new ArrayList<>();
            TIMER_STAT_THREAD_LOCAL.set(times);
        }
        // 将time添加到list，支持嵌套
        times.add(time);
        return time;
    }

    /**
     * 耗时统计-结束
     *
     * @return time 结束时间
     */
    public static long end() {
        // 从threadLocal取值
        List<Long> times = TIMER_STAT_THREAD_LOCAL.get();
        if (Objects.nonNull(times)) {
            // 支持嵌套，从最后一个开始取值
            Long time = times.remove(times.size() - 1);
            long end = System.currentTimeMillis();
            time = end - time;
            return time;
        }
        return -1L;
    }
}