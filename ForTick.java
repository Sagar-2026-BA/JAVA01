import java.util.Scanner;
class ForTick{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = n; i > 0; i--){
            System.out.println("tick "+i);
            sc.close();
        }
    }
}
