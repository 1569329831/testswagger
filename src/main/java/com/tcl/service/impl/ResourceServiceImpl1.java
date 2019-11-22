package com.tcl.service.impl;

import com.tcl.service.ResourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Linjiawei
 * @create: 2019-11-21 19:53
 */
@Service("resourceServiceImpl1")
public class ResourceServiceImpl1 implements ResourceService {
    @Override
    public void printMsg() {
        System.out.println("resouce demo1");
    }
}
