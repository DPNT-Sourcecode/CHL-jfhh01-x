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
	    		case 'A':  break;
	    		case 'B': itemCount[1]++; break;
	    		case 'C': itemCount[2]++; break;
	    		case 'D': itemCount[3]++; break;    		
	    		default: return -1;
    		}
    	}
    }
    
    public 
}



