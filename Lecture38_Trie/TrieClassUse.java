package Lecture38_Trie;

public class TrieClassUse {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("gawad");
        trie.add("prajyot");
        System.out.println(trie.search("gawa"));
        System.out.println(trie.search("prajyot"));
    }
}
