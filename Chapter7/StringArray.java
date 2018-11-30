package Chapter7;

/**
 * Created by averychen on 3/10/17.
 */
public class StringArray {

    public static void main(String[] args){

        String [] names = {"John", "Mary", "Adam", "Joel"};

        String name = nameAtIndex(names, 1);
        System.out.println("name at position 1: " + name);

        name = nameAtIndex(names, 5);
        System.out.println("name at position 5: " + name);

        name = nameAtIndex(names, -1);
        System.out.println("name at position -1: " + name);
    }

    private static String nameAtIndex(String[] names, int index) {
        String name;
        if (index >= 0 && index < names.length) {
            name = names[index];
        }
        else {
            name = "Not in names list";
        }
        return name;
    }
}
