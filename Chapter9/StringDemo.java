package Chapter9;

/**
 * Created by averychen on 4/12/17.
 */
public class StringDemo {

    public static void main (String[] args) {

        String s = "       Welcome To Java.";
        String s1 = "Michael is awesome!";
        String s2 = "Michael";
        String s3 = "Michael";

        System.out.println(s.length());
        System.out.println(s.charAt(3));

        System.out.println(s.concat(s1));

        System.out.println(s.trim());
        System.out.println(s);

        if (s2.equals(s3)) {
            System.out.println("s2 and s3 are the same");
        }

        if(s2.compareTo(s3) < 0){
            System.out.println(s2 + "/n" +s3);
        }
        else {
            System.out.println(s3 + "/n"+ s2);
        }

        if (s.startsWith("Welcome")) {
            System.out.println("very welcome");
        }
    }
}
