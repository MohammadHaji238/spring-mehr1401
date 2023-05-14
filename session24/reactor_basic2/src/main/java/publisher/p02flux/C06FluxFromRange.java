package publisher.p02flux;

import reactor.core.publisher.Flux;
import util.Util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C06FluxFromRange {
    public static void main(String[] args) {


       Flux.range(1,100)
               .filter(integer -> integer%2==0)
               .subscribe(
                       Util.onNext(),
                       Util.onError(),
                       Util.onComplete()
               );






    }
}
