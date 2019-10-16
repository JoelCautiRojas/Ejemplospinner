package com.example.ejemplo_spinner.data.models;

public class SpinnerModelAdapter {

    private String nombre;
    private String capital;

    public SpinnerModelAdapter(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
