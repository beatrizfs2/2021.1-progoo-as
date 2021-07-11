package br.ibmec.progoo.as.sistemageral;

import java.io.IOException;
import java.util.ArrayList;

import br.ibmec.progoo.as.entidades.Disciplina;
import br.ibmec.progoo.as.entidades.Sala;

public interface IExportadorDados {
    public void exportaDados(ArrayList<Disciplina> disciplinas, ArrayList<Sala> salas) throws IOException;
}