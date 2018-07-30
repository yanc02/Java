import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class helper {


    public void mostrarPersonas(List<persona> personas) {


        System.out.println("------------------------------------------------------");
        System.out.println("|                       Tabla                        |");
        System.out.println("------------------------------------------------------");
        System.out.println("|                      Persona                       |");
        System.out.println("------------------------------------------------------");
        System.out.printf("|%2s|%-12s|%-12s|%-24s|\n", "id", "Nombre", "Apellido", "Cedula");
        for (persona item : personas) {
            System.out.println("------------------------------------------------------");
            System.out.printf("|%2s|%-12s|%-12s|%-24s|\n", item.getId(), item.getNombre(), item.getApellido(), item.getCedula());
        }
        System.out.println("------------------------------------------------------");
    }

    public void mostrarPersona(persona personaData) {


        System.out.println("------------------------------------------------------");
        System.out.println("|                       Tabla                        |");
        System.out.println("------------------------------------------------------");
        System.out.println("|                      Persona                       |");
        System.out.println("------------------------------------------------------");
        System.out.printf("|%2s|%-12s|%-12s|%-24s|\n", "id", "Nombre", "Apellido", "Cedula");


        System.out.println("------------------------------------------------------");
        System.out.printf("|%2s|%-12s|%-12s|%-24s|\n", personaData.getId(), personaData.getNombre(), personaData.getApellido(), personaData.getCedula());

        System.out.println("------------------------------------------------------");
    }

    public persona encontrarPersona(int id) {
        persona persona = new persona();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dataBaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM testing.personas WHERE Id =" + "'" + id + "'");
            while (resultSet.next()) {
                persona.setId(resultSet.getInt("Id"));
                persona.setNombre(resultSet.getString("Nombre"));
                persona.setApellido(resultSet.getString("Apellido"));
                persona.setCedula(resultSet.getString("Cedula"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return persona;

    }


}
