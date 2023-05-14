package publisher.mono;

import reactor.core.publisher.Mono;
import util.Util;

public class C02Mono2 {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just("Hello java")
                .map(s -> s.length()/0);


       /* mono.subscribe(integer -> System.out.println(integer),
                throwable -> System.out.println(throwable.getMessage()),
                () -> System.out.println("completed"));*/


        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );


    }
}
