
public class Calculer {
    
    
    char sign;
    double var1;
    double var2;
    double resultAdd;
    double resultSous;
    double resultMult;
    double resultDiv;
    
    
    
    
    /**
     * @return the sign
     */
    public char getSign() {
        return sign;
    }
    /**
     * @param sign the sign to set
     */
    public void setSign(char sign) {
        this.sign = sign;
    }
    /**
     * @return the var1
     */
    public double getVar1() {
        return var1;
    }
    /**
     * @param var1 the var1 to set
     */
    public void setVar1(double var1) {
        this.var1 = var1;
    }
    /**
     * @return the var2
     */
    public double getVar2() {
        return var2;
    }
    /**
     * @param var2 the var2 to set
     */
    public void setVar2(double var2) {
        this.var2 = var2;
    }
    public Calculer(char sign, double var1, double var2) {
	this.sign = sign;
	this.var1 = var1;
	this.var2 = var2;
    }
    
     
   
    public Calculer(double var1, double var2) {
	this.resultAdd = var1+var2;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
	
	if (sign == '+') {
	    return  "L'addition : "+var1 +" "+ sign +" "+ var2 + " = " + resultAdd;
	}else {
	    if (sign == '-') {
		return  "La soustraction : "+var1 +" "+ sign +" "+ var2 + " = " + resultSous;
	    }else {
		    if (sign == '*') {
			return  "La multiplication : "+var1 +" "+ sign +" "+ var2 + " = " + resultMult;
		    }else {
			return  "La division : "+ var1 +" "+ sign +" "+ var2 + " = " + resultDiv;
		    }
	    }
	}
	    
	
    }
   
    
   
    
    
    
    
    
    
    
    
    
    
}
