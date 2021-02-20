public class SingletonObject {
    private static SingletonObject instance;
    private int Attribute_A;
    private int Attribute_B;
    private SingletonObject(){}
    public int getAttribute_A(){
        return this.Attribute_A;
    }
    public void setAttribute_A(int value){
        this.Attribute_A = value;
    }
    public int getAttribute_B(){
        return this.Attribute_B;
    }
    public void setAttribute_B(int value){
        this.Attribute_B = value;
    }
    public static SingletonObject getInstance(){
        if(instance == null){
            instance = new SingletonObject();
            instance.Attribute_A = 1;
            instance.Attribute_B = 2;
        }
        return instance;
    }
}
