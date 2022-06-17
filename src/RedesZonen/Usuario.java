package RedesZonen;

public class Usuario {

    protected int mensj;
    protected String correo;
    protected String nombre;

    public int mensjMas() {
        return this.mensj +1;
    }
    public int mensjMenos() {
        return this.mensj -1;
    }
    public String nuevoCorreo(String correo) {
       return this.correo = correo;
    }
}
