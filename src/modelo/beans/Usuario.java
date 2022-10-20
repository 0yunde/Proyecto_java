/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author Oyunde
 */
public class Usuario {
    private String usuario;
    private String contrasenia;
    private String nombres;
    private String apellidos;
    private String correo;

    
    //constructor
    public Usuario(String usuario, String contrasenia, String nombres, String apellidos, String correo) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    //getter y settter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString(){
        return usuario;
    }
    
}
