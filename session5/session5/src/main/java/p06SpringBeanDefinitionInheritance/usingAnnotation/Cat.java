package p06SpringBeanDefinitionInheritance.usingAnnotation;

public class Cat extends Animal {
    private String location;
    public void initC() {
        System.out.println("Inside initC()");
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
