package Lecture38_Trie;

public class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode[] children;
    int countWords;

    public TrieNode(char alphabet){
        this.data = alphabet;
        this.isTerminating = false;
        children = new TrieNode[26];
        countWords = 0;
    }
}
class Trie {
    TrieNode root;

    Trie(){
        root = new TrieNode('\0');
    }
    private void insert(String word , TrieNode root){
        if (word.length() == 0){
            root.isTerminating = true;
            root.countWords++;
            return;
        }
        char InputChar = word.charAt(0);
        int  Childindex = word.charAt(0) - 'a';
        TrieNode newTrieNode = root.children[Childindex];
        if (newTrieNode == null){
            newTrieNode = new TrieNode(InputChar);
            root.children[Childindex] = newTrieNode;
        }
        insert(word.substring(1),root.children[Childindex]);
    }
    public void add(String word){
        insert(word,root);
    }

    private boolean search(String word , TrieNode root){
        // base case
        if (word.length() == 0){
            return root.isTerminating;
        }
        // code
        int childIndex = word.charAt(0) - 'a';
        char childInput = word.charAt(0);
        TrieNode node = root.children[childIndex];
        boolean ans = true;

        if (node == null){
            return false;
        }else
            return search(word.substring(1) ,root.children[childIndex]);
    }
    public boolean search(String word){
        return search(word ,root);
    }
    public void delete(String word){
        delete(word , root);
    }
    private void delete(String word , TrieNode root){
        // base case
        if(word.length() == 0){
            root.isTerminating = false;
        }
        // code

    }

}

