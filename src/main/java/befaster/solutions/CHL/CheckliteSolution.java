package befaster.solutions.CHL;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckliteSolution {
    public Integer checklite(String skus) {

    	Map<String,Integer> itemMap = new HashMap<String, Integer>();
    	itemMap.put("A", 0);
    	itemMap.put("B", 0);
    	itemMap.put("C", 0);
    	itemMap.put("D", 0);
    	
    	for(char item:skus.toCharArray()) {
    		switch(item){
    			case 'A': itemMap.put("A",itemMap.get("A") break;
	    		case 'B': itemMap.put("B",itemMap.get("B") break;
	    		case 'C': itemMap.put("C",itemMap.get("C") break;
	    		case 'D': itemMap.put("D",itemMap.get("D") break;   		
	    		default: return -1;
    		}
    	}
    	
    	int totalCheckout = 0;
    	itemMap.forEach(k,v) -> totalCheckout+=calculatePriceOfItem(k,v));
    }
    
    public calculatePriceOfItem(String item, Integer amount) {
    	
    }
}





