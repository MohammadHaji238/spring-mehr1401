package publisher.p02flux;

import reactor.core.publisher.Flux;
import util.Util;

public class C07log {
    public static void main(String[] args) {


       Flux.range(1,100)
               .log()
               .filter(integer -> integer%2==0)//50
              // .log()
               .subscribe(
                       Util.onNext(),
                       Util.onError(),
                       Util.onComplete()
               );






    }
}
