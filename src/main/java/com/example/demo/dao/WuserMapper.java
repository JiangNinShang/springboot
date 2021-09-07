package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.Wuser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WuserMapper extends BaseMapper<Wuser> {
}
