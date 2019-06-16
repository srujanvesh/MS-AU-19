import java.io.*;
import java.util.logging.*;
public class Exceptionhandling{
    
    public static void main(String[] args){
        Logger logger = Logger.getLogger("MyLog");
        
        FileHandler fh;
     

        int a = 10 , b = 0;
         try {   
            fh = new FileHandler("C:\\Users\\kotha.srujanvesh\\Desktop\\logFile.txt");
            
            logger.addHandler(fh);
            
            SimpleFormatter formatter = new SimpleFormatter();  
          
            fh.setFormatter(formatter);    
              
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }    

        try{
        int c = a/b;
        }
        catch(ArithmeticException e){
            logger.warning("Arithmetic exception");
            logger.info("Dividing by Zero exception");
        }
        try{
            int d[] = new int[10];
            System.out.println(d[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            logger.finer("Access index within the size of an array");
            logger.info("Array index out of bounds");
        }
        try{
        FileInputStream fis = new FileInputStream("D://abc.txt");
        }
        catch(FileNotFoundException e){
           
            logger.info("File not found");
        }

        finally{
            
            logger.fine("Successful Execution");
        }
        
    }
} 