package p01EnvironmentAbstraction.p1profiles.p1xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        //-Dspring.profiles.active="school"
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("file:C:\\Users\\Admin\\IdeaProjects\\spring\\5\\session6\\session6\\src\\main\\java\\p01EnvironmentAbstraction\\p1profiles\\p1xml\\school-config.xml");

        ctx.refresh();


        FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);
        List<C01Food> lunchSet = foodProviderService.provideLunchSet();
        for (C01Food food: lunchSet) {
            System.out.println("Food: " + food.getName());

        ctx.close();
        }

    }
}
