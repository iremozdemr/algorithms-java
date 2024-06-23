public class LinearSearch{
    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 10, 40 };
        int target1 = 10;
        int target2 = 70;

        System.out.println(linearSearch(array, target1));
        System.out.println(linearSearch(array, target2));
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