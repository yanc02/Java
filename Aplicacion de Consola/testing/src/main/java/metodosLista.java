import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class metodosLista {

    private List<Persona> personas = new ArrayList<Persona>();

    public void mostrarLista(){
        int i=0;
        System.out.println("------------------------------------------");
        System.out.println("|                  Tabla                 |");
        System.out.println("------------------------------------------");
        System.out.println("|                 Persona                |");
        System.out.println("------------------------------------------");
        System.out.printf("|%2s|%-12s|%-24s|\n","id", "Nombre", "Correo");
        for(Persona item : personas)
        {
            System.out.println("------------------------------------------");
            System.out.printf("|%2d|%-12s|%-24s|\n",item.getId(), item.getName(), item.getEmail());
        }
        System.out.println("------------------------------------------");
    }

    //---------------------------------------------------------------------------------------------------------------

    public void generarLista(){

        Persona persona = new Persona(1,"Jose","Jose@email.com");
        personas.add(persona);
        persona = new Persona(2,"Miguel","Miguel@email.com");
        personas.add(persona);
        persona = new Persona(3,"Pedro","Pedro@email.com");
        personas.add(persona);
        persona = new Persona(4,"antonio","antonio@email.com");
        personas.add(persona);
        persona = new Persona(5,"hernesto","antonio@email.com");
        personas.add(persona);
    }

    public int comprobarLista()
    {
        return personas.size();
    }

    //---------------------------------------------------------------------------------------------------------------

    public void insertarenLista(String nombre, String email){
        int count = 0;

        for(Persona item : personas)
        {
            if((item.getId() - 1) == count)
            {
                count ++;
                continue;
            }
        }
        Persona persona = new Persona((count + 1), nombre, email);
        personas.add(count,persona);

    }

    //---------------------------------------------------------------------------------------------------------------

    public void editarLista(int indice){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insertar Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Insertar Correo:");
        String email = scanner.nextLine();

        Persona persona = new Persona(indice + 1, nombre, email);
        personas.set(indice,persona);

    }

    //---------------------------------------------------------------------------------------------------------------


    public boolean indexDesitionbool(int index){


        int count = 0;

        for(Persona item : personas)
        {
            if(item.getId() == index)
            {
                return false;
            }
        }
        return true;
    }

    //---------------------------------------------------------------------------------------------------------------

    public void detalledePersona(int indice){

        System.out.println("--------------------------------");
        System.out.println("|           Tabla              |");

        for(Persona item : personas)
        {
            if(item.getId() == indice)
            {

                System.out.println("--------------------------------");
                System.out.println("| "+ item.getId() + "  | " + item.getName() + "  | " + item.getEmail() + " |");
                System.out.println("--------------------------------");
            }
        }
    }

    //---------------------------------------------------------------------------------------------------------------


    public void eliminarPersona(int indice){
        int realInd = indice - 1;
        System.out.println(indice - 1);
        System.out.println("--------------------------------");
        System.out.println("|           Tabla              |");

        for(Persona item : personas)
        {
            if(item.getId() == indice)
            {
                System.out.println("--------------------------------");
                System.out.println("| "+ item.getId() + "  | " + item.getName() + "  | " + item.getEmail() + " |");
                System.out.println("--------------------------------");
                System.out.println("Eliminado!!");
            }
        }
        System.out.println(realInd);
        System.out.println(personas.size());
        personas.remove(realInd);
    }


    //---------------------------------------------------------------------------------------------------------------
    public void vaciarLista(){
        personas.clear();
    }

//---------------------------------------------------------------------------------------------------------------
}
