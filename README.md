# Java_Basic_Codes

### In this repository, there are some basic programs (only functions) that most companies ask during interview process in java language.

#### Categories (like array,linked list,tree) of all questions are also tagged along side of question description below.

<br />

<details><summary> Program-1)   Median of two sorted arrays (time complexity should be O(log(m+n))) <b>#Array #Binary Search #Divide and Conque</b></summary>
<pre>
  Ex. nums1 = [1,2] and nums2 = [3,4]
      median = (2+3)/2 = 2.5
</pre>
</details>
                  
<details><summary> Program-2)   Merge two sorted linked lists <b>#Linked List</b></summary>
<pre>
  Ex. lis1 = 1->4->5 and list2 = 1->6->8
      ans = 1->1->4->5->6->8
</pre>
</details> 

<details><summary> Program-3)   Search insert position <b>#Binary Search #Array</b> </summary>
<pre>
   -> Given a sorted array and a target value, return the index if the target is found. If not, return the index where it           would be if it were inserted in order.
    Ex. [1,3,5,6], 7
        ans = 4
</pre>
</details> 

<details><summary> Program-4)   Find First and Last Position of Element in Sorted Array <b>#Array #Binary Search</b>  </summary>
<pre>
   Ex. nums = [5,7,7,8,8,10], target = 8
       ans = [3,4]
</pre>
</details> 
        
<details><summary> Program-5)   Count of Smaller Numbers After Self <b>#Binary Search #Greedy #Binary Indexed Tree #Segment Tree #Divide and Conque</b>  </summary>
<pre>
   Ex. nums = [5,2,6,1]
       ans = [2,1,1,0]
</pre>
</details>

<details><summary> Program-6)   Boats to Save People (Return the minimum number of boats) <b>#Two Pointers #Greedy</b> </summary>
<pre>
   -> The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
   -> Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most                 limit.
    Ex. people = [3,2,2,1], limit = 3
        ans = 3   (Explanation: 3 boats (1, 2), (2) and (3))
</pre>
</details>

<details><summary> Program-7)   Same Tree or not <b>#Tree</b> </summary>
<pre>
    -> Given two binary trees, write a function to check if they are the same or not.
     Ex.    1         1
           / \       / \
          2   3     2   3 
     input = [1,2,3], [1,2,3]
     Ans = true 
</pre>
</details>
          
<details><summary> Program-8)   Validate Binary Search Tree <b>#Tree</b> </summary>
<pre>
    ->Given a binary tree, determine if it is a valid binary search tree (BST).
     *) The left subtree of a node contains only nodes with keys less than the node's key.
     *) The right subtree of a node contains only nodes with keys greater than the node's key.
     *) Both the left and right subtrees must also be binary search trees.
     Ex.     2    input = [2,1,3];
            / \
           1   3  Ans = true 
</pre>
</details>

<details><summary> Program-9)   Invert Binary Tree <b>#Tree</b> </summary>
<pre>
    Ex. Input =   4           
                /   \
               2     7
              / \   / \
             1   3 6   9
     Output =      4
                 /   \
                7     2
               / \   / \
              9   6 3   1
</pre>
</details>

<details><summary> Program-10)   Sum Root to Leaf Numbers (each path from root to leaf represents the number) <b>#Tree</b> </summary>
<pre>
    Ex. [4,9,0,5,1]         
              4
             / \
            9   0     Ans = 495 + 491 + 40 = 1026
           / \
          5   1
</pre>
</details>

<details><summary> Program-11)  Path Sum (check if path exist in which sum of values of nodes equal to given target sum) <b>#Tree</b> </summary>
<pre>
    Ex. Input = 22        
            5         Ans = 5->4->11->2 = 5+4+11+2 = 22  
           / \        Ans = true
          4   8
         /   / \
        11  13  4
       /  \      \
      7    2      1 
</pre>
</details>

<details><summary> Program-12)   Binary search (time complexity O(log(n)) <b>#Binary Search</b></summary>
<pre>
   Ex. nums = [-1,0,3,5,9,12], target = 9
       Ans = 4
</pre>
</details>
          
<details><summary> Program-13)   Search and return subtree of that node in Binary Search Tree <b>#Tree</b> </summary>
<pre>
    Ex. input =  4      key = 2    Output =  2      else return [];
                / \                         / \ 
               2   7                       1   3
              / \
             1   3
</pre>
</details>

<details><summary> Program-14)   Symmetric Tree (mirror image concept can be applied here) <b>#Tree #Breadth-first Search</b> </summary>
<pre>
   Ex. input =    1         Output = true
                 / \
                7   7
               / \ / \
              5  2 2  5
</pre>
</details>

<details><summary> Program-15)   Add Binary Strings <b>#String #Math</b> </summary>
<pre>
   Ex. string1 = "1010", string2 = "1011"
      Ans = "10101"
</pre>
</details>

<details><summary> Program-16)   Plus One (Add 1 in the given number in form of array) <b>#Array</b> </summary>
<pre>
   Ex. Input = [2,4,5,9]       Input = [9,9,9]
       Ans =  [2,4,6,0]       Input = [1,0,0,0]
</pre>
</details>

<details><summary> Program-17)  Count no of 1 in given String (Concept of masking of bits in using AND operation) <b>#Bit Manipulation</b> </summary>
<pre>
   Ex. 11111111111111111111111111101101
       Ans = 30
</pre>
</details>

