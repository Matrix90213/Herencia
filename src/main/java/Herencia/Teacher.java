package Herencia;
public class Teacher extends Person {
    private String adscription;
    private int biocard;
    private int assignedHours;
    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Teacher(String name, String lastName, String email, String address, String adscription, int biocard, int assignedHours) {
        super(name, lastName, email, address);
        this.adscription = adscription;
        this.biocard = biocard;
        this.assignedHours = assignedHours;
    }
    public String getAdscription() {
        return adscription;
    }

    public void setAdscription(String adscription) {
        this.adscription = adscription;
    }

    public int getBiocard() {
        return biocard;
    }

    public void setBiocard(int biocard) {
        this.biocard = biocard;
    }

    public int getAssignedHours() {
        return assignedHours;
    }
    public void setAssignedHours(int assignedHours) {
        this.assignedHours = assignedHours;
    }
    public String toString () { //Creando un metodo que ya existe, por lo tanto es Sobrecarga un metodo
        return "\n==========Datos del Maestro==========\n" +
                "El Nombre del Maestro es: "+this.getName()+"\n" +
                "Su Apellido es: "+this.getLastName()+"\n" +
                "Su Correo es: "+this.getEmail()+"\n" +
                "Su Direccion es: "+this.getAddress()+"\n" +
                "Su Adscripcion es: " +this.getAdscription()+"\n" +
                "Su BioTarjeta es: "+this.getBiocard()+"\n" +
                "Sus Horas asignadas son: "+this.getAssignedHours()+" hrs";
    }
    public String Soy(){
        return "Soy una Persona y Maestro";
    }
}
