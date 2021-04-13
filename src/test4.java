

public class test4 {
    public static void main(String[] args){
        int [] array = {25, 11, 250, 5, -2};

        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
