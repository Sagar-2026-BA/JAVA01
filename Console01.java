public class Console01{
    public static void main(String args[]){
        String name=System.console().readLine("Enter your name: ");
        
        System.out.println("Name:" +name);
    }
}
