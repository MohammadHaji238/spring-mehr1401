package ir.digixo;

public class MellatImpl implements ITransferService {
    
    public boolean transfer(long cardNumber, double amount){
        
        System.out.println("Connecting to Melat Bank...");
        System.out.println(amount + " is tarnsfered to " + cardNumber);
        return true;
        
    } 
    
}
