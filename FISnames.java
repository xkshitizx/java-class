import java.io.FileInputStream;
public class FIS {
    //declaring array
    public static String[] names=new String[10];
     public static void main(String[] args){
        try{
            int ind=0;
            int i=0;
            FileInputStream fis=new FileInputStream("/home/kshitiz/Desktop/java/file/kshitiz.txt");
            
            while((i=fis.read()) != -1){
                
                //initializing value of elements of array to be empty because by default they are null
                if (names[ind]==null){
                    names[ind]="";
                }

                char x=(char)i;

                /*if new line is detected, the word stored in array is printed and next index is incremented
                else concatenate the character to indexed element.
                */
                if(x=='\n'){
                    System.out.println(names[ind]);
                    ind+=1;
                }
                else{
                    names[ind]=names[ind]+x;
                }
                
            }
            
            fis.close();
          }catch(Exception e){System.out.println(e);}
         }
     }
