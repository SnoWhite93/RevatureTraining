package wrappers;

public class FloatWrapper {

    public static void main(String[] args) {

        Float float1 = 27.22f;
        Float float2 = 27.22f;
        Float float3 = new Float(27.22);

        System.out.println("float1 = " + float1);
        System.out.println("float2 = " + float2);
        System.out.println("float3 = " + float3);
        System.out.println("float1 == float2 : " + (float1 == float2));
        System.out.println("float1 == float3 : " + (float1 == float3));

        System.out.println("float1.equals(float2) : " + (float1.equals(float2)));
        System.out.println("long1.equals(double3) : " + (float1.equals(float3)));

        float primitivefloat = float1;
        System.out.println("primitivefloat = " + primitivefloat);

        primitivefloat = 242.44f;
        float1 = primitivefloat;

        System.out.println("float1 is now = " + float1);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        String g = "23";
        float miles = Float.parseFloat(g);
        System.out.println("miles = " + miles);

        miles = 55;
        g = miles + "";
        System.out.println("g is : " + g);
        Float float4 = 9.43f;
        g = float4.toString();
        System.out.println("g is now : " + g);

//        System.out.println(Float.toBinaryString( 34.22));
          System.out.println(Float.toHexString(27.22f));
//        System.out.println(Float.toOctalString( 34.22));

//   if ist object is > than the 2nd  it will return 1, if the same 0, or else -1
        System.out.println("float4 : " + float4);
        System.out.println("double.compareTo(34.22)" + float4.compareTo(9.43f));
        System.out.println("double.compareTo(233.1)" + float4.compareTo(33.56f));
        System.out.println("double.compareTo(11.5)" + float4.compareTo(2.33f));

        Integer ii = 77;
        float d = ii.floatValue();
        System.out.println("d is " + d);

    }

}