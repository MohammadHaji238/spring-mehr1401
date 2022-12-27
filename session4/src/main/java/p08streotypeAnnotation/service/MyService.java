package p08streotypeAnnotation.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import p08streotypeAnnotation.dao.Dao;

import javax.inject.Inject;

//@Component
@Service
public class MyService {
    private Dao dao;

    @Inject
    public void setDao(Dao dao) {
        this.dao = dao;
    }


    public void create()
    {
        dao.create();
    }
}
