package code;
public class avgValue {
    public static double avgValueFinder(int[] input){
        if (input.length == 0)
            return 0;
        double sum = 0;
        double avg = 0;
        for (int i = 0;i<input.length;i++)
            sum+=input[i];
        avg = sum/input.length;
        return avg;
    }
}