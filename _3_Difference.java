package Thecodeworld;


import java.util.Scanner;

public class _3_Difference {
	
    public static int Reverse(int num){
    	
        int rem=1,result=0;
        
         if(num<10)
        	 
        	 return num;
         
         else {
        	 
        	 while(num!=0) {
        		 
        	 rem=num%10;
        	 
             result=result*10+rem;
             
             num/=10;
             
        	 }
         }
         return result;
             

    }
    public static void main(String[] args){
    	
         Scanner in=new Scanner(System.in);
         
        System.out.println("Enter a number");
        
         int number=in.nextInt();
         
         int rev=Reverse(number);
         
        System.out.println(number + "-" +rev + "=" +(number-rev));


    }
}

