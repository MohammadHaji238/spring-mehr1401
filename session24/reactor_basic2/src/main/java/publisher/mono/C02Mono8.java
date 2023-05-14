package publisher.mono;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import util.Util;

public class C02Mono8 {
    public static void main(String[] args) throws InterruptedException {

       // getName();

      getName()
              .subscribeOn(Schedulers.boundedElastic())
              .subscribe(Util.onNext());
      getName()
              .subscribeOn(Schedulers.boundedElastic())
              .subscribe(Util.onNext());
      getName()
              .subscribeOn(Schedulers.boundedElastic())
              .subscribe(Util.onNext());
      getName()
              .subscribeOn(Schedulers.boundedElastic())
              .subscribe(Util.onNext());


      Thread.sleep(4000);
    }



    static Mono<String> getName()
    {

        return  Mono.fromSupplier(() -> {
            System.out.println("generating data");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "mahsa";
        });
    }
}
