public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,5,3,4,7,9,3,12,33,1};
        System.out.println(largestMinusSmallest(numbers));
        System.out.println(twoSmallest(numbers));
        System.out.println(formula(6,5));
    }
    public static int  largestMinusSmallest(int[] intArray){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<intArray.length; i++){
            if(intArray[i]>= largest){
                largest = intArray[i];
            }
            if(intArray[i]<= smallest){
                smallest = intArray[i];
            }
        }
        return largest-smallest;
    }
    public static String twoSmallest(int[] intArray){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0; i<intArray.length; i++){
            if(intArray[i]<= smallest){
                smallest = intArray[i];
            }
        }
        for (int i=0; i<intArray.length; i++){
            if(intArray[i]<= secondSmallest && intArray[i] > smallest){
                secondSmallest = intArray[i];
            }
        }
        return String.valueOf(smallest).concat(" ").concat(String.valueOf(secondSmallest));
    }

    public static double formula(int x, int y){
        return Math.pow(x, 2) + Math.pow((4*y/5-x), 2);
    }
}
