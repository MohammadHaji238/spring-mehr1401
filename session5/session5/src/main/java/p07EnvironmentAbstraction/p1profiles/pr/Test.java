package p07EnvironmentAbstraction.p1profiles.pr;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p07EnvironmentAbstraction\\p1profiles\\pr\\school-config.xml");
        ctx.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session5\\session5\\src\\main\\java\\p07EnvironmentAbstraction\\p1profiles\\pr\\kinder-config.xml");

        ctx.refresh();

        FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);
        List<C01Food> lunchSet = foodProviderService.provideLunchSet();
        for (C01Food food: lunchSet) {
            System.out.println("Food: " + food.getName());

        ctx.close();
        }

    }
}
