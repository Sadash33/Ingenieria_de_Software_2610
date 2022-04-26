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
public class Tablet implements Producto {
    private String marca;
    private String version;
    private String color;
    private int precio;

    public Tablet() {
    }

    public Tablet(String marca, String version, String color, int precio) {
        this.marca = marca;
        this.version = version;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tablet{" + "Marca = " + marca + ", Version = " + version + ", Color = " + color + ", Precio = " + "$" + precio + '}';
    }

    
    
}