<details><summary> Program-18)  Hamming Distance (Upto 32 bits) (Use of Integer.toBinaryString(int) function of java in-built function) <b>#Bit Manipulation</b> </summary>
<pre>
  -> Also we have to format the string of this converted binary into 32 bit format.
  -> X = 1 and Y = 4
  Binary =>   X = 1
              Y = 100
  -> So we cannot compare the bits for hamming distance.
  -> Therefore we have to format the string
  Ex. Input:    X = -24   Y = 675
      Converting to Binary :  X = 11111111111111111111111111101000
                              Y = 00000000000000000000001010100011
      ANS = 27
</pre>
</details>

<details><summary> Program-19)  Total Hamming Distance (All pairs of numbers in given array) (time complexity must be taken care of because of  two for loops) <b>#Bit Manipulation</b> </summary>
<pre>
  Ex. Input => [5, 15, 20]
  Ans = hamming(5,15) + hamming(15,20) + hamming(5,20)
      = 2 + 4 + 2
      = 8
</pre>
</details>

<details><summary> Program-20)  Reverse Integer (Constraint : 32-bit signed integer) <b>#Math</b> </summary>
<pre>
  Ex. Input  = 113      Input = -345    Input = 120
       Ans = 311         Ans = -543      Ans = 21
</pre>
</details>

<details><summary> Program-21)  Move Zeros to end of the array (Without using another array and min no of operations) <b>#Two Pointers #Array</b> </summary>
<pre>
  Ex. Input = [0,56,3,2,4,0,2]
       Ans = [56,3,2,4,2,0,0]
</pre>
</details>

<details><summary> Program-22)  Subtract the Product and Sum of Digits of an Integer <b>#Math</b> </summary>
<pre>
  Ex. N = 453
      Product = 4*5*3 = 60
      Sum = 4 + 5 + 3 = 12
      Result = 60 - 12 = 48
</pre>
</details>

<details><summary> Program-23)  Number of Steps to Reduce a Number to Zero (If n is even divide by 2 otherwise reduce 1 from n at each operation until zero) <b>#Bit Manipulation</b> </summary>
<pre>
  Ex. Num = 6;
      Ops = (6/2) = (3-2) = (2/2) = (1-1) = 0.
      No of Ops = 1 + 1 + 1 + 1 = 4
</pre>
</details>

<details><summary> Program-24)  Intersection of Two Arrays <b>#Two Pointers #Binary Search #Greedy #Hash Table</b> </summary>
<pre>
  Ex. Input1 = [4,7,6]  Input2 = [6,32,23,7,8]
      Ans = [7,6]
</pre>
</details>

<details><summary> Program-25)  Replace Elements with Greatest Element on Right Side (Last element = -1) <b>#Array</b> </summary>
<pre>
  Ex. arr = [17,18,5,4,6,1]
      Ans = [18,6,6,6,1,-1]
</pre>
</details>

<details><summary> Program-26)  Find Numbers with Even Number of Digits <b>#Array</b> </summary>
<pre>
  Ex. Input = [34,5,4,345,6785]
      Ans = 2
</pre>
</details>
                 
<details><summary> Program-27)  Merge Sorted Array (Assume : array one is large enough to hold both array) <b>#Two Pointers #Array</b> </summary>
<pre>
  Ex. Input1 = [1,5,4,0,0,0]
      Input2 = [3,2,7]
      Ans = [1,2,3,4,5,7]
</pre>
</details>

<details><summary> Program-28)  Two Sum <b>#Hash Table #Array</b> </summary>
<pre>
  -> Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  Ex. Input = [7,8,45,32] Target = 15
      Ans = Input[0] + Input[1] = 7+8 = 15
      Ans = [0,1]
</pre>
</details>

<details><summary> Program-29)  Single Number <b>#Hash Table #Bit Manipulation</b> </summary>
<pre>
  -> Given a non-empty array of integers and Frequency of all elements except one, find that number
  Ex. Input = [5,6,7,7,5,8,6,4,8]
      Ans = 4
</pre>
</details>

<details><summary> Program-30)  Power (x,n) (Only for 32 bit range [-2^32, 2^31 - 1] <b>#Binary Search #Math</b> </summary>
<pre>
  Ex. Input -> X = 2.0, n = 10
      Ans = 1024.0
</pre>
</details>

<details><summary> Program-31)  Max Consecutive Ones (Input string of 0 and 1s) <b>#Array</b> </summary>
<pre>
  Ex. Input = [1,1,0,0,0,1,1,1,1,1]
      Ans = 5
</pre>
</details>

<details><summary> Program-32)  Palindrome Number (Negative number also) (Without converting to string) <b>#Math</b> </summary>
<pre>
  Ex. Input = 565     Input = -565
      Ans = true      Ans = false
</pre>
</details>

<details><summary> Program-33)  Find First and Last Position of Element in Sorted Array (O(log(n)) <b>#Binary Search #Array</b> </summary>
<pre>
  Ex. Input = [5,4,6,8,6,5,3]       Input = [3,4,5,2,4,5,6]
      Target = 6                    Target = 8
      Ans = [2,4]                   Ans = [-1,-1]
</pre>
</details>

<details><summary> Program-34)  Edit Distance (One of the useful similarity measure in data science)(Using Dynamic Approach) <b>#String #Dynamic Programming</b> </summary>
<pre>
  -> The minimum edit distance is the minimum number of editing operations (insert, delete, replace) to transform one              string into the other.
     Ex. "sunday" and "saturday"
        Edit distance = 3
        -> Last three and first characters are same.
        -> convert "un" to "atur".
        -> Replace 'n' with 'r', insert t, insert a
</pre>
</details>
     
