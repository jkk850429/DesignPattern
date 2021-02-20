public class SingletonObjectDemo {
    public static void main(String[] args){
        SingletonObject object = SingletonObject.getInstance();
        System.out.println("Attribute_A before assign value:" + object.getAttribute_A());
        System.out.println("Attribute_B before assign value:" + object.getAttribute_B());
        object.setAttribute_A(10);
        object.setAttribute_B(20);
        System.out.println("Attribute_A after assign value:" + object.getAttribute_A());
        System.out.println("Attribute_B after assign value:" + object.getAttribute_B());
    }
}
