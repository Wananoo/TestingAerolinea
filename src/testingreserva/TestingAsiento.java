/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingreserva;

/**
 *
 * @author wanan
 */
public class TestingAsiento {
    
    private Integer numero;
    private Character seccion;
    
    //CONSTRUCTOR
    public TestingAsiento() {
    }
    //CONSTRUCTOR
    public TestingAsiento(Integer numero, Character seccion) {
        this.numero = numero;
        this.seccion = seccion;
    }
    
    public String getClase() throws Error {
        try {
            if ((numero.compareTo(1) >= 0) && (numero.compareTo(5) <= 0)) {
                return "PRIMERA CLASE";
            }
            if ((numero.compareTo(6) >= 0) && (numero.compareTo(15) <= 0)) {
                return "CLASE ECONOMICA";
            }
            throw new Error("No se pudo obtener la clase");
        } catch (NullPointerException | NumberFormatException e) {
            throw new Error("No se pudo obtener la clase");
        }
    }
    public String getUbicacion() throws Error {
        try {
            switch (seccion) {
                case 'A':
                case 'D':
                    return "VENTANA";
                case 'B':
                case 'C':
                    return "PASILLO";
                default:
                    return null;
            }
        } catch (NullPointerException e) {
            throw new Error("No se pudo obtener la ubicacion");
        }
    }
    
}
