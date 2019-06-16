
//day2 que 2
import java.io.*;

public class que2 {

	public static void main(String[] args) throws IOException,Exception
	{
		try {
		File f=new File("C:\\Users\\kotha.srujanvesh\\Desktop");
		
		File lis[] =f.listFiles();
		int i=0;
		while(i<=lis.length)
		{
			if(lis[i].isFile())
			{
				
				if(lis[i].getName().endsWith(".txt"))
					{
					System.out.println(lis[i]);
//					lis[i].delete();
					}
			}
				
			i++;
		}
		
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
//		try {
//			File f=new File("C:\\Users\\kotha.srujanvesh\\Desktop");
//			File lis2[] =f.listFiles();
//			
//			for(int p=0;p<lis2.length;p++)
//			{
//				System.out.println("unna"+lis2[p].getName());
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println("exception");
//		}
//		
		
		
	}
	
}
