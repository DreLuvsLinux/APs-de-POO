import java.util.Scanner;

public class JogoDaForca {

    static Scanner sc = new Scanner(System.in);
    static String[] bancoPalavras = {"casa", "computador", "java", "cachorro", "futebol", "escola"};

    public static void main(String[] args) {
        jogar();
    }

    public static void jogar() {
        System.out.println("=== JOGO DA FORCA ===");

        String palavra = escolherPalavra();
        char[] resposta = iniciarResposta(palavra);
        int erros = 0;

        while (erros < 6 && !palavraCompleta(resposta)) {
            mostrarEstado(resposta, erros);
            System.out.print("Digite uma letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            if (!tentarLetra(palavra, resposta, letra)) {
                erros++;
                System.out.println("Letra incorreta! Erros: " + erros);
            } else {
                System.out.println("Boa! Letra encontrada.");
            }
        }

        mostrarResultadoFinal(palavra, resposta, erros);
    }

    public static String escolherPalavra() {
        System.out.println("Escolha uma palavra do banco:");
        for (int i = 0; i < bancoPalavras.length; i++) {
            System.out.println((i+1) + " - " + bancoPalavras[i]);
        }
        int opcao = sc.nextInt();
        return bancoPalavras[opcao - 1];
    }

    public static char[] iniciarResposta(String palavra) {
        char[] resp = new char[palavra.length()];
        for (int i = 0; i < resp.length; i++) {
            resp[i] = '_';
        }
        return resp;
    }

    public static boolean tentarLetra(String palavra, char[] resposta, char letra) {
        boolean encontrou = false;

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                resposta[i] = letra;
                encontrou = true;
            }
        }
        return encontrou;
    }

    public static boolean palavraCompleta(char[] resposta) {
        for (char c : resposta) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public static void mostrarEstado(char[] resposta, int erros) {
        System.out.println("\nPalavra: ");
        for (char c : resposta) {
            System.out.print(c + " ");
        }
        System.out.println("\nErros: " + erros + "/6");
    }

    public static void mostrarResultadoFinal(String palavra, char[] resposta, int erros) {
        if (erros >= 6) {
            System.out.println("\nVocê perdeu! A palavra era: " + palavra);
        } else {
            System.out.println("\nParabéns! Você acertou: " + palavra);
        }
    }
}