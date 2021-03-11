/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.time.LocalDate;

/**
 *
 * @author raquel
 */
public class PruebaMain {

    public static void main(String[] args) {

        NIF nif = new NIF(12345678L, LocalDate.now());

        System.out.println(nif);
    }

}
