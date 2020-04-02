# Java_Basic_Codes

### In this repository, there are some basic programs (only functions) that most companies ask during interview process in java language.

<br />

<details><summary> Program-1)   Median of two sorted arrays (time complexity should be O(log(m+n)))</summary>
<pre>
      Ex. nums1 = [1,2] and nums2 = [3,4]
          median = (2+3)/2 = 2.5
</pre>
</details>
                  
<details><summary> Program-2)   Merge two sorted linked lists</summary>
<pre>
      Ex. lis1 = 1->4->5 and list2 = 1->6->8
          ans = 1->1->4->5->6->8
</pre>
</details> 

<details><summary> Program-3)   Search insert position</summary>
<pre>
       -> Given a sorted array and a target value, return the index if the target is found. If not, return the index where it           would be if it were inserted in order.
        Ex. [1,3,5,6], 7
            ans = 4
</pre>
</details> 

<details><summary> Program-4)   Find First and Last Position of Element in Sorted Array  </summary>
<pre>
       Ex. nums = [5,7,7,8,8,10], target = 8
           ans = [3,4]
</pre>
</details> 
        
<details><summary> Program-5)   Count of Smaller Numbers After Self  </summary>
<pre>
       Ex. nums = [5,2,6,1]
           ans = [2,1,1,0]
</pre>
</details>

<details><summary> Program-6)   Boats to Save People (Return the minimum number of boats) </summary>
<pre>
       -> The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
       -> Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most                 limit.
        Ex. people = [3,2,2,1], limit = 3
            ans = 3   (Explanation: 3 boats (1, 2), (2) and (3))
</pre>
</details>

<details><summary> Program-7)   Same Tree or not </summary>
<pre>
        -> Given two binary trees, write a function to check if they are the same or not.
         Ex.    1         1
               / \       / \
              2   3     2   3 
         input = [1,2,3], [1,2,3]
         Ans = true 
</pre>
</details>
          
<details><summary> Program-8)   Validate Binary Search Tree </summary>
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

<details><summary> Program-9)   Invert Binary Tree </summary>
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

<details><summary> Program-10)   Sum Root to Leaf Numbers (each path from root to leaf represents the number) </summary>
<pre>
        Ex. [4,9,0,5,1]         
                  4
                 / \
                9   0     Ans = 495 + 491 + 40 = 1026
               / \
              5   1
</pre>
</details>

<details><summary> Program-11)  Path Sum (check if path exist in which sum of values of nodes equal to given target sum) </summary>
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

<details><summary> Program-12)   Binary search (time complexity O(log(n))</summary>
<pre>
       Ex. nums = [-1,0,3,5,9,12], target = 9
           Ans = 4
</pre>
</details>
          
<details><summary> Program-13)   Search and return subtree of that node in Binary Search Tree </summary>
<pre>
        Ex. input =  4      key = 2    Output =  2      else return [];
                    / \                         / \ 
                   2   7                       1   3
                  / \
                 1   3
</pre>
</details>

<details><summary> Program-14)   Symmetric Tree (mirror image concept can be applied here) </summary>
<pre>
       Ex. input =    1         Output = true
                     / \
                    7   7
                   / \ / \
                  5  2 2  5
</pre>
</details>

<details><summary> Program-15)   Add Binary Strings </summary>
<pre>
       Ex. string1 = "1010", string2 = "1011"
          Ans = "10101"
</pre>
</details>

<details><summary> Program-16)   Plus One (Add 1 in the given number in form of array) </summary>
<pre>
       Ex. Input = [2,4,5,9]       Input = [9,9,9]
           Ans =  [2,4,6,0]       Input = [1,0,0,0]
</pre>
</details>

<details><summary> Program-17)  Count no of 1 in given String (Concept of masking of bits in using AND operation) </summary>
<pre>
       Ex. 11111111111111111111111111101101
           Ans = 30
</pre>
</details>

<details><summary> Program-18)  Hamming Distance (Upto 32 bits) (Use of Integer.toBinaryString(int) function of java in-built function) </summary>
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

<details><summary> Program-19)  Total Hamming Distance (All pairs of numbers in given array) (time complexity must be taken care of because of  two for loops) </summary>
<pre>
      Ex. Input => [5, 15, 20]
      Ans = hamming(5,15) + hamming(15,20) + hamming(5,20)
          = 2 + 4 + 2
          = 8
</pre>
</details>

<details><summary> Program-20)  Reverse Integer (Constraint : 32-bit signed integer) </summary>
<pre>
      Ex. Input  = 113      Input = -345    Input = 120
           Ans = 311         Ans = -543      Ans = 21
