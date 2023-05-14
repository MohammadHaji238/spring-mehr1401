package publisher.mono;

import reactor.core.publisher.Mono;
import util.Util;

public class C02Mono6 {
    public static void main(String[] args) {
        Mono<String> mono = Mono.fromSupplier(() -> getName());
        mono.subscribe(

                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );


    }

    static Mono<String> productRepo()
    {
       // return Mono.just("Mahsa jan");
       // return Mono.empty();
        return Mono.error(new RuntimeException("error"));
    }

    static String getName()
    {
        System.out.println("generating data");
        return "mahsa";
    }
}
