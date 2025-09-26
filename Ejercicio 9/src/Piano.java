// Clase Piano que hereda de InstrumentoMusical
class Piano extends InstrumentoMusical {

    @Override
    public void tocarNota(String nota) {
        System.out.println("El piano presiona la tecla para la nota " + nota + ".");
    }
}
