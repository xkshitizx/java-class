import java.io.FileWriter;
public class FW {
    public static void main(String[] args){
         try{
           FileWriter fl=new FileWriter("files-filewriter/abc.txt");
           fl.write("Kshitiz");
           fl.close();
           System.out.println("Done writing");
          }catch(Exception e){
            System.out.println(e);
          }
        }
}
