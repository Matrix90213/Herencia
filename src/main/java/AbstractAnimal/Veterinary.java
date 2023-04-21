package AbstractAnimal;
public class Veterinary {
    public static void main(String[] args){
        Cat garfield=new Cat("Garfield","Naranja",5);
        Cat felix=new Cat("Felix","Gris",3);
        Dog firulais=new Dog("Firulais","Manchado",3);
        Rooster claudio=new Rooster("Claudio","Blanco con rojo",1);

        System.out.println("\n--Ejemplo de polimorfismo usando clase abstracta--");
        System.out.println("Invocando al metodo toString:\n");
        System.out.println(garfield.toString());
        System.out.println(felix.toString());
        System.out.println(firulais.toString());
        System.out.println(claudio.toString());
    }
}