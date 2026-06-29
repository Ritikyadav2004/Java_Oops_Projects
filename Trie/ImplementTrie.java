package Trie;
//  leetcode 208
public class ImplementTrie {
    
}
class TrieNode{
    TrieNode trieNode[];
    boolean wordEnd;

    // constructor
    TrieNode()
    {
        wordEnd=false;
        trieNode= new TrieNode[26];
    }
    // functions so that it work for assigning values to this data structures
    boolean containsChar(char ch)
    {
        // return trieNode['ch'-a]==null; // kya character exit nhi krta he 
        return (trieNode[ch-'a']!=null);  // kya character iss arfay me exit krta he 
    }   

    void  add(char ch)
    {
        trieNode[ch-'a']= new TrieNode();
    } 

    // yeh mujhe coresponding chaaracter ka node lake dega 
    TrieNode getChar(char ch)
    {
            return trieNode[ch-'a'];
    }


// yeh mark krne ka kaaam kerga true and false
    void markWordEnd()
    {
        wordEnd=true;
    }
    // yeh function word end ki value return kaerga 1 or 0
    boolean isWord()
    {
        return wordEnd;//
        // true mean word end ho chuka he and 
        // false mean word end nhi hua that corresponds to word not present in Node
    }




}
class Trie {
   TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode temp=root;
        for(char ch:word.toCharArray())
        {
            if(!temp.containsChar(ch))
            {
                       temp.add(ch);
            }
            temp=temp.getChar(ch);  // yeh humko node return kerga jsime temp move hoga
        }

        temp.markWordEnd();
    }
    
    public boolean search(String word) {

        TrieNode temp=root;
        for(char ch:word.toCharArray())
        {
            if(!temp.containsChar(ch))
            return false;


            // if(exit) yes then move to next next
            temp=temp.getChar(ch);
        }


        return temp.isWord();
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp=root;
        for(char ch:prefix.toCharArray())
        {
            if(!temp.containsChar(ch))
            {
                return false;
            }
            temp=temp.getChar(ch);

        }


        // mean yes start with ch
        return temp!=null;
        // it mean if Not = null yani word exit krta he abhi sirf prefix check kiya he 
        //but if equal to null it mean  Word age exit nhi krta YYAA not startwith prefix

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */