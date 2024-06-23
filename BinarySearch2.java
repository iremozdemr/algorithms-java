public class BinarySearch2 {
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
        return helper(array,0,array.length-1,target);
    }

    public static int helper(int[] array,int start,int end,int target){
        int middle = (start+end)/2;

        if(start > end){
            return -1;
        }
        else if(array[middle] == target){
            return middle;
        }
        else if(array[middle] > target){
            return helper(array, start, middle-1, target);
        }
        else{
            return helper(array, middle+1, end, target);
        }
    }
}