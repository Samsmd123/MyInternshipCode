import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ClientForCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuffData oStuffData = new StuffData(); 

		Set corpEmpSet = (Set) oStuffData.prepareCollection(2);
		
		Iterator itr = corpEmpSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		

	}

}
