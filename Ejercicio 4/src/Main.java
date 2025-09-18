public class Main {
    public static void main(String[] args) {
        Nacional n1 = new Nacional(101, "Yerba", 100.0f, "Montevideo", false);
        Nacional n2 = new Nacional(102, "Arroz", 100.0f, "Canelones", true);
        Importado i1 = new Importado(201, "Celular", 200.0f, 2007, 50.0f);
        Importado i2 = new Importado(202, "Tablet", 200.0f, 2015, 50.0f);

        System.out.println(n1.getNombre() + " (" + n1.tipoArticulo() + "): $" + n1.precioVenta());
        System.out.println(n2.getNombre() + " (" + n2.tipoArticulo() + "): $" + n2.precioVenta());
        System.out.println(i1.getNombre() + " (" + i1.tipoArticulo() + "): $" + i1.precioVenta());
        System.out.println(i2.getNombre() + " (" + i2.tipoArticulo() + "): $" + i2.precioVenta());
    }
}