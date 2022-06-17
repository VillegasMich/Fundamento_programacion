package RedesZonen;

public class Administrador extends Usuario {
    private int baneos;

    public void nuevoNombre(String nick) {
        this.nombre = nick;
    }
    public int baneoMas() {
       return this.baneos +1;
    }
}
