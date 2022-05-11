import java.util.*;

public class IterateMap {
	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("sonu",101);
		map.put("sam",107);
		map.put("pree",103);
		map.put("ram",109);
		//System.out.println("the szie of the map is::"+map.size());
		 //System.out.println(map);
		 
		 //Find the value if the key given is present
		 //if(map.containsKey("pree")){
			// Integer a=map.get("pree");
		
		 //System.out.println("THE KEY VALUE PAIR OF PREE IS :"+ a);
		 //}
		 for(Map.Entry<String,Integer> mp:map.entrySet()){
			System.out.print(mp.getKey()+":");
			System.out.println(mp.getValue());
		 }
		 map.put("sam",102);
		 System.out.println("the updated map is ::"+map);
	}
} 
