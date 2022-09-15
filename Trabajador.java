public class Trabajador extends Persona {
    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
    }

    public int getSalario() {
        return salario;
    }
}
