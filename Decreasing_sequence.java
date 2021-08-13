package Compatitive_programs;

import java.util.Scanner;

public class Decreasing_sequence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String a=sc.nextLine();
        a=a+",100000";
        String []sar=a.split(",");
        int n=0;
        int max_len=0;
        int count=1;
        int max=Integer.parseInt(sar[0]);
        for (int i=0;i<sar.length-1;i++) {
            
            if(max>Integer.parseInt(sar[i+1])) {
                count++;
                max=Integer.parseInt(sar[i+1]);
            }
            else {
                max=Integer.parseInt(sar[i+1]);
                if(count>1) {
                    n++;
                    if(max_len<count)
                        max_len=count;
                }
                count=1;
            }
        }
        System.out.println(n);
        System.out.print(max_len);
        
        sc.close();    }

}
