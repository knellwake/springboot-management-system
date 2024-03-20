package com.wake.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class MSTest {

    @Test
    public void test01(){
        Date date = new Date();
        System.out.println(date);
    }
}