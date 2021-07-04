package br.ibmec.progoo.as.sistemageral;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.ibmec.progoo.as.entidades.Disciplina;
import br.ibmec.progoo.as.entidades.Sala;

public class ExportadorDados implements IExportadorDados {

    @Override
    public void exportaDados(ArrayList<Disciplina> disciplinas, ArrayList<Sala> salas) throws IOException {
        exportaSalas("./salas.txt", salas);
        exportaDisciplinas("./disciplinas.txt", disciplinas);
    }

    private static void exportaSalas(String caminho, ArrayList<Sala> salas) throws IOException {
        // implementar metodo
    }

    private static void exportaDisciplinas(String caminho, ArrayList<Disciplina> disciplinas) throws IOException {
        // implementar metodo
    }
}
