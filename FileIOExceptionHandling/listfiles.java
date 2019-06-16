
//day2 que 1
import java.io.*;
public class listfiles {

	static void fun(File[] a,int index,int x )
	{
		if(index==a.length)
		{
			return;
		}
		
		for (int i = 0; i < x; i++) 
			System.out.print("\t"); 
		
		for (int i = 0; i < x; i++) 
			System.out.print("\t"); 
		
		if(a[index].isFile())
		{
			System.out.println(a[index]);
			
		}
		else if(a[index].isDirectory())
		{
			System.out.println(a[index]);
			fun(a[index].listFiles(),0,x+1);
		}
		
		fun(a,index+1,x);
		
		
	}
	
	
	public static void main(String[] args) throws IOException ,Exception{
		String fname="C:\\Dell";
		File f=new File(fname);
		if(f.exists() && f.isDirectory())
		{
//			System.out.println("Yes");
			
			File lis[] =f.listFiles();
			
			System.out.println("main dir"+f);
//			for(int i=0;i<lis.length;i++)
//			{
//				System.out.println(lis[i]);
//			}
			fun(lis,0,0);
		}
	}
}
