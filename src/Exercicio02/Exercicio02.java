package Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(5, 3.5);
        System.out.println(triangulo1.calcularArea());
        Triangulo triangulo2 = new Triangulo(2, 4);
        System.out.println(triangulo2.calcularArea());
        Triangulo triangulo3 = new Triangulo(5,5);
        System.out.println(triangulo3.calcularArea());
    }
}

