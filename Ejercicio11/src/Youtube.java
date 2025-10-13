// Clase YouTube que hereda de PlataformaStreaming
class YouTube extends PlataformaStreaming {
    @Override
    public void reproducirContenido(String contenido) {
        System.out.println("YouTube carga y reproduce el video de: " + contenido + ".");
    }
}