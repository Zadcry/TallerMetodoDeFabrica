package edu.unisabana.pizzafactory.processes.integral;

import edu.unisabana.pizzafactory.processes.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements Amasador {

        @Override
        public void amasar() {
            Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                    .log(Level.INFO, "[@@] Amasando la pizza integral.");
        }
}
