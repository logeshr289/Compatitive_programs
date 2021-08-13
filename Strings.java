package Compatitive_programs;

import java.util.*;

public class Strings {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String a=sc.nextLine();//String input
		int c=sc.nextInt();//Case input
		
		String arr[]=a.split(" ");//Split the string
		int len=arr.length;//String array length
		
		String[] ar=new String[len];//declare String array ar
		
		
		for(int i=0;i<len;i++) {
			StringBuffer x=new StringBuffer(arr[i]); //String to string buffer
			x.reverse();                //String reverse
			ar[i]=x.toString();   //Store in array
			}
		
		
		switch(c) {
		case(0):     //First case
			for(String i:ar) 
				System.out.print(i+" "); //Reverse the string
			break;
		case(1):       //Second case
			for(int i=0;i<len;i++) {
				
				String lar=ar[i].toLowerCase();  // string to lower case
				
				char x[]=lar.toCharArray();  //String to string array
				
				char y[]=arr[i].toCharArray();
				
				for(int j=0;j<x.length;j++) {
					
					if(Character.isUpperCase(y[j])) {
						
						x[j]=Character.toUpperCase(x[j]);
					}
					
					System.out.print(x[j]);
				}
				
				System.out.print(" ");
			}
			
			break;
		
		case(2):    //Case 3
				
			for(int i=0;i<len;i++) {
				
				char x[]=ar[i].toCharArray();
				
				for(char j:x) {
					
					if(Character.isUpperCase(j))
					
						System.out.print(Character.toLowerCase(j));
					
					else
						System.out.print(Character.toUpperCase(j));
				
						}
				
				System.out.print(" ");
				}
		
		break;
		
		default:
			
			System.out.print("Null");			
			
		}
		sc.close();
		
	}				

}

