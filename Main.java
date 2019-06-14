public class Main {

    public static void main(String[] args) {
        int [] array = {8,7,6,5,4,3,2,1};
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length-1; j++) {
                if (array[j]>array[j+1]) {
                    int TEMP = array[j];
                    array[j] = array[j+1];
                    array[j+1] = TEMP;
                }
            }
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
