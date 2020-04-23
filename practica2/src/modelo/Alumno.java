package modelo;


public class Alumno extends Usuario{
    
    public Alumno(String nombre, String apellidos, String nick, String contraseña, String email) {
        super(nombre, apellidos, nick, contraseña, email);
    }

    private boolean tienePenalizacion;

    //establecer fecha de la penalizacion y sumarle dos dia(fin del ban) luego comparar esa fecha en estaPenalizado
    public boolean penalizar(){
        return this.tienePenalizacion = true;
    }

    public boolean estaPenalizado(){ //comparar las fechas de inicio y fin de la clase Penalizacion con la actual
        return this.tienePenalizacion;
    }   
}
