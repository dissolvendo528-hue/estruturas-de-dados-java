public class TestarHorario {
    public static void main(String[] args) {
        System.out.println("=== Teste 1: Primeiro horário Correto: ");
        Horario horario = new Horario(14, 30, 45);

        System.out.println("Hora obtida: " + horario.getHoras());
        System.out.println("Minutos Obtidos: "  + horario.getMinutos());
        System.out.println("Segundos obtidos: " + horario.getSegundos());

        System.out.println("Horário formatado: " + horario);
    }
}