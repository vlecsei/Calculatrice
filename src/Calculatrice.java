
public class Calculatrice {
    
    
    
    private static double resultAdd;
    private static double resultSous;
    private static double resultMult;
    private static double resultDiv;   
    
    
    
    
    public static void calculer(char sign, double var1, double var2) {
	   
	if(sign == '+') {
	    resultAdd = var1 + var2;
	    System.out.println("L'addition "+var1+sign+var2+" = "+resultAdd);
	}else if(sign == '-') {
	    resultSous = var1 - var2;
	    System.out.println("La soustraction "+var1+sign+var2+" = "+resultSous);
	}else if (sign =='*') {
	    resultMult = var1 * var2;
	    System.out.println("La multiplication "+var1+sign+var2+" = "+resultMult);
	}else {
	    resultDiv = var1 / var2;
	    System.out.println("La division "+var1+sign+var2+" = "+resultDiv);
	}
    }
    
 
  
    }
