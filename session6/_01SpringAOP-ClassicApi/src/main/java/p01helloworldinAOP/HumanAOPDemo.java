package p01helloworldinAOP;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Hello world!
 *
 */
public class HumanAOPDemo
{
    public static void main( String[] args )
    {
        Human human=new Human();



        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.addAdvice(new HumanDecorator());//all method as advice
        proxyFactory.setTarget(human);

        Human proxy =(Human) proxyFactory.getProxy();//weaving
       // human.speak();
        System.out.println("\n############");
        proxy.study();
    }
}
