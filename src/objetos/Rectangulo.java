package objetos;


public class Rectangulo {
	double base;
    double altura;
    
    public double calcularArea() {
        double area = base * altura;
        return area;
    }
    
    public double calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        return perimetro;
    }
}
