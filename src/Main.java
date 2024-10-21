public class Main {
    public static void main(String[] args) {

        int [] firstWeight = new int [3];
        firstWeight[0] = 1;
        firstWeight[1] = 2;
        firstWeight[2] = 3;
        for(int i=0; i<firstWeight.length;i++){
            System.out.print(firstWeight[i]+",");
        }
        System.out.println();
        for(int i= firstWeight.length-1; i>=0;i--){
            System.out.print(firstWeight[i]+",");
        }
        System.out.println();
        float [] secondWeight = {1.57f,7.654f, 9.986f};
        for (int j=0;j<secondWeight.length;j++) {
            System.out.print(secondWeight[j]+",");
        }
        System.out.println();
        for(int i= secondWeight.length-1; i>=0;i--){
            System.out.print(secondWeight[i]+",");
        }
        System.out.println();
        long [] thirdWeight = new long [5];
        thirdWeight[0]= 45635776765767L;
        thirdWeight[1]= 7635657367657367L;
        thirdWeight[2]= 3365767653L;
        thirdWeight[3]= 56737675L;
        thirdWeight[4]= 76675353365L;
        for (int i=0;i<thirdWeight.length;i++) {
            System.out.print(thirdWeight[i] + ",");
        }
        System.out.println();
        for(int i= thirdWeight.length-1; i>=0;i--){
            System.out.print(thirdWeight[i]+",");
        }





    }
}