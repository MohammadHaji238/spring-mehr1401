package publisher.p02flux;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import util.Util;

import java.util.concurrent.atomic.AtomicReference;

public class C08Subscription {
    public static void main(String[] args) throws InterruptedException {


        AtomicReference<Subscription> atomicReference = new AtomicReference<>();


        Flux.range(1, 10)
                .log()
                //.filter(integer -> integer%2==0)//50
                // .log()
                .subscribe(new Subscriber<Integer>() {
                               @Override
                               public void onSubscribe(Subscription s) {
                                   // System.out.println("on subscribe");
                                   // s.request(20);
                                   atomicReference.set(s);
                               }

                               @Override
                               public void onNext(Integer integer) {
                                   System.out.println("on next:" + integer);
                               }

                               @Override
                               public void onError(Throwable t) {
                                   System.out.println("On error" + t);
                               }

                               @Override
                               public void onComplete() {
                                   System.out.println("complete");
                               }
                           }
                );


        atomicReference.get().request(3);
        Thread.sleep(4000);
        atomicReference.get().request(4);
        Thread.sleep(4000);
        atomicReference.get().request(40);

    }
}
