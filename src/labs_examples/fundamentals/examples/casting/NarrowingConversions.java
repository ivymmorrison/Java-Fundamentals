package labs_examples.fundamentals.examples.casting;

public class NarrowingConversions {
    public static void main(String[] args) {
        double x = 10.23;
        System.out.println("x = " + x);
        float f = (float) x;
        System.out.println("f = " + f);
        // double "x" is being casted to an (int) "z" below
        int z = (int) x;
        System.out.println("z = " + z);
        // more examples
        double d = 100.04;
        System.out.println("d = " + d);
        // cast double "d" to long "l" - explicit type labs_examples.fundamentals.examples.casting required
        long l = (long) d;
        // cast long "l" to int "i" - explicit type labs_examples.fundamentals.examples.casting required
        int i = (int) l;
        System.out.println("Long value " + l);
        System.out.println("int value " + i);
    }
}