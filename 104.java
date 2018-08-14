import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();int sq=1;
		for(int i=0;i<k;i++)
		{
			sq=sq*n;
		}
		System.out.print(sq);
	}
}
