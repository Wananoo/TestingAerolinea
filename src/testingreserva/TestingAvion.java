/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingreserva;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

/**
 *
 * @author wanan
 */
class Cliente implements Serializable
{
    private String pasaporte;
    public Cliente(String identificacion) {
        this.pasaporte = identificacion;
    }
    public String getPasaporte() {
        return pasaporte;
    }
}
class Asiento implements Serializable, Comparable<Asiento>
{
    private Integer numero;
    String getUbicacion()
    {
        return "VENTANA";
    }
    String getClase()
    {
        return "CLASE ECONOMICA";
    }
    public Integer getNumero() {
        return numero;
    }
    @Override
    public int compareTo(Asiento o) {
        return (numero.toString().compareTo(o.getNumero().toString()));
    }
}
class CompararCliente implements Comparator<Cliente>{
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getPasaporte().compareTo(o2.getPasaporte());
    }
}
public class TestingAvion implements Serializable{
    private Map<Asiento, Cliente> asientos;
    private List<Cliente> pasajeros;
    
    public List<Asiento> getAsientosDisponibles(String categoria, String ubicacion) {
        List<Asiento> resultado = new ArrayList();
        for (Asiento asiento: asientos.keySet()) {
            Cliente pasajero = asientos.get(asiento);
            if ((pasajero == null) && 
                    asiento.getUbicacion().equals(ubicacion) && 
                    asiento.getClase().equals(categoria)) {
                resultado.add(asiento);
            }
        }
        Collections.sort(resultado);
        return resultado;
    }
    
    public boolean reservaAsiento(Asiento asiento, Cliente pasajero) throws Error {
        if ((asiento == null) || (!asientos.containsKey(asiento))) {
            throw new Error("Asiento no existe en el avion");
        }
        if ((pasajero != null)) {
            if (Collections.binarySearch(pasajeros, pasajero, new CompararCliente()) >= 0) {
                throw new Error("Pasajero ya existe en la lista de reserva");
            }
        } else {
            throw new Error("Pasajero esta en blanco");
        }

        if ((asientos.get(asiento) == null)) {
            asientos.put(asiento, pasajero);
            pasajeros.add(pasajero);
            return true;
        } else {
            throw new Error("Asiento esta ocupado");
        }
    }
}
