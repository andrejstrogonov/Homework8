import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1 задача
        //1 массив
        int [] firstWeight = new int [3];
        firstWeight[0] = 1;
        firstWeight[1] = 2;
        firstWeight[2] = 3;
        // 2 массив
        float [] secondWeight = {1.57f,7.654f, 9.986f};
        // 3 массив
        long [] thirdWeight = new long [5];
        thirdWeight[0]= 45635776765767L;
        thirdWeight[1]= 7635657367657367L;
        thirdWeight[2]= 3365767653L;
        thirdWeight[3]= 56737675L;
        thirdWeight[4]= 76675353365L;
        //2 задача
        System.out.println(Arrays.toString(firstWeight));//1 массив
        System.out.println(Arrays.toString(secondWeight)); //2 массив
        System.out.println(Arrays.toString(thirdWeight)); //3 массив
        System.out.println("Третья задача");
        // 3 задача
        // 1 массив
        //1 способ
        System.out.println("Первый способ");
        for (int i = 0; i < firstWeight.length; i++) {
            System.out.print(firstWeight[i]);
            if (i != firstWeight.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\nРеверсированный первый способ");//не понимаю идеи
        for (int i = firstWeight.length - 1; i >= 0; i--) {
            System.out.print(firstWeight[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println("\nВторой способ");
        //2 способ
        int[] reversedFirstWeight = new int[firstWeight.length];
        for (int i = 0; i < firstWeight.length; i++) {
            reversedFirstWeight[i] = firstWeight[firstWeight.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedFirstWeight));
        //2 массив
        float[] reversedSecondWeight = new float[secondWeight.length];
        for (int i = 0; i < secondWeight.length; i++) {
            reversedSecondWeight[i] = secondWeight[secondWeight.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedSecondWeight));
        //3 массив
        long[] reversedThirdWeight = new long[thirdWeight.length];
        for (int i = 0; i < thirdWeight.length; i++) {
            reversedThirdWeight[i] = thirdWeight[thirdWeight.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedThirdWeight));
        //4 задача
        System.out.println("Четвертая задача");
        for (int i = 0; i < firstWeight.length; i++) {
            if (firstWeight[i] % 2 != 0) {
                firstWeight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstWeight));
    }
}