package p02advices.p02AfterReturningAdvice;
//5-target
public /*final*/ class Human {
    //jointpoint is the invocation of the speak() method
    //3-pointcut is speak() method
    public void speak()
    {
        System.out.print("World");
    }

    public void study()
    {
        System.out.println("studying.......");
    }
}
