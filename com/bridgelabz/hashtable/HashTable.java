package com.bridgelabz.hashtable;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome To Hash Table Program");
        HashTableImplementation<String, Integer> hashImpl = new HashTableImplementation<String, Integer>();
        String message = "Paranoids are not	paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        // Split the words when a white space comes up and Convert all the words in
        // lowercase
        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray) {
            // Search for the word in the linked list
            Integer value = hashImpl.get(word);
            // If not found, frequency of the word StayWith 1
            if (value == null)
                value = 1;
            else
                // If found, frequency of the word increases by 1
                value = value + 1;
            hashImpl.add(word, value);
        }
        // Remove "avoidable" from the hashtable
        hashImpl.remove("avoidable");
        // Display the hashtable
        System.out.println(hashImpl);
    }
}
