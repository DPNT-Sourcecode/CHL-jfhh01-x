package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;

public class CheckliteSolution {
    public Integer checklite(String skus) {
    	
    	int[] itemCount = new int[] {0,0,0,0};
    	for(char item:skus.toCharArray()) {
    		switch(item){
	    		case 'A': itemCount[0]++; break;
	    		case 'B': itemCount[1]++; break;
	    		case 'C': itemCount[2]++; break;
	    		case 'D': itemCount[3]++; break;    		
	    		default: return -1;
    		}
    	}
    }
}


