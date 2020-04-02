import java.util.Scanner;

public class ConsecutiveApp {

    public static final String SNAP = "'Snap'";
    public static final String SPLIT_STRING = ",";

    public void outputResults() {
        System.out.println("Output results...");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter coma separated numbers :");
        String numbers = myObj.nextLine();
        System.out.println("numbers: " + numbers);
        System.out.println(findNumbers(numbers));
    }

    private String findNumbers(String input) {
        String[] inputArr = input.split(SPLIT_STRING);
        String first = " ";
        boolean found = false;
        StringBuffer buffer = new StringBuffer();

        for(int i=0; i<inputArr.length; i++) {
            if(!found) {
                buffer.append(inputArr[i] + SPLIT_STRING);
            }

            if(first.equals(inputArr[i]) && !found) {
                buffer.append(SNAP);
                found = true;
            }
            first = inputArr[i];
        }

        return buffer.toString();

    }
}
