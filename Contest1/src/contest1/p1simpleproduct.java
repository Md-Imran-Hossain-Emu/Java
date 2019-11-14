/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest1;
import java.util.Scanner;

public class p1simpleproduct {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        int number1,number2,product;
        
        number1=obj.nextInt();
        number2=obj.nextInt();
        
        product = number1 * number2;
        
        System.out.println("PROD = "+product);
    }
}
