import java.io.File;
import java.io.IOException;
public class CreateFile02{
    public static void main(String args[]){
        try{
            File f=new File("filename.txt");
            if(f.exists()){
                System.out.println("File already exists.");
                System.out.println("File name: " + f.getName());
                System.out.println("Absolute path: " + f.getAbsolutePath());
                System.out.println("Writeable: " + f.canWrite());
                System.out.println("Readable: " + f.canRead());
                System.out.println("File size in bytes: " + f.length());
            }else{
                f.createNewFile();
                System.out.println("File created: "+f.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
