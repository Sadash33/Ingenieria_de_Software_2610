package patronfactory;

import articulos.Computadora;
import articulos.Smartphone;        
import articulos.Tablet;
        
public class PatronFactory {
    public static Producto createProducto(int tipo){
        switch (tipo) {
            case Producto.Compu_gamer:
                return new Computadora("Dell", "Intel Core i5", true, 500);
                
            case Producto.Compu_esc:
                return new Computadora("HP", "Intel Celeron", false, 128);
                
            case Producto.Tel_android:
                return new Smartphone("Motorola", 8, 100, 64, 6);
                
            case Producto.Tel_iphone:
                return new Smartphone("Apple", 12, 194, 128, 6);
                
            case Producto.Tablet_sam:
                return new Tablet("Samsung", "Android 10", "Gris", 6799);
                
            case Producto.Tablet_gen:
                return new Tablet("Hyndai", "Android 10", "Negro", 2799);
                
            default:
                throw new AssertionError();
        }
    
    }
    
    
}
