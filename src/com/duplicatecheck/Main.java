import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class DuplicateCountChar{

    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String token = inputString.nextLine();
        char[] ch = token.toCharArray();
        Map<Character, Integer> dupCountMap =  new HashMap<Character,Integer>();

        for (char c : ch) {
            if(dupCountMap.containsKey(c)) {
                dupCountMap.put(c, dupCountMap.get(c)+1);
            }else {
                dupCountMap.put(c, 1);
            }
        }


        for (char c : ch) {
            System.out.println("Key = "+c+ "Value : "+dupCountMap.get(c));
        }

        Set<Character> keys = dupCountMap.keySet();
        for (Character character : keys) {
            System.out.println("Key = "+character+ " Value : " + dupCountMap.get(character));
        }
    }
}
