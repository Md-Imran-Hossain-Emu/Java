/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class p2multipliesof13 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        int number1,number2,sum=0,i;
        
        number1=obj.nextInt();
        number2=obj.nextInt();
        
        if(number1>number2){
        for(i=number2;i<=number1;i++){
            if(i%13 == 0){
                sum=sum;
            }
            else{
                sum = sum+i;
            }
        }
        System.out.println(+sum);
    }
    else{
        for(i=number1;i<=number2;i++){
            if(i%13 == 0){
                sum=sum;
            }
            else{
                sum = sum+i;
            }
        }
        System.out.println(+sum);
    } 
    }
}
