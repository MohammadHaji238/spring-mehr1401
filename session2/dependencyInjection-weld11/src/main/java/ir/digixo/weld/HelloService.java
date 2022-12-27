
package ir.digixo.weld;

import javax.inject.Inject;

public class HelloService {
    
    @Inject
    private Language lang;
    
    public String sayHello(String name) {
        return lang.sayHello() + " " + name;
    }

}
