package com.giao.wuhu.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.giao.wuhu.bean.Wuser;

/**
 * @author: JNS
 * @date: 2021年09月09日 10:39
 */
public interface WuserService extends CommonService {
    Wuser getUser(QueryWrapper<Wuser> queryWrapper);

    Wuser Login(Wuser wuser);
}