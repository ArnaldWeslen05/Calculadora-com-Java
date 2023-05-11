package cauladoraJava;

public class calculadora {
    public int soma (int a, int b){
        //usando a variavel auxilar 
        int result = a + b;
        return result;
    }
    // sobrecarga para somar floats/doubles
    public double soma (double a, double b){
        return a + b;
    }
    //sobregarga para strings
    public int soma (String a, String b){
       int numA = Integer.parseInt(a);
       int numB = Integer.parseInt(b);
       return numA + numB;
    }
    //sobrecarga variando as quantidades 
    public int soma (int a, int b, int c){
        return a + b + c;
    }
    public double soma ( int a , double b, String c){
        return a + b + Double.parseDouble(c);
    }
    public int subtracao (int a, int b){
        //sem variavel auxilar
        return a - b;
    }
    public int multiplicacao (int a, int b){
        return a * b;
    }
    public int divisao (int a, int b ){
        return a / b;
    }
}
