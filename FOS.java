import java.io.FileOutputStream;
public class FOS {
    public static void main(String[] args){
            try{
             FileOutputStream fos=new FileOutputStream("/home/kshitiz/Desktop/java/file/kshitiz.txt");
             String str="kshitiz\n saroj\n samir\n sanzay";
             byte[] bt = str.getBytes();
             fos.write(bt);
             fos.close();
            }catch(Exception e){System.out.println(e);}
      }
}