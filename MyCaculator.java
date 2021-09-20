package lab3;
import java.util.ArrayList;
import java.util.Scanner;
public class MyCaculator {
	 static String expression;
	 static String removespace;
	 static double result;
	 

	public MyCaculator() {
		
	}

	public static void main (String[]args){
		Scanner f1=new Scanner(System.in);
		
		System.out.println("Add your expression");
		expression=f1.nextLine();
		eveluate(expression);
		System.out.println(result);
		f1.close();
		
	
	}
		 
        public static double eveluate(String exe) {
        	try {
        	removespace = exe.replaceAll(" ", "");
        	System.out.println(removespace);
        	
        	  
            ArrayList<Character>members=new ArrayList<Character>();
            for (char c : removespace.toCharArray()) {
            	  members.add(c);
            	}
           
            char n1=members.get(0);
            char n2=members.get(2);
            double number1=(double) Character.digit(n1, 10);
            double number2=(double) Character.digit(n2, 10);
            
            if(!(members.get(1)=='+' ||members.get(1)=='-'||members.get(1)=='/'||members.get(1)=='*'||members.get(1)=='%')) {
            	System.out.println("ERROR: Unknown");
            	
            }
          
          
            
            	switch(members.get(1)) {
            	  case '+':
            	    result=number1+number2;
            	    break;
            	    
            	  case '-':
            		  result=number1-number2;
            	    break;
            	    
            	  case '*':
            		  result=number1*number2;
            	    break;
            	    
            	  case '%':
            		  result=number1%number2;
              	  break;
            	  case '/':
            		  result=number1/number2;
                	    break;
                	    
            	}
            	
            	}catch(Exception e) {
            		
         System.out.println("ERROR: Unknown operator");
         
            		
       }
        	return result;
        	
        	
        }
        
        
        }
        
     

		
	