For reference check out this link: [Edit distance](https://en.wikipedia.org/wiki/Edit_distance)            

<details><summary> Program-35)  Integer Replacement <b>#Math #Bit Manipulation</b> </summary>
<pre>
  ->  Given a positive integer n and you can do operations as follow:
    Until n = 1; do
  -> If n is even, replace n with n/2.
  -> If n is odd, you can replace n with either n+1 or n-1. (Choose by which min no of operations can be obtained)
     Ex. Input = 12
         12 -> 6 -> 3 -> 2 -> 1  Opes = 4      (at 3 -> N = N-1)
         12 -> 6 -> 3 -> 4 -> 2 -> 1 Opes = 5  (at 3 -> N = N+1)
         Ans = 4
</pre>
</details>

<details><summary> Program-36)  Missing Number (first missing number from 0,1,2... n where n = array length) <b>#Math #Array</b> </summary>
<pre>
  Ex. Input = [0,1,2]   Input = [6,7,8,9]
      Ans = 3           Ans = 4
</details>
  
<details><summary> Program-37)  First Missing Positive (find the first positive number in unsorted array) <b>#Array</b> </summary>
<pre>
  Ex. Input = [-5,-3,1,3]           Input = [4,3,5,2]       Input = [-5,-4,-9,-10,-11]   
      Ans   = 2                     Ans   = 1               Ans   = 1
</pre>
</details>  

<details><summary> Program-38) Complement of number <b>#Bit Manipulation</b> </summary>
<pre>
  Ex. Input = 34529     Input = 34
      Ans = 31006       Ans = 29
</pre>
</details> 
  
<details><summary> Program-39)  Student Attendance Record I <b>#String</b> </summary>
<pre>
  -> You are given a string representing an attendance record for a student. The record only contains the following three          characters:
        'A' : Absent.
        'L' : Late.
        'P' : Present.
  -> A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two              continuous 'L' (late).
      Ex. "PPALLP"           "LLPPPLL"
          Ans = true        Ans = true
</pre>
</details>  

<details><summary> Program-40)  Binary Number with Alternating Bits <b>#Bit Manipulation</b> </summary>
<pre>
  -> Given a positive integer, check whether it has alternating bits.
    Ex. Input = 5  (101)    Input = 231 (11100111)   
        Ans = true          Ans = false
</pre>
</details> 

<details><summary> Program-41)  Maximum Average Subarray I <b>#Array</b> </summary>
<pre>
  -> Find the contiguous subarray of given length k that has the maximum average value.
    Ex. Input = [10,12,66,-70,-53]  K = 4
        Ans = 4.50
</pre>
</details> 

<details><summary> Program-42)  Sum of Square Numbers <b>#Math</b> </summary>
<pre>
  -> Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
  Ex. Input = 46        Input = 3423
      Ans = false       Ans = false
</pre>
</details>

<details><summary> Program-43)  Valid Perfect Square (Do not use sqrt function) <b>#Binary Search #Math</b> </summary>
<pre>
  Ex. Input = 625         Input = 24
      Ans = true          Ans = false
</pre>
</details>
  
<details><summary> Program-44)  Sqrt(x) (find square root of given number using floor function) <b>#Binary Search #Math</b> </summary>
<pre>
  Ex. Input = 16            Input = 534
      Ans = 4               Ans = 23
</pre>
</details>

<details><summary> Program-45)  Powerful Integers <b>#Hash Table #Math</b> </summary>
<pre>
  -> Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j
      for some integers i >= 0 and j >= 0. until the bound given.
  Ex. Input => X = 5, Y = 7, Bound = 15
      Ans = [2,6,8,12]
</pre>
</details>
  

<details><summary> Program-46)  Valid Parentheses <b>#String #Stack</b> </summary>
<pre>
  -> Check if given string of parentheses is balanced or not.
  Ex. Input = "((({}[))])"
      Ans = false
</pre>
</details>
  
<details><summary> Program-47)  Score of Parentheses <b>#String #Stack</b> </summary>
<pre>
  -> Given a balanced parentheses string S, compute the score of the string based on the following rule:
  -> () has score 1
  -> AB has score A + B, where A and B are balanced parentheses strings.
  -> (A) has score 2 * A, where A is a balanced parentheses string.   
      Ex. Input = "(()(()(()))())"
          Ans = 16
</pre>
</details>
  
<details><summary> Program-48)  Prime Number of Set Bits in Binary Representation <b>#Bit Manipulation</b> </summary>
<pre>
  -> if no of set bits in binary representation of number in given range is prime then return count
     Range is given [L, R]
  Ex . Input = [10,15]
  -> 10 -> 1010 (2 set bits, 2 is prime)
  -> 11 -> 1011 (3 set bits, 3 is prime)
  -> 12 -> 1100 (2 set bits, 2 is prime)
  -> 13 -> 1101 (3 set bits, 3 is prime)
  -> 14 -> 1110 (3 set bits, 3 is prime)
  -> 15 -> 1111 (4 set bits, 4 is not prime)
  Ans = 5
</pre>
</details>
  
<details><summary> Program-49)  Sum of Even Numbers After Queries <b>#Array</b> </summary>
<pre>
  -> For the i-th query 
      -> val = queries[i][0]
      -> index = queries[i][1]
  we add val to A[index]. Then, the answer to the i-th query is the sum of the even values of A.
  Ex. Input -> A = [1,6,8,5]  Queries = [[1,0],[-3,1],[-4,0],[2,3]]
     Ans = [16,10,6,6]
    -> After adding 1 to A[0], the array is [2,6,8,5], and the sum of even values is 2 + 6 + 8 = 16.
    -> After adding -3 to A[1], the array is [2,3,8,5], and the sum of even values is 2 + 8 = 10.
    -> After adding -4 to A[0], the array is [-2,3,8,5], and the sum of even values is -2 + 8 = 6.
    -> After adding 2 to A[3], the array is [-2,3,8,7], and the sum of even values is -2 + 8 = 6.
