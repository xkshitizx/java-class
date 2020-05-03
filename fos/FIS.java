import java.io.FileInputStream;
public class FIS{
    public static void main(String[] args){
        try {
            FileInputStream newrd = new FileInputStream("file/kshitiz.txt");
            int i=0;
            while((i=newrd.read())!=-1){
                System.out.print((char)i);
            }
            newrd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}