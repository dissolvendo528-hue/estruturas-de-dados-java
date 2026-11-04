public class PilhaString {
    private String[] pilha;
    private int topo; 

    // Construtor: o topo nasce em 0 (apontando para a próxima posição livre)
    public PilhaString(int tamanhoMaximo) {
        pilha = new String[tamanhoMaximo];
        topo = 0; 
    }

    public void adicionar(String elemento) {
        if (cheia()) {
            throw new RuntimeException("Erro: A pilha está cheia!");
        } else {
            pilha[topo] = elemento; // Insere na posição atual do topo
            topo++;                 // Incrementa depois
        }    
    } 

    public String remover() {
        if (vazia()) {
            throw new RuntimeException("Erro: A pilha está vazia!");
        } else {
            topo--;                 // Recua o topo primeiro
            String valorRemovido = pilha[topo];
            pilha[topo] = null;     // Limpa a referência da memória
            return valorRemovido;
        }
    }

    public boolean vazia() {
        return topo == 0; // A pilha está vazia se o topo for 0
    }

    public boolean cheia() {
        return topo == pilha.length; // A pilha está cheia se o topo igualar o tamanho máximo do vetor
    }

    @Override 
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < topo; i++) {
            resultado += pilha[i];
            if (i < topo - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }
}