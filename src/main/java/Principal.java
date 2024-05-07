import javax.swing.*;
public class Principal {
    public static void main(String[] args){
        Calculadora cl = new Calculadora();
        int opt;
        do{
            opt= Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Somar"+" \n2 - subtrair \n3 - multiplicar \n4 - Dividir \n0 - Fechar calculadora"));
            switch(opt){
                case 1:
                    cl.somar();
                    break;
                case 2:
                    double n1, n2;
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero: "));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero: "));
                   cl.subtrair(n1, n2);
                   break;
                case 3:
                    double resposta = cl.multiplicar();
                    JOptionPane.showMessageDialog(null,cl.getN1() + " * " + cl.getN2() + " = " + cl.getR());
                    break;
                 case 4:
                     double N1, N2;
                     N1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero: "));
                     N2 = Double.parseDouble(JOptionPane.showInputDialog("Informe segundo numero: "));
                     double rt = cl.dividir(N1, N2);
                     JOptionPane.showMessageDialog(null,N1 + " / "+ N2 + " = "+ cl.getR());
                     break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa");
                     break;
                default:
                    JOptionPane.showMessageDialog(null,"Por favor, Informe um numero valido");
            }
        }while(opt !=0);
    }
}
