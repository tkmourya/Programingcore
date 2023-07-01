package HackerRank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int n=arr.size();
        int pos = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {

            if (arr.get(i) > 0) {
                pos++;
            } else if (arr.get(i) == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println(pos / (double) n);
        System.out.println(neg / (double) n);
        System.out.println(zero / (double) n);
    }
}



public class Plusminus {
    public static void main(String[] args) throws IOException {
        System.out.println("please enter arr size");
        System.out.println("please enter element");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

