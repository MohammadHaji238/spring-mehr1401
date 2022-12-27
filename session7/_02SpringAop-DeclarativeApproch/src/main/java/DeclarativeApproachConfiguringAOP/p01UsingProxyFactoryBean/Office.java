package DeclarativeApproachConfiguringAOP.p01UsingProxyFactoryBean;

public class Office {
    JavaProgrammer javaProgrammer;

    public void execute(){
        javaProgrammer.code1();
        javaProgrammer.code2();
        javaProgrammer.talk();
        javaProgrammer.rest();
    }

    public void setJavaProgrammer(JavaProgrammer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }
}
