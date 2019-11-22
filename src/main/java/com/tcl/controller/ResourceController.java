package com.tcl.controller;

import com.tcl.service.ResourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Linjiawei
 * @create: 2019-11-21 20:01
 */
@RestController
public class ResourceController {

    @Resource(name = "resourceServiceImpl1")
    private ResourceService resourceService1;

    @Resource(name = "ResourceServiceImpl2")
    private ResourceService resourceService2;

    @RequestMapping("/testResource1")
    public void testResource1(){
        resourceService1.printMsg();
    }

    @RequestMapping("/testResource2")
    public void testResource2(){
        resourceService2.printMsg();
    }
}
