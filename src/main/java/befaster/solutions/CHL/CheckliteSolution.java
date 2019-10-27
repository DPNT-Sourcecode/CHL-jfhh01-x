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
    	itemMap.put("E", 0);
    	
    	for(char item:skus.toCharArray()) {
    		switch(item){
    			case 'A': itemMap.put("A",itemMap.get("A")+1); break;
	    		case 'B': itemMap.put("B",itemMap.get("B")+1); break;
	    		case 'C': itemMap.put("C",itemMap.get("C")+1); break;
	    		case 'D': itemMap.put("D",itemMap.get("D")+1); break;  
	    		case 'E': itemMap.put("E",itemMap.get("E")+1); break;  
	    		case 'F': itemMap.put("F",itemMap.get("E")+1); break;  		
	    		default: return -1;
    		}
    	}
    	Integer totalCheckout = 0;
    	
    	// Apply special offers and calculate price for round 1
//    	for(String key:itemMap.keySet()) {
//    		totalCheckout+=calculatePriceOfItemR1(key,itemMap.get(key));
//    	}
    	
    	// Apply special offers and calculate price for round 2
    	totalCheckout+=handleSpecialOffers(itemMap);
    	
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
    
    public int handleSpecialOffers(Map<String,Integer> itemMap) {
    	int totalCheckout = 0;
    	
    	int Es = itemMap.get("E");
    	totalCheckout+=calculatePriceOfItemR2("E",Es);
    	int Bs = itemMap.get("B");
    	
    	if(Bs>0)
    		Bs-=Es/2;

    	totalCheckout+=calculatePriceOfItem("B",Bs);
    	totalCheckout+=calculatePriceOfItem("A",itemMap.get("A"));
    	totalCheckout+=calculatePriceOfItem("C",itemMap.get("C"));
    	totalCheckout+=calculatePriceOfItem("D",itemMap.get("D"));
    	
    	int Fs = itemMap.get("F");
    	
    	Fs-=Fs/3;
    	totalCheckout+=calculatePriceOfItem("F",Fs);
    	
    	return totalCheckout;
    }
    
    // Method to calculate price of items in basket by applying special offers in round 1
    public int calculatePriceOfItemR2(String item, int amount) {
    	switch(item) {
	    	case "A": return (amount/5)*200 + ((amount%5)/3)*130 + ((amount%5)%3)*50;
	    	case "B": return (amount/2)*45 + (amount%2)*30;
	    	case "C": return amount*20;
	    	case "D": return amount*15;
	    	default: return amount*40;
    	}
    }
    

    
    // Method to calculate price of items in basket by applying special offers in round 1
    public int calculatePriceOfItem(String item, int amount) {
    	switch(item) {
	    	case "A": return (amount/5)*200 + ((amount%5)/3)*130 + ((amount%5)%3)*50;
	    	case "B": return (amount/2)*45 + (amount%2)*30;
	    	case "C": return amount*20;
	    	case "D": return amount*15;
	    	case "E": return amount*40;
	    	case "F": return amount*10;
	    	default: return 0;
    	}
    }
}




