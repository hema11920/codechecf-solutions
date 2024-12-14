import java.util.*;
import java.lang.*;
import java.io.*;

class NEWCC
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new  Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y)
		System.out.println("New");
		else if(x==y)
		System.out.println("Same");
		else
		System.out.println("Old");

	}
}