import java.util.*;

public class Generator {
    //uppercase = 65-90 -> 1
    //lowercase = 97-122 ->1
    //numbers = 48-57 -> 2
    //characters = 33-47 -> 1
    Random rand = new Random();

    public String generate() {
    int[][] asciiCodes = {{33, 48, 2, 0},//spc characters
            {48, 58, 2, 0},//numbers
            {65, 91, 1, 0},//uppercase
            {97, 123, 1, 0},//lowercase
    };
    int count = 0;
        StringBuilder sb = new StringBuilder();
        List<Character> charList = new ArrayList<>();
        int n = asciiCodes.length;

        while (count < n) {
            int[] ranges = asciiCodes[count];
            int rngInit = ranges[0];
            int rngFinal = ranges[1];
            if (ranges[3] >= ranges[2]) {
                count++;
                continue;
            }

            int num = rand.nextInt(rngInit, rngFinal);
            char c = (char) (num);
//        System.out.println(c);
            charList.add(c);
            asciiCodes[count][3]++;
        }
        Collections.shuffle(charList);
        for(char c: charList){
            sb.append(c);
        }
        //logic
//        System.out.println(sb.toString());
        return sb.toString();
    }
}