</pre>
</details> 

<details><summary> Program-50)  Maximum Number of Balloons <b>#String #Hash Table</b> </summary>
<pre>
  -> From the given string, find the number of string balloon can be formed.
    Ex. Input = "nlaebolkoballono"
        Ans = 2
</details> 
  
<details><summary> Program-51)  Minimum Depth of Binary Tree <b>#Tree</b> </summary>
<pre>
  Ex. Input = [8,6,4,5,10,16,2]
          8           
         / \        Ans = 3
        6   10
       /     \
      4       16
     / \
    2   5
</pre>
</details>

<details><summary> Program-52)  Maximum Depth of Binary Tree <b>#Tree #Breadth-first Search</b> </summary>
<pre>
  Ex. Input = [20,8,4,14,23]
        20
       /  \         Ans = 3
      8    23 
     / \
    4   14 
</pre>
</details>

<details><summary> Program-53)  Balanced Binary Tree <b>#Tree</b> </summary>
<pre>
  -> Height-balanced binary tree is defined as:
      -> a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
   Ex. Input = [3,9,20,null,null,15,7]
         3
        / \     Ans = true
       9  20      
      / \
     15  7
</pre>
</details>

<details><summary> Program-54)  Self Dividing Numbers <b>#Math</b> </summary>
<pre>
  -> A self-dividing number is a number that is divisible by every digit it contains.
  -> Also, a self-dividing number is not allowed to contain the digit zero.
    Ex. Input -> Left = 56 & Right = 78
        Ans = [66,77]
</pre>
</details>

<details><summary> Program-55)  Average of Levels in Binary Tree <b>#Tree</b> </summary>
<pre>
    Ex.   3     
         / \      Ans = [3, 14.5, 11]
        9  20
          /  \
         15   7
</pre>
</details>

<details><summary> Program-56)  Perfect Number <b>#Math</b> </summary>
<pre>
  -> Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
  Ex. Input = 256       Input = 6
      Ans = false       Ans = true
</details>
  
<details><summary> Program-57)  Add Digits <b>#Math</b> </summary>
<pre>
  -> Add all its digits until the result has only one digit.
  Ex. Input = 78
      Ans = 7+8 = 15 = 1+5 = 6
</pre>
</details>

<details><summary> Program-58)  Daily Temperatures <b>#Dynamic Programming #Hash Table</b> </summary>
<pre>
  -> Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you          would have to wait until a warmer temperature. 
  -> If there is no future day for which this is possible, put 0 instead.
    Ex. Input = [73,78,71,71,69,72,73,76]
        Ans = [1,0,3,2,1,1,1,0]
</pre>
</details>

<details><summary> Program-59)  Counting Bits <b>#Dynamic Programming #Bit Manipulation</b> </summary>
<pre>
  -> Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in       their binary representation and return them as an array.
    Ex. Input -> num = 35
        Ans = [0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3]
</pre>
</details>

<details><summary> Program-60)  Majority Element <b>#Divide and Conque #Array #Bit Manipulation</b> </summary>
<pre>
  -> Given an array of size n, find the majority element.
  -> The majority element is the element that appears more than ⌊ n/2 ⌋ times.
    Ex. Input = [1,2,4,3,2,4,4,4,4,4,2]
        Ans = 4
</pre>
</details>

<details><summary> Program-61)  Majority Element II <b>#Array</b> </summary>
<pre>
  -> Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
    Ex. Input = [4,4,5,3,4,5,5,3,3,3,3,4,4,4,4]
        Ans = [4]
</pre>
</details>

<details><summary> Program-62)  All Elements in Two Binary Search Trees <b>#Tree #Greedy</b> </summary>
<pre>
  -> Given two binary search trees root1 and root2.
  -> Return a list containing all the integers from both trees sorted in ascending order.
  Ex.  4         6           List1 = [4,5,7]
      / \       / \          List2 = [6,10,1]
     5   7     10  1         
     Ans = [1,4,5,6,7,10]
</pre>
</details>

<details><summary> Program-63)  Count Number of Teams <b>#Array</b> </summary>
<pre>
  -> There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
  -> Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
      A team is valid if:  
        (rating[i] < rating[j] < rating[k]) or 
        (rating[i] > rating[j] > rating[k]) 
        where (0 <= i < j < k < n).
    Ex. rating = [2,5,3,4,1]
        Ans = 3  [ Explanation: (2,3,4), (5,4,1), (5,3,1)]
</pre>
</details>

<details><summary> Program-64)  Univalued Binary Tree  <b>#Tree</b> </summary>
<pre>
  -> A binary tree is univalued if every node in the tree has the same value.
      Ex. 6
         / \     Ans = true
        6   6
       /
      6 
</pre>
</details>

<details><summary> Program-65)  Convert Binary Number in a Linked List to Integer <b>#Linked List #Bit Manipulation</b> </summary>
<pre>
  Ex. Input = [1,0,1,1,1,1,0,0,0,0,1]
      Ans = 1505
</pre>
</details>

