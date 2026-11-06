/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

import capacontrolador.Conexion;

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
}
