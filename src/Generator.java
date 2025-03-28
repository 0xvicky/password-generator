import java.util.Random;

public class Generator {
//uppercase = 65-90 -> 1
    //lowercase = 97-122 ->1
    //numbers = 48-57 -> 2
    //characters = 33-47 -> 2
    public String generate() {
        StringBuilder sb = new StringBuilder();

        Random rand = new Random();
        int num = rand.nextInt(65,91);
        System.out.println(num);

        //logic
        return sb.toString();
    }
}
