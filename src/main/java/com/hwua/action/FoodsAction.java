package com.hwua.action;

import com.hwua.domain.Foods;
import com.hwua.service.impl.FoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FoodsAction {
    @Autowired
    private FoodsServiceImpl foodService;

    @GetMapping("getm/{id}")
    public Foods getFood(@PathVariable Integer id)throws Exception{
        return foodService.getFoodsById(id);
    }
}
