import java.util.*;
class Address{
    private String name;
    private int reg_no;
    private int m1;   //Each subject marks individually is 100
    private int m2; 
    private int m3;
    private int m4;
    private int m5;
    private int total;
    private double perc;

    Address(String n, int r, int m1, int m2, int m3, int m4, int m5){
        name = n;
        reg_no = r;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        total = m1 + m2 + m3 + m4 + m5;
        perc = total / 500.0 * 100;
    }

    @Override
    public String toString(){
    return "Name: " + name + "\nReg No: " + reg_no + "\nMarks: " + m1 + ", " + m2 + ", " + m3 + ", " + m4 + ", " + m5 + "\nTotal: " + total + "\nPercentage: " + perc;
}
}

class OverAll{
    public static void main(String[] args) {
        LinkedList<Address> list= new LinkedList<Address>();
        Address addr = new Address("John Doe", 12345, 85, 90, 78, 92, 88);
        Address addr2 = new Address("Jane Smith", 67890, 95, 88, 92, 85, 90);
        Address addr3 = new Address("Alice Johnson", 54321, 80, 75, 85, 90, 95);
        list.add(addr);
        list.add(addr2);
        list.add(addr3);
        for (Address a : list) {
            System.out.println(a);
        }
        System.out.println();
    }
}
