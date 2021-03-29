import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class test5 {

        public static void main(String[] args){
            int[][] arr = new int[5][5];
            for(int i=0; i<5; i++)
                for(int j=0; j<5; j++)
                    arr[i][j] = ThreadLocalRandom.current().nextInt(0,100);
            System.out.println("Array : ");
            for(int[] i : arr) System.out.println(Arrays.toString(i));
            System.out.println("Array after change :");
            IntStream.range(0,arr.length)
                    .peek(i -> {int j = arr[i][0]; arr[i][0]=arr[i][4]; arr[i][4]=j;})
                    .forEach(i -> System.out.println(Arrays.toString(arr[i])));
        }
    }
