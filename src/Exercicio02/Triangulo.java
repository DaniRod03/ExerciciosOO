package Exercicio02;

public class Triangulo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea(){
        double area = (this.base * this.altura) / 2;
        return area;
    }
}
