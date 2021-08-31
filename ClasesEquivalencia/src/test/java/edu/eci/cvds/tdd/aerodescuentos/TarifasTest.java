package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;

import org.junit.Test;

public class TarifasTest {

    @Test
    public void validateSieteUnoCaso() {
        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,20,13);
        Assert.assertEquals(result, 10,0);
    }
    @Test
    public void validateSieteDosCaso() {
        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,20,24);
        Assert.assertEquals(result, 10,0);
    }
    @Test
    public void validateSieteTresCaso() {
        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,21,24);
        Assert.assertEquals(result, 8,5);
    }
    @Test
    public void validateSieteCuatroCaso() {
        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,24,13);
        Assert.assertEquals(result, 8,0);
    }
    @Test
    public void validateSieteCincoCaso() {
        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,24,66);
        Assert.assertEquals(result, 7,7);
    }
    @Test
    public void validateSieteSeisCaso() {
        
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(10,13,66);
        Assert.assertEquals(result, 9,2);
    }

}
