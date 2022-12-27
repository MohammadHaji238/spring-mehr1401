package p02advices.p04throwsAdvice;

public class C01ErrorBean {
    public void m1() throws Exception
    {
        throw new Exception("Generic Exception");
    }
    public void m2() throws Exception
    {
        throw new IllegalArgumentException("IllegalArgument Exception");
    }
}