<details><summary> Program-66)  Unique Number of Occurrences <b>#Hash Table</b> </summary>
<pre>
  -> write a function that returns true if and only if the number of occurrences of each value in the array is unique.
    Ex. Input = [-5,-6,2,6,-5,-7,5]
        Ans = false
</pre>
</details>

<details><summary> Program-67)  Valid Anagram <b>#Greedy #Hash Table</b> </summary>
<pre>
  -> Given two strings str1 and str2 , write a function to determine if str2 is an anagram of str1.
      Ex. Str1 = "hardik" Str2 = "krdiha"
          Ans = true
</pre>
</details>

<details><summary> Program-68)  Merge Two Binary Trees <b>#Tree</b> </summary>
<pre>
  -> The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
  Ex. 4           5                 9
     / \    +    /        =        / \
    2   6       3                 5   6
</pre>
</details>

<details><summary> Program-69)  Middle of the Linked List <b>#Linked List</b> </summary>
<pre>
  -> singly linked list with head node head, return a middle node of linked list.
  -> If there are two middle nodes, return the second middle node.
    Ex. Input = [4,5,6,7,7,4,3,3]
        Ans = [7,4,3,3]
</pre>
</details>

<details><summary> Program-70)  Find Minimum in Rotated Sorted Array II <b>#Binary Search #Array</b> </summary>
<pre>
  -> An array sorted in ascending order is rotated at some pivot unknown to you beforehand. Find min of array.
  Ex. Input = [1,3,5,5,6,3,2,0,1,1]
      Ans = 0
</pre>
</details>

<details><summary> Program-71)  Search a 2D Matrix <b>#Binary Search #Array</b> </summary>
<pre>
  -> Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     1 -> Integers in each row are sorted from left to right.
     2 -> The first integer of each row is greater than the last integer of the previous row.
  Ex.  Matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]] Target = 3
       Ans = true
</pre>
</details>

<details><summary> Program-72)  Sum of Two Integers <b>#Bit Manipulation</b> </summary>
<pre>
  Ex. a = 5 and b = 6 
      Ans = 11
</pre>
</details>

<details><summary> Program-73)  Add Two Numbers <b>#Linked List #Math</b> </summary>
<pre>
 -> You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse             order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
      Ex. Num1 = 2->4->3->7->8    Num2 = 5->6->4->4->2
          Ans = 7->0->8->1->1->1
</pre>
</details>

<details><summary> Program-74)  Add to Array-Form of Integer <b>#Array</b> </summary>
<pre>
 -> The array-form of X is an array of its digits in left to right order.
    Ex. X = [1,4,53,5,63,9] and K = 94243 ( Add number + K)
        Ans = [2,8,8,3,8,2]
</pre>
</details>

<details><summary> Program-75)  Binary Tree Inorder Traversal <b>#Tree #Stack #Hash Table</b> </summary>
<pre>
  Ex.Input = [7,4,1,6,9,2,3]
        7
       / \
      4   9
     / \
    1   6
     \
      2
       \
        3
     Ans = [6,4,9,7,2,1,3]
</pre>
</details>

<details><summary> Program-76)  Binary Tree Preorder Traversal <b>#Tree #Stack</b> </summary>
<pre>
  Ex. Input = [7,4,1,6,9,2,3]
        7
       / \
      4   9
     / \
    1   6
     \
      2
       \
        3
      Ans = [7,4,6,9,1,2,3]
</pre>
</details>

<details><summary> Program-77)  Binary Tree Postorder Traversal <b>#Tree #Stack</b> </summary>
<pre>
  Ex. Input = [7,4,1,6,9,2,3]
        7
       / \
      4   9
     / \
    1   6
     \
      2
       \
        3
      Ans = [6,9,4,2,3,1,7]
</pre>
</details>

<details><summary> Program-78)  Minimum Distance Between BST Nodes <b>#Tree #Recursion</b> </summary>
<pre>
  -> Find the minimum difference between the values of any two different nodes in the BST
  Ex. Input = [4,2,6,1,3,null,null]
        4
       / \
      2   6
     / \    
    1   3  
    Ans = 1
</pre>
</details>

<details><summary> Program-79)  Find All Duplicates in an Array <b>#Array</b> </summary>
<pre>
  -> Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
  -> Find all the elements that appear twice in this array.
  Ex. Input = [4,3,5,5,6,8,7,5,3,2,2,7,8,2,3,1] 
      Ans = [5,5,3,2,7,8,2,3]
</pre>
</details>

<details><summary> Program-80)  Find All Numbers Disappeared in an Array <b>#Array</b> </summary>
<pre>
  -> Find all the elements of [1, n] inclusive that do not appear in this array.
  Ex. Input = [4,3,5,5,6,8,7,5,3,2,2,7,8,2,3,1] 
      Ans = [9,10,11,12,13,14,15,16]
</pre>
</details>

<details><summary> Program-81)  Distance Between Bus Stops <b>#Array</b> </summary>
<pre>
  -> A bus has n stops numbered from 0 to n - 1 that form a circle. 
  -> We know the distance between all pairs of neighboring stops where distance[i] is the distance between the stops number        i and (i + 1) % n.
  -> Return the shortest distance between the given start and destination stops.
  Ex. Input = [4,3,5,5,6,8,7,5,3,2,2,7,8,2,3,1] Start = 4, Destination = 8
      Ans = 26
</pre>
</details>

<details><summary> Program-82)  N-Repeated Element in Size 2N Array <b>#Hash Table</b> </summary>
<pre>
  -> in a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
  -> Return the element repeated N times.
    Ex. [5,1,5,2,5,3,5,4]
        Ans = 5
