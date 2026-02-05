public class SistemaLocacao {

    static class Filme {
        String titulo;
        double precoBase = 4.0;

        Filme(String titulo) {
            this.titulo = titulo;
        }

        double calcularPreco() {
            return precoBase;
        }
    }

    static class FilmeInfantil extends Filme {

        FilmeInfantil(String titulo) {
            super(titulo);
        }

        @Override
        double calcularPreco() {
            return precoBase + 2.0;
        }
    }

    static class FilmeLancamento extends Filme {

        FilmeLancamento(String titulo) {
            super(titulo);
        }

        @Override
        double calcularPreco() {
            return precoBase + 3.0;
        }
    }

    static class FilmePromocao extends Filme {

        FilmePromocao(String titulo) {
            super(titulo);
        }

        @Override
        double calcularPreco() {
            return precoBase - 2.0;
        }
    }
    public static void main(String[] args) {

        Filme f1 = new FilmeInfantil("Toy Story");
        Filme f2 = new FilmeLancamento("Oppenheimer");
        Filme f3 = new FilmePromocao("Matrix");

        System.out.println("Filme: " + f1.titulo + " | Preço: R$ " + f1.calcularPreco());
        System.out.println("Filme: " + f2.titulo + " | Preço: R$ " + f2.calcularPreco());
        System.out.println("Filme: " + f3.titulo + " | Preço: R$ " + f3.calcularPreco());
    }
}