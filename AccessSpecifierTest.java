class AccessSpecifierDemo {     
    public int publicVar = 10;     
    protected int protectedVar = 20;     
    int defaultVar = 30;        
     private int privateVar = 40;      
     public void display() {         
        System.out.println("Public Var: " + publicVar);         
        System.out.println("Protected Var: " + protectedVar);         
        System.out.println("Default Var: " + defaultVar);         
        System.out.println("Private Var: " + privateVar);     
    } 
}  
public class AccessSpecifierTest {     
    public static void main(String[] args) {         
        AccessSpecifierDemo obj = new AccessSpecifierDemo();         
        obj.display();          
    System.out.println("Public Var: " + obj.publicVar);         
    System.out.println("Protected Var: " + obj.protectedVar);         
    System.out.println("Default Var: " + obj.defaultVar);         
} 
}
