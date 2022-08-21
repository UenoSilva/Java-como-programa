package principal;

/**
 *
 * @author Ueno Souza Silva
 */
public class Principal {

    public static void main(String[] args) {

        String frase = "Meu nome e Ueno Souza Silva";

        mostraResultados(valores(frase));

    }

    public static int[] valores(String frase) {

        int[] numeroDeCaracteres = new int[26];

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
        int k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0;
        int u = 0, v = 0, x = 0, y = 0, w = 0, z = 0;

        for (int aux = 0; aux < frase.length(); aux++) {
            if (frase.substring(aux, aux + 1).lastIndexOf("a", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("A", aux) != -1) {
                a++;
                numeroDeCaracteres[0] = a;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("b", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("B", aux) != -1) {
                b++;
                numeroDeCaracteres[1] = b;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("c", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("C", aux) != -1) {
                c++;
                numeroDeCaracteres[2] = c;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("d", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("D", aux) != -1) {
                d++;
                numeroDeCaracteres[3] = d;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("e", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("E", aux) != -1) {
                e++;
                numeroDeCaracteres[4] = e;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("f", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("F", aux) != -1) {
                f++;
                numeroDeCaracteres[5] = f;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("g", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("G", aux) != -1) {
                g++;
                numeroDeCaracteres[6] = g;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("h", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("H", aux) != -1) {
                h++;
                numeroDeCaracteres[7] = h;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("i", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("I", aux) != -1) {
                i++;
                numeroDeCaracteres[8] = i;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("j", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("J", aux) != -1) {
                j++;
                numeroDeCaracteres[9] = j;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("k", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("K", aux) != -1) {
                k++;
                numeroDeCaracteres[10] = k;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("l", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("L", aux) != -1) {
                l++;
                numeroDeCaracteres[11] = l;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("m", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("M", aux) != -1) {
                m++;
                numeroDeCaracteres[12] = m;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("n", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("n", aux) != -1) {
                n++;
                numeroDeCaracteres[13] = n;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("o", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("O", aux) != -1) {
                o++;
                numeroDeCaracteres[14] = o;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("p", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("P", aux) != -1) {
                p++;
                numeroDeCaracteres[15] = p;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("q", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("Q", aux) != -1) {
                q++;
                numeroDeCaracteres[16] = q;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("r", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("R", aux) != -1) {
                r++;
                numeroDeCaracteres[17] = r;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("s", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("S", aux) != -1) {
                s++;
                numeroDeCaracteres[18] = s;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("t", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("T", aux) != -1) {
                t++;
                numeroDeCaracteres[19] = t;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("u", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("U", aux) != -1) {
                u++;
                numeroDeCaracteres[20] = u;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("v", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("V", aux) != -1) {
                v++;
                numeroDeCaracteres[21] = v;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("x", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("X", aux) != -1) {
                x++;
                numeroDeCaracteres[22] += x;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("y", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("Y", aux) != -1) {
                y++;
                numeroDeCaracteres[23] = y;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("w", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("W", aux) != -1) {
                w++;
                numeroDeCaracteres[24] = w;
            } else if (frase.substring(aux, aux + 1).lastIndexOf("z", aux) != -1 || frase.substring(aux, aux + 1).lastIndexOf("Z", aux) != -1) {
                z++;
                numeroDeCaracteres[25] += z;
            }

        }

        return numeroDeCaracteres;
    }

    public static void mostraResultados(int[] numeroDeCaracteres) {
        String alfabeto = "abcdefghijklmnopqrstuvxywz";

        System.out.println("Letra Quantidade");
        for (int i = 0; i < numeroDeCaracteres.length; i++) {
            System.out.println("    " + alfabeto.charAt(i) + "       " + numeroDeCaracteres[i]);
        }
    }

}
