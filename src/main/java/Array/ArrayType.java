package Array;
public class ArrayType {
    public static void main(String[] args) {
        String[] bugs = {"cricket","beetle","ladybug"};
        String[] alias=bugs;
        System.out.println(bugs.equals(alias));//true
        System.out.println(bugs.toString());

        for (int i=0; i<bugs.length; i++){
            System.out.println(bugs[i]);
        }
    }
}
