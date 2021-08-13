package Compatitive_programs;
import java.util.Arrays;
import java.util.Scanner;
public class Rajiv_Roy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String f_name=sc.nextLine();
		String l_name=sc.nextLine();
		char[] pin = ("" + sc.nextInt()).toCharArray();
		int N=sc.nextInt();
		String smaller_name="";
		char [] longer_name;
		if(f_name.length()<l_name.length()) {
			smaller_name =f_name;
			longer_name = ("" + l_name).toCharArray();
		}
		else if(f_name.length()>l_name.length()) {
			smaller_name =l_name;
			longer_name = ("" + f_name).toCharArray();
		}
		else {
			String arr[]= {f_name,l_name};
			Arrays.sort(arr);
			smaller_name =arr[0];
			longer_name = ("" + arr[1]).toCharArray();
		}
		String User_id=longer_name[0]+smaller_name;
		char [] str=("" + User_id).toCharArray();
		String user_id="";
		for (char i:str) {
			if(Character.isUpperCase(i))
				user_id+=Character.toLowerCase(i);
			else
				user_id+=Character.toUpperCase(i);
		}
		System.out.print(user_id+pin[N-1]+pin[pin.length-(N)]);
		sc.close();
		
	}

}

/*Manoj
LAst_Name =Kumar
PIN=561327
N=2*/