</pre>
</details>

<details><summary> Program-83)  Maximum 69 Number <b>#Math #Array</b> </summary>
<pre>
  -> Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
    Ex. Num = 9669
        Ans = 9969
</pre>
</details>

<details><summary> Program-84)  Largest Perimeter Triangle <b>#Greedy #Math</b> </summary>
<pre>
  -> Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of          these lengths.
    Ex. [2,1,2,6,5,4,8,7,3,10,1,3,4,2344,12124]
        Ans = 25
</pre>
</details>

<details><summary> Program-85)  Peak Index in a Mountain Array <b>#Binary Search</b> </summary>
<pre>
  -> Given an array that is definitely a mountain, return any i such that 
          A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
     Ex. Input -> A = [0,1,2,3,5,6,7,4,3,2,4,3,2,1,0]
         Ans = 6
</pre>
</details>
  
<details><summary> Program-86)  Find Peak Element <b>#Binary Search #Array</b> </summary>
<pre>
  -> A peak element is an element that is greater than its neighbors.
  -> The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
    Ex. A = [6,7,8,7,3]
        Ans = 2
</pre>
</details>

<details><summary> Program-87)  Find the Distance Value Between Two Arrays <b>#Array</b> </summary>
<pre>
  -> Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
  -> The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where              |arr1[i]-arr2[j]| <= d.
    Ex. Arr1 = [2,1,100,3]
        Arr2 = [-5,-2,10,-3,7]
        d = 6
        Ans = 1
</pre>
</details>

<details><summary> Program-88)  Find Lucky Integer in an Array </summary>
<pre>
  -> A lucky integer is an integer which has a frequency in the array equal to its value.
  -> Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no          lucky integer return -1.
    Ex. Input = [2,2,3,4]
        Ans = 2
</pre>
</details>

<details><summary> Program-89)  Monotonic Array <b>#Array</b> </summary>
<pre>
  -> An array is monotonic if it is either monotone increasing or monotone decreasing.
    Ex. Input = [6,7,9,13,15,26,125]    Input = [1,3,4,6,2,3,1]
        Ans = true                      Ans = false
</pre>
</details>

<details><summary> Program-90)  Leaf-Similar Trees <b>#Tree</b> </summary>
<pre>
  -> Consider all the leaves of a binary tree. From left to right order, the values of those leaves form a leaf value              sequence.
  -> Two binary trees are considered leaf-similar if their leaf value sequence is the same.
      Ex. Tree1 = [3,5,1,6,2,9,8,null,null,7,4]
          Tree2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
          Ans = true
</pre>
</details>

<details><summary> Program-91)  Reduce Array Size to The Half <b>#Greedy #Array</b> </summary>
<pre>
  -> You can choose a set of integers and remove all the occurrences of these integers in the array.
  -> Return the minimum size of the set so that at least half of the integers of the array are removed.
    Ex. Input = [3,3,3,3,5,5,5,2,2,7]
        Ans = 2        (Explanation : {3,7} , Reduced array = [5,5,5,2,2])
</pre>
</details>

<details><summary> Program-92)  Maximum Width Ramp <b>#Array</b> </summary>
<pre>
  -> Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].The width of such a ramp is j-i.
  -> Find the maximum width of a ramp in A.  If one doesn't exist, return 0.
    Ex. Input = [9,8,1,0,1,9,4,0,4,1]
        Ans = 7       (Explanation : index -> (2,9)) 
</pre>
</details>

<details><summary> Program-93)  Contains Duplicate <b>#Hash Table #Array</b> </summary>
<pre>
  -> Given an array of integers, find if the array contains any duplicates.
      Ex. Input = [7,8,5,4,3,4,6,7,8]
          Ans = true
</pre>
</details>

<details><summary> Program-94)  Contains Duplicate II <b>#Hash Table #Array</b> </summary>
<pre>
  -> Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such        that nums[i] = nums[j] and the absolute difference between i and j is at most k.
    Ex. Input = [1,2,3,1,7,6,5,6,7,8,9,7] and k = 6
        Ans = true
</pre>
</details>

<details><summary> Program-95)  Rotate Array <b>#Array</b> </summary>
<pre>
  -> Given an array, rotate the array to the right by k steps, where k is non-negative.
    Ex. Input = [1,2,3,7,5,6,4,4,5,6,7] and K = 5
        Ans = [4,4,5,6,7,1,2,3,7,5,6]
</pre>
</details>

<details><summary> Program-96)  Best Time to Buy and Sell Stock <b>#Dynamic Programming #Array</b> </summary>
<pre>
  -> you have an array for which the ith element is the price of a given stock on day i.
  -> If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock)
  -> Design an algorithm to find the maximum profit.
      Ex. Input = [7,11,3,4,67,87,3,4,2,46]
          Ans = 84    (Explanation: buy = 3 and sell = 87, profit = 84)
</pre>
</details>

<details><summary> Program-97)  Count Number of Nice Subarrays <b>#Two Pointers</b> </summary>
<pre>
  -> Given an array of integers nums and an integer k. A subarray is called nice if there are k odd numbers on it.
  -> Return the number of nice sub-arrays.
     Ex. Input = [1,8,7,6,5,9,8,7,6,3,2,1,9] and k = 6
         Ans = 6
</pre>
</details>

<details><summary> Program-98)  First Unique Character in a String <b>#String #Hash Table</b> </summary>
<pre>
  -> Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
    Ex. s = "loveleetcode"
        Ans = 2
</pre>
</details>

