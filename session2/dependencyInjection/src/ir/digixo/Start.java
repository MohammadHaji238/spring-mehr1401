package ir.digixo;

public class Start {
    
    public static void main(String[] args) {
        
        BankClient client = new BankClient();
        
        new MyContext().injectIn(client);
        
        client.transfer(11451, 500);
        
    }

}
