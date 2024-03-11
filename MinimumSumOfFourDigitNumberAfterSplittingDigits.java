package NeedMoreSpace2;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static int minimumSum(int num) {
        //Split apart the number into single numbers
        int num1 = num % 10;
        num /= 10;

        int num2 = num % 10;
        num /= 10;

        int num3 = num % 10;
        num /= 10;

        int num4 = num % 10;

        //create all 36 possibilities (This assumes that every digit is unique)
        int[] sums = new int[36];
        sums[0] = num1 + ((num2 * 100) + (num3 * 10) + num4);
        sums[1] = num1 + ((num2 * 100) + (num4 * 10) + num3);
        sums[2] = num1 + ((num3 * 100) + (num2 * 10) + num4);
        sums[3] = num1 + ((num3 * 100) + (num4 * 10) + num2);
        sums[4] = num1 + ((num4 * 100) + (num2 * 10) + num3);
        sums[5] = num1 + ((num4 * 100) + (num3 * 10) + num2);

        sums[6] = num2 + ((num1 * 100) + (num3 * 10) + num4);
        sums[7] = num2 + ((num1 * 100) + (num4 * 10) + num3);
        sums[8] = num2 + ((num3 * 100) + (num1 * 10) + num4);
        sums[9] = num2 + ((num3 * 100) + (num4 * 10) + num1);
        sums[10] = num2 + ((num4 * 100) + (num1 * 10) + num3);
        sums[11] = num2 + ((num4 * 100) + (num3 * 10) + num1);

        sums[12] = num3 + ((num2 * 100) + (num1 * 10) + num4);
        sums[13] = num3 + ((num2 * 100) + (num4 * 10) + num1);
        sums[14] = num3 + ((num1 * 100) + (num2 * 10) + num4);
        sums[15] = num3 + ((num1 * 100) + (num4 * 10) + num2);
        sums[16] = num3 + ((num4 * 100) + (num2 * 10) + num1);
        sums[17] = num3 + ((num4 * 100) + (num1 * 10) + num2);

        sums[18] = num4 + ((num2 * 100) + (num3 * 10) + num1);
        sums[19] = num4 + ((num2 * 100) + (num1 * 10) + num3);
        sums[20] = num4 + ((num3 * 100) + (num2 * 10) + num1);
        sums[21] = num4 + ((num3 * 100) + (num1 * 10) + num2);
        sums[22] = num4 + ((num1 * 100) + (num2 * 10) + num3);
        sums[23] = num4 + ((num1 * 100) + (num3 * 10) + num2);

        sums[24] = ((num2 * 10) + num1) + ((num3 * 10) + num4);
        sums[25] = ((num2 * 10) + num1) + ((num4 * 10) + num3);

        sums[26] = ((num3 * 10) + num1) + ((num2 * 10) + num4);
        sums[27] = ((num3 * 10) + num1) + ((num4 * 10) + num2);

        sums[28] = ((num4 * 10) + num1) + ((num2 * 10) + num3);
        sums[29] = ((num4 * 10) + num1) + ((num3 * 10) + num2);

        sums[30] = ((num1 * 10) + num2) + ((num3 * 10) + num4);
        sums[31] = ((num1 * 10) + num2) + ((num4 * 10) + num3);

        sums[32] = ((num1 * 10) + num3) + ((num2 * 10) + num4);
        sums[33] = ((num1 * 10) + num3) + ((num4 * 10) + num2);

        sums[34] = ((num1 * 10) + num4) + ((num3 * 10) + num2);
        sums[35] = ((num1 * 10) + num4) + ((num2 * 10) + num3);

        //Find the minimum
        int min = 1009; //The max possible number results from 999 + 9 and equals 1008, so I use a minimum that is higher than that
        for(int i = 0; i < sums.length; i++){
            if(min > sums[i]) min = sums[i];
        }

        return min;
    }

    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }
}