//day2 session2 que1
public class FreqOfLetter {

	
	public static void main(String[] args)
	{
		String str="hey i am srujan";
		
		int arr[]=new int[26];
//		
		try {
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int x=ch-'a';
			
			if((str.charAt(i)>='A' && str.charAt(i)<='Z' )||( str.charAt(i)>='a' && str.charAt(i)<='z'))
				arr[x]++;
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print((char)(65+i)+"  ");
				while(arr[i]--!=0)
					System.out.print("#");
				System.out.println(" ");
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		
	}
	
}