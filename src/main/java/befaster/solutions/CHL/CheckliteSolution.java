package befaster.solutions.CHL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckliteSolution {
    public Integer checklite(String skus) {

    	Map<String,Integer> itemMap = new LinkedHashMap()<String, Integer>();

    	itemMap.put("E", 0);
    	itemMap.put("A", 0);
    	itemMap.put("B", 0);
    	itemMap.put("C", 0);
    	itemMap.put("D", 0);
    	
    	for(char item:skus.toCharArray()) {
    		switch(item){
    			case 'A': itemMap.put("A",itemMap.get("A")+1); break;
	    		case 'B': itemMap.put("B",itemMap.get("B")+1); break;
	    		case 'C': itemMap.put("C",itemMap.get("C")+1); break;
	    		case 'D': itemMap.put("D",itemMap.get("D")+1); break;  
	    		case 'E': itemMap.put("E",itemMap.get("E")+1); break;  		
	    		default: return -1;
    		}
    	}
    	int totalCheckout = 0;
    	
    	for(String key:itemMap.keySet()) {
    		//totalCheckout+=calculatePriceOfItemR1(key,itemMap.get(key));
    		
    		totalCheckout+=calculatePriceOfItemR2(key,itemMap.get(key));
    	}
    	return totalCheckout;
    }
    
    // Method to calculate price of items in basket by applying special offers in round 1
    public int calculatePriceOfItemR1(String item, int amount) {
    	switch(item) {
	    	case "A": return (amount/3)*130 + (amount%3)*50;
	    	case "B": return (amount/2)*45 + (amount%2)*30;
	    	case "C": return amount*20;
	    	default: return amount*15;
    	}
    }
    
    // Method to calculate price of items in basket by applying special offers in round 1
    public int calculatePriceOfItemR2(String item, int amount) {
    	switch(item) {
	    	case "A": return (amount/3)*130 + (amount%3)*50;
	    	case "B": return (amount/2)*45 + (amount%2)*30;
	    	case "C": return amount*20;
	    	case "D": return amount*15;
	    	default: return amount*15;
    	}
    }
}




