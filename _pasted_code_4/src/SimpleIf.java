public class SimpleIf {
	
	public void oddeven(int num) {
		
		if (num % 2 == 0) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
	}
    public void posneg(int num) {
    	
    	if (num > 0) {
    		System.out.println("yes");
    		
    		
    	}
    	else if (num < 0) {
    		System.out.println("no");
    	}
    }
    public void multiten (int num) {
    	if (num % 10 == 0) {
    		System.out.println("yes");
    		
    	}
    	else {
    		System.out.println("no");
    	}
    }
    public void maximum(double num1, double num2, double num3) {
    	Math.max(num1, num2);
    	Math.max(num1, num3);
    	Math.max(num2, num3);
    	if (num1 > num2) {
    		if (num1 > num3) {
    			System.out.println("num1 is the biggest");
    		}
    	}
    	else if (num2 > num1) {
    		if (num2 > num3) {
    			System.out.println("num 2 is the biggest");
    			
    		}
    	
    	}
    	else {
    		System.out.println("num 3 is biggest");
    	}
    	
    }
    public void upperLower(char c) {
    	if (c < 91) {
    	System.out.println("uppercase");
    			}
    	else if (c >= 97) {
    	System.out.println("lowercase");
    			}
    	else {
    	System.out.println("neither");
    			}
    		}
    
    public static void main(String args[]) {
    	SimpleIf tester = new SimpleIf();
    	tester. oddeven(5);
    	tester. posneg(-6);
    	tester. multiten(100);
    	tester. maximum(2, 3, 1);
    	tester. upperLower('a');
    }
    
    
    
    
}
    
	
		