import java.io.FileReader;
public class FRead {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("/home/kshitiz/Desktop/java/file-writer/files-filewriter/abc.txt");
            int i;
            while((i=fr.read())!=-1)
            System.out.print((char)i);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}