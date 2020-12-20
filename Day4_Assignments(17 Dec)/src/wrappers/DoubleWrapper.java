package wrappers;

public class DoubleWrapper {

    public static void main(String[] args) {

        Double double1 = 34.22;
        Double double2 = 34.22;
        Double double3 = new Double(34.22);

        System.out.println("double1 = " +  double1);
        System.out.println("double2 = " + double2);
        System.out.println("double3 = " + double3);
        System.out.println("double1 == double2 : " + (double1==double2));
        System.out.println("double1 == double3 : " + (double1==double3));

        System.out.println("double1.equals(double2) : " + (double1.equals(double2)));
        System.out.println("long1.equals(double3) : " + (double1.equals(double3)));

        double primitivedouble = double1;
        System.out.println("primitivedouble = " + primitivedouble);

        primitivedouble = 123.56;
        double1 = primitivedouble;

        System.out.println("double1 is now = " + double1);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        String g = "98";
        double miles = Double.parseDouble(g);
        System.out.println("miles = " + miles);

        miles = 55;
        g = miles + "";
        System.out.println("g is : " + g);
        Double double4 = 11.43;
        g = double4.toString();
        System.out.println("g is now : " + g);

//        System.out.println(Double.toBinaryString( 34.22));
        System.out.println(Double.toHexString(34.22));
//        System.out.println(Double.toOctalString( 34.22));

//   if ist object is > than the 2nd  it will return 1, if the same 0, or else -1
        System.out.println("double 4: " + double4);
        System.out.println("double.compareTo(34.22)" + double4.compareTo(34.22));
        System.out.println("double.compareTo(233.1)" + double4.compareTo(233.1));
        System.out.println("double.compareTo(11.5)" + double4.compareTo(11.5));

        Integer ii = 123;
        double d  = ii.doubleValue();
        System.out.println("d is " + d);

    }
}
