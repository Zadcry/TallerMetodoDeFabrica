package edu.unisabana.pizzafactory.factories;


import edu.unisabana.pizzafactory.processes.Amasador;
import edu.unisabana.pizzafactory.processes.Horneador;
import edu.unisabana.pizzafactory.processes.Moldeador;
import edu.unisabana.pizzafactory.processes.delgada.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.processes.delgada.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.processes.delgada.MoldeadorPizzaDelgada;

public class FabricaPizzaDelgada implements FabricaPizza{

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}