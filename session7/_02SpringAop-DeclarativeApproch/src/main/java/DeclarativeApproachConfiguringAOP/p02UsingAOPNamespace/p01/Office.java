package DeclarativeApproachConfiguringAOP.p02UsingAOPNamespace.p01;

public class Office {
    JavaProgrammer javaProgrammer;

    public void execute(){
        javaProgrammer.code();
        javaProgrammer.code2();
        javaProgrammer.talk();
    }

    public void setJavaProgrammer(JavaProgrammer javaProgrammer) {
        this.javaProgrammer = javaProgrammer;
    }
}
