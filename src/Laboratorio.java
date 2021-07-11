package br.ibmec.progoo.as.entidades;

public class Laboratorio extends Sala {

    private String[] equipamentos;

    public Laboratorio (String[] equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String[] getEquipamentos() {
		return equipamentos;
	}

    
    @Override
    public String toString() {
        return "Equipamentos: " + this.getEquipamentos()
                                
    }
}
