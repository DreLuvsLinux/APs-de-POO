class Retangulo {
    private double altura = 1;
    private double largura = 1;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        }
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return 2 * (altura + largura);
    }
}

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setAltura(5.5);
        r.setLargura(3.0);

        System.out.println("Altura: " + r.getAltura());
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
    }
}
