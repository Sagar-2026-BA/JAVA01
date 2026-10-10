class A{
    void cat(){
        System.out.println("Hello, this is cat");
    }
}
class B extends A{
    void dog(){
        System.out.println("Hello, this is dog");
    }
}
class C extends B{
    void lion(){
        System.out.println("Hello, this is lion");
    }
}
public class Main02{
public static void main(String args[]){
    C obj = new C();
    obj.cat();
    obj.dog();
    obj.lion();
}
}
