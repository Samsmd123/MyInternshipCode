import java.util.Iterator;
import java.util.Set;

public class ClientForCollectionList {
	
	public static void main(String[] args) {
		
		
		StuffData oStuffData = new StuffData(); 

		Set corpEmpSet = oStuffData.prepareSet();
		
		Iterator itr = corpEmpSet.iterator();
		
		while(itr.hasNext()){
			CorpEmployee ce = (CorpEmployee) itr.next();
			System.out.println(ce.getEmpName());
		}
	
	}
	

}
