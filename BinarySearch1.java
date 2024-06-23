public class BinarySearch1 {
    public static void main(String[] args) {
        int array1[] = {2, 3, 4, 10, 40};
        int array2[] = {2, 3, 4, 10};

        System.out.println(binarySearch(array1,2));
        System.out.println(binarySearch(array1,3));
        System.out.println(binarySearch(array1,4));
        System.out.println(binarySearch(array1,10));
        System.out.println(binarySearch(array1,40));
        System.out.println(binarySearch(array1,70));

        System.out.println(binarySearch(array2, 2));
        System.out.println(binarySearch(array2, 3));
        System.out.println(binarySearch(array2, 4));
        System.out.println(binarySearch(array2, 10));
        System.out.println(binarySearch(array2, 70));
    }

    public static int binarySearch(int[] array,int target){

        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int middle = (start+end)/2;

            if(array[middle] == target){
                return middle;
            }
            else if(array[middle] > target){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }

        return -1;
    }
}