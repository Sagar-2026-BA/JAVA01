class Box{
    private double width;
    private double height;
    private double depth;
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
 }
}
class OverloadingCons{
    public static void main(String args[]){
        Box b1 = new Box();
        Box b2 = new Box(10);
        Box b3 = new Box(10, 20, 30);
        double vol;

        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }
}