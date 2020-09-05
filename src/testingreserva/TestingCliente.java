/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingreserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author wanan
 */
public class TestingCliente {
    private Date fechaNac;
    public TestingCliente(String fechaNac) {
        setFechaNac(fechaNac);
    }
    public void setFechaNac(String fechaNac) {
        try {
            this.fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNac);
        } catch (ParseException ex) {
        }
    }
    public Integer getEdad() {
        Calendar fechaNac_ = Calendar.getInstance();
        fechaNac_.setTime(fechaNac);
        try {
            return Math.abs(Calendar.getInstance().get(Calendar.YEAR) - fechaNac_.get(Calendar.YEAR));
        } catch (ArithmeticException e) {
            return -1;
        }
    }
}
