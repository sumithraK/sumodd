import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
    
     int n,i,t=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
     for(i=1;i<=n;i++){
         if(i%2!=0){
             t=t+i;
         }
        
        
    }
    System.out.println(t);
    
     }
}
