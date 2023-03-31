public class Student extends Person{
    private int controlNumber;
    private String career;
    private double generalAverage;
    //3 constructores
    public Student() {
    }
    public Student(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Student(String name, String lastName, String email, String address, int controlNumber, String career, double generalAverage) {
        super(name, lastName, email, address);
        this.controlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;
    }
    //Getter and Setter de solo la clase Student
    public int getControlNumber() {
        return controlNumber;
    }
    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public double getGeneralAverage() {
        return generalAverage;
    }
    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }
    public String toString (){//Creando un metodo que ya existe, por lo tanto es Sobrecarga un metodo
        return "\n==========Datos del alumno==========\n" +
                "El Nombre del Alumno es: "+this.getName()+"\n" +
                "Su Apellido es: "+this.getLastName()+"\n" +
                "Su Correo es: "+this.getEmail()+"\n" +
                "Su Direccion es: "+this.getAddress()+"\n" +
                "Su Numero de control es: " +this.getControlNumber()+"\n" +
                "Su Carrera es: "+this.getCareer()+"\n" +
                "Su Promedio es: "+this.getGeneralAverage();
    }
    public String Soy(){
        return "Soy una Persona y Estudiante";
    }
}
