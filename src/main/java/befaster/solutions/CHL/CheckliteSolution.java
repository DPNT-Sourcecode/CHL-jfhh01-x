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
    	itemMap.put("F", 0);
    	itemMap.put("G", 0);
    	itemMap.put("H", 0);
    	itemMap.put("I", 0);
    	itemMap.put("J", 0);
    	itemMap.put("K", 0);
    	itemMap.put("L", 0);
    	itemMap.put("M", 0);
    	itemMap.put("N", 0);
    	itemMap.put("O", 0);
    	itemMap.put("P", 0);
    	itemMap.put("Q", 0);
    	itemMap.put("R", 0);
    	itemMap.put("S", 0);
    	itemMap.put("T", 0);
    	itemMap.put("U", 0);
    	itemMap.put("V", 0);
    	itemMap.put("W", 0);
    	itemMap.put("X", 0);
    	itemMap.put("Y", 0);
    	itemMap.put("Z", 0);
    	
    	for(char item:skus.toCharArray()) {
    		switch(item){
    			case 'A': itemMap.put("A",itemMap.get("A")+1); break;
	    		case 'B': itemMap.put("B",itemMap.get("B")+1); break;
	    		case 'C': itemMap.put("C",itemMap.get("C")+1); break;
	    		case 'D': itemMap.put("D",itemMap.get("D")+1); break;  
	    		case 'E': itemMap.put("E",itemMap.get("E")+1); break;  
	    		case 'F': itemMap.put("F",itemMap.get("F")+1); break;  	
    			case 'G': itemMap.put("G",itemMap.get("G")+1); break;
	    		case 'H': itemMap.put("H",itemMap.get("H")+1); break;
	    		case 'I': itemMap.put("I",itemMap.get("I")+1); break;
	    		case 'J': itemMap.put("J",itemMap.get("J")+1); break;  
	    		case 'K': itemMap.put("K",itemMap.get("K")+1); break;  
	    		case 'L': itemMap.put("L",itemMap.get("L")+1); break;  
    			case 'M': itemMap.put("M",itemMap.get("M")+1); break;
	    		case 'N': itemMap.put("N",itemMap.get("N")+1); break;
	    		case 'O': itemMap.put("O",itemMap.get("O")+1); break;
	    		case 'P': itemMap.put("P",itemMap.get("P")+1); break;  
	    		case 'Q': itemMap.put("Q",itemMap.get("Q")+1); break;  
	    		case 'R': itemMap.put("R",itemMap.get("R")+1); break;  
	    		case 'S': itemMap.put("S",itemMap.get("S")+1); break;  
    			case 'T': itemMap.put("T",itemMap.get("T")+1); break;
	    		case 'U': itemMap.put("U",itemMap.get("U")+1); break;
	    		case 'V': itemMap.put("V",itemMap.get("V")+1); break;
	    		case 'W': itemMap.put("W",itemMap.get("W")+1); break;  
	    		case 'X': itemMap.put("X",itemMap.get("X")+1); break;  
	    		case 'Y': itemMap.put("Y",itemMap.get("Y")+1); break;  
	    		case 'Z': itemMap.put("Z",itemMap.get("Z")+1); break;  		
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
    	int Bs = itemMap.get("B");
    	
    	if(Bs>Es/2)
    		Bs-=Es/2;
    	else Bs=0;
    	totalCheckout+=calculatePriceOfItem("B",Bs);
    	
    	int Fs = itemMap.get("F");
    	Fs-=Fs/3;
    	totalCheckout+=calculatePriceOfItem("F",Fs);
    	
    	int Ns = itemMap.get("N");
    	int Ms = itemMap.get("M");

    	if(Ms>Ns/3)
    		Ms-=Ns/3;
    	else Ms=0;
    	totalCheckout+=calculatePriceOfItem("M",Ms);
    	
    	int Rs = itemMap.get("R");
    	int Qs = itemMap.get("Q");

    	if(Qs>Rs/3)
    		Qs-=Rs/3;
    	else Qs=0;
    	totalCheckout+=calculatePriceOfItem("Q",Qs);
    	
    	int Us = itemMap.get("U");
    	Us-=Us/4;
    	totalCheckout+=calculatePriceOfItem("U",Us);
    	
    	totalCheckout+=calculatePriceOfItem("A",itemMap.get("A"));
    	totalCheckout+=calculatePriceOfItem("C",itemMap.get("C"));
    	totalCheckout+=calculatePriceOfItem("D",itemMap.get("D"));
    	totalCheckout+=calculatePriceOfItem("E",itemMap.get("E"));
    	totalCheckout+=calculatePriceOfItem("G",itemMap.get("G"));
    	totalCheckout+=calculatePriceOfItem("H",itemMap.get("H"));
    	totalCheckout+=calculatePriceOfItem("I",itemMap.get("I"));
    	totalCheckout+=calculatePriceOfItem("J",itemMap.get("J"));
    	totalCheckout+=calculatePriceOfItem("K",itemMap.get("K"));
    	totalCheckout+=calculatePriceOfItem("L",itemMap.get("L"));
    	totalCheckout+=calculatePriceOfItem("N",itemMap.get("N"));
    	totalCheckout+=calculatePriceOfItem("O",itemMap.get("O"));
    	totalCheckout+=calculatePriceOfItem("P",itemMap.get("P"));
    	totalCheckout+=calculatePriceOfItem("R",itemMap.get("R"));
    	totalCheckout+=calculatePriceOfItem("S",itemMap.get("S"));
    	totalCheckout+=calculatePriceOfItem("T",itemMap.get("T"));
    	totalCheckout+=calculatePriceOfItem("V",itemMap.get("V"));
    	totalCheckout+=calculatePriceOfItem("W",itemMap.get("W"));
    	totalCheckout+=calculatePriceOfItem("X",itemMap.get("X"));
    	totalCheckout+=calculatePriceOfItem("Y",itemMap.get("Y"));
    	totalCheckout+=calculatePriceOfItem("Z",itemMap.get("Z"));
    	
    	return totalCheckout;
    }
    
    // Method to calculate price of items in basket by applying special offers in round 1
    public int calculatePriceOfItemR1_R2(String item, int amount) {
    	switch(item) {
	    	case "A": return (amount/5)*200 + ((amount%5)/3)*130 + ((amount%5)%3)*50;
	    	case "B": return (amount/2)*45 + (amount%2)*30;
	    	case "C": return amount*20;
	    	case "D": return amount*15;
	    	case "E": return amount*40;
	    	default: return 0;
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
	    	case "G": return amount*20;
	    	case "H": return (amount/10)*80 + ((amount%10)/5)*45 + ((amount%10)%5)*10;
	    	case "I": return amount*35;
	    	case "J": return amount*60;
	    	case "K": return (amount/2)*150 + (amount%2)*80;
	    	case "L": return amount*90;
	    	case "M": return amount*15;
	    	case "N": return amount*40;
	    	case "O": return amount*10;
	    	case "P": return (amount/5)*200 + (amount%5)*50;
	    	case "Q": return (amount/3)*80 + (amount%3)*30;
	    	case "R": return amount*50;
	    	case "S": return amount*30;
	    	case "T": return amount*20;
	    	case "U": return amount*40;
	    	case "V": return (amount/3)*130 + ((amount%3)/2)*90 + ((amount%3)%2)*50;
	    	case "W": return amount*20;
	    	case "X": return amount*90;
	    	case "Y": return amount*10;
	    	case "Z": return amount*50;
	    	default: return 0;
    	}
    }
}
