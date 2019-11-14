/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int number1,number2,area=0,perimeter=0;
        
        number1=obj.nextInt();
        number2=obj.nextInt();
        
        area = number1*number2;
        perimeter = 2*(number1+number2);
        
        System.out.println(+area+ " " +perimeter);
    }
}
