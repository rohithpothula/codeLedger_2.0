package org.example;

public class TrieNode {
    TrieNode[] children;
    boolean isEndofWord;

    TrieNode(){
        isEndofWord=false;
        children = new TrieNode[26];
    }

    public static void insert(TrieNode root, String key){

        for(int i=0;i<key.length();i++){
            if(root.children[key.charAt(i)-'a']==null){
                TrieNode node = new TrieNode();
                root.children[key.charAt(i)-'a']=node;
            }
            root=root.children[key.charAt(i)-'a'];
        }

        root.isEndofWord=true;

    }

    public static boolean search(TrieNode root, String word){

        TrieNode curr = root;

        for(int i=0;i<word.length();i++){
            if(curr.children[word.charAt(i)-'a']==null){
                return false;
            }
            curr=curr.children[word.charAt(i)-'a'];
        }
        if(curr.isEndofWord==true)
            return true;
        else
            return false;

    }

    public static boolean startsWith(TrieNode root , String prefix) {
        TrieNode curr = root;

        for(int i=0;i<prefix.length();i++){
            if(curr.children[prefix.charAt(i)-'a']==null){
                return false;
            }
            curr=curr.children[prefix.charAt(i)-'a'];
        }
        return true;
    }
}
