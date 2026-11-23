/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author danie
 */
public class Cliente {
    private String telefono;
    private String nombre;
    private String direccion;
    private int zona;

    public Cliente() {
    }

    public Cliente(String telefono, String nombre, String direccion, int zona) {
        setTelefono(telefono);
        setNombre(nombre);
        setDireccion(direccion);
        setZona(zona);
    }

    public static boolean esTelefonoValido(String telefono) {
        return telefono != null && telefono.matches("^9[0-9]{8}$");
    }

    public static boolean esZonaValida(int zona) {
        return zona >= 1 && zona <= 4;
    }

    public static double obtenerTarifaZona(int zona) {
        switch (zona) {
            case 1:
                return 4.00;
            case 2:
                return 6.00;
            case 3:
                return 8.00;
            case 4:
                return 10.00;
            default:
                return 0.0;
        }
    }

    public double getTarifaDelivery() {
        return obtenerTarifaZona(this.zona);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (!esTelefonoValido(telefono)) {
            throw new IllegalArgumentException("El telefono debe tener 9 digitos y empezar con 9.");
        }
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacio.");
        }
        this.nombre = nombre.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La direccion no puede estar vacia.");
        }
        this.direccion = direccion.trim();
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        if (!esZonaValida(zona)) {
            throw new IllegalArgumentException("La zona debe estar entre 1 y 4.");
        }
        this.zona = zona;
    }
}