public class PilhaInt {
    private int v[];
    private int topo = 0;

    public PilhaInt(int tam) {
        v = new int[tam];
    }

    public PilhaInt() {
        this(4);
    }

    public int comprimento() {
        return topo;
    }

    public int capacidade() {
        return v.length;
    }

    public void adicionar(int elem) {
        if (cheia()) {
            throw new RuntimeException("pilha cheia");
        }
        v[topo] = elem;
        topo++;
    }

    public int remover() {
        if (vazia()) {
            throw new RuntimeException("pilha vazia");
        }
        topo--;
        return v[topo];
    }

    public boolean vazia() {
        return topo == 0;
    }

    public boolean cheia() {
        return topo == v.length;
    }

    public int elemento(int p) {
        if (p < 0 || p >= topo) {
            throw new RuntimeException("posição inválida: " + p);
        }
        return v[p];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < topo - 1; i++) {
            sb.append(v[i]);
            sb.append(",");
        }
        if (topo > 0) {
            sb.append(v[topo - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}