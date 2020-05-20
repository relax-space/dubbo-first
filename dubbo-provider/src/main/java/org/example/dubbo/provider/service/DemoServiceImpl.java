package org.example.dubbo.provider.service;


import org.apache.dubbo.config.annotation.Service;
import org.example.dubbo.api.DemoService;

/**
 * @author: 肖新苗
 * @since: 2020/5/21
 * create at : 2020/5/21 4:12
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHi() {
        return "Hello Dubbo!";
    }
}
