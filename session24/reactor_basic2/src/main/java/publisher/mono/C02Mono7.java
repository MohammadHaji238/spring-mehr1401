package publisher.mono;

import reactor.core.publisher.Mono;
import util.Util;

public class C02Mono7 {
    public static void main(String[] args) {

       // getName();

      getName().subscribe(Util.onNext());
      getName().subscribe(Util.onNext());
      getName().subscribe(Util.onNext());
      getName().subscribe(Util.onNext());


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
