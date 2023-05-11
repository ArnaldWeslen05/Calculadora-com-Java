package cauladoraJava;

import javax.swing.JOptionPane;

public class TestCalculador {
    public static void main(String[] args) {
        calculadora c = new calculadora();
        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog("digite\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao"));
    
    int num1 = Integer.parseInt(
        JOptionPane.showInputDialog("digite o primeiro numero")
        );

    int num2 = Integer.parseInt(
        JOptionPane.showInputDialog("digite o segundo numero")
        );

        switch (opcao){
            case 1:
                 JOptionPane.showMessageDialog(null, "soma =" + c.soma(num1, num2), "resultado, ", JOptionPane.INFORMATION_MESSAGE);
               break;
            case 2:
                 JOptionPane.showMessageDialog(null, "subtracao =" + c.subtracao(num1, num2), "resultado, ", JOptionPane.INFORMATION_MESSAGE);
               break;
            case 3:
                JOptionPane.showMessageDialog(null, "multiplicacao =" + c.multiplicacao(num1, num2), "resultado, ", JOptionPane.INFORMATION_MESSAGE);
               break;
            case 4:
                JOptionPane.showMessageDialog(null, "divisao =" + c.divisao(num1, num2), "resultado, ", JOptionPane.INFORMATION_MESSAGE);
               break;
            default:
               JOptionPane.showMessageDialog(null,"operacao invalida", "resultado", JOptionPane.ERROR_MESSAGE);
        }
}
}
