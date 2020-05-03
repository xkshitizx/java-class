import java.io.FileInputStream;
public class FIS {
    public static String[] names=new String[10];
     public static void main(String[] args){
        try{
            int ind=0;
            int i=0;
            FileInputStream fis=new FileInputStream("/home/kshitiz/Desktop/java/file/kshitiz.txt");
            
            while((i=fis.read()) != -1){
                names[ind]="";

                while(boolean z!=true){
                
                    char x=(char)i;
                    if(x=='\n'){
                        System.out.println(names[ind]);
                        ind+=1;
                    }
                    else{
                    names[ind]=names[ind]+x;
                    }
                    z=true;
                }
            }
            fis.close();
          }catch(Exception e){System.out.println(e);}
         }
     }
