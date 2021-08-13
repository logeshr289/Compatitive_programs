package Compatitive_programs;

import java.util.*;
public class Lemons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		if (day<=84){
		double gb=sc.nextDouble();
		int sms=sc.nextInt();
	    int calls=sc.nextInt();
		System.out.println(84-day+"days to recharge");
		System.out.println(2.0-gb+"gb data you have");
		System.out.println(100-sms+"messages you have");
		System.out.println(3000-calls+"calls you have");
	    }
	    else {
	    	System.out.println("Your pack not vaild");
	    }
		sc.close();
	   }

}
