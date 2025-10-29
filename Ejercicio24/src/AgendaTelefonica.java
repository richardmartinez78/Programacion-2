import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    public static void main(String[] args) {
        // Crear HashMap con nombre como clave y teléfono como valor
        HashMap<String, String> agenda = new HashMap<>();

        // Agregar contactos
        agenda.put("Ana", "091234567");
        agenda.put("Carlos", "098765432");
        agenda.put("Lucía", "099112233");
        agenda.put("Martín", "092223344");

        // Mostrar todos los contactos
        System.out.println("📞 Agenda Telefónica:");
        for (Map.Entry<String, String> contacto : agenda.entrySet()) {
            System.out.println("👤 " + contacto.getKey() + " → " + contacto.getValue());
        }
    }
}