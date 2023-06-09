import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Declarar variables
        String nombre, fechaNacimiento, rut;
        String direccion, telefono;
        String departamento;
        String funcion, nombreSuperior;
        int tipo, cantidadEmpleados, aniosExp;
        Scanner leer = new Scanner(System.in);


        // Registrar Usuario preguntas generales

        System.out.println("Ingrese nombre: ");
        nombre = leer.nextLine();

        System.out.println("Ingrese fecha de Nacimiento: ");
        fechaNacimiento = leer.nextLine();

        System.out.println("Ingrese rut: ");
        rut = leer.nextLine();

        System.out.println("Ingrese el tipo: 1: Cliente 2: Profesional 3: Administrativo");
        tipo = leer.nextInt();


        direccion = "";
        telefono = "";
        cantidadEmpleados = 0;
        aniosExp = 0;
        departamento = "";
        funcion = "";
        nombreSuperior = "";


        switch (tipo) {
            case 1 -> {
                // Preguntas opcion 1

                leer = new Scanner(System.in);
                System.out.println("Ingrese direccion: ");
                direccion = leer.nextLine();
                System.out.println("Ingrese telefono: ");
                telefono = leer.nextLine();
                System.out.println("Ingrese cantidad de empleados: ");
                cantidadEmpleados = leer.nextInt();
            }
            case 2 -> {
                // Preguntas opcion 2

                leer = new Scanner(System.in);
                System.out.println("Ingrese años de experiencia: ");
                aniosExp = leer.nextInt();
                System.out.println("Ingrese departamento: ");
                departamento = leer.nextLine();
            }
            case 3 -> {
                // Preguntas opcion 3

                leer = new Scanner(System.in);
                System.out.println("Ingrese funcion: ");
                funcion = leer.nextLine();
                System.out.println("Ingrese nombre del superior: ");
                nombreSuperior = leer.nextLine();
            }
            default -> {

                System.out.println("Ingrese una opcion valida");
                tipo = leer.nextInt();
            }
        }

        mostrarUsuario(nombre, fechaNacimiento, rut, direccion, telefono, cantidadEmpleados,
                aniosExp, departamento,funcion, nombreSuperior,tipo);

    }
    public static void mostrarUsuario(String nombre, String fechaNacimiento, String rut, String direccion, String telefono, int cantidadEmpleados,
                                      int aniosExp, String departamento, String funcion, String nombreSuperior, int op){

        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Rut: " + rut);

        switch (op) {

            case 1 -> {
                System.out.println("Tipo: Cliente");
                System.out.println("Direccion: " + direccion);
                System.out.println("Ingrese telefono: " + telefono);
                System.out.println("Ingrese cantidad de empleados: " + cantidadEmpleados);
            }
            case 2 -> {
                System.out.println("Tipo: Profesional");
                System.out.println("Ingrese años de experiencia: " + aniosExp);
                System.out.println("Ingrese departamento: " + departamento);
            }
            case 3 -> {
                System.out.println("Tipo: Administrativo");
                System.out.println("Ingrese funcion: " + funcion);
                System.out.println("Ingrese nombre del superior: " + nombreSuperior);
            }
            default -> {
            }
        }

    }
}

