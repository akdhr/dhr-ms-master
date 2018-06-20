package com.dhr.ms.query.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :注释
 * Created by duanhr30063 on 2018/5/29.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        System.out.println("ms test...");
        return 1;
    }
}
