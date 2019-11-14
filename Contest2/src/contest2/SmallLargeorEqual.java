/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;
import java.util.Scanner;

public class SmallLargeorEqual {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int number1,number2,sum=0,i;
        
        number1=obj.nextInt();
        number2=obj.nextInt();
        
        if(number1 == number2)
            System.out.println("a == b");
        else if(number1 < number2)
            System.out.println("a < b");
        else
            System.out.println("a > b");
    }
}
