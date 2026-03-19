Dua-pointer technique ek popular algorithm hai. Isme hum do pointers (ya variables) ko ek hi data structure par use karte hain, jaise ki array ya linked list. Ek pointer aage badhta hai aur doosra peeche ya alag speed se. Ye technique especially tab kaam aati hai jab hume do elements ko ek saath process karna hota hai, jaise ki sorting ya searching mein. Isse time complexity kaafi kam ho jaati hai.
<br>

<br>

Example
Aap imagine kariye ki aapke paas ek sorted array hai aur aapko do numbers ka pair dhundhna hai jinka sum 10 ho. Aap ek pointer (let's say left) ko array ke shuruat mein rakhenge, aur doosra pointer (right) ko array ke aakhir mein.
<br>

left pointer shuruat se aage badhega, aur right pointer aakhir se peeche aayega.

Dono pointers ke elements ko add karke dekhenge.

Agar sum 10 se zyada hai, toh right pointer ko peeche le aayenge.

Agar sum 10 se kam hai, toh left pointer ko aage le jayenge.

<br>

Is tarah, aap linear time mein solution dhoondh sakte hain.