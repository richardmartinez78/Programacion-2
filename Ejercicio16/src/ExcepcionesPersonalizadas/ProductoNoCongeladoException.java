package frioexpress.excepciones;

public class ProductoNoCongeladoException extends Exception {
    public ProductoNoCongeladoException(String mensaje) {
        super(mensaje);
    }
}