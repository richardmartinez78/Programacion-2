public class Prueba {
    public static void main(String[] args) {
        // Crear artículos nacionales
        Nacional yerba = new Nacional(101, "Yerba", 100.0f, "Montevideo", false);
        Nacional arroz = new Nacional(102, "Arroz", 100.0f, "Canelones", true);

        // Crear artículos importados
        Importado celular = new Importado(201, "Celular", 200.0f, 2007, 50.0f);
        Importado tablet = new Importado(202, "Tablet", 200.0f, 2015, 50.0f);

        // Probar métodos y mostrar datos
        System.out.println("=== PRUEBA DE ARTÍCULOS ===\n");

        // Nacional Yerba
        System.out.println("Código: " + yerba.getCodigo());
        System.out.println("Nombre: " + yerba.getNombre());
        System.out.println("Departamento: " + yerba.getDepartamento());
        System.out.println("Subsidiado: " + yerba.getSubsidiado());
        System.out.println("Tipo: " + yerba.tipoArticulo());
        System.out.println("Precio Venta: $" + yerba.precioVenta());
        System.out.println();

        // Nacional Arroz
        System.out.println("Código: " + arroz.getCodigo());
        System.out.println("Nombre: " + arroz.getNombre());
        System.out.println("Departamento: " + arroz.getDepartamento());
        System.out.println("Subsidiado: " + arroz.getSubsidiado());
        System.out.println("Tipo: " + arroz.tipoArticulo());
        System.out.println("Precio Venta: $" + arroz.precioVenta());
        System.out.println();

        // Importado Celular
        System.out.println("Código: " + celular.getCodigo());
        System.out.println("Nombre: " + celular.getNombre());
        System.out.println("Año Importación: " + celular.getAnioImportacion());
        System.out.println("Impuesto: $" + celular.getImpuesto());
        System.out.println("Tipo: " + celular.tipoArticulo());
        System.out.println("Precio Venta: $" + celular.precioVenta());
        System.out.println();

        // Importado Tablet
        System.out.println("Código: " + tablet.getCodigo());
        System.out.println("Nombre: " + tablet.getNombre());
        System.out.println("Año Importación: " + tablet.getAnioImportacion());
        System.out.println("Impuesto: $" + tablet.getImpuesto());
        System.out.println("Tipo: " + tablet.tipoArticulo());
        System.out.println("Precio Venta: $" + tablet.precioVenta());
    }
}