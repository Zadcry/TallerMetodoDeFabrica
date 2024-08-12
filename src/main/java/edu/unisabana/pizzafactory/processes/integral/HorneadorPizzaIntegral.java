package edu.unisabana.pizzafactory.processes.integral;

import edu.unisabana.pizzafactory.processes.Horneador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements Horneador {

        @Override
        public void hornear() {
            Logger.getLogger(HorneadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza integral.");

        }
}
