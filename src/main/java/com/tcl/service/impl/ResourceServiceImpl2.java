package com.tcl.service.impl;

import com.tcl.service.ResourceService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Linjiawei
 * @create: 2019-11-21 19:59
 */
@Service("ResourceServiceImpl2")
public class ResourceServiceImpl2 implements ResourceService {
    @Override
    public void printMsg() {
        System.out.println("resouce demo2");
    }
}
