package publisher.p02flux;

import reactor.core.publisher.Flux;
import util.Util;

import java.math.BigDecimal;

public class C01FluxDemo {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(1, 2, 3);
        Flux flux2 = Flux.just(1, 2, 3,new BigDecimal("2323"),"mahsa");


        flux2.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}
