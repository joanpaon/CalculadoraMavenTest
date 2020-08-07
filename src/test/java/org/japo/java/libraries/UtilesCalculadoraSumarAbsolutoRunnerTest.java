/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author JAPO Labs - japolabs@gmail.com
 */
@RunWith(value = Parameterized.class)
public class UtilesCalculadoraSumarAbsolutoRunnerTest {

    private final int n1;
    private final int n2;
    private final int resEsp;

    public UtilesCalculadoraSumarAbsolutoRunnerTest(int n1, int n2, int resEsp) {
        this.n1 = n1;
        this.n2 = n2;
        this.resEsp = resEsp;
    }

    @Ignore
    @Parameters
    public static Iterable<Object[]> obtenerDatosPrueba() {
        ArrayList<Object[]> lista = new ArrayList<>();

        lista.add(new Object[]{2, 3, 5});
        lista.add(new Object[]{-2, 3, 1});
        lista.add(new Object[]{2, -3, 1});
        lista.add(new Object[]{-2, -3, 5});

        return lista;
    }

    @Parameters
    public static Iterable<Object[]> generarDatosPrueba() {
        return Arrays.asList(new Object[][]{
            {2, 3, 5},
            {-2, 3, 1},
            {2, -3, 1},
            {-2, -3, 5}
        });
    }

    @Test
    public void testSumarAbsoluto() {

        int resCal = UtilesCalculadora.sumarAbsoluto(n1, n2);

        assertEquals(resEsp, resCal);
    }
}
