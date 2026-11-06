/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capalogica;

/**
 *
 * @author marvi
 */
public class UsuariosDAO {

    private String correos;
    private String nombres;
    private String apellidos;
    private String claves;
    private int niveles;
    
    /**
     * @return the correos
     */
    public String getCorreos() {
        return correos;
    }

    /**
     * @param correos the correos to set
     */
    public void setCorreos(String correos) {
        this.correos = correos;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the claves
     */
    public String getClaves() {
        return claves;
    }

    /**
     * @param claves the claves to set
     */
    public void setClaves(String claves) {
        this.claves = claves;
    }

    /**
     * @return the niveles
     */
    public int getNiveles() {
        return niveles;
    }

    /**
     * @param niveles the niveles to set
     */
    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }
    
}
