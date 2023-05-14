package publisher.mono;

import org.w3c.dom.ls.LSOutput;
import reactor.core.publisher.Mono;

public class C02Mono {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(100);
        //System.out.println(mono);
        mono.subscribe(integer -> System.out.println(integer));

    }
}
