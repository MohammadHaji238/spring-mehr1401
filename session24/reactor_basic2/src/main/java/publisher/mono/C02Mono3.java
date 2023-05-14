package publisher.mono;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;
import util.Util;

public class C02Mono3 {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just("Hello java")
                .map(s -> s.length()/0);


       /* mono.subscribe(integer -> System.out.println(integer),
                throwable -> System.out.println(throwable.getMessage()),
                () -> System.out.println("completed"));*/


       /* mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
*/


        mono.subscribe(new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription s) {
                s.request(1);
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("received :"+integer);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
