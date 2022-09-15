public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(25, "Carlos", "26656", 600);
        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("La edad de " + cliente.getNombre() + " es: " + cliente.getEdad());
        System.out.println("El telefono de " + cliente.getNombre() + " es: " + cliente.getTelefono());
        System.out.println("El credito de " + cliente.getNombre() + " es: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador(32, "Jose", "4211696", 30000);
        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("La edad de " + trabajador.getNombre() + " es: " + trabajador.getEdad());
        System.out.println("El telefono de " + trabajador.getNombre() + " es: " + trabajador.getTelefono());
        System.out.println("El salario de " + trabajador.getNombre() + " es: " + trabajador.getSalario());
    }
}
