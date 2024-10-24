import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] firstWeight = new int [3];
        firstWeight[0] = 1;
        firstWeight[1] = 2;
        firstWeight[2] = 3;
        String firstWeightString = Arrays.toString(firstWeight);
        System.out.print(Arrays.toString(firstWeight));
        for (int i = 0; i < firstWeight.length; i++) {
            System.out.print(firstWeight[i]);
            if (i != firstWeight.length - 1) {
                System.out.print(",");
            }
        }
        int[] reversedFirstWeight = new int[firstWeight.length];
        for (int i = 0; i < firstWeight.length; i++) {
            reversedFirstWeight[i] = firstWeight[firstWeight.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedFirstWeight));
        System.out.println();
        for (int i = 0; i < firstWeight.length; i++) {
            if (firstWeight[i] % 2 != 0) {
                firstWeight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstWeight));


        System.out.println();
        float [] secondWeight = {1.57f,7.654f, 9.986f};

        float[] reversedSecondWeight = new float[secondWeight.length];
        for (int i = 0; i < secondWeight.length; i++) {
            reversedSecondWeight[i] = secondWeight[secondWeight.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedSecondWeight));

        long [] thirdWeight = new long [5];
        thirdWeight[0]= 45635776765767L;
        thirdWeight[1]= 7635657367657367L;
        thirdWeight[2]= 3365767653L;
        thirdWeight[3]= 56737675L;
        thirdWeight[4]= 76675353365L;
        long[] reversedThirdWeight = new long[thirdWeight.length];
        for (int i = 0; i < thirdWeight.length; i++) {
            reversedThirdWeight[i] = thirdWeight[thirdWeight.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedThirdWeight));
    }
}