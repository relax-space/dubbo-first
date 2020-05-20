package org.example.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.example.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 肖新苗
 * @since: 2020/5/21
 * create at : 2020/5/21 4:17
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String sayHi(){
        return demoService.sayHi();
    }
}