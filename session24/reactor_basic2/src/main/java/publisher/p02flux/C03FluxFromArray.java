package publisher.p02flux;

import reactor.core.publisher.Flux;
import util.Util;

import java.util.Arrays;
import java.util.List;

public class C03FluxFromArray {
    public static void main(String[] args) {


        List<String> list= Arrays.asList("a","b","c");
         Flux.fromIterable(list).subscribe(Util.onNext());


         Integer[] ints={1,2,3};
         Flux.fromArray(ints).subscribe(Util.onNext());


         //
        Runnable runnable=() -> Flux.range(1,200);




    }
}
