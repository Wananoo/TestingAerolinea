/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingreserva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author wanan
 */
public class TestingReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Numero --");
        Integer numero = Integer.valueOf(br.readLine());
        System.out.println("-- Seccion --");
        Character seccion = br.readLine().charAt((0));
        
        TestingAsiento TA = new TestingAsiento(numero,seccion);
        
        System.out.println(TA.getClase());
    }
    
}
