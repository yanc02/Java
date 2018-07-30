package com.yan.controllers;
/*Created by IntelliJ IDEA.
        User: yan
        Date: 13/1/2018
        Time: 9:53 PM
*/

import com.yan.dataBaseConfig;
import com.yan.models.persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Controller
public class personasController {

    /*-----------------------------------------Index--------------------------------------------------------*/
    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    public ModelAndView Index(){

        List<persona> personas = new ArrayList<persona>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = dataBaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM personas");

            while (resultSet.next()){
                persona persona = new persona();
                persona.setId(resultSet.getInt("Id"));
                persona.setNombre(resultSet.getString("Nombre"));
                persona.setApellido(resultSet.getString("Apellido"));
                persona.setCedula(resultSet.getString("Cedula"));

                personas.add(persona);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        ModelAndView model = new ModelAndView("personas/index");
        model.addObject("personas", personas);

        return model;
    }

    /*-----------------------------------------Create------------------------------------------------------*/

    @RequestMapping(value = "/personas/create", method = RequestMethod.GET)
    public ModelAndView Create(){

        ModelAndView model = new ModelAndView("personas/create");
        model.addObject("persona", new persona());

        return model;
    }

    @RequestMapping(value = "/personas/create", method = RequestMethod.POST)
    public RedirectView Create(@ModelAttribute("persona")persona persona){

        if(persona != null) {
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
            return new RedirectView("/personas");
        }
        return new RedirectView("errors");
    }

    /*-----------------------------------------Details-----------------------------------------------------*/

    @RequestMapping(value = "/personas/details/{id}", method = RequestMethod.GET)
    public ModelAndView Details(@PathVariable("id") int id){
        persona persona = new persona();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = dataBaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM testing.personas WHERE Id =" + "'" + id + "'");
            while (resultSet.next()){
                persona.setId(resultSet.getInt("Id"));
                persona.setNombre(resultSet.getString("Nombre"));
                persona.setApellido(resultSet.getString("Apellido"));
                persona.setCedula(resultSet.getString("Cedula"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        ModelAndView model = new ModelAndView("personas/details");
        model.addObject("persona", persona);

        return model;
    }

    /*-----------------------------------------Edit--------------------------------------------------------*/

    @RequestMapping(value = "/personas/edit/{id}", method = RequestMethod.GET)
    public ModelAndView Edit(@PathVariable("id") int id){

        persona persona = new persona();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = dataBaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM testing.personas WHERE Id =" + "'" + id + "'");

            while (resultSet.next()){
                persona.setId(resultSet.getInt("Id"));
                persona.setNombre(resultSet.getString("Nombre"));
                persona.setApellido(resultSet.getString("Apellido"));
                persona.setCedula(resultSet.getString("Cedula"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        ModelAndView model = new ModelAndView("personas/edit");
        model.addObject("persona", persona);

        return model;
    }

    @RequestMapping(value = "/personas/edit", method = RequestMethod.POST)
    public RedirectView Edit(@ModelAttribute("persona")persona persona){

        System.out.println(persona.getId() + " " +persona.getNombre() + " " + persona.getApellido() + " " + persona.getCedula());

        if(persona != null) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = dataBaseConfig.getConnection();
                preparedStatement = connection.prepareStatement("UPDATE testing.personas SET Nombre = ?, Apellido = ?, Cedula = ? WHERE  Id ='" + persona.getId() + "'");
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
            return new RedirectView("/personas");

        }
        return new RedirectView("errors");
    }


    /*-----------------------------------------Remove--------------------------------------------------------*/
    @RequestMapping(value = "/personas/remove/{id}", method = RequestMethod.GET)
    public ModelAndView Remove(@PathVariable("id") int id){

        persona persona = new persona();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet  = null;

        try{
            connection = dataBaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM testing.personas WHERE Id =" + "'" + id + "'");

            while (resultSet.next()){
                persona.setId(resultSet.getInt("Id"));
                persona.setNombre(resultSet.getString("Nombre"));
                persona.setApellido(resultSet.getString("Apellido"));
                persona.setCedula(resultSet.getString("Cedula"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet !=null){
                try{
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (connection != null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (statement !=null){
                try{
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

        ModelAndView model = new ModelAndView("personas/remove");
        model.addObject("persona", persona);

        return model;
    }

    @RequestMapping(value = "/personas/removeConfirmed", method = RequestMethod.POST)
    public RedirectView RemoveConfirmed(@ModelAttribute("persona")persona persona){

        System.out.println(persona.getId());
        if(persona != null) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = dataBaseConfig.getConnection();
                preparedStatement = connection.prepareStatement("DELETE FROM personas WHERE Id='"+ persona.getId() +"'");

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
            return new RedirectView("/personas");

        }
        return new RedirectView("errors");
    }
}
