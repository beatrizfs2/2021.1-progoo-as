package br.ibmec.progoo.as.entidades;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public abstract class Sala {

    private int numero;
    private ArrayList<Disciplina> disciplinas;
    private Disciplina[] agenda;

    // implementar construtor

    public Sala() {
        this.disciplinas = new ArrayList<>();

    public int getNumero() {
        return this.numero;
    }

    public void setAgenda(Disciplina[] agenda) {
        this.agenda = agenda;
    }

    public Disciplina[] getAgenda() {
        return agenda;
    }

    public SalaArray(){
		this.agenda = new Disciplina[5];

    public boolean verificaDisponibilidade(int diaSemana) {
        // implementar metodo
        // retorna true se sala esta disponivel naquele dia
        if (diaSemana) {
            System.out.println("Sala está disponível");
            return true;
        } else {
            System.out.println("Sala não está disponível");
            return false;
        }

        if(this.getAgenda().contains(diaSemana)){
            return true;
        }
        else 
            return false;
    }

            
    public void reserva(Disciplina disciplina) {
        this.agenda[disciplina.getDiaSemana() - 1] = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Sala)) {
            return false;
        }
        Sala sala = (Sala) o;
        return numero == sala.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agenda);
    }

    @Override
    public String toString() {
        String mensagem = this.numero + ";";

        for (Disciplina disciplina : this.agenda) {
            if (disciplina == null) {
                mensagem += ";";
            } else {
                mensagem += disciplina.getNome() + ";";
            }
        }

        return mensagem;
    }

}
