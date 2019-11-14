package contest3;

import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        while(scan.hasNextLine()){
            sb.append(scan.nextLine());
	}
        
        String line = sb.toString();
        
        char ch;
        char a= 'a';
        int[]data = new int[26];
        
        for(int i=0;i<line.length();i++){
            ch=line.charAt(i);

            for(int j=0;j<26;j++){
                if(ch == (char)(a+j)){
                    data[j]++;
                    break;
                }
            }
        }
        
        for(int i=0;i<26;i++){
            System.out.println((char)(a+i)+ " : " +data[i]);
        }
        
    }
}
