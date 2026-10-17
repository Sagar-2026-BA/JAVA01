package package2;

import package1.AccessSpecifierDemo;

public class AccessSpecifierTest extends AccessSpecifierDemo {
    public static void main(String[] args) {
        AccessSpecifierTest obj = new AccessSpecifierTest();

        obj.displayAll();
        System.out.println("\nAccess from package2:");
        System.out.println("Public Var:" + obj.publicVar);
        System.out.println("Protected Var:" + obj.protectedVar);
        

        // These are not accessible from another package:
        // System.out.println(obj.defaultVar);
        // System.out.println(obj.privateVar);
    }
}
