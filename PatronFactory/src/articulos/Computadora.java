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
public class Computadora implements Producto {
    private String fabricante;
    private String procesador;
    private boolean tarjeta_grafica;
    private int almacenamiento; 

    public Computadora() {
    }

    public Computadora(String fabricante, String procesador, boolean tarjeta_grafica, int almacenamiento) {
        this.fabricante = fabricante;
        this.procesador = procesador;
        this.tarjeta_grafica = tarjeta_grafica;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return fabricante;
    }

    public void setMarca(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public boolean isTarjeta_grafica() {
        return tarjeta_grafica;
    }

    public void setTarjeta_grafica(boolean tarjeta_grafica) {
        this.tarjeta_grafica = tarjeta_grafica;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca = " + fabricante + ", Procesador = " + procesador + ", Tarjeta Grafica = " + tarjeta_grafica + ", Almacenamiento = " + almacenamiento + " GB" + '}';
    }
    
    
}
