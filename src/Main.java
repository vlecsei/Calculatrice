import javax.swing.JOptionPane;

public class Main {  
    
    public static void main(String[] args) {
	
	Calculatrice add = new Calculatrice('+', 30, 50);
	add.Calculer();
	JOptionPane.showMessageDialog(null, add.toString(), "Résultat", JOptionPane.YES_OPTION);
	

    }

}
