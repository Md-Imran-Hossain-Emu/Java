/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class NewClass {
    public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int table[] = new int[128];

		for(int i = 0; i < table.length; i++){
			table[i] = 0;
		}

		StringBuilder sb = new StringBuilder();

		while(scanner.hasNext()){
			sb.append(scanner.nextLine());
		}

		String line = sb.toString();

		for(int i = 0; i < line.length(); i++){
			table[line.charAt(i)]++;
		}

		for(int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", 'a'+i,table['a'+i]+table['a'+i-32]);
		}
	}
}
