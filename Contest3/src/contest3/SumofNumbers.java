package contest3;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        while(obj.hasNext()){
            long item = obj.nextInt();
            long sum = 0;
            
            if(item==0)
                break;
            
            while(item>0){
                long temp = item%10;
                sum+=temp;
                
                item = item/10;
            }
            
            System.out.println(+sum);
        }
        
    }
}
