
public class IndexSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] input = { 1, 6, 2, 4, 8, 7 };
        int i, j, flag = 0;
        /*
         * for( i=0,j=0;i<=input.length;i++,j++) { if((input[i]+input[i+1])==8) {
         * System.out.println("The indices are:"+i+" "+(i+1)); break; } }
         */
        for (i = 0; i <= input.length; i++) {

            for (j = i + 1; j <= input.length - 1; j++) {
                if ((input[i] + input[j]) == 8) {
                    System.out.println("The indices are:" + i + " " + j);
                    flag = 1;
                }

            }
            if (flag == 1)
                break;
        }

    }

}