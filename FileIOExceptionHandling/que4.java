
//day2 que4
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class que4 {

	public static void main(String args[]) 
		    throws FileNotFoundException,IOException 
		    {
				FileInputStream fis = new FileInputStream("C:\\Users\\kotha.srujanvesh\\Desktop\\abc.txt");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\kotha.srujanvesh\\Desktop\\xyz\\def.txt");
				int b; 
		        while  ((b=fis.read()) != -1) 
		            fos.write(b); 
		        fis.close(); 
		        fos.close();
		    }
}
