package ir.digixo.bank;


import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;


public class BankClient {

    @Inject
    @Named("MeliImpl")
    //@Named("MellatImpl")
    private ITransfer service;

    public ITransfer getService() {
        return service;
    }

    public void setService(ITransfer service) {
        this.service = service;
    }
    
    public void transfer(long cardNumber, double amount){
        service.transfer(cardNumber, amount);
    }
    
}
