package p03SingletonBeanswithPrototypeBeanDependencies.solved.p1methodinjection;

public abstract   class SingletonScope {

    public SingletonScope()
    {
        System.out.println("Singleton Bean Instantiated !!");
    }

    public abstract PrototypeScope getPrototypeBean();
}
