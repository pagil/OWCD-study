package owcd02.business.logic.beans;

public class MyBean {
    private String name="harry";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyBean(String name) {
        super();
        this.name = name;
    }


    /*
     * If this default constructor is commented
     * jsp:useBean will not be able to instantiate
     * an instance of this bean!!!
     */
    public MyBean() {
        super();
    }

}
