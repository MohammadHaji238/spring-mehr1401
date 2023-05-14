package publisher.mono;


import java.util.stream.Stream;

public class C01StreamDemo {
    public static void main(String[] args) {


        Stream<Integer> stream = Stream.of(100)
                .map(integer -> {

                    try {
                        Thread.sleep(8000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return integer * 10;
                });


        stream.forEach(System.out::println);
       // System.out.println(stream);
    }
}
