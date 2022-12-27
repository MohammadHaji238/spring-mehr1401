package com.anisa.container;

import com.anisa.beans.BeanOne;
import com.anisa.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class ContainerDemo {
    public static void main(String[] args) {
        //aop i18n transaction validation
        ApplicationContext context1=new ClassPathXmlApplicationContext("classpath:config.xml");
       // var context2=new FileSystemXmlApplicationContext("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session2\\session2\\src\\main\\resources\\config.xml");
      //  var context3=new AnnotationConfigApplicationContext(MyConfig.class);

      //  var context4=new XmlWebApplicationContext();
      //  var context5=new AnnotationConfigWebApplicationContext();

     /*   BeanOne beanOne= (BeanOne) context1.getBean("id1,id2,id3");
        System.out.println(beanOne);*/
    }
}
