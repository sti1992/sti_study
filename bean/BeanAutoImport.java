package com.sti.test_springboot;

import com.sti.test_springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author sti
 * @Date 2022/04/03 22:36
 */
@Component
public class BeanAutoImport {
    @Autowired
    private User user;
}
