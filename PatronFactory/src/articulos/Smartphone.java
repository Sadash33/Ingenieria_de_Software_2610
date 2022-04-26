/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

import patronfactory.Producto;

/**
 *
 * @author dfgf
 */
public class Smartphone implements Producto {
    private String marca;
    private int megapixeles;
    private int peso;
    private int capacidad;
    private int pantalla;

    public Smartphone() {
    }

    public Smartphone(String marca, int megapixeles, int peso, int capacidad, int pantalla) {
        this.marca = marca;
        this.megapixeles = megapixeles;
        this.peso = peso;
        this.capacidad = capacidad;
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(int megapixeles) {
        this.megapixeles = megapixeles;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Marca = " + marca + ", Megapixeles = " + megapixeles + ", Peso = " + peso + "g, Capacidad = " + capacidad + "GB, Pantalla = " + pantalla + " pulgadas" + '}';
    }
    
    
}
