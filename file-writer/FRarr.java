//using array
import java.io.FileReader;
public class FRarr {
    public static String[] names=new String[10];
    public static void main(String[] args){
        try {
            int ind=0;
            int i=0;
            FileReader farr = new FileReader("files-filewriter/abc.txt");
            while((i=farr.read())!=-1){
                if (names[ind]==null){
                    names[ind]="";
                }

                char x=(char)i;
                if(x=='\n'){
                    System.out.println(names[ind]);
                    ind+=1;
                }
                else{
                    names[ind]=names[ind]+x;
                }
            }
            farr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}