package br.ibmec.progoo.as.entidades;

import java.util.Objects;

public abstract class Sala {

    private int numero;
    private Disciplina[] agenda;

    // implementar construtor

    public int getNumero() {
        return this.numero;
    }

    public boolean verificaDisponibilidade(int diaSemana) {
        // implementar metodo
        // retorna true se sala esta disponivel naquele dia
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
