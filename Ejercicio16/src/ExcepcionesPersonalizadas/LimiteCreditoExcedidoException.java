package frioexpress.excepciones;

public class LimiteCreditoExcedidoException extends Exception {
    public LimiteCreditoExcedidoException(String mensaje) {
        super(mensaje);
    }
}