public class OperadoresRelacionais {

    public static void main(String[] args) throws Exception {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.60;
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i1 > i2));
        System.out.println("i1 <= i2: " + (i1 <= i2));

        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 != f2: " + (f1 != f2));
        System.out.println("f1 > f2: " + (f1 > f2));
        System.out.println("f1 <= f2: " + (f1 <= f2));

        System.out.println("d1 <= f2: " + (d1 <= f2));

        System.out.println("s1 == s2: " + (s1 == s2));
        // System.out.println("s1 > s2: " + (s1 > s2));

        System.out.println("b1 == b2: " + (b1 == b2));

        // Disjunção exclusiva:
        // xor | ^
        // true ^ true = false
        // true ^ false = true
    }
}
