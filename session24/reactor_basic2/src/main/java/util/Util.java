package util;

import java.util.function.Consumer;

public class Util {
    public static Consumer<Object> onNext(){
        return o -> System.out.println("received :"+o);
    }
    public static Consumer<Throwable> onError(){
        return o -> System.out.println("error :"+o.getMessage());
    }

    public static Runnable onComplete(){
        return () -> System.out.println("complete!");
    }
}
