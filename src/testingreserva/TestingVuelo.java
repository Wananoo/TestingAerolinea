/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingreserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wanan
 */
public class TestingVuelo {
    private Date fechaVuelo;
    private Date horaVuelo;
    
    public TestingVuelo(String fV, String hV){
        setFechaVuelo(fV);
        setHoraVuelo(hV);
    }
    
    public void setFechaVuelo(String fechaVuelo) {
        try {
            this.fechaVuelo = new SimpleDateFormat("dd/MM/yyyy").parse(fechaVuelo);
        } catch (ParseException ex) {
        }
    }
    public void setHoraVuelo(String horaVuelo) {
        try {
            this.horaVuelo = new SimpleDateFormat("hh:mm").parse(horaVuelo);
        } catch (ParseException ex) {
        }
    }
    public Date getFechaVuelo() {
        return fechaVuelo;
    }
    public Date getHoraVuelo() {
        return fechaVuelo;
    }
}
