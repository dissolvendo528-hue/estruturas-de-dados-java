// Criar a nossa classe e depois os atributos (serão privados)
// Verificar se os valores são válidos.
// Ao verificar se os valores são válidos, vamos guardar eles na variável
// vamos utilizar setter para alterar o valor e getter para olhar
// após verificarmos, vamos criar nossas funções getters para visualizar o valor.
// Vamos criar nosso construtor pensando (como as variáveis devem ser criadas corretamente?)
// ToString
//Reorganizar o código.


public class Horario {
    private int horas;
    private int minutos;
    private int segundos;

    public void setHoras(int h) {
        if (h < 0 || h > 23) {
            throw new RuntimeException("Valor inválido!" + h);
        }
        horas = h;
    }

    public void setMinutos(int m) {
        if (m < 0 || m > 59) {
            throw new RuntimeException("Valor inválido: " + m);
        }
        minutos = m;
    }

    public void setSegundos(int s) {
        if(s < 0 || s > 59) {
            throw new RuntimeException("Valor inválido: " + s);
        }
        segundos = s;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public Horario(int h, int m, int s) {
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}