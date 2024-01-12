package entities;

public class Retangulo {
    public double a;
    public double b;
    double perimetro;

    public double areaRetangulo() {
        return (b*a)/2;
    }

    public double perimeter(){
        return (2*a) + (2*b);
    }

    public double diagonal () {
        return Math.sqrt((a*a) + (b*b));
    }

    public String toString() {
        return "area: " + areaRetangulo() + "\nperimetro: " + perimeter() + "\ndigagonal: " + diagonal();
    }

}
