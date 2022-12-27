package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01;

import org.springframework.stereotype.Component;

@Component("hassan")
public class JavaProgrammer  {

    public void code1() {
        System.out.println("java code");

    }
    public void code2() {
        System.out.println("python code");
    }
    public void rest() {
        System.out.println("zzzzzzzz");
    }
}
