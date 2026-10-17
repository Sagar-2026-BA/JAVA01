package package1;

public class AccessSpecifierDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void displayAll() {
        System.out.println("Public Var: " + publicVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Default Var: " + defaultVar);
        System.out.println("Private Var: " + privateVar);
    }
}
