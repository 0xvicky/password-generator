import java.util.Random;

public class Generator {
//uppercase = 65-90 -> 1
    //lowercase = 97-122 ->1
    //numbers = 48-57 -> 2
    //characters = 33-47 -> 1
        Random rand = new Random();
        int count = 0;
    int[][] asciiCodes = {
        {33,48,2,0},//spc characters
        {48,58,2,0},//numbers
        {65, 91,1,0},//uppercase
        {97,123,1,0},//lowercase
};
    public String generate() {
        StringBuilder sb = new StringBuilder();
        int n = asciiCodes.length;

        while(count<n){
            int[] ranges = asciiCodes[count];
            int rngInit = ranges[0];
            int rngFinal = ranges[1];
        if(ranges[3]>=ranges[2]){
            count++;
            continue;
        }
        int num = rand.nextInt(rngInit,rngFinal);
        char c = (char) (num);
//        System.out.println(c);
        sb.append(c);
        asciiCodes[count][3]++;

        }
        //logic
        System.out.println(sb);
        return sb.toString();
    }
}
