public class DecimalToAnyBase {

    // Function to convert decimal to any base
    static String convert(int num, int base) {

        return Integer.toString(num, base).toUpperCase();
    }

    public static void main(String[] args) {

        int num = 255;

        System.out.println("Decimal      : " + num);
        System.out.println("Binary       : " + convert(num, 2));
        System.out.println("Octal        : " + convert(num, 8));
        System.out.println("Hexadecimal  : " + convert(num, 16));
        System.out.println("Base 3       : " + convert(num, 3));
        System.out.println("Base 5       : " + convert(num, 5));
    }
}