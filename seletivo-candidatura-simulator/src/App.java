import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        String[] candidatos = { "Carlos", "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println(
                    "Conseguimos contato com o canditado " + candidato + " na tentativa " + tentativasRealizadas);
            System.out.println("************************************");
        } else {
            System.out.println("************************************");
            System.out.println("Não conseguimos contato com o candidato: " + candidato);
            System.out.println("************************************");
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Carlos", "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo lista de candidatos selecionados: ");
        System.out.println("************************************");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número " + (i + 1) + " é " + candidatos[i]);
        }

        // Utilizando FOR EACH
        System.out.println("");
        System.out.println("************************************");
        System.out.println("Imprimindo lista de candidatos selecionados com FOR EACH: ");
        System.out.println("************************************");
        for (String candidado : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidado);
        }
    }

    static void selecionarCandidatos() {
        String[] candidatos = { "Carlos", "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou o valor " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método que simula a ligação
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
