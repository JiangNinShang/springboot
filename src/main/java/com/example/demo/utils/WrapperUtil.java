package com.example.demo.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.config.JettyConfig;
import com.example.demo.enumerate.WrapperEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: JNS
 * @date: 2021年09月09日 10:50
 */
public class WrapperUtil {
    @Autowired
    private WrapperEnum wrapperEnum;
    public static final Logger logger = LogManager.getLogger(WrapperUtil.class);
    /**
     * @param fildName   字段名
     * @param dateObj    值
     * @param conditions 条件
     * @return
     */
    public static QueryWrapper getWrapper(String fildName, List<Object> dateObj, String conditions) {
        QueryWrapper queryWrapper = new QueryWrapper();
        try{
            switch (conditions) {
//            case "allEq":
//                break;
                case "eq":
                    queryWrapper.eq(fildName, dateObj.get(0));
                    break;
                case "ne":
                    queryWrapper.ne(fildName, dateObj.get(0));
                    break;
                case "gt":
                    queryWrapper.gt(fildName, dateObj.get(0));
                    break;
                case "ge":
                    queryWrapper.ge(fildName, dateObj.get(0));
                    break;
                case "lt":
                    queryWrapper.lt(fildName, dateObj.get(0));
                    break;
                case "le":
                    queryWrapper.le(fildName, dateObj.get(0));
                    break;
                case "between":
                    queryWrapper.between(fildName, dateObj.get(0), dateObj.get(1));
                    break;
                case "notBetween":
                    queryWrapper.notBetween(fildName, dateObj.get(0), dateObj.get(1));
                    break;
                case "like":
                    queryWrapper.like(fildName, dateObj.get(0));
                    break;
                case "noLike":
                    queryWrapper.notLike(fildName, dateObj.get(0));
                    break;
                case "likeLeft":
                    queryWrapper.likeLeft(fildName, dateObj.get(0));
                    break;
                case "likeRight":
                    queryWrapper.likeRight(fildName, dateObj.get(0));
                    break;
                case "isNull":
                    queryWrapper.isNull(fildName);
                    break;
                case "isNotNull":
                    queryWrapper.isNotNull(fildName);
                    break;
//            case "in":
//                break;
//            case "notIn":
//                break;
//            case "inSql":
//                break;
//            case "notInSql":
//                break;
//            case "groupBy":
//                break;
//            case "orderByAsc":
//                break;
//            case "orderByDesc":
//                break;
//            case "orderBy":
//                break;
//            case "having":
//                break;
//            case "func":
//                break;
//            case "or":
//                break;
//            case "and":
//                break;
//            case "nested":
//                break;
                case "apply":
                    queryWrapper.apply(fildName, dateObj.get(0));
                    break;
//            case "last":
//                break;
                case "exists":
                    queryWrapper.exists(fildName, dateObj.get(0));
                    break;
                case "notExists":
                    queryWrapper.notExists(fildName, dateObj.get(0));
                    break;
                default:
                    queryWrapper.eq(fildName, dateObj.get(0));
                    break;
            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return queryWrapper;
    }
}