package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TrieNode node = new TrieNode();
        TrieNode.insert(node,"rohith");
        TrieNode.insert(node,"ronaldo");
        TrieNode.insert(node,"messi");
        TrieNode.insert(node,"maheshbabu");

        System.out.println(TrieNode.search(node,"rohith"));
        System.out.println(TrieNode.search(node,"rohi"));
        System.out.println(TrieNode.startsWith(node,"ro"));

    }
}