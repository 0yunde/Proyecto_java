/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;



import java.util.ArrayList;
import java.util.List;
import modelo.beans.Usuario;

/**
 *
 * @author Oyunde
 */
public class UsuarioDAO {
    private List<Usuario> usuarios; // requerriimos un arraylist o una lista de usuarios
    
    //generar constructor vacio 
    public UsuarioDAO() {
        usuarios = new ArrayList<>(); //inicializando la lista creada que es usuarrio en el ccodigo de arriba.
    }
    
    
    public void listar() {
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getUsuario() + usuarios.get(i).getContrasenia()
            );
        }
    }
    
    
    //crear diferentes metodos para hacer crud de usuarios, todos estos metodos seran publicos
    
    //recorrer todo el arreglo , para devolver por parametro la posicion en la que se encuentra nuestro elemento.
    public int buscar(String usuario) {
        int n=-1; //para encontrar usuario con su respectiva identificacion
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getUsuario() + usuario );
            //primero devuelve un objeto , luego como se tiene el metodo get lo igualamos a usaurio
            if(usuarios.get(i).getUsuario().equals(usuario)) {
                n=i;
                System.out.println("n" + n + "i" + i);
                break;//para salir  del bucle
            }
            
        }
        return n;
    }
    
    //este metodo servira  para  agregar y en caso encontrar usuario duplicado no realizarlo 
    public boolean insertar(Usuario usuario) {
        //se usa este if para determiinar si existe este usuario para generar la acccion de insertar
        if(buscar(usuario.getUsuario())== -1){
            usuarios.add(usuario);
            return true ;
        }else {
            return false;
        }
    
    }
    
    
    //se usara el obtener para modificar
    public boolean modificar(Usuario usuario) {
        if(buscar(usuario.getUsuario()) != -1){
            Usuario usuarioaux = obtener(usuario.getUsuario());
            
            usuarioaux.setContrasenia(usuario.getContrasenia());
            usuarioaux.setNombres(usuario.getNombres());
            usuarioaux.setApellidos(usuario.getApellidos());
            usuarioaux.setCorreo(usuario.getCorreo());
            
            return true ;
        }else {
            return false;
        }
    
    }
    
    public boolean eliminar(String usuario) {
        if(buscar(usuario) != -1){
            
            usuarios.remove(buscar(usuario));
            return true ;
        }else {
            return false;
        }
    
    }
    
    //este servira para buscar en toda la lista de usuarios que se esta disponibe buscara en que posicion estara el elemento y luego lo devolvera
    public Usuario obtener(String usuario) {
        if(buscar(usuario) != -1) {
            return usuarios.get(buscar(usuario));
        }else {
            return null;
        }
    
    }
    
    
}
