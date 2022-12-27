package DeclarativeApproachConfiguringAOP.p03UsingAspectJStyleAnnotations.p01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("office")
public class Office {
    JavaProgrammer javaProgrammer;

    public void execute(){
        javaProgrammer.code1();
        javaProgrammer.code2();
        javaProgrammer.rest();

    }

    @Autowired
    @Qualifier("hassan")
    public void setJavaProgrammer(JavaProgrammer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }
}
