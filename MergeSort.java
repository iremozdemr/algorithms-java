public class MergeSort {
    public static void main(String[] args) {
        int[] array = {34,1,2,23,4,0};

        printArray(array);

        mergeSort(array, 0, array.length-1);

        printArray(array);
    }

    public static void mergeSort(int[] array,int left,int right){
        if(left < right){
            int middle = (left+right)/2;

            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array,int left,int middle,int right){
        int size1 = middle-left+1;
        int size2 = right-middle;

        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        for(int i=0; i<size1; i++){
            leftArray[i] = array[left+i];
        }

        for(int i=0; i<size2; i++){
            rightArray[i] = array[middle+1+i];
        }

        int i=0;
        int j=0;
        int k = left;

        while(i<size1 && j<size2){
            if(leftArray[i] < rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}