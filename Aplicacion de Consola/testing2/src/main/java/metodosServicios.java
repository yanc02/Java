import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class metodosServicios {

    /*-----------------------------------------Listar------------------------------------------------------*/

    public List<persona> listarPersonas() {
        List<persona> personas = new ArrayList<persona>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dataBaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM personas");

            while (resultSet.next()) {
                persona persona = new persona();
                persona.setId(resultSet.getInt("Id"));
                persona.setNombre(resultSet.getString("Nombre"));
                persona.setApellido(resultSet.getString("Apellido"));
                persona.setCedula(resultSet.getString("Cedula"));

                personas.add(persona);
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
        return personas;
    }
    //---------------------------------------Insertar----------------------------------------------------------------

    public void insertarEnTabla(persona persona) {

        if (persona != null) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = dataBaseConfig.getConnection();
                preparedStatement = connection.prepareStatement("INSERT INTO personas(Nombre, Apellido, Cedula)" +
                        "VALUES (?,?,?)");
                preparedStatement.setString(1, persona.getNombre());
                preparedStatement.setString(2, persona.getApellido());
                preparedStatement.setString(3, persona.getCedula());
                preparedStatement.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
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
            }
        }
    }
    //-------------------------------------------Editar----------------------------------------------------------------

    public void editarPersona(int id, String nombre, String apellido, String cedula) {
        helper mostrarencontrarPersona = new helper();
        persona persona = mostrarencontrarPersona.encontrarPersona(id);
        mostrarencontrarPersona.mostrarPersona(persona);
        System.out.println("Modificado!!!!");

//--------------------------------------------------------------------------------------------------------------------------

        if (persona != null) {
            Connection connection1 = null;
            PreparedStatement preparedStatement = null;

            try {
                connection1 = dataBaseConfig.getConnection();
                preparedStatement = connection1.prepareStatement("UPDATE testing.personas SET Nombre = ?, Apellido = ?, Cedula = ? WHERE  Id ='" + id + "'");
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, apellido);
                preparedStatement.setString(3, cedula);
                preparedStatement.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (connection1 != null) {
                    try {
                        connection1.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //-------------------------------------------Detalles--------------------------------------------------------------

    public persona detalledePersona(int id) {

        helper encontrar = new helper();
        persona persona = encontrar.encontrarPersona(id);
        return persona;
    }
    //----------------------------------------Eliminar---------------------------------------------------------------


    public void eliminarPersona(int id) {
        helper encontrar = new helper();
        persona persona = encontrar.encontrarPersona(id);

        encontrar.mostrarPersona(persona);
        System.out.println("Eliminado!");

        if (persona != null) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            try {
                connection = dataBaseConfig.getConnection();
                preparedStatement = connection.prepareStatement("DELETE FROM personas WHERE Id='" + persona.getId() + "'");
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
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
            }
        }
    }
}
