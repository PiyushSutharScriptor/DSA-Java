class Node{
    Node[] link = new Node[26];
    boolean flag = false;

    boolean containsKey(char ch){
        return (link[ch-'a']!=null);
    }

    void put(char ch, Node node){
        link[ch-'a'] = node;
    }

    Node get(char ch){
        return link[ch-'a'];
    }

    boolean setEnd(){
        return flag = true;
    }

    boolean isEnd(){
        return flag;
    }

}

public class ImplementationOfTrie {
    public static Node root;

    public ImplementationOfTrie() {
        root = new Node();
    }
    
    //inserting every char
    public void insert(String word) {
        Node node = root;

        for(int i=0 ; i<word.length() ; i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i) , new Node());
            }
            node = node.get(word.charAt(i));
        }

        node.setEnd();

    }
    
    //search for word
    public boolean search(String word) {
        Node node = root;

        for(int i=0 ; i<word.length() ; i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i)); 
        }

        if(node.isEnd()) return true;
        return false;
    }
    
    //word starts with 
    public boolean startsWith(String prefix) {
        Node node = root;

        for(int i=0 ; i<prefix.length() ; i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }

        return true;
    }
}
