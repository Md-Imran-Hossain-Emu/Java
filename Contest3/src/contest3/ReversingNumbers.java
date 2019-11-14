package contest3;
import java.util.Scanner;

public class ReversingNumbers {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        int n = obj.nextInt();
        int array[] = new int[n];
        
        for(int i=0; i<n ; i++){
            array[i] = obj.nextInt();
        }
        
        for(int i=n-1; i>=0 ; i--){
            if(i==0)
                System.out.println(+array[i]);
            else
                System.out.print(+array[i]+" "); 
        }
    }
}
