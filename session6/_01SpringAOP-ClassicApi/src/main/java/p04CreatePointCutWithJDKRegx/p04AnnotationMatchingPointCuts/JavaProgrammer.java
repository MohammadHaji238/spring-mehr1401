package p04CreatePointCutWithJDKRegx.p04AnnotationMatchingPointCuts;

public class JavaProgrammer implements Programmer {
    @Override

    public void code() {
        System.out.println("java code");
    }
    @AdviceRequired
    public void code2() {
        System.out.println("python code");
    }
    public void rest() {
        System.out.println("zzzzzzzz");
    }
}