</pre>
</details>

<details><summary> Program-21)  Move Zeros to end of the array (Without using another array and min no of operations) </summary>
<pre>
      Ex. Input = [0,56,3,2,4,0,2]
           Ans = [56,3,2,4,2,0,0]
</pre>
</details>

<details><summary> Program-22)  Subtract the Product and Sum of Digits of an Integer </summary>
<pre>
      Ex. N = 453
          Product = 4*5*3 = 60
          Sum = 4 + 5 + 3 = 12
          Result = 60 - 12 = 48
</pre>
</details>

<details><summary> Program-23)  Number of Steps to Reduce a Number to Zero (If n is even divide by 2 otherwise reduce 1 from n at each operation until zero) </summary>
<pre>
      Ex. Num = 6;
          Ops = (6/2) = (3-2) = (2/2) = (1-1) = 0.
          No of Ops = 1 + 1 + 1 + 1 = 4
</pre>
</details>

<details><summary> Program-24)  Intersection of Two Arrays </summary>
<pre>
      Ex. Input1 = [4,7,6]  Input2 = [6,32,23,7,8]
          Ans = [7,6]
</pre>
</details>

<details><summary> Program-25)  Replace Elements with Greatest Element on Right Side (Last element = -1) </summary>
<pre>
      Ex. arr = [17,18,5,4,6,1]
          Ans = [18,6,6,6,1,-1]
</pre>
</details>

<details><summary> Program-26)  Find Numbers with Even Number of Digits </summary>
<pre>
      Ex. Input = [34,5,4,345,6785]
          Ans = 2
</pre>
</details>
                 
<details><summary> Program-27)  Merge Sorted Array (Assume : array one is large enough to hold both array) </summary>
<pre>
      Ex. Input1 = [1,5,4,0,0,0]
          Input2 = [3,2,7]
          Ans = [1,2,3,4,5,7]
</pre>
</details>

<details><summary> Program-28)  Two Sum </summary>
<pre>
      -> Given an array of integers, return indices of the two numbers such that they add up to a specific target.
      Ex. Input = [7,8,45,32] Target = 15
          Ans = Input[0] + Input[1] = 7+8 = 15
          Ans = [0,1]
</pre>
</details>

<details><summary> Program-29)  Single Number </summary>
<pre>
      -> Given a non-empty array of integers and Frequency of all elements except one, find that number
      Ex. Input = [5,6,7,7,5,8,6,4,8]
          Ans = 4
</pre>
</details>

<details><summary> Program-30)  Power (x,n) (Only for 32 bit range [-2^32, 2^31 - 1] </summary>
<pre>
      Ex. Input -> X = 2.0, n = 10
          Ans = 1024.0
</pre>
</details>

<details><summary> Program-31)  Max Consecutive Ones (Input string of 0 and 1s) </summary>
<pre>
      Ex. Input = [1,1,0,0,0,1,1,1,1,1]
          Ans = 5
</pre>
</details>

<details><summary> Program-32)  Palindrome Number (Negative number also) (Without converting to string) </summary>
<pre>
      Ex. Input = 565     Input = -565
          Ans = true      Ans = false
</pre>
</details>

<details><summary> Program-33)  Find First and Last Position of Element in Sorted Array (O(log(n)) </summary>
<pre>
      Ex. Input = [5,4,6,8,6,5,3]       Input = [3,4,5,2,4,5,6]
          Target = 6                    Target = 8
          Ans = [2,4]                   Ans = [-1,-1]
</pre>
</details>

<details><summary> Program-34)  Edit Distance (One of the useful similarity measure in data science)(Using Dynamic Approach) </summary>
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

<details><summary> Program-35)  Integer Replacement </summary>
<pre>
      ->  Given a positive integer n and you can do operations as follow:
        Until n = 1; do
      -> If n is even, replace n with n/2.
      -> If n is odd, you can replace n with either n+1 or n-1. (Choose by which min no of operations can be obtained)
         Ex. Input = 12
             12 -> 6 -> 3 -> 2 -> 1  Opes = 4      (at 3 -> N = N-1)
             12 -> 6 -> 3 -> 4 -> 2 -> 1 Opes = 5  (at 3 -> N = N+1)
             Ans = 4
</details>

<details><summary> Program-36)  Missing Number (first missing number from 0,1,2... n where n = array length) </summary>
<pre>
      Ex. Input = [0,1,2]   Input = [6,7,8,9]
          Ans = 3           Ans = 4
