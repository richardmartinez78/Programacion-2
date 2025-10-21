package frioexpress.excepciones;

public class StockMinimoAlcanzadoException extends Exception {
    public StockMinimoAlcanzadoException(String mensaje) {
        super(mensaje);
    }
}