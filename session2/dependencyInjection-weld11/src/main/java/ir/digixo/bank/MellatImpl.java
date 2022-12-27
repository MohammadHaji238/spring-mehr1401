package ir.digixo.bank;


import javax.inject.Named;

@Named("MellatImpl")
public class MellatImpl implements ITransfer {
    
    public boolean transfer(long cardNumber, double amount){
        
        System.out.println("Connecting to Melat Bank...");
        System.out.println(amount + " is tarnsfered to " + cardNumber);
        return true;
        
    } 
    
}
