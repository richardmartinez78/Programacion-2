// Clase Netflix que hereda de PlataformaStreaming
class Netflix extends PlataformaStreaming {
    @Override
    public void reproducirContenido(String contenido) {
        System.out.println("Netflix carga y reproduce la serie/película: " + contenido + ".");
    }
}