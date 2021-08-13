package Compatitive_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Find_key_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] chara = ("" + sc.nextInt()).toCharArray();
		char[] charb = ("" + sc.nextInt()).toCharArray();
		char[] charc = ("" + sc.nextInt()).toCharArray();
		// first
		int x=Character.getNumericValue(chara[0]);
		int y=Character.getNumericValue(charb[1]);
		Arrays.sort(charc);
		int z=Character.getNumericValue(charc[0]);	
		System.out.print(x*y+z);
		sc.close();

	}

}
