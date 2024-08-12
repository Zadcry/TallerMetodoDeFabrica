
package edu.unisabana.pizzafactory.consoleview;


import edu.unisabana.pizzafactory.factories.FabricaPizzaIntegral;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.factories.FabricaPizza;
import edu.unisabana.pizzafactory.factories.FabricaPizzaDelgada;

import edu.unisabana.pizzafactory.processes.Amasador;
import edu.unisabana.pizzafactory.processes.Horneador;
import edu.unisabana.pizzafactory.processes.Moldeador;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();
            FabricaPizza fabrica=new FabricaPizzaIntegral();
            pp.prepararPizza(ingredientes, Tamano.PEQUENO, fabrica);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, FabricaPizza fabrica)
            throws ExcepcionParametrosInvalidos {
        Amasador am = fabrica.crearAmasador();
        Horneador hor = fabrica.crearHorneador();
        Moldeador mol = fabrica.crearMoldeador();
        am.amasar();

        if (tam == Tamano.PEQUENO) {
            mol.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mol.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hor.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
