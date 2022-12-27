package ir.digixo.bank;


import javax.inject.Named;

@Named("MeliImpl")
public class MeliImpl implements ITransfer {
    
    public boolean transfer(long cardNumber, double amount){
        
        System.out.println("Connecting to Meli Bank...");
        System.out.println(amount + " is tarnsfered to " + cardNumber);
        return true;
        
    } 
    
}
