package p06SpringBeanDefinitionInheritance.withXMLConfigurationusinAbstractAttributeinXMLConfiguration;

public abstract class Animal {
    private String name;
    private Integer age;
    public void initA() {
        System.out.println("Inside initA()");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
