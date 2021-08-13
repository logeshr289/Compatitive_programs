package Compatitive_programs;

import java.util.Scanner;

public class Reduced_subratct_form {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int ar[]=new int[50];
		int i=0;
		while(a!=0) {
			ar[i]=a%10;
			a=a/10;
			i++;
		}
		//System.out.print(ar[1]);
		while(ar.length>1) {
			
		}
		sc.close();
	}

}
