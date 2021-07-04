package br.ibmec.progoo.as.gestor;

import java.io.IOException;
import java.util.ArrayList;

import br.ibmec.progoo.as.entidades.Disciplina;
import br.ibmec.progoo.as.entidades.Laboratorio;
import br.ibmec.progoo.as.entidades.Sala;
import br.ibmec.progoo.as.entidades.SalaDeAula;
import br.ibmec.progoo.as.sistemageral.ExportadorDados;

public class Gestor {

    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Sala> salas;

    public Gestor() {
        this.disciplinas = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public void adicionaSala(int numero) {
        if (this.procuraSala(numero) != null) {
            System.out.println("Sala ja existe!");
        } else {
            this.salas.add(new SalaDeAula(numero));
        }
    }

    public void adicionaSala(int numero, String equipamentos) {
        // implementar metodo
        // este metodo deve ser usado quando se deseja adicionar um laboratorio
    }

    public boolean adicionaDisciplina(String nome, String codigo, int numeroSala, int diaSemana) {
        // implementar metodo
        // se ja existir uma disciplina com o codigo passado, dispara uma mensagem
        // se o numero passado para a sala nao corresponder a nenhuma sala criada, dispara uma mensagem
        // se a sala nao possui disponibilidade naquele dia, dipara uma mensagem

        // retorna false se cair em um dos tres erros acima

        // se nao retornar false, cria uma disciplina, adiciona-a na lista de disciplinas
        // faz uma reserva na sala e retorna true
    }

    public void exibeSalas() {
        // imprime na tela todas as salas cadastradas
    }

    public void exibeDisciplinas() {
        System.out.println("\nDisciplinas cadastradas:\n");
        for (Disciplina disciplina : this.disciplinas) {
            System.out.println(disciplina);
        }
    }

    public void exportaDados() throws IOException {
        // implementar metodo
    }

    private Sala procuraSala(int numero) {
        // verifica, na lista de salas, se ha uma com o codigo passado
        // caso haja, retorna a sala
        // retorna null caso contrario
    }

    private Disciplina procuraDisciplina(String codigo) {
        // verifica, na lista de disciplinas, se ha uma com o codigo passado
        // caso haja, retorna a disciplina
        // retorna null caso contrario
    }
}
