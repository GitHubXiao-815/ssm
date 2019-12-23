package com.hwua.service.impl;

import com.hwua.domain.Foods;
import com.hwua.mapper.FoodsMapper;
import com.hwua.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodsServiceImpl implements FoodsService {
    @Autowired
    private FoodsMapper foodMapper;
    @Override
    public Foods getFoodsById(Integer id) {
        return foodMapper.getFoodsById(id);
    }
}
