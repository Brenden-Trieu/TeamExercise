package code;

public class arrMedian {
    public static double findMedianValue(int[] input){
        if(input.length == 0)
            return 0;

        if(input.length%2 == 0)
            return (input[input.length / 2 - 1] + input[(input.length/2)])/2.0 ;
        else
            return input[(input.length/2)];
    }
}
