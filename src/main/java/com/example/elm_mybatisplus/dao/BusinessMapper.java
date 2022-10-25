package com.example.elm_mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm_mybatisplus.pojo.Business;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessMapper extends BaseMapper<Business> {
    Business queryBusinessById(Integer businessId);
}
