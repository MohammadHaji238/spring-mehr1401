package p12collections.p02annotation;

//@Service
public class C03StringHolder implements ContentHolder{
    private String value="dfdfdfdf";

    @Override
    public String toString() {
        return "StringHolder{" +
                "value='" + value + '\'' +
                '}';
    }
}
