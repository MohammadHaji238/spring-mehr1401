package p02AdditionalCapabilitiesoftheApplicationContext.p3CustomEvent;

import org.springframework.context.ApplicationEvent;

import java.util.StringJoiner;


public class C1MyEvent extends ApplicationEvent {

    //Custom property
    private String message;



    public C1MyEvent(Object source, String message) {
        super(source);
        this.message = message;

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", C1MyEvent.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .add("source=" + source)
                .toString();

    }
}
