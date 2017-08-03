package exercises;

public class ArrayList {

    private static int evenSum(int[] args) {
        int sum = 0;

        for(int i=0; i < args.length; i++){
            if (args[i]%2 == 0) sum += args[i];
        }
        return(sum);
    }
    public static void main(String[] args) {
        int[] someInts = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println("Sum is: " + evenSum(someInts));
    }
}
