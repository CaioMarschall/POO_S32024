package aula2;

public class Main {
        public static void main(String[] args){
                Calculadora calc = new Calculadora();
                calc.numA = 10.6;
                calc.numB = 3.9;
                System.out.println("Soma: " + calc.somar() );
                System.out.println("Subtração: " + calc.subtrair() );
                System.out.println("Divisão: " + calc.dividir() );
                System.out.println("Multiplicação: " + calc.multiplicar() );
        }
}
