public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {34,1,2,23,4,0};

        printArray(array);

        insertionSort(array);

        printArray(array);
    }

    public static void insertionSort(int[] array){
        for(int i=1; i<array.length; i++){
            int current = array[i];
            int j = i-1;

            while(j >= 0){
                if(array[j] < current){
                    break;
                }
                else{
                    array[j+1] = array[j];
                    j--;
                }
            }
            array[j+1] = current;
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}