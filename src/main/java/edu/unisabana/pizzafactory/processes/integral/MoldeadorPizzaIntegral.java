package edu.unisabana.pizzafactory.processes.integral;

import edu.unisabana.pizzafactory.processes.Moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements Moldeador {

        @Override
        public void moldearPizzaPequena() {
            Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                    .log(Level.INFO, "[O] Amasando la pizza delgada integral.");
        }

        @Override
        public void moldearPizzaMediana() {
            Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                    .log(Level.INFO, "[O] Amasando la pizza delgada integral.");
        }

}
