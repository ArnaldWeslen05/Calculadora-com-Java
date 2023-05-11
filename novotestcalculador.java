package cauladoraJava;

public class novotestcalculador {
    public static void main(String[] args) {
        calculadora c = new calculadora();
        System.out.println("soma 3 inteiros:" + c.soma(2,3,4));
        System.out.println("soma tipos diferentes:" + c.soma(2, 4.6, "345"));
        System.out.println("soam 2 doubles:" + c.soma (3.5, - 1.4));
    }
}
