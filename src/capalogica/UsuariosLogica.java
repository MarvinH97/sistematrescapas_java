/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

import capacontrolador.Conexion;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author marvi
 */
public class UsuariosLogica {
    Conexion conexion;
    public UsuariosLogica() {
        conexion = new Conexion();
    }
    
    public boolean insertarUsuario(UsuariosDAO pUsuarioDAO) {
        String consultaSQL = "";
        consultaSQL = "INSERT INTO usuarios(correos, nombres, apellidos, claves, niveles) ";
        consultaSQL += "VALUES('" + pUsuarioDAO.getCorreos() + "', '" + pUsuarioDAO.getNombres() + "', '" + pUsuarioDAO.getApellidos() + "', '" + pUsuarioDAO.getClaves() + "', " + pUsuarioDAO.getNiveles() + ")";
        try {
            return conexion.ejecutaSentenciasAccion(consultaSQL);
        } catch (Exception e) {
            System.out.println("ERROR: insertarUsuario: " + e.getMessage());
            return true;
        }
    }
    
    public ArrayList<UsuariosDAO> getListado(UsuariosDAO pUsuariosDAO) {
        String elCorreo = pUsuariosDAO.getCorreos();
        ArrayList<UsuariosDAO> elListadoRetornar = new ArrayList<UsuariosDAO>();
        String consultaSql = "";
        try {
            consultaSql = "SELECT * FROM usuarios ";
            if (!elCorreo.equals("-1")) {
                consultaSql += "WHERE correos = '" + elCorreo + "'";
            }
            ResultSet resultado = conexion.ejecutaSentenciasSelect(consultaSql);
            while (resultado.next()) {                
                UsuariosDAO objUsuariosDAO = new UsuariosDAO();
                objUsuariosDAO.setCorreos(resultado.getString(1));
                objUsuariosDAO.setNombres(resultado.getString(2));
                objUsuariosDAO.setApellidos(resultado.getString(3));
                objUsuariosDAO.setClaves(resultado.getString(4));
                objUsuariosDAO.setNiveles(resultado.getInt(5));
                elListadoRetornar.add(objUsuariosDAO);
            }
        } catch (SQLException e) {
            System.out.println("ERROR en getListado: " + e.getMessage());
        }
        return elListadoRetornar;
    } 
}
