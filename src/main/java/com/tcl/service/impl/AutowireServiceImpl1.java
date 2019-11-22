package com.tcl.service.impl;

import com.tcl.service.AutowiredService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @description: 实现类1
 * @author: Linjiawei
 * @create: 2019-11-21 19:38
 */
@Service
@Qualifier("AutowireServiceImpl1")
public class AutowireServiceImpl1 implements AutowiredService {
    @Override
    public void printMsg() {
        System.out.println("first demo!");
    }
}
