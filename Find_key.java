package Compatitive_programs;

import java.util.Scanner;
import java.util.Arrays;

public class Find_key {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] chara = ("" + sc.nextInt()).toCharArray();
		char[] charb = ("" + sc.nextInt()).toCharArray();
		char[] charc = ("" + sc.nextInt()).toCharArray();
		// first
		for(int i=0;i<4;i++) {
		char[] arr= {chara[i],charb[i],charc[i]};
		Arrays.sort(arr);
		int a=arr[0];
		int b=arr[2];
		System.out.print(b-a);
		}
		System.out.println();
		// second
		for (int i=0;i<4;i++) {
			char[] arr= {chara[i],charb[i],charc[i]};
			Arrays.sort(arr);
			System.out.print(arr[0]);
		}
		System.out.println();
		// third
		Arrays.sort(chara);
		Arrays.sort(charb);
		Arrays.sort(charc);
		int a=chara[0];int b=charb[0];int c=charc[0];
		int x=chara[2];int y=charb[2];int z=charc[2];
		System.out.println((a+b+c)-(x+y+z));
		sc.close();
	}
}

