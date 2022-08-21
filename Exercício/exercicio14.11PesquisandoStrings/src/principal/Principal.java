package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {

        String frase = "aaa";
        String stringParaBusca = "a";
        numeroDeOcorrencias(frase, stringParaBusca);

    }

    public static void numeroDeOcorrencias(String frase, String stringParaBusca) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).lastIndexOf(stringParaBusca, i) != -1) {
                cont++;
            }
        }
        System.out.println("Tantas ocorrencias: " + cont);
    }

}
