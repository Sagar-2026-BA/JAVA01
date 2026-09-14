class DisplayOverloading{
    public void display(char c){
        System.out.println("Character: " + c);
        }

    public void display(int c){
       System.out.println("Integer: " + c);
}
}
class Sample{
    public static void main(String args[]){
        DisplayOverloading obj = new DisplayOverloading();
        obj.display('A');
        obj.display(5);
    }
}