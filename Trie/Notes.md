# Trie (Prefix Tree)

## 1. Trie kya hota hai?

Trie ek special tree data structure hai jo strings ya words ko efficiently store aur search karne ke liye use hota hai.

Isse **Prefix Tree** bhi kehte hain kyunki ye common prefixes ko share karta hai.

### Example

Words:
- cat
- car
- can

```
        Root
          |
          c
          |
          a
       /  |  \
      t   r   n
```

Yahan `ca` teenon words ka common prefix hai.

## 2. Trie ki zarurat kyu padi?

Agar hamare paas bahut saare words ho, jaise:
- Apple
- Application
- Apply
- App

Aur user type kare `Ap`, to normal array/list me saare words check karne padenge.

Trie me sirf prefix follow karna hota hai, isliye searching bahut fast hoti hai.

## 3. Real world applications

Trie ka use hota hai:

- ✅ Google search autocomplete
- ✅ Mobile keyboard suggestions
- ✅ Dictionary lookup
- ✅ Spell checker
- ✅ Contact search
- ✅ Word games (Scrabble)
- ✅ IP routing (longest prefix matching)

## 4. Java me Trie node structure

Har Trie node me generally do cheeze hoti hain:

```java
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}
```

- `children` : 26 English alphabets ke liye.
  - `children[0]` → `a`
  - `children[1]` → `b`
  - ...
  - `children[25]` → `z`
- `isEnd` : batata hai ki word yahin khatam hua ya nahi.

## 5. Trie operations

### 1) Insert
Word ko Trie me add karna.

Example: `insert("cat")`

### 2) Search
Word exist karta hai ya nahi.

Example:
- `search("cat")` → `true`
- `search("cab")` → `false`

### 3) startsWith
Prefix exist karta hai ya nahi.

Example:
- `startsWith("ca")` → `true`

### 4) Delete
Trie se word remove karna.

## 6. Time complexity

Agar word ki length = `L`, to:

| Operation    | Complexity |
|-------------|------------|
| Insert      | O(L)       |
| Search      | O(L)       |
| startsWith  | O(L)       |
| Delete      | O(L)       |

Yahan `L` = word ki length.

## 7. Trie ke advantages

- Fast searching
- Prefix search bahut efficient
- Common prefix sirf ek baar store hota hai
- Autocomplete ke liye best choice

## 8. Trie ki limitations

- Memory zyada consume karta hai
- Chhote datasets ke liye `HashSet` ya `HashMap` better ho sakte hain

## 9. Trie seekhne ka roadmap

1. Trie concept samjho
2. Node structure banayo
3. Insert implement karo
4. Search implement karo
5. startsWith implement karo
6. Delete implement karo
7. LeetCode problems solve karo

## 10. Interview me frequently asked questions

- Trie kya hota hai?
- Trie aur HashMap me difference kya hai?
- Trie ka use kaha hota hai?
- Autocomplete kaise implement karoge?
- Prefix search kya hota hai?
- Trie ki time complexity kya hai?
- Trie memory zyada kyu leta hai?
- Delete operation kaise implement karte hain?

## 11. LeetCode practice order

- LeetCode 208 - Implement Trie (Prefix Tree)
- LeetCode 211 - Design Add and Search Words Data Structure
- LeetCode 212 - Word Search II

## 12. One-line revision

Trie ek tree-based data structure hai jo strings ko efficiently store aur search karta hai, especially jab prefix-based searching ya autocomplete ki zarurat ho.

### Java me yaad rakhne wali core line

```java
TrieNode[] children = new TrieNode[26];
boolean isEnd;
```

Yahi Trie ka core hai. Iske baad `Insert → Search → startsWith → Delete` implement kiye jaate hain.
