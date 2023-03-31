public class SchoolApp {
    public static void main (String[] args) {
        //Objeto
        Student student1 = new Student("Ian", "Pillado",
                "ian@gmail.com", "Josefa Ortiz de Dominguez");

        Teacher teacher1 = new Teacher("Maria", "Morales",
                "Maria@gmail.com", "Ruffo Figueroa");

        System.out.println("El nombre del Student1 = " + student1.getName() + " " + student1.getLastName());
        System.out.println("El nombre del Teacher1 = " + teacher1.getName() + " " + teacher1.getLastName());

        //Student
        student1.setControlNumber(22670007);
        student1.setCareer("Ing. en Informatica");
        student1.setGeneralAverage(9.8);
        //Teacher
        teacher1.setAdscription("Contaduria");
        teacher1.setBiocard(1132322132);
        teacher1.setAssignedHours(8);

        //Probando la sobrecarga de un metodo
        System.out.println("\nMetodo toString() de Student : " + student1.toString());
        System.out.println("\nMetodo toString() de Teacher : " + teacher1.toString());

        System.out.println("\nEl Student: "+student1.Soy());
        System.out.println("El Teacher: "+teacher1.Soy());
    }

}
