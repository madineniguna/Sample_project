import java.util.*;
import java.io.*;

public class Roi{
    public static void main(String args[]){
	     Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enetr the Stock name");
		 
		 String c=sc.next();
		 System.out.print("Enetr the amount of the stock");
		 Double n=sc.nextDouble();
		 
		 System.out.print("Enter the number of years of stock");
		 
		 int k=sc.nextInt();
		 
		 System.out.println("Enter the increase percentage every year");
		 
		 int p=sc.nextInt();
		
		 for(int i=0; i<k;i++){
	        
			Double x=n*(Double.valueOf(p)/100);
			
			n=n+x;
			
			 System.out.println(n);
		 }
		 
		
		 
		 
	}
}