</details>
  
<details><summary> Program-37)  First Missing Positive (find the first positive number in unsorted array) </summary>
<pre>
      Ex. Input = [-5,-3,1,3]           Input = [4,3,5,2]       Input = [-5,-4,-9,-10,-11]   
          Ans   = 2                     Ans   = 1               Ans   = 1
</details>  

<details><summary> Program-38) Complement of number </summary>
<pre>
      Ex. Input = 34529     Input = 34
          Ans = 31006       Ans = 29
</details> 
  
<details><summary> Program-39)  Student Attendance Record I </summary>
<pre>
      -> You are given a string representing an attendance record for a student. The record only contains the following three          characters:
            'A' : Absent.
            'L' : Late.
            'P' : Present.
      -> A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two              continuous 'L' (late).
          Ex. "PPALLP"           "LLPPPLL"
              Ans = true        Ans = true
</details>  

<details><summary> Program-40)  Binary Number with Alternating Bits </summary>
<pre>
      -> Given a positive integer, check whether it has alternating bits.
        Ex. Input = 5  (101)    Input = 231 (11100111)   
            Ans = true          Ans = false
</details> 

<details><summary> Program-41)  Maximum Average Subarray I </summary>
<pre>
      -> Find the contiguous subarray of given length k that has the maximum average value.
        Ex. Input = [10,12,66,-70,-53]  K = 4
            Ans = 4.50

</details> 

<details><summary> Program-42)  Sum of Square Numbers </summary>
<pre>
      -> Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
      Ex. Input = 46        Input = 3423
          Ans = false       Ans = false
</details>

<details><summary> Program-43)  Valid Perfect Square (Do not use sqrt function)</summary>
<pre>
      Ex. Input = 625         Input = 24
          Ans = true          Ans = false
</details>
  
<details><summary> Program-44)  Sqrt(x) (find square root of given number using floor function) </summary>
<pre>
      Ex. Input = 16            Input = 534
          Ans = 4               Ans = 23
</details>

<details><summary> Program-45)  Powerful Integers </summary>
<pre>
      -> Given two positive integers x and y, an integer is powerful if it is equal to x^i + y^j
          for some integers i >= 0 and j >= 0. until the bound given.
      Ex. Input => X = 5, Y = 7, Bound = 15
          Ans = [2,6,8,12]
</details>
  

<details><summary> Program-46)  Valid Parentheses </summary>
<pre>
      -> Check if given string of parentheses is balanced or not.
      Ex. Input = "((({}[))])"
          Ans = false
</details> 
  
<details><summary> Program-47)  Score of Parentheses </summary>
<pre>
      -> Given a balanced parentheses string S, compute the score of the string based on the following rule:
      -> () has score 1
      -> AB has score A + B, where A and B are balanced parentheses strings.
      -> (A) has score 2 * A, where A is a balanced parentheses string.   
          Ex. Input = "(()(()(()))())"
              Ans = 16
</details>
  
<details><summary> Program-48)  Prime Number of Set Bits in Binary Representation </summary>
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
</details>
  
<details><summary> Program-49)  Sum of Even Numbers After Queries </summary>
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
</details>  

<details><summary> Program-50)  Maximum Number of Balloons </summary>
<pre>
      -> From the given string, find the number of string balloon can be formed.
        Ex. Input = "nlaebolkoballono"
            Ans = 2
</details> 
  
<details><summary> Program-51)  Minimum Depth of Binary Tree </summary>
<pre>
      Ex. Input = [8,6,4,5,10,16,2]
              8           
             / \        Ans = 3
            6   10
           /     \
          4       16
         / \
        2   5
</details>
  
<details><summary> Program-52)  Maximum Depth of Binary Tree </summary>
<pre>
      Ex. Input = [20,8,4,14,23]
            20
           /  \         Ans = 3
          8    23 
         / \
        4   14 
</details>
  
<details><summary> Program-53)  Balanced Binary Tree </summary>
<pre>
      -> Height-balanced binary tree is defined as:
          -> a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
       Ex. Input = [3,9,20,null,null,15,7]
             3
            / \     Ans = true
           9  20      
          / \
         15  7
</details>
  
<details><summary> Program-54)  Self Dividing Numbers </summary>
<pre>
      -> A self-dividing number is a number that is divisible by every digit it contains.
      -> Also, a self-dividing number is not allowed to contain the digit zero.
        Ex. Input -> Left = 56 & Right = 78
            Ans = [66,77]
</details> 
  
