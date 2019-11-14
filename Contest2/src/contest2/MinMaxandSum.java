package contest2;
import java.util.Scanner;

public class MinMaxandSum {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        
        int arraysize = obj.nextInt();
        int array[] = new int[arraysize];
        long sum = 0;
        
        for(int i=0; i<arraysize ; i++){
            array[i] = obj.nextInt();
            
            sum = sum + array[i];
        }
        
        int minvalue = array[0];
        for(int i=0; i<arraysize ; i++){
            int temp = array[i];
            minvalue = Math.min(minvalue,temp);
        }   
        
        int maxvalue = array[0];
        for(int i=0; i<arraysize ; i++){
            int temp = array[i];
            maxvalue = Math.max(maxvalue,temp);
        }  
        
        System.out.println( +minvalue+ " " +maxvalue+ " " +sum);
        
    }
}
