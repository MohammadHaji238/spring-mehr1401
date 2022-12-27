package com.anisa.container;

import com.anisa.beans.BeanOne;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanNaming {
    public static void main(String[] args) {
        var context=new ClassPathXmlApplicationContext("config.xml");


        final Map<String, BeanOne> beansOfType = context.getBeansOfType(BeanOne.class);
        beansOfType.entrySet().stream().forEach(b-> System.out.println("id :"+b.getKey()+"aliiases :"+ Arrays.toString(context.getAliases(b.getKey()))));
    }
}
