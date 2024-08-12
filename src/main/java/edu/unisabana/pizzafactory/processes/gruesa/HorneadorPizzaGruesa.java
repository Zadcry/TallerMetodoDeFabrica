package edu.unisabana.pizzafactory.processes.gruesa;

import edu.unisabana.pizzafactory.processes.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {

        @Override
        public void hornear() {
            Logger.getLogger(HorneadorPizzaGruesa.class.getName())
                    .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa pan.");
        }

}
