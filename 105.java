import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a;
		int d[]=new int[10];
		int i=0,cnt=0;
		if(a==0 || b==0)
		{
			System.out.print(a+""+b);
		}
		else
		{
		while(b!=0)
		{
			int rem=b%10;
			d[i++]=rem;
			cnt++;
			b=b/10;
		}
		for(int j=cnt-1;j>=0;j--)
		{
			c=(c*10)+d[j];
		}
		System.out.print(c);
		}
	}
}
