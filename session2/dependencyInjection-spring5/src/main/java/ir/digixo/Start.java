package ir.digixo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    
    public static void main(String[] args) {
        


        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        
        BankClient ba = (BankClient) ctx.getBean("bankClient");
        
        ba.transfer(112333, 100); 
        
    }

}
