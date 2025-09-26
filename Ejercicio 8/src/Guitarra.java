// Clase Guitarra que hereda de InstrumentoMusical
class Guitarra extends InstrumentoMusical {

    @Override
    public void tocarNota(String nota) {
        System.out.println("La guitarra rasguea la nota " + nota + ".");
    }
}
