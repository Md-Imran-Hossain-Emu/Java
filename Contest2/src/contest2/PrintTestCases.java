/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;

import java.util.Scanner;

public class PrintTestCases {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int i=1;
        
        while (obj.hasNext()) {
            int number = obj.nextInt();
            
            if(number == 0)
                break;
            else
                System.out.println("Case "+i+": "+number);
            
            i++;
        } 
    }
}

