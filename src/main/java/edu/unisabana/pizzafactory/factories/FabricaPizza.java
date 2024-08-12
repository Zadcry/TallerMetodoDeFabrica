package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.processes.Amasador;
import edu.unisabana.pizzafactory.processes.Horneador;
import edu.unisabana.pizzafactory.processes.Moldeador;

public interface FabricaPizza {
    Amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();
}

