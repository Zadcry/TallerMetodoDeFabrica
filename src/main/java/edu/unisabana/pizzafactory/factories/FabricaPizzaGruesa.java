package edu.unisabana.pizzafactory.factories;


import edu.unisabana.pizzafactory.processes.Amasador;
import edu.unisabana.pizzafactory.processes.Horneador;
import edu.unisabana.pizzafactory.processes.Moldeador;
import edu.unisabana.pizzafactory.processes.gruesa.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.processes.gruesa.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.processes.gruesa.MoldeadorPizzaGruesa;

public class FabricaPizzaGruesa implements FabricaPizza{

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}
