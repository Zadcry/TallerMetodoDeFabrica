package edu.unisabana.pizzafactory.processes.delgada;

import edu.unisabana.pizzafactory.processes.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaDelgada implements Amasador {
        @Override
        public void amasar() {
            Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                    .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        }
}
