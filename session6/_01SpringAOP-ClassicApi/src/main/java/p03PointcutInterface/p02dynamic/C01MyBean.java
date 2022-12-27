package p03PointcutInterface.p02dynamic;

public class C01MyBean {
    public void m1(int x)
    {
        System.out.println("invoked m2() with "+x);
    }

    public void m2()
    {
        System.out.println("invoked m2() ");
    }
}
