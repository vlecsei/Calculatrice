
public class Calculatrice {
    
    
    char sign;
    double var1;
    double var2;
    
    double resultAdd = getVar1() + getVar2();
    double resultSous = getVar1() - getVar2();
    double resultMult = getVar1() * getVar2();
    double resultDiv = getVar1() / getVar2();
    
    
    
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
    public Calculatrice(char sign, double var1, double var2) {
	this.sign = sign;
	this.var1 = var1;
	this.var2 = var2;
    }
    
    
    
  
    }
