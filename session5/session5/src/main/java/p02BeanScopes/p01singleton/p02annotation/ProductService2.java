package p02BeanScopes.p01singleton.p02annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ProductService2 {
    @Autowired
    private MysqlProductDao productDao;

    public MysqlProductDao getProductDao() {
        return productDao;
    }

}
