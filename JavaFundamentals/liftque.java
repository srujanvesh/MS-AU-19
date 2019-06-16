import java.util.*;
public class liftque {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Map<Integer,Integer> m=new HashMap<>();
		System.out.println("Enter number of Persons");
		int n = scanner.nextInt();
		System.out.println("Enter destinations for each person");
		for(int i=1;i<=n;i++)
		{
			int dest=scanner.nextInt();
			m.put(i,dest);
		}
		System.out.println("Enter lift Position");
		int liftPosition =scanner.nextInt();
		
		List<Map.Entry<Integer, Integer> > list = 
	               new LinkedList<Map.Entry<Integer, Integer> >(m.entrySet()); 
	  
	        
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
	            public int compare(Map.Entry<Integer, Integer> o1,  
	                               Map.Entry<Integer, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	         
	        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
	        for (Map.Entry<Integer, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        int i=0;
	        for (Map.Entry<Integer, Integer> en : temp.entrySet()) { 
	            if(i<n/2)
	        	{
	            	if(i==0)
	            		System.out.println("lift->A");
	            	System.out.println("person = " + en.getKey());
	        	}             
	            else
	            {
	            	if(i==n/2)
	            		System.out.println("lift->B");
	            	System.out.println("person  = " + en.getKey());  
	            }
	            i++;
	                          
	            
	        } 
		
		
	}
}
