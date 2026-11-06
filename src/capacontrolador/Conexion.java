/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capacontrolador;

import java.sql.*;

/**
 *
 * @author marvi
 */
public class Conexion {
    private Connection conexion;
    private Statement ejecutaSentencias;
    public Conexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/sistemas?useSSL=false&serverTimezone=UTC";
            String usuario = "root";
            String password = "";
            //POR DEFECTO EL USUARIO ES ROOT Y SIN CONTRASEÑA
            conexion = DriverManager.getConnection(url, usuario, password);
            ejecutaSentencias = conexion.createStatement();
            System.out.println("SE CONECTO A LA BASE DE DATOS...");
        } catch (SQLException e) {
            System.out.println("NO SE CONECTÓ A LA BASE DE DATOS: ERROR: " + e.getMessage());
        }
    }
    
    public boolean ejecutaSentenciasAccion(String consultaSql) {
        try {
            //PRUEBA COMENTARIO GIT
            return ejecutaSentencias.execute(consultaSql);
        } catch (SQLException e) {
            System.out.println("ERROR: en ejecutaSentenciasAccion: " + e.getMessage());
            return true;
        }
    }
    
    public ResultSet ejecutaSentenciasSelect(String consultaSql) {
        ResultSet listado = null;
        try {
            listado = ejecutaSentencias.executeQuery(consultaSql);
        } catch (SQLException e) {
            System.out.println("ERROR: en ejecutaSentenciasSelect: " + e.getMessage());
        }
        return listado;
    }
}
