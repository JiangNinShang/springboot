package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.bean.Wuser;
import com.example.demo.mapper.WuserMapper;
import com.example.demo.service.WuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: JNS
 * @date: 2021年09月09日 10:41
 */
@Service
public class WuserServiceImpl implements WuserService {
    @Autowired
    private WuserMapper wuserMapper;

    @Override
    public Wuser getUser(QueryWrapper<Wuser> queryWrapper) {
        return wuserMapper.selectOne(queryWrapper);
    }

    @Override
    public Wuser Login(Wuser wuser) {
        QueryWrapper<Wuser> wrapper = new QueryWrapper<>();
        wrapper.eq("name", wuser.getName());
        wrapper.eq("pwd", wuser.getPwd());
        return wuserMapper.selectOne(wrapper);
    }
}