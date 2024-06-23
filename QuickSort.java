public class QuickSort {
    public static void main(String[] args) {
        int[] array = {34,1,2,23,4,0};

        printArray(array);

        quickSort(array, 0, array.length-1);

        printArray(array);
    }

    public static void quickSort(int[] array,int start,int end){
        if(start < end){
            int index = divide(array, start, end);

            quickSort(array, start, index-1);
            quickSort(array, index+1, end);
        }
    }

    public static int divide(int[] array,int start,int end){
        int pivot = array[end];
        int i = start-1;

        for(int j=start; j<=end; j++){
            if(array[j] < pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;

        return i+1;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}