<details><summary> Program-99)  Increasing Order Search Tree <b>#Tree</b> </summary>
<pre>
  -> Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the        tree, and every node has no left child and only 1 right child.
      Ex. Input =  5       
                  / \             
                3    6      
               / \    \
              2   4    8
             /        / \ 
            1        7   9
          Ans =  1
                  \
                   2
                    \
                     3
                      \
                       4
                        \
                         5
                          \
                           6
                            \
                             7
                              \
                               8
                                \
                                 9    
</pre>
</details>

<details><summary> Program-100)  Sum of Left Leaves <b>#Tree #Array</b> </summary>
<pre>
  -> Find the sum of all left leaves in a given binary tree.
      EX. Input = 5
                 / \
                7   9
               /   / \
              4   5   10 
          Ans = 9 (4+5)   
</pre>
</details>

<details><summary> Program-101)  Product of Array Except Self <b>#Array</b> </summary>
<pre>
  -> Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the 
  product of all the elements of nums except nums[i]. 
    Ex. Input = [1,2,3,4]
        Ans = [24,12,8,6]
</pre>
</details>

<details><summary> Program-102)  Check If N and Its Double Exist <b>#Array</b> </summary>
<pre>
  -> Given an array arr of integers, check if there exists two integers N and M such that N is the double of M (i.e.N = 2*M).
      Ex. Input = [10,2,5,4,3,2]
          Ans = true
</pre>
</details>

<details><summary> Program-103)  Product of the Last K Numbers <b>#Design #Array</b> </summary>
<pre>
  -> Implement the class ProductOfNumbers that supports two methods:
    1. add(int num)
        Adds the number num to the back of the current list of numbers. 
    2. getProduct(int k)
        Returns the product of the last k numbers in the current list.
        You can assume that always the current list has at least k numbers.
    Ex. Input =       
          ["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]
          [[],[3],[0],[2],[5],[4],[2],[3],[4],[8],[2]]
        Ans = [null,null,null,null,null,null,20,40,0,null,32]  
</pre>
</details>


<details><summary> Program-104)  1-bit and 2-bit Characters <b>#Array</b> </summary>
<pre>
  -> There are two special characters. The first character can be represented by one bit 0. The second character can be            represented by two bits (10 or 11).
  -> Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The      given string will always end with a zero.
      Ex. Input = [1, 1, 1, 0]        Input = [0,0]
          Ans = false                 Ans = true
</pre>
</details>

<details><summary> Program-105)  Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold <b>#Array</b> </summary>
<pre>
  -> Given an array of integers arr and two integers k and threshold.
  -> Return the number of sub-arrays of size k and average greater than or equal to threshold.
      Ex. Input = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
          Ans = 3 (Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. 
                  All other sub-arrays of size 3 have averages less than 4 (the threshold))
</pre>
</details>

<details><summary> Program-106)  Insert into a Binary Search Tree <b>#Tree</b> </summary>
<pre>
  -> Binary Search Tree is a node-based binary tree data structure which has the following properties:
  -> The left subtree of a node contains only nodes with keys lesser than the node’s key.
  -> The right subtree of a node contains only nodes with keys greater than the node’s key.
  -> The left and right subtree each must also be a binary search tree.
     Ex. Input = 4     val = 5
                / \             Ans =  4
               2   7                 /   \
              / \                   2     7  
             1   3                 / \   /
                                  1   3 5
</pre>
</details>

<details><summary> Program-107)  Maximum Binary Tree <b>#Tree</b> </summary>
<pre>
  -> Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
     ->The root is the maximum number in the array.
     ->The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
     ->The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
  ->Construct the maximum tree by the given array and output the root node of this tree.
  Ex. Input = [3,2,1,6,0,5]
      Ans = 6
          /   \
         3     5
          \    / 
           2  0   
             \
              1
</pre>
</details>

<details><summary> Program-108)  Maximum Subarray <b>#Array #Dynamic Programming #Divide and Conquer</b> </summary>
<pre>
  -> Given an integer array nums, find the contiguous subarray (containing at least one number) which has the 
     largest sum and return its sum.
  Ex. Input = [9,8,7,-4,0,-6,-3,7,8,8]
      Ans = 34
</pre>
</details>

<details><summary> Program-109)  Maximum Product of Three Numbers <b>#Array #Math</b> </summary>
<pre>
  -> Given an integer array, find three numbers whose product is maximum and output the maximum product.
  Ex. Input = [9,8,7,-4,0,-6,-3,7,8,8]
      Ans = 576
</pre>
</details>


<details><summary> Program-110)  Odd Even Linked List <b>#Linked List</b> </summary>
<pre>
  -> Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here 
     we are talking about the node number and not the value in the nodes.
     Ex. Input : 2->1->3->5->6->4->7->NULL
         Output: 2->3->6->7->1->5->4->NULL
</pre>
</details>

<details><summary> Program-111)  Reverse Linked List <b>#Linked List</b> </summary>
<pre>
  -> Reverse a singly linked list.
    Ex. Input : 1->2->3->4->5->NULL
        Output: 5->4->3->2->1->NULL
</pre>
</details>

<details><summary> Program-112)  Delete Node in a Linked List <b>#Linked List</b> </summary>
<pre>
  -> Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
  -> Given linked list -- head = [4,5,1,9], which looks like following:
     Ex. head = [4,5,1,9], node = 5
         Output: [4,1,9]
</pre>
</details>

<details><summary> Program-113)  Remove Linked List Elements <b>#Linked List</b> </summary>
<pre>
  -> Remove all elements from a linked list of integers that have value val.
     Ex. Input:  1->2->6->3->4->5->6, val = 6
         Output: 1->2->3->4->5
