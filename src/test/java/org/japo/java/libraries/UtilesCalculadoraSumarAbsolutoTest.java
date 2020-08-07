/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author JAPO Labs - japolabs@gmail.com
 */
public class UtilesCalculadoraSumarAbsolutoTest {
    @Ignore
    @Test
    public void testSumarAbsoluto01() {
        int n1 = 2;
        int n2 = 3;
        
        int resEsp = 5;
        
        int resCal = UtilesCalculadora.sumarAbsoluto(n1, n2);
        
        assertEquals(resEsp, resCal);
    }

    @Ignore
    @Test
    public void testSumarAbsoluto02() {
        int n1 = Integer.MAX_VALUE;
        int n2 = 1;
        
        int resEsp = -1;
        
        int resCal = UtilesCalculadora.sumarAbsoluto(n1, n2);
        
        assertEquals(resEsp, resCal);
    }
    
    @Ignore
    @Test
    public void testSumarAbsoluto03() {
        int n1 = -2;
        int n2 = -3;
        
        int resEsp = 5;
        
        int resCal = UtilesCalculadora.sumarAbsoluto(n1, n2);
        
        assertEquals(resEsp, resCal);
    }
    
    @Ignore
    @Test
    public void testSumarAbsoluto04() {
        int n1 = Integer.MIN_VALUE;
        int n2 = -1;
        
        int resEsp = -1;
        
        int resCal = UtilesCalculadora.sumarAbsoluto(n1, n2);
        
        assertEquals(resEsp, resCal);
    }
    
}
