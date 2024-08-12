package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.processes.Amasador;
import edu.unisabana.pizzafactory.processes.Horneador;
import edu.unisabana.pizzafactory.processes.Moldeador;
import edu.unisabana.pizzafactory.processes.integral.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.processes.integral.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.processes.integral.MoldeadorPizzaIntegral;

public class FabricaPizzaIntegral implements FabricaPizza{
    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
}
