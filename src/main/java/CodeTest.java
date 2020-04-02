import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class CodeTest {
    public static void main(String[] args) {
        System.out.println("Please replace this with calls to all completed tests.");
    }

    public static String[] reverseArray(String[] input) {

        String[] revertedArr = new String[input.length];
        for(int i=0; i < input.length; i++) {
            revertedArr[i] = input[input.length -1 -i];
        }
        return revertedArr;
    }

    public static String[] uppercaseArray(String[] input) {
        String[] ucArr = new String[input.length];
        for(int i=0; i < input.length; i++) {
            ucArr[i] = input[i].toUpperCase();
        }
        return ucArr;
    }


    public static int findWordCount(String text, String wordToFind) {
        String[] inputArr = text.split(" ");
        HashMap<String, Integer> counter = new HashMap<>();
        String maxWord = "";
        int maxWordCount = 0;

        for(String word:inputArr){
            if(counter.containsKey(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.putIfAbsent(word, 1);
            }
        }

        if(counter.containsKey(wordToFind)){
            return counter.get(wordToFind);
        }

        return 0;
    }

    public static Function<Integer,Integer> composeU(Function<Integer,Integer> f1, Function<Integer,Integer> f2){
        BinaryOperator<Function<Integer,Integer>> compose = (a, b) -> x -> b.apply(a.apply(x));
        return compose.apply(f1,f2);
    }

    public static void writeContentsToConsole() throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader("/somepath/tofile.txt"));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(line != null)
        {
            System.out.println(line);
            try {
                line = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void handleInvalidArgument() throws IllegalArgumentException{
        int counter = 0;
        if (counter < 0) {
            throw new IllegalArgumentException("Counter should be positive");
        }
    }

    public static void puzzle() {
        // add code here
    }
}