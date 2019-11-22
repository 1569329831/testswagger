package com.tcl.service.impl;

import com.tcl.service.AutowiredService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @description: 实现类2
 * @author: Linjiawei
 * @create: 2019-11-21 19:45
 */
@Service("autowireServiceImpl2")
//@Qualifier("autowireServiceImpl2")
public class AutowireServiceImpl2 implements AutowiredService {
    @Override
    public void printMsg() {
        System.out.println("second demo!");
    }
}
