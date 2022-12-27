package p03SingletonBeanswithPrototypeBeanDependencies.solved.p1methodinjection;

public  class PrototypeScope {
    private String message;
    public PrototypeScope()
    {
        System.out.println("Prototype Bean Instantiated !!");
    }
    public void setMessage(String message){
        this.message  = message;
    }
    public String  getMessage(){
        return this.message;
    }
}
