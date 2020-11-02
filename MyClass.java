import java.util.*;
import java.io.*;

class MyClass{
	
	static int fibonacci(int n){
		if(n<=1){
			return n;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
	 
	 int n=sc.nextInt();
	 if(n<=20){
	    int out= fibonacci(n+1);
	 
	    System.out.println(out);
	 }
	 else{
		 System.out.println("Wrong Infrastructure");
	 }
  
 
}
	 
	 
 
}