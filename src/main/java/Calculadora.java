import java.text.DecimalFormat;
import javax.swing.*;
public class Calculadora {
    private DecimalFormat df = new DecimalFormat("0.00");
    private double n1;
    private double n2;
    private double r;
    
    public Calculadora(){
        this(0,0,0);
    }
    public Calculadora(double n1, double n2, double r){
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    /**
     * @return the df
     */
    public DecimalFormat getDf() {
        return df;
    }

    /**
     * @param df the df to set
     */
    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    /**
     * @return the n1
     */
    public double getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public double getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }
    public void somar(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero: "));
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero: "));
        this.setR(this.n1 + this.n2);
        JOptionPane.showMessageDialog(null,this.n1 + " + " + this.n2 + " = "+ this.r);
    }
    public void subtrair(double a, double b){
        this.setR(a-b);
        JOptionPane.showMessageDialog(null,a + " - " + b + " = " + this.getR());
    }
    public double multiplicar(){
        double rt;
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero: ")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero: ")));
        rt = this.getN1() * this.getN2();
        this.setR(rt);
        return rt;
    }
    public double dividir(double a, double b){
        double rt;
        this.setN1(a);
        this.setN2(b);
        this.setR(a/b);
        rt = this.getR();
        return rt;
    }
}
 
