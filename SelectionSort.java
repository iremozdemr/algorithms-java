public class SelectionSort{
    public static void main(String[] args) {
        int[] array = {34,1,2,23,4,0};

        printArray(array);

        selectionSort(array);

        printArray(array);
    }

    public static void selectionSort(int[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=i; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}