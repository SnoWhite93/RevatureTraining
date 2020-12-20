package wrappers;

public class LongWrapper {

    public static void main(String[] args) {

        Long long1 = 23456789876567L;
        Long long2 = 23456789876567L;
        Long long3 = new Long(23456789876567L);

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("long3 = " + long3);
        System.out.println("long1 == long2 : " + (long1 == long2));
        System.out.println("long1 == long3 : " + (long1 == long3));

        System.out.println("long1.equals(long2) : " + (long1.equals(long2)));
        System.out.println("long1.equals(long3) : " + (long1.equals(long3)));

        long primitiveLong = long1;
        System.out.println("primitiveLong = " + primitiveLong);

        primitiveLong = 12323L;
        long1 = primitiveLong;

        System.out.println("long1 is now = " + long1);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        String g = "23";
        long miles = Long.parseLong(g);
        System.out.println("miles = " + miles);

        miles = 55;
        g = miles + "";
        System.out.println("g is : " + g);
        Long long4 = 2322L;
        g = long4.toString();
        System.out.println("g is now : " + g);

        System.out.println(Long.toBinaryString(23456789876567L));
        System.out.println(Long.toHexString(23456789876567L));
        System.out.println(Long.toOctalString(23456789876567L));

//   if ist object is > than the 2nd  it will return 1, if the same 0, or else -1
        System.out.println("long 4: " + long4);
        System.out.println("long4.compareTo(2322L)" + long4.compareTo(2322L));
        System.out.println("long4.compareTo(3000L)" + long4.compareTo(3000L));
        System.out.println("long4.compareTo(232L)" + long4.compareTo(232L));

        Double dd = 123.45;
        long l = dd.longValue();
        System.out.println("l is " + l);


    }

}
