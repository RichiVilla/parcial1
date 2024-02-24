package edu.eci.cvds.tdd;
 
import org.junit.Assert;
import org.junit.Test;
 
public class edadTest {

    private validarEdad validar = new validarEdad();

    @Test
    public void deberia_validar_MenorEdad() throws Exception {
        Assert.assertEquals(true, validar.menorEdad(17));
    }

    @Test
    public void deberia_validar_MayorEdad() throws Exception {
        Assert.assertEquals(false, validar.menorEdad(18));
    }

    @Test (expected = Exception.class)
    public void noDeberia_validar_EdadInvalida() throws Exception{
        Assert.assertEquals(false, validar.menorEdad(-10));
    }


	
}