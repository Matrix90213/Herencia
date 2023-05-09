package Array;
public class EjemploArreglos {
    public static void main(String[] args) {
        String[] zoo = {"Monkey","Chimp","Donkey","Elephant","Panda","Lion","Turtle","Zebra","Tiger","Snake"};
        System.out.println("Mi zoologico tiene "+zoo.length+" animales");
        System.out.println("Que son:");
        for (int i=0; i<zoo.length; i++) {
                System.out.println(i+1 + ". " + zoo[i]);
        }
    }
}
