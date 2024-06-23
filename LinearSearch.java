public class LinearSearch{
    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 10, 40 };

        System.out.println(linearSearch(array, 2));
        System.out.println(linearSearch(array, 40));
        System.out.println(linearSearch(array, 70));
    }

    public static int linearSearch(int[] array,int target){
        for(int i=0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }

        return -1;
    }
}