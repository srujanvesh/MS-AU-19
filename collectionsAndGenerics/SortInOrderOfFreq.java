//day2 session2 que2
import java.util.HashMap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
class MyComparator implements Comparator<String> {
	Map<String, Integer> myMap;
	public MyComparator(Map<String, Integer> myMap) {
	this.myMap = myMap;
	}
	public int compare(String s1, String s2) {
	int n1 = myMap.get(s1);
	int n2 = myMap.get(s2);
	return n1<n2?1:-1;
	}

}
public class SortInOrderOfFreq{
	
	public static void main(String[] args)
	{
		String[] input = {"ab", "bc", "ab" ,"ab" ,"cd", "cd"};
		List<String> list= new ArrayList<String>();
		HashMap<String, Integer>  stringMap = new HashMap<String,Integer>();
		for(int i=0;i<input.length;i++) {
		String ch = input[i];
		if(!stringMap.containsKey(ch))
		list.add(ch);
		stringMap.put(ch, stringMap.containsKey(ch)?stringMap.get(ch)+1:1);
		}
		MyComparator comp = new MyComparator(stringMap);
		Collections.sort(list, comp);
		
		for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i) + ", ");
		}
	}

		
	
	
	
}