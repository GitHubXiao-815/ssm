package com.hwua.service;

import com.hwua.domain.Foods;
import org.springframework.stereotype.Service;

@Service
public interface FoodsService {

    Foods getFoodsById(Integer id);
}
