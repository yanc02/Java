import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        metodosLista testingList = new metodosLista();

        int opcion = 5;

        while(opcion > 0 && opcion < 8  )
        {
            System.out.println("Seleccionar una Opcion:");

            System.out.printf("1) %s\n",Option.ONE);
            System.out.printf("2) %s\n",Option.TWO);
            System.out.printf("3) %s\n",Option.THREE);
            System.out.printf("4) %s\n",Option.FOUR);
            System.out.printf("5) %s\n",Option.FIVE);
            System.out.printf("6) %s\n",Option.SIX);
            System.out.printf("7) %s\n",Option.SEVEN);

            System.out.println("Salir presionando cualquier numero que no este en las opciones......");

            try{
                opcion = Integer.parseInt(scanner.nextLine());

            }catch(Exception e)
            {
                System.out.println("Error!");
                System.out.println("Introducir numero valido!!");
                continue;
            }

            switch ( opcion ) {
                case 1:
                    testingList.mostrarLista();
                    break;
                case 2:
                    int size = testingList.comprobarLista();
                    if(size != 0)
                    {
                        System.out.println("La lista esta llena!!!");
                        System.out.println("Debe de estar vacia.....");
                        break;

                    }
                    testingList.generarLista();
                    testingList.mostrarLista();
                    break;
                case 3:
                    System.out.println("Insertar Nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Insertar Correo:");
                    String email = scanner.nextLine();

                    testingList.insertarenLista(nombre,email);
                    testingList.mostrarLista();
                    break;
                case 4:
                    boolean indexDesition4 = true;
                    System.out.println("Introducir indice a buscar:");
                    int ind4 = 0;

                    do{
                        try{
                            ind4 = Integer.parseInt(scanner.nextLine());
                            if(ind4 == 0)
                            {
                                System.out.println("La lista esta vacia!");
                                break;
                            }
                        }catch(NumberFormatException e){
                            System.out.println("Error!");
                            System.out.println("Introducir indice valido!!");
                            continue;
                        }

                        indexDesition4 = testingList.indexDesitionbool(ind4);

                        System.out.println("Error!");
                        System.out.println("Introducir indice valido!!");

                    }while(indexDesition4);

                    testingList.editarLista(ind4 - 1);
                    testingList.mostrarLista();

                    break;
                case 5:
                    boolean indexDesition = true;
                    System.out.println("Introducir indice a buscar:");
                    int ind5 = 0;

                    do{
                        try{

                            ind5 = Integer.parseInt(scanner.nextLine());

                        }catch(NumberFormatException e){
                            System.out.println("Error!");
                            System.out.println("Introducir indice valido!!");
                            continue;
                        }

                        indexDesition = testingList.indexDesitionbool(ind5);

                        System.out.println("Error!");
                        System.out.println("Introducir indice valido!!");

                    }while(indexDesition);

                    testingList.detalledePersona(ind5);

                    break;
                case 6:
                    System.out.println("Introducir indice a buscar:");
                    try{

                        int ind6 = Integer.parseInt(scanner.nextLine());

                        testingList.eliminarPersona(ind6);
                        testingList.mostrarLista();

                    }catch(IndexOutOfBoundsException e)
                    {
                        System.out.println("Error!");
                        System.out.println("Introducir indice valido!!");
                    }
                    break;
                case 7:
                    testingList.vaciarLista();
                    testingList.mostrarLista();
                    break;
                default:
                    System.out.println("Saliendo de la App" );
                    break;
            }
        }
        System.out.println("Gracias!");
    }


}


