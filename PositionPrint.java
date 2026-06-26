public class PositionPrint {
    public static void main(String[] args) {

        int num = 536289;
        int k = 3;

        // ==========================================
        // 1. Math Method
        // ==========================================

        int cD = 0;
        int temp = num;

        // Count total digits
        while (temp != 0) {
            temp /= 10;
            cD++;
        }
        // cD = 6

        int n = (int) (num % Math.pow(10, cD - k));
        // 536289 % 1000 = 289

        int first = (int) (num / Math.pow(10, cD - k));
        // 536289 / 1000 = 536

        n = (int) (n * Math.pow(10, k));
        // 289 * 1000 = 289000

        int mathAns = n + first;
        // 289000 + 536 = 289536

        System.out.println("Math Method : " + mathAns);


        // ==========================================
        // 2. String Method (Split from Beginning)
        // ==========================================

        String s = String.valueOf(num);
        // s = "536289"

        String s1 = s.substring(0, k);
        // s1 = "536"

        String s2 = s.substring(k);
        // s2 = "289"

        String ans = s2 + s1;
        // ans = "289536"

        int result = Integer.parseInt(ans);
        // result = 289536

        System.out.println("String Start : " + result);


        // ==========================================
        // 3. String Method (Split from End)
        // ==========================================

        int index = s.length() - k;
        // index = 6 - 3 = 3

        String part1 = s.substring(0, index);
        // part1 = "536"

        String part2 = s.substring(index);
        // part2 = "289"

        String finalAns = part2 + part1;
        // finalAns = "289536"

        int finalResult = Integer.parseInt(finalAns);
        // finalResult = 289536

        System.out.println("String End : " + finalResult);
    }
}