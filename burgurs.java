import java.util.*;
class burgurs
{
	public static void main (String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int T=s.nextInt();
	for(int i=1;i<=T;i++)
	{
	    int A=s.nextInt();
	    int B=s.nextInt();
	    int z=Math.min(A,B);
	    System.out.println(z);
	}

	}
}