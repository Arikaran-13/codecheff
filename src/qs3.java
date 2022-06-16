/* package codechef; // don't place package name! */
//import  java.util.String;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double totalbal;
		int withdraw;
		Scanner sc= new Scanner(System.in);
		withdraw=sc.nextInt();
		totalbal=sc.nextDouble();
		if(withdraw+0.5<=totalbal && withdraw%5==0){
		    System.out.println(String.format("%.2f",totalbal-(withdraw+0.5)));
		}
		else{
		    System.out.println(String.format("%.2f",totalbal));
		}
	}
}
