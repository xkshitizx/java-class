import java.io.FileInputStream;
public class FIS{
    public static void main(String[] args){
        try {
<<<<<<< HEAD
            FileInputStream newrd = new FileInputStream("
file/kshitiz.txt");
=======
            FileInputStream newrd = new FileInputStream("file/kshitiz.txt");
>>>>>>> 7e3083ee2c3ecbf86fc6ed8f19fc58065b70ea25
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
