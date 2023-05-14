package publisher.p02flux;

import reactor.core.publisher.Flux;
import util.Util;

import java.math.BigDecimal;

public class C02FluxDemo2 {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(1, 2, 3);




        flux.subscribe(integer -> System.out.println("subcriber 1:"+integer));
        flux.subscribe(integer -> System.out.println("subcriber 2:"+integer));
        flux.subscribe(integer -> System.out.println("subcriber 3:"+integer));
    }
}
