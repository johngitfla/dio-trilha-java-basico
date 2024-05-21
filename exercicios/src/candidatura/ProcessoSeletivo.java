package candidatura; // Corrigi o nome do pacote para "candidatura" para refletir um nome mais correto
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();

    }
    static void imprimirSelecionados(ArrayList<String> selecionados){
        System.out.println("Os candidatos selecionados foram:");
        for(String candidato : selecionados){
            System.out.println(candidato);
            ligarCandidatos(candidato);
        }
    }


    

    static void ligarCandidatos(String candidato) {
        System.out.println("Discando para " + candidato + "...");
        boolean continuarTentando = true;
        boolean atendeu = false;
        int tentativas = 1;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativas++;
        } while (continuarTentando && tentativas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " após " + tentativas + " tentativa(s).");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " após " + tentativas + " tentativa(s).");
        }
    }
    
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

   

    static void selecaoCandidatos(){
        String[] candidatos = {"DIOGO", "JEAN", "NITZ", "RYAN", "CLARA", "GUILHERME", "JOAO FERNANDES", "RICARDO", "DANIEL", "JAO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        ArrayList<String> selecionados = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
             String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário: " + salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                selecionados.add(candidato);
            }
            candidatoAtual++;

        }
        imprimirSelecionados(selecionados);


    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para candidato");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado demais candidatos");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
}
