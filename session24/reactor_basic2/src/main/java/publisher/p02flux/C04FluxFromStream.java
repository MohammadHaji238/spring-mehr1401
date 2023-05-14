package publisher.p02flux;

import reactor.core.publisher.Flux;
import util.Util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C04FluxFromStream {
    public static void main(String[] args) {


        List<String> list= Arrays.asList("a","b","c");

        Stream<String> stream = list.stream();
        Flux.fromStream(stream).subscribe(Util.onNext(),Util.onError(),Util.onComplete());







    }
}
