package p01BeanDefining.p05staticfactorymethod;

public class ProductService {
    private static  final ProductService instance=new ProductService();

    private ProductService() {
    }

    public static ProductService getInstance()
    {
        return instance;
    }
}
