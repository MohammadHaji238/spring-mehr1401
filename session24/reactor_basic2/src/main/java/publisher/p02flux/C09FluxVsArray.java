package publisher.p02flux;

import reactor.core.publisher.Flux;

import com.github.javafaker.Faker;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class C09FluxVsArray {
    public static void main(String[] args) {


        getNames(5)
                .subscribe(Util.onNext());

       /* List<String> names = getNames(5);
        System.out.println(names);*/
    }



    static Flux<String> getNames(int number)
    {
       return Flux.range(0,number)
                .map(integer -> getName());

    }

 /*   static List<String> getNames(int number) {

        List<String> names = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            names.add(getName());
        }
        return names;
    }*/

    static String getName() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Faker().name().firstName();
    }
}
