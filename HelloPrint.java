import java.util.Scanner;

class HelloPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wanna Say Something like Hello?");
        String message = sc.nextLine();
        System.out.println(message);

        sc.close();
    }
}
