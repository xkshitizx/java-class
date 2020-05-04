import java.io.FileWriter;
public class FWappend {
    public static void main(String[] args){
         try{
           FileWriter fadd=new FileWriter("files-filewriter/abc.txt");
           fadd.write("Kshitiz\nSaroj\nSaurav\nSanzay\nSamir");
           fadd.close();
           System.out.println("Done adding");
          }catch(Exception e){
            System.out.println(e);
          }
        }
}
