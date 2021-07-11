package br.ibmec.progoo.as.programa;

import java.io.IOException;
import java.util.Scanner;

import br.ibmec.progoo.as.gestor.Gestor;

public class Programa {

    public static void main(String[] args) throws IOException {

        Gestor gestor = new Gestor();
        Scanner input = new Scanner(System.in);

        String opcao = "0";

        while (!opcao.equals("")) {
            exibeOpcoes();
            opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    adicionaSala(gestor, input);
                    break;
                case "2":
                    adicionaDisciplina(gestor, input);
                    break;
                case "3":
                    gestor.exibeSalas();
                    break;
                case "4":
                    gestor.exibeDisciplinas();
                    break;
                case "5":
                    gestor.exportaDados();
                    break;
                default:
                    opcao = "";
                    break;
            }
        }
    }

    private static void exibeOpcoes() {
        System.out.println("\nGestor de salas");
        System.out.println("Informe a opcao desejada");
        System.out.println("1 - Cadastrar sala;");
        System.out.println("2 - Cadastrar disciplina;");
        System.out.println("3 - Exibe salas;");
        System.out.println("4 - Exibe disciplinas;");
        System.out.println("5 - Exporta os dados.");
    }

    private static void adicionaSala(Gestor gestor, Scanner input) {
        System.out.println("Digite 1 para sala de aula, ou 2 para laboratorio:");
        String opcao = input.nextLine();

        if (opcao.equals("1") || opcao.equals("2")) {
            System.out.print("Informe o numero da sala: ");
            int numero = Integer.parseInt(input.nextLine());

            if (opcao.equals("2")) {
                System.out.print("Informe os equipamentos do laboratorio, separados por espaco: ");
                String equipamentos = input.nextLine();

                gestor.adicionaSala(numero, equipamentos);
            } else {
                gestor.adicionaSala(numero);
            }
        } else {
            System.out.println("Opcao invalida!");
        }
    }

    private static void adicionaDisciplina(Gestor gestor, Scanner input) {
        System.out.print("Informe o nome da disciplina: ");
        String nome = input.nextLine();

        System.out.print("Informe o codigo da disciplina: ");
        String codigo = input.nextLine();

        System.out.print("Informe o numero da sala: ");
        int numeroSala = Integer.parseInt(input.nextLine());

        System.out.print("Informe o dia da semana da aula (1 - segunda, 2 - terca, etc.): ");
        int diaSemana = Integer.parseInt(input.nextLine());

        gestor.adicionaDisciplina(nome, codigo, numeroSala, diaSemana);
    }
}
