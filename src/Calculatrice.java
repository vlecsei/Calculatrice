public class Calculatrice {  
    
    public static void main(String[] args) {
	
	
	Calculer calcul = new Calculer('*', 10, 8);
	System.out.println(calcul.toString());
	
	Calculer calcul1 = new Calculer('+', 94, 8);
	
	System.out.println(calcul1.toString());

    }

}
