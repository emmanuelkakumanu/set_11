import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.trim();
		char ch[]=str.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		for(int i=1;i<str.length();i++)
		{
			
			if(ch[i]==' ' && ch[i+1]!=' ')
			{
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		for(int i=0;i<str.length();i++)
		System.out.print(ch[i]);
	}
}
