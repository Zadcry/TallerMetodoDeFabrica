package edu.unisabana.pizzafactory.processes.gruesa;

import edu.unisabana.pizzafactory.processes.Amasador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements Amasador{

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa pan.");
    }
}
