package DataStructures.HashTable;

public class Main {
    public static void main(String[] args) {

        HashTable myHT = new HashTable();

        myHT.set("phones", 100);
        myHT.set("cars", 40);
        myHT.set("laptops", 30);

        myHT.set("watches", 70);
        myHT.set("screens", 45);
        myHT.set("consoles", 45);

        myHT.printTable();

//        System.out.println(myHT.get("phones"));
//        System.out.println(myHT.get("cars"));
//        System.out.println(myHT.get("tv"));

        System.out.println(myHT.keys());

        int[] array1 = {1, 2, 8};
        int[] array2 = {5, 0, 4};

        System.out.println(myHT.itemInCommon(array1, array2));
        System.out.println(myHT.itemsInCommon(array1, array2));

        int[] arr = {1, 2, 2, 5, 6, 7, 4, 9};
        int n = arr.length;
//        myHT.removeDups(arr, n);

        myHT.removeDuplicate(arr);

    }
}