</pre>
</details>

<details><summary> Program-114)  Remove Duplicates from Sorted List <b>#Linked List</b> </summary>
<pre>
  -> Given a sorted linked list, delete all duplicates such that each element appear only once.
     Ex. Input: 1->1->2->3->3
         Output: 1->2->3
</pre>
</details>

<details><summary> Program-115)  Remove Nth Node From End of List <b>#Linked List</b> </summary>
<pre>
  -> Given a linked list, remove the n-th node from the end of list and return its head.
     Ex. Input: 1->2->3->4->5, and n = 2.
         Output: 1->2->3->5.
</pre> 
</details>

<details><summary> Program-116)  Complement of Base 10 Integer <b>#Math</b> </summary>
<pre>
  -> Find complement of Base 10 Integer.
     Ex. Input: 5 (101)
         Output: 2 (010)
</pre> 
</details>

<details><summary> Program-117)  Third Maximum Number <b>#Array</b> </summary>
<pre>
  -> Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the          maximum number. 
     Ex. Input: [2, 2, 3, 1]
         Output: 1
</pre> 
</details>

<details><summary> Program-118)  Kth Largest Element in a Stream <b>#Heap</b> </summary>
<pre>
  -> Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,      not the kth distinct element.
  -> Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains            initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth        largest element in the stream.
     Ex.  int k = 3;
          int[] arr = [4,5,8,2];
          KthLargest kthLargest = new KthLargest(3, arr);
          kthLargest.add(3);   // returns 4
          kthLargest.add(5);   // returns 5
          kthLargest.add(10);  // returns 5
          kthLargest.add(9);   // returns 8
          kthLargest.add(4);   // returns 8
</pre> 
</details>

<details><summary> Program-119)  Find Pivot Index <b>#Array</b> </summary>
<pre>
  -> Given an array of integers nums, write a method that returns the "pivot" index of this array.
  -> We define the pivot index as the index where the sum of the numbers to the left of the index is 
     equal to the sum of the numbers to the right of the index.
  -> If no such index exists, we should return -1. If there are multiple pivot indexes, you should return 
     the left-most pivot index.
     Ex. Input = [1, 7, 3, 6, 5, 6]
         Output = 3
</pre> 
</details>

<details><summary> Program-120)  Length of Last Word <b>#String</b> </summary>
<pre>
  -> Return the length of last word in given string
    Ex. Input = "My name is Hardik"
        Output = 6
</pre> 
</details>

<details><summary> Program-121)  Bulls and Cows <b>#Hash Table</b> </summary>
<pre>
  -> You are playing the following Bulls and Cows game with your friend: You write down a number and 
     ask your friend to guess what the number is. Each time your friend makes a guess, you provide a 
     hint that indicates how many digits in said guess match your secret number exactly in both digit and 
     position (called "bulls") and how many digits match the secret number but locate in the wrong 
     position (called "cows"). 
  -> Your friend will use successive guesses and hints to eventually derive the secret number.
  -> Write a function to return a hint according to the secret number and friend's guess, 
     use A to indicate the bulls and B to indicate the cows. 
    Ex. Secret = "122432"  Guess = "783223"
        Output = "0A3B"
</pre> 
</details>

<details><summary> Program-122)  Next Greater Element I <b>#Stack</b> </summary>
<pre>
  -> You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. 
     Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
  -> The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
     If it does not exist, output -1 for this number.
    Ex. nums1 = [2,4], nums2 = [1,2,3,4].
        Output = [3,-1]
</pre> 
</details>

<details><summary> Program-123)  Range Sum Query - Immutable <b>#Dynamic Programming #Segment Tree</b> </summary>
<pre>
  -> Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
    Ex. Given nums = [-2, 0, 3, -5, 2, -1]
          sumRange(0, 2) -> 1
          sumRange(2, 5) -> -1
          sumRange(0, 5) -> -3
</pre> 
</details>

<details><summary> Program-124)  Range Sum Query 2D - Immutable <b>#Dynamic Programming</b> </summary>
<pre>
  -> Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner 
     (row1, col1) and lower right corner (row2, col2).
    Ex. Given matrix = [
                        [3, 0, 1, 4, 2],
                        [5, 6, 3, 2, 1],
                        [1, 2, 0, 1, 5],
                        [4, 1, 0, 1, 7],
                        [1, 0, 3, 0, 5]
                      ]
        sumRegion(2, 1, 4, 3) -> 8
        sumRegion(1, 1, 2, 2) -> 11
        sumRegion(1, 2, 2, 4) -> 12
</pre> 
</details>

<details><summary> Program-125)  Check If It Is a Straight Line <b>#Array #Math #Geometry</b> </summary>
<pre>
  -> You are given an array coordinates,coordinates[i] = [x, y],where [x, y] represents the coordinate of a point. 
     Check if these points make a straight line in the XY plane.
    Ex. coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
        Output: true
</pre> 
</details>

<details><summary> Program-126)  Valid Mountain Array <b>#Array</b> </summary>
<pre>
  -> Given an array A of integers, return true if and only if it is a valid mountain array.
  -> Recall that A is a mountain array if and only if:
      -> A.length >= 3
      -> There exists some i with 0 < i < A.length - 1 such that:
           A[0] < A[1] < ... A[i-1] < A[i]
           A[i] > A[i+1] > ... > A[A.length - 1]
    Ex. Input : [0,2,3,4,5,2,1,0]
        Output: true
</pre> 
</details>
