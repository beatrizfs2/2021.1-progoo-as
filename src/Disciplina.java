package br.ibmec.progoo.as.entidades;

import java.util.Objects;

public class Disciplina {

    private String nome;
    private String codigo;
    private Sala sala;
    private int diaSemana;

    // implementar construtor
    public Sala getSala() {
        return this.sala;
    }

    public String getNome() {
        return this.nome;
    }

    public int getDiaSemana() {
        return this.diaSemana;
    }

    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Disciplina)) {
            return false;
        }
        Disciplina disciplina = (Disciplina) o;
        return Objects.equals(codigo, disciplina.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo, sala);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome()
                + ", Código: " + this.getCodigo()
                + ", Sala " + this.getSala()
                + ", Dia de semana: " + this.getDiaSemana()
    }

    
}
