package Compatitive_programs;

import java.util.Scanner;

public class Find_Key_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*char[] chara = ("" + sc.nextInt()).toCharArray();
		char[] charb = ("" + sc.nextInt()).toCharArray();
		char[] charc = ("" + sc.nextInt()).toCharArray();
		// first*/
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		char[] ar=new char[4];
		int i=0;
		while(a!=0 && b!=0 && c!=0) {
		ar[i]=(char)((Math.min(Math.min(a%10, b%10),c%10))+'0');
		a/=10;b/=10;c/=10;
		i++;
		}
		for(int j=3;j>=0;j--)
			System.out.print(ar[j]);
		sc.close();

	}

}
