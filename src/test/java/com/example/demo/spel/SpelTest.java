 package com.example.demo.spel;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.SpringbootDemoApplicationTests;
import com.example.demo.spel.FieldValueTestBean;

/**
 * @author xiang
 * @date 2018/12/05
 */
public class SpelTest extends SpringbootDemoApplicationTests {
    @Autowired
    private FieldValueTestBean fieldValueTestBean;
    /**
     * 测试spel表达式的简单例子
     */
    @Test
    public void testA() {
        System.out.println(fieldValueTestBean.getDefaultLocale());
        
    }
    

}
