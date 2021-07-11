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
        
        if (this.procuraSala(numero) != null) {
            System.out.println("Sala ja existe!");
        } else {
            this.salas.add(new SalaDeAula(equipamentos));
        }
       
        
    }

    public boolean adicionaDisciplina(String nome, String codigo, int numeroSala, int diaSemana) {
        // implementar metodo
        // se ja existir uma disciplina com o codigo passado, dispara uma mensagem
        // se o numero passado para a sala nao corresponder a nenhuma sala criada, dispara uma mensagem
        // se a sala nao possui disponibilidade naquele dia, dipara uma mensagem

        // retorna false se cair em um dos tres erros acima

        // se nao retornar false, cria uma disciplina, adiciona-a na lista de disciplinas
        // faz uma reserva na sala e retorna true

        if (this.procuraDisciplina(codigo, nome) != null) {
            System.out.println("Disciplina já existe!");
            return false
        }    
            if (this.procuraSala(numeroSala) != null) {
                 System.out.println("Nenhuma sala criada!");
                return false
            }
                if (this.procuraSala(diaSemana) != null) {
                    System.out.println("Nesse dia não tem disponibilidade!");
                    return false
        
                }else {
                    this.disciplinas[sala.getDiaSemana() - 1] = sala;
                    return true

            }else {
                this.disciplinas.add(new ArrayList<Disciplina>(numeroSala));
                return true

        }else {
            disciplinas.add(new Disciplina(codigo, nome));
            return true

        }
   
    }

    public void exibeSalas() {
        System.out.println("\nSalas cadastradas:\n");
        for (Sala sala : this.salas) {
            System.out.println(sala);
        }
    }

    public void exibeDisciplinas() {
        System.out.println("\nDisciplinas cadastradas:\n");
        for (Disciplina disciplina : this.disciplinas) {
            System.out.println(disciplina);
        }
    }

    public void exportaDados() throws IOException {
        // implementar metodo
        BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\Pestana\\Desktop\\POO\\Projeto\\src\\output.txt",true));
        Parser parser = new Parser("src/test/resources/test001.exportaDados"); 
		parser.parse();
		parser.printInstructions();
		printCFG(parser, "exportaDados.txt.vcg");
		runXVCG("exportaDados.txt.vcg");

        Disciplina disciplinas = new Parser("src/test/resources/test001.exportaDados");
        Sala salas = new Parser("src/test/resources/test001.exportaDados");

        Disciplina disciplinas, sala salas
    }

    private Sala procuraSala(int numero) {
        for (Sala s : salas) 
            if (s.getNumero().equalsIgnoreCase(numero)) 
                return s;
                
        return null;
    }

    private Disciplina procuraDisciplina(String codigo) {
        for (Disciplina d : disciplinas) 
            if (d.getCodigo().equalsIgnoreCase(codigo)) 
                return d;
        return null;

        Disciplina disciplinas = null;
        for (Disciplina disciplinasProcura : ArrayList<Disciplina>) {
            if (disciplinaProcura.getCodigo() == codigo) {
                disciplinas = disciplinasProcura;
                return disciplinas;
            }
        }
        return null;
    }
}
