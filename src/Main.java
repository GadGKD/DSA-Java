import java.util.HashMap;

public class Main {
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }

    }

    public static void main(String[] args) {
        printItems(10);

        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("purple");

        cookieOne.setColor("green");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 22);
        map2 = map1;

        System.out.println(map1);
        System.out.println(map2);
    }


}
