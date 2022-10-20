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
    private static UsuarioDAO usuariodao = new UsuarioDAO();
    
    public static void listar(){
        usuariodao.listar();
       
    }
    public static boolean autentificar(String usuario, String contrasenia){
  
        if(obtener(usuario) != null){
            Usuario usuarioConsulta=obtener(usuario);
            System.out.println("hola");
            if(usuarioConsulta.getUsuario().equals(usuario) && usuarioConsulta.getContrasenia().equals(contrasenia)){
                System.out.println("hola2");
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
        
        
        
    }
    
    public static boolean insertar(Usuario usuario){
        return usuariodao.insertar(usuario) ;
    }
    
    public static boolean modificar(Usuario usuario){
        return usuariodao.modificar(usuario) ;
    }
    
    public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario) ;
    }
    
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario) ;
    }
    
    
    
    
    
}
