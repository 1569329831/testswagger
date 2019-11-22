package com.tcl.controller;

import com.tcl.service.AutowiredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Linjiawei
 * @create: 2019-11-21 19:41
 */
@RestController
public class AutowiredController {
    @Autowired
    @Qualifier("AutowireServiceImpl1")
    private AutowiredService autowiredService1;

    @Autowired
    @Qualifier("autowireServiceImpl2")
    private AutowiredService autowiredService2;

    @RequestMapping("/testAutowired1")
    public void testAutowired1(){
        autowiredService1.printMsg();
    }

    @RequestMapping("/testAutowired2")
    public void testAutowired2(){
        autowiredService2.printMsg();
    }
}
