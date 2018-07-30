import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        metodosServicios testingList = new metodosServicios();
        helper mostrar = new helper();

        int opcion = 5;

        while (opcion > 0 && opcion < 6) {
            System.out.println("Seleccionar una Opcion:");

            System.out.printf("1) %s\n", option.ONE);
            System.out.printf("2) %s\n", option.TWO);
            System.out.printf("3) %s\n", option.THREE);
            System.out.printf("4) %s\n", option.FOUR);
            System.out.printf("5) %s\n", option.FIVE);


            System.out.println("Salir presionando cualquier numero que no este en las opciones......");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Error!");
                System.out.println("Introducir numero valido!!");
                continue;
            }

            switch (opcion) {
                case 1:
                    List<persona> personasDatos = testingList.listarPersonas();
                    mostrar.mostrarPersonas(personasDatos);

                    break;
                case 2:
                    persona datosPersona = new persona();
                    System.out.println("Insertar Nombre:");
                    datosPersona.setNombre(scanner.nextLine());
                    System.out.println("Insertar Apellido:");
                    datosPersona.setApellido(scanner.nextLine());
                    System.out.println("Insertar Cedula:");
                    datosPersona.setCedula(scanner.nextLine());

                    //System.out.println("Insertar Correo:");
                    //String email = scanner.nextLine();

                    testingList.insertarEnTabla(datosPersona);
                    testingList.listarPersonas();
                    mostrar.mostrarPersonas(testingList.listarPersonas());
                    break;

                case 3:
                    System.out.println("Introducir indice a buscar:");
                    int ind3 = 0;

                    ind3 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nombre:");
                    String nombreEditar = scanner.nextLine();
                    System.out.println("Apellido:");
                    String apellidoEditar = scanner.nextLine();
                    System.out.println("Cedula:");
                    String cedulaEditar = scanner.nextLine();
                    testingList.editarPersona(ind3, nombreEditar, apellidoEditar, cedulaEditar);
                    testingList.listarPersonas();
                    break;
                case 4:
                    helper mostrarDetalles = new helper();
                    System.out.println("Introducir indice a buscar:");
                    int ind4 = 0;
                    ind4 = Integer.parseInt(scanner.nextLine());
                    mostrarDetalles.mostrarPersona(testingList.detalledePersona(ind4));
                    break;

                case 5:
                    System.out.println("Introducir indice a buscar:");
                    int ind5 = Integer.parseInt(scanner.nextLine());
                    testingList.eliminarPersona(ind5);
                    testingList.listarPersonas();

                    break;

                default:
                    System.out.println("Saliendo de la App");
                    break;
            }
        }
        System.out.println("Gracias!");
    }


}


