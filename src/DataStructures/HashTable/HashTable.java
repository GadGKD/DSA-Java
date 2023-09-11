package DataStructures.HashTable;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        int value;
        String key;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }

        }
    }

    private int hash(String key) {
        int hash = 0;
        char keyChars[] = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;

    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    //INTERVIEW QUESTION -- 0(N)*2 METHOD vrs O(N)
    public boolean itemInCommon(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean itemsInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }
        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }

    //REMOVE DUPLICATES FROM AN ARRAY
    //PS: HASHMAP DOES NOT ALLOW DUPLICATES
    public void removeDups(int[] a, int n) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.get(a[i]) == null) {
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }

    public void removeDuplicate(int[] a) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (mp.get(a[i]) == null) {
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }

    //VALID PALINDROME
    public boolean isPalindrome(String s) {
        String fixedString = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedString += c;
            }
        }
        fixedString = fixedString.toLowerCase();
        int startPointer = 0;
        int endPointer = fixedString.length() - 1;

        while (startPointer <= endPointer) {
            if (fixedString.charAt(startPointer) != fixedString.charAt(endPointer)) {
                return false;
            }
            startPointer += 1;
            endPointer -= 1;
        }
        return true;
    }



}
