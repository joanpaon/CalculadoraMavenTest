/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author JAPO Labs - japolabs@gmail.com
 */
public final class UtilesCalculadora {

    public static final int sumarAbsoluto(int n1, int n2) {
        int suma;

        if (n1 >= 0 && n2 >= 0 && n1 + n2 < 0) {
            suma = -1;
        } else if (n1 < 0 && n2 < 0 && n1 + n2 >= 0) {
            suma = -1;
        } else {
            suma = Math.abs(n1 + n2);
        }

        return suma;
    }

}
