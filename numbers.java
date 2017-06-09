import java.io.*;
import java.util.*;
class numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)
		System.out.println("zero");
		else if(n>0)
		System.out.println("positive");
		else
		System.out.println("negative");
	}
	
}
