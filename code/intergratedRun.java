package code;

public class intergratedRun {
    public static void main(String[] args){
        int[] array = { 1, 3, 9 , 19, 38, 40, 43, 49, 73};
        System.out.println("The min of the elements in the array is: " + code.MinFinder.findMinElem(array));
        System.out.println("The sum of the elements in the array is: " + code.arrSum.sumVal(array));
        System.out.println("The mean of the elements in the array is: " + code.avgValue.avgValueFinder(array));
        System.out.println("The median of the elements in the array is: " + code.arrMedian.findMedianValue(array));
    }
}
