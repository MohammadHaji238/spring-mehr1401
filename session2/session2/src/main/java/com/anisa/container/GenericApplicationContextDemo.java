package com.anisa.container;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GenericApplicationContextDemo {
    public static void main(String[] args) {
        GenericApplicationContext context=new GenericXmlApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("config.xml");
        context.refresh();
    }
}
