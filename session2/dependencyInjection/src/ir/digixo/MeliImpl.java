package ir.digixo;

public class MeliImpl implements ITransferService {
    
    public boolean transfer(long cardNumber, double amount){
        
        System.out.println("Connecting to Meli Bank...");
        System.out.println(amount + " is tarnsfered to " + cardNumber);
        return true;
        
    } 
    
}
