
//day2 que3
import java.io.*;
public class que3 {

	public static void main(String args[]) 
		    throws FileNotFoundException,IOException 
		    {
				FileInputStream fis = new FileInputStream("C:\\Users\\kotha.srujanvesh\\Desktop\\abc.txt");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\kotha.srujanvesh\\Desktop\\def.txt");
				int b; 
		        while  ((b=fis.read()) != -1) 
		            fos.write(b); 
		        fis.close(); 
		        fos.close();
		    }
}
