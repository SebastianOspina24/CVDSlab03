package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

    @Test
    public void validateRegistryResult() {
        
        double resulatado = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,21,66);
        System.out.println(resulatado+"--------------------------------------------------------------");
    }

}
