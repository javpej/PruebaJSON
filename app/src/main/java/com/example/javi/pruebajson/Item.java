package com.example.javi.pruebajson;

/**
 * Created by javi on 15/03/17.
 */

public class Item {

    String sCiudad;
    String sTemperatura;
    String sTiempo;

    public Item(String sCiudad, String sTemperatura, String sTiempo) {
        this.sCiudad = sCiudad;
        this.sTemperatura = sTemperatura;
        this.sTiempo = sTiempo;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public String getsTemperatura() {
        return sTemperatura;
    }

    public void setsTemperatura(String sTemperatura) {
        this.sTemperatura = sTemperatura;
    }

    public String getsTiempo() {
        return sTiempo;
    }

    public void setsTiempo(String sTiempo) {
        this.sTiempo = sTiempo;
    }
}
