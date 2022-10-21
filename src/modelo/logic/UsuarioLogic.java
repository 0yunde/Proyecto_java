/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logic;

import modelo.beans.Usuario;
import modelo.dao.UsuarioDAO;

/**
 *
 * @author Oyunde
 */
public class UsuarioLogic {
    //crear objeto 
    private static UsuarioDAO usuariodao = new UsuarioDAO(); //asignando espacio en memoria
    
     //se crean metodos staticos es decir que no serra necesario crear nuevos objetos 
    //para acceder a los metodos
    
    public static void listar(){
        usuariodao.listar();
       
    }
    
    //la autentificacion no se ara dentro de formulario si no aca en la logica se autentifica
    public static boolean autentificar(String usuario, String contrasenia){
        
        //validar si hay usuario registrado
        if(obtener(usuario) != null){
            Usuario usuarioConsulta = obtener(usuario);
            //vallidar que el nombre de usuario y contraseña correponden al usuario para autentificar 
            if(usuarioConsulta.getUsuario().equals(usuario) && usuarioConsulta.getContrasenia().equals(contrasenia)){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
        
    }
    
    //Se utuliza el metodo insertar de dao
    public static boolean insertar(Usuario usuario){
        return usuariodao.insertar(usuario) ;
    }
    //Se utuliza el metodo modificar de dao
    public static boolean modificar(Usuario usuario){
        return usuariodao.modificar(usuario) ;
    }
    //Se utuliza el metodo elimiinar de dao
    public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario) ;
    }
    
    //Se utuliza el metodo obtener de dao
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario) ;
    }
    
    
    
    
    
}
