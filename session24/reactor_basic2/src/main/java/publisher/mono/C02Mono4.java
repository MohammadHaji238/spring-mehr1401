package publisher.mono;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;
import util.Util;

public class C02Mono4 {
    public static void main(String[] args) {
        Mono<String> mono = productRepo();


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
}
