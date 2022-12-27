
package ir.digixo.bank;

import ir.digixo.weld.HelloService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class MainHello {
    
    public static void main(String[] args) {
        
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        
        BankClient h = container.instance().select(BankClient.class).get();
        
        h.transfer(112333,1000);
        
        weld.shutdown();
        
    }

}
