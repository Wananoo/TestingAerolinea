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
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int op = 0;
        do
        {
            System.out.println("-- Menu Testing --");
            System.out.println("-- 1) Clase Asiento, getClase() --");
            System.out.println("-- 2) Clase Cliente, getUbicacion() --");
            System.out.println("-- 3) Clase Asiento, getEdad() --");
            System.out.println("-- 4) Clase Vuelo, setFechaVuelo() y setHoraVuelo() --");
            op = Integer.valueOf(br.readLine());
            switch(op)
            {
                case 1:
                {
                    TestingAsientogetClase();
                    break;
                }
                case 2:
                {
                    TestingAsientogetUbicacion();
                    break;
                }
                case 3:
                {
                    TestingClientegetEdad();
                    break;
                }
                case 4:
                {
                    TestingVuelosetFechaVuelosetHoraVuelo();
                    break;
                }
                default:
                {
                    break;
                }
            }
        }while (op != 0 || op<6);
        
        
        
    }
    
    public static void TestingAsientogetClase() throws IOException
        {
        System.out.println("-- Numero --");
        Integer numero = Integer.valueOf(br.readLine());
        TestingAsiento TA = new TestingAsiento(numero,'a');
        
        System.out.println(TA.getClase());
        }
    public static void TestingAsientogetUbicacion() throws IOException
        {
        System.out.println("-- Seccion --");
        Character seccion = br.readLine().charAt((0));
        
        TestingAsiento TA = new TestingAsiento(0,seccion);
        
        System.out.println(TA.getUbicacion());
        }
    public static void TestingClientegetEdad() throws IOException
        {
        System.out.println("-- Fecha de nacimiento --");
        System.out.println("-- \"dd/MM/yyyy\" --");
        String edad = br.readLine();
        
        TestingCliente TC = new TestingCliente(edad);
        
        System.out.println(TC.getEdad());
        }
    public static void TestingVuelosetFechaVuelosetHoraVuelo() throws IOException
        {
        System.out.println("-- Fecha de vuelo --");
        System.out.println("-- \"dd/MM/yyyy\" --");
        String fechavuelo = br.readLine();
        System.out.println("-- Hora de vuelo --");
        System.out.println("-- \"hh:mm\" --");
        String horavuelo = br.readLine();
        
        TestingVuelo TV = new TestingVuelo(fechavuelo,horavuelo);
        System.out.println(TV.getFechaVuelo().toString() +" "+ TV.getHoraVuelo().toString());
        }
}
