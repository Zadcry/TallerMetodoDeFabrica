package edu.unisabana.pizzafactory.processes.gruesa;

import edu.unisabana.pizzafactory.processes.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements Moldeador{

        @Override
        public void moldearPizzaPequena() {
            Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                    .log(Level.INFO, "[O] Moldeando pizza pequena de masa pan.");
        }

        @Override
        public void moldearPizzaMediana() {
            Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                    .log(Level.INFO, "[O] Moldeando pizza mediana con masa pan.");
        }
}
