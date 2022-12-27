package ir.digixo.dynamicProxy;

public class Client {

    public static void main(String[] args) {

        getService().m(); // the method is called on dynamic proxy object
        
    }
    
    static I getService() {
        
        return (I) IHandler.createFor( new Target() ); // return the dynamic proxy for target
        
    }
    
}
