
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiomartin
 */
public class Usuario {
    
    private String nombre ;
    private String apellidos;
    private String contraseña;
    private String email;
    private ArrayList<String> notificaciones;
 
    
    public void recibirNotificacion(String notificacion){
        notificaciones.add(notificacion);
    }

    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }    
}
