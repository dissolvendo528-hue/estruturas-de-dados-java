public class FilaString {
    private String[] elementos;
    private int fim = 0;

    public FilaString(int tamanhoMaximo) {
        elementos = new String[tamanhoMaximo];
        fim = 0;
    }

    boolean vazia() {
        return fim == 0;
    }

    boolean cheia() {
        return fim == elementos.length; 
    }

    public void adicionar(String nome) {
        if (cheia()) {
            throw new RuntimeException("Fila cheia, impossível adicionar nome na fila agora!");
        }
        elementos[fim] = nome;
        fim++;
    }

    public String remover() {
        if(vazia()) {
            throw new RuntimeException("Fila vazia, impossível remover um elemento agora!");
        }
        String removido = elementos[0];

        for (int i = 0; i < fim - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fim--;
        elementos[fim] = null;
        return removido;
    }

    public int comprimento() {
        return fim;
    }

    @Override 
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < fim; i++) {
            resultado += elementos[i];
            if (i < fim - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}