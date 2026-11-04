// Fazendo o código com base na representação UML do pdf.
public class FilaInt {
    private int v[];
    private int fim = 0;

    // construtor
    public FilaInt(int tam) {
        v = new int[tam];
    }

    public FilaInt() {
        this(10);
    }

    public boolean vazia() {
        return fim == 0;
    }

    public boolean cheia() {
        return fim == v.length;
    }

    public int comprimento() {
        return fim;
    }

    public int capacidade() {
        return v.length;
    }

    public void adicionar(int elem) {
        if (cheia()) {
            throw new RuntimeException("Fila cheia!");
        }
        v[fim] = elem;
        fim++;
    }

    public int remover() {
        if (vazia()) {
            throw new RuntimeException("Fila vazia!");
        }
        int aux = v[0];
        for (int i = 1; i < fim; i++) {
            v[i - 1] = v[i];
        }
        fim--;
        return aux;
    }

    public int elemento(int p) {
        if (p < 0 || p >= fim) {
            throw new RuntimeException("Posição inválida!");
        }
        return v[p];
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < fim; i++) {
            s += v[i];
            if (i < fim - 1) {
                s += ", ";                 // vírgula entre elementos, menos após o último
            }
        }
        s += "]";
        return s;
    }
}