<details><summary> Program-55)  Average of Levels in Binary Tree </summary>
<pre>
        Ex.   3     
             / \      Ans = [3, 14.5, 11]
            9  20
              /  \
             15   7
</details>  

<details><summary> Program-56)  Perfect Number </summary>
<pre>
      -> Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
      Ex. Input = 256       Input = 6
          Ans = false       Ans = true
</details>
  
<details><summary> Program-57)  Add Digits </summary>
<pre>
      -> Add all its digits until the result has only one digit.
      Ex. Input = 78
          Ans = 7+8 = 15 = 1+5 = 6
</details>  

<details><summary> Program-58)  Daily Temperatures </summary>
<pre>
      -> Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you          would have to wait until a warmer temperature. 
      -> If there is no future day for which this is possible, put 0 instead.
        Ex. Input = [73,78,71,71,69,72,73,76]
            Ans = [1,0,3,2,1,1,1,0]
</details>
  
<details><summary> Program-59)  Counting Bits </summary>
<pre>
      -> Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in       their binary representation and return them as an array.
        Ex. Input -> num = 35
            Ans = [0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3]
</details>  

<details><summary> Program-60)  Majority Element </summary>
<pre>
      -> Given an array of size n, find the majority element.
      -> The majority element is the element that appears more than ⌊ n/2 ⌋ times.
        Ex. Input = [1,2,4,3,2,4,4,4,4,4,2]
            Ans = 4
</details>
  
<details><summary> Program-61)  Majority Element II </summary>
<pre>
      -> Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
        Ex. Input = [4,4,5,3,4,5,5,3,3,3,3,4,4,4,4]
            Ans = [4]
</details>
  
<details><summary> Program-62)  All Elements in Two Binary Search Trees </summary>
<pre>
      -> Given two binary search trees root1 and root2.
      -> Return a list containing all the integers from both trees sorted in ascending order.
      Ex.  4         6           List1 = [4,5,7]
          / \       / \          List2 = [6,10,1]
         5   7     10  1         
         Ans = [1,4,5,6,7,10]
</details>
  
<details><summary> Program-63)  Count Number of Teams </summary>
<pre>
      -> There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
      -> Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
          A team is valid if:  
            (rating[i] < rating[j] < rating[k]) or 
            (rating[i] > rating[j] > rating[k]) 
            where (0 <= i < j < k < n).
        Ex. rating = [2,5,3,4,1]
            Ans = 3  [ Explanation: (2,3,4), (5,4,1), (5,3,1)]
</details>
  
<details><summary> Program-64)  Univalued Binary Tree </summary>
<pre>
      -> A binary tree is univalued if every node in the tree has the same value.
          Ex. 6
             / \     Ans = true
            6   6
           /
          6 
</details> 
  
<details><summary> Program-65)  Convert Binary Number in a Linked List to Integer </summary>
<pre>
      Ex. Input = [1,0,1,1,1,1,0,0,0,0,1]
          Ans = 1505
</details>

<details><summary> Program-66)  Unique Number of Occurrences </summary>
<pre>
      -> write a function that returns true if and only if the number of occurrences of each value in the array is unique.
        Ex. Input = [-5,-6,2,6,-5,-7,5]
            Ans = false
</details>

<details><summary> Program-67)  Valid Anagram </summary>
<pre>
      -> Given two strings str1 and str2 , write a function to determine if str2 is an anagram of str1.
          Ex. Str1 = "hardik" Str2 = "krdiha"
              Ans = true
</details>

<details><summary> Program-68)  Merge Two Binary Trees </summary>
<pre>
      -> The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
      Ex. 4           5                 9
         / \    +    /        =        / \
        2   6       3                 5   6
</details>
  
<details><summary> Program-69)  Middle of the Linked List </summary>
<pre>
      -> singly linked list with head node head, return a middle node of linked list.
      -> If there are two middle nodes, return the second middle node.
        Ex. Input = [4,5,6,7,7,4,3,3]
            Ans = [7,4,3,3]
</details>  

<details><summary> Program-70)  Find Minimum in Rotated Sorted Array II </summary>
<pre>
      > An array sorted in ascending order is rotated at some pivot unknown to you beforehand. Find min of array.
      Ex. Input = [1,3,5,5,6,3,2,0,1,1]
          Ans = 0
</details>

<details><summary> Program-71)  Search a 2D Matrix </summary>
<pre>
      -> Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
         1 -> Integers in each row are sorted from left to right.
         2 -> The first integer of each row is greater than the last integer of the previous row.
      Ex.  Matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]] Target = 3
           Ans = true
</details>
