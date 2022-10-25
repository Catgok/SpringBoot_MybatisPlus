package com.example.elm_mybatisplus;

import com.example.elm_mybatisplus.dao.BusinessMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElmMybatisPlusApplicationTests {
    @Autowired
    BusinessMapper businessMapper;

    @Test
    public void contextLoads() {
        System.out.println(businessMapper.queryBusinessById(10001).toString());
    }

}
