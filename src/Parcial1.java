import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante();
        System.out.println("¿Desea agregar un estudiante? (ingrese si o no)");
        String respuesta = scan.next();
        while(true) {

            if(respuesta.equals("si")) {
                System.out.println("Ingrese el nombre");
                String nom = scan.next();
                estudiante1.setNombre(nom);
                System.out.println(estudiante1.getNombre());

                System.out.println("Ingrese el codigo del estudiante");
                int codigo = scan.nextInt();
                estudiante1.setCodigoEstudiante(codigo);
                System.out.println(estudiante1.getCodigoEstudiante());

                System.out.println("Ingrese el SSN");
                int ssn = scan.nextInt();
                estudiante1.setSsn(ssn);
                System.out.println(estudiante1.getSsn());

                System.out.println("Ingrese la direccion actual");
                String direcA = scan.next();
                estudiante1.setDireccionActual(direcA);
                System.out.println(estudiante1.getDireccionActual());

                System.out.println("Ingrese el telefono actual");
                int telefA = scan.nextInt();
                estudiante1.setTelefonoActual(telefA);
                System.out.println(estudiante1.getTelefonoActual());

                System.out.println("Ingrese la direccion permanente");
                String direcP = scan.next();
                estudiante1.setDireccionPermanentes(direcP);
                System.out.println(estudiante1.getDireccionPermanentes());

                System.out.println("Ingrese el telefono permanente");
                int telefP = scan.nextInt();
                estudiante1.setTelefonoPermanentes(telefP);
                System.out.println(estudiante1.getTelefonoPermanentes());

                System.out.println("Ingrese la fecha de nacimiento (dia - mes)");
                int fechanacimiento = scan.nextInt();
                estudiante1.setFechaNacimiento(fechanacimiento);
                System.out.println(estudiante1.getFechaNacimiento());
                System.out.println("Ingrese la fecha actual (dia - mes)");
                int hoy = scan.nextInt();
                estudiante1.cumpleaños(hoy);

                System.out.println("Ingrese el genero del estudiante");
                String sex = scan.next();
                estudiante1.setSexo(sex);
                System.out.println(estudiante1.getSexo());

                System.out.println("Ingrese la clase del estudiante (junior, senior, graduate)");
                String clase = scan.next();
                estudiante1.setClase(clase);
                System.out.println(estudiante1.getClase());

                System.out.println("Ingrese el departamento del estudiante");
                String depa = scan.next();
                estudiante1.setDepartamentoMajor(depa);
                System.out.println(estudiante1.getDepartamentoMajor());
            }

            else if(respuesta.equals("no")) {
                break;
            }

            System.out.println("¿Desea agregar un estudiante? (ingrese si o no)");
            respuesta = scan.next();
        }


    }
}

class Estudiante {

    int codigoEstudiante, ssn, telefonoActual, telefonoPermanentes, fechaNacimiento;
    String nombre, direccionActual, direccionPermanentes, sexo, clase, departamentoMajor;

/*    public Estudiante(String nombre,int codigoEstudiante, int ssn, int telefonoActual,String direccionActual, int telefonoPermanentes, String direccionPermanentes, String fechaNacimiento, String sexo, String clase, String departamentoMajor) {

        this.codigoEstudiante = codigoEstudiante;
        this.ssn = ssn;
        this.telefonoActual = telefonoActual;
        this.telefonoPermanentes = telefonoPermanentes;
        this.nombre = nombre;
        this.direccionActual = direccionActual;
        this.direccionPermanentes = direccionPermanentes;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.clase = clase;
        this.departamentoMajor = departamentoMajor;
    }
*/

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getTelefonoActual() {
        return telefonoActual;
    }

    public void setTelefonoActual(int telefonoActual) {
        this.telefonoActual = telefonoActual;
    }

    public int getTelefonoPermanentes() {
        return telefonoPermanentes;
    }

    public void setTelefonoPermanentes(int telefonoPermanentes) {
        this.telefonoPermanentes = telefonoPermanentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionActual() {
        return direccionActual;
    }

    public void setDireccionActual(String direccionActual) {
        this.direccionActual = direccionActual;
    }

    public String getDireccionPermanentes() {
        return direccionPermanentes;
    }

    public void setDireccionPermanentes(String direccionPermanentes) {
        this.direccionPermanentes = direccionPermanentes;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDepartamentoMajor() {
        return departamentoMajor;
    }

    public void setDepartamentoMajor(String departamentoMajor) {
        this.departamentoMajor = departamentoMajor;
    }

    public void cumpleaños(int dm) {
        if(this.fechaNacimiento == dm) {
            System.out.println("FELIZ CUMPLEAÑOS");
        }
    }
}



