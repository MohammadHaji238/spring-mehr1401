package p08streotypeAnnotation.WebHandler;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import p08streotypeAnnotation.service.MyService;

import javax.inject.Inject;

//@Component
@Controller
public class MyController {
    private MyService myService;

    public MyService getMyService() {
        return myService;
    }

    @Inject
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

   public void create()
    {
        myService.create();
    }
}
