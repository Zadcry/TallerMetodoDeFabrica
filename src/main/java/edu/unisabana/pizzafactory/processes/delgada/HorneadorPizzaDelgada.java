package edu.unisabana.pizzafactory.processes.delgada;

import edu.unisabana.pizzafactory.processes.Horneador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaDelgada implements Horneador{
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");
    }
}
