# Java_Basic_Codes

### In this repository, there are some basic programs (only functions) that most companies ask during interview process in java language.

#### Categories (like array,linked list,tree) of all questions are also tagged along side of question description below.

<br />

<h2> Find all the problems' description below. </h2>

<details><summary> Click here to expand the problem statements. (Total Problems: 249) </summary>
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
     -> Given a sorted array and a target value, return the index if the target is found. If not, 
        return the index where it would be if it were inserted in order.
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
     -> Each boat carries at most 2 people at the same time, provided the sum of the weight of those people 
        is at most limit.
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
    -> The minimum edit distance is the minimum number of editing operations (insert, delete, replace) to 
       transform one string into the other.
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
    -> If n is odd, you can replace n with either n+1 or n-1.(Choose by which min no of operations can be obtained)
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
    -> You are given a string representing an attendance record for a student. The record only contains 
       the following three characters:
          'A' : Absent.
          'L' : Late.
          'P' : Present.
    -> A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or 
       more than two continuous 'L' (late).
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
    -> Given a non-empty binary tree, return the average value of the nodes on each level in the 
       form of an array.
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
    -> Given a list of daily temperatures T, return a list such that, for each day in the input, tells 
       you how many days you would have to wait until a warmer temperature. 
    -> If there is no future day for which this is possible, put 0 instead.
      Ex. Input = [73,78,71,71,69,72,73,76]
          Ans = [1,0,3,2,1,1,1,0]
  </pre>
  </details>

  <details><summary> Program-59)  Counting Bits <b>#Dynamic Programming #Bit Manipulation</b> </summary>
  <pre>
    -> Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the 
       number of 1's in their binary representation and return them as an array.
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
    -> write a function that returns true if and only if the number of occurrences of each value 
       in the array is unique.
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
    -> Write an efficient algorithm that searches for a value in an m x n matrix. 
       This matrix has the following properties:
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
   -> You are given two non-empty linked lists representing two non-negative integers. The digits are 
      stored in reverse order and each of their nodes contain a single digit. Add the two numbers and 
      return it as a linked list.
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
    -> Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and 
       others appear once.
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
    -> We know the distance between all pairs of neighboring stops where distance[i] is the distance 
       between the stops number i and (i + 1) % n.
    -> Return the shortest distance between the given start and destination stops.
    Ex. Input = [4,3,5,5,6,8,7,5,3,2,2,7,8,2,3,1] Start = 4, Destination = 8
        Ans = 26
  </pre>
  </details>

  <details><summary> Program-82)  N-Repeated Element in Size 2N Array <b>#Hash Table</b> </summary>
  <pre>
    -> in a array A of size 2N, there are N+1 unique elements, and exactly one of these elements 
       is repeated N times.
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
    -> Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, 
       formed from 3 of these lengths.
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
    -> Given two integer arrays arr1 and arr2, and the integer d, return the distance value between 
       the two arrays.
    -> The distance value is defined as the number of elements arr1[i] such that there is not any 
       element arr2[j] where |arr1[i]-arr2[j]| <= d.
      Ex. Arr1 = [2,1,100,3]
          Arr2 = [-5,-2,10,-3,7]
          d = 6
          Ans = 1
  </pre>
  </details>

  <details><summary> Program-88)  Find Lucky Integer in an Array </summary>
  <pre>
    -> A lucky integer is an integer which has a frequency in the array equal to its value.
    -> Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. 
       If there is no lucky integer return -1.
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
    -> Consider all the leaves of a binary tree. From left to right order, the values of those leaves 
       form a leaf value sequence.
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
    -> Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].The width 
       of such a ramp is j-i.
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
    -> Given an array of integers and an integer k, find out whether there are two distinct indices i 
       and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
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
    -> Given an array of integers nums and an integer k. A subarray is called nice if there are k 
       odd numbers on it.
    -> Return the number of nice sub-arrays.
       Ex. Input = [1,8,7,6,5,9,8,7,6,3,2,1,9] and k = 6
           Ans = 6
  </pre>
  </details>

  <details><summary> Program-98)  First Unique Character in a String <b>#String #Hash Table</b> </summary>
  <pre>
    -> Given a string, find the first non-repeating character in it and return it's index. If it 
       doesn't exist, return -1.
      Ex. s = "loveleetcode"
          Ans = 2
  </pre>
  </details>

  <details><summary> Program-99)  Increasing Order Search Tree <b>#Tree</b> </summary>
  <pre>
    -> Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree 
       is now the root of the tree, and every node has no left child and only 1 right child.
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
    -> Given an array arr of integers, check if there exists two integers N and M such that N is 
       the double of M (i.e.N = 2*M).
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
    -> There are two special characters. The first character can be represented by one bit 0. The 
       second character can be represented by two bits (10 or 11).

    -> Now given a string represented by several bits. Return whether the last character must be a 
       one-bit character or not. The given string will always end with a zero.
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
    -> Given a non-empty array of integers, return the third maximum number in this array. If it 
       does not exist, return the maximum number. 
       Ex. Input: [2, 2, 3, 1]
           Output: 1
  </pre> 
  </details>

  <details><summary> Program-118)  Kth Largest Element in a Stream <b>#Heap</b> </summary>
  <pre>
    -> Design a class to find the kth largest element in a stream. Note that it is the kth largest 
       element in the sorted order, not the kth distinct element.

    -> Your KthLargest class will have a constructor which accepts an integer k and an integer array 
       nums, which contains initial elements from the stream. For each call to the method KthLargest.add, 
       return the element representing the kth largest element in the stream.
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
    -> Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper 
       left corner (row1, col1) and lower right corner (row2, col2).
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
    -> You are given an array coordinates,coordinates[i] = [x, y],where [x, y] represents the coordinate 
       of a point. Check if these points make a straight line in the XY plane.
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

  <details><summary> Program-127)  Second Minimum Node In a Binary Tree <b>#Tree</b> </summary>
  <pre>
    -> Given a non-empty special binary tree consisting of nodes with the non-negative value, where each 
       node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value 
       is the smaller value among its two sub-nodes. More formally, the property 
       root.val = min(root.left.val, root.right.val) always holds.
    -> Given such a binary tree, you need to output the second minimum value in the set made of all the 
       nodes' value in the whole tree.
    -> If no such second minimum value exists, output -1 instead.
      Ex. Input : [2,2,5,null,null,5,7]
          Output: 5
  </pre> 
  </details>

  <details><summary> Program-128)  Longest Mountain in Array <b>#Two Pointers</b> </summary>
  <pre>
    -> Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:
            -> B.length >= 3
            -> There exists some 0 < i < B.length - 1 such that 
               B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]

    -> Given an array A of integers, return the length of the longest mountain.
    -> Return 0 if there is no mountain.
       Ex. Input : [2,1,4,7,3,2,5]
          Output: 5
  </pre> 
  </details>

  <details><summary> Program-129)  Range Sum of BST <b>#Tree #Recursion</b> </summary>
  <pre>
    -> Given the root node of a binary search tree, return the sum of values of all nodes with 
       value between L and R (inclusive).
    -> The binary search tree is guaranteed to have unique values.
       Ex. root  = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
          Output = 23
  </pre> 
  </details>

  <details><summary> Program-130)  Fizz Buzz </summary>
  <pre>
    -> Write a program that outputs the string representation of numbers from 1 to n.
    -> for multiples of three it should output “Fizz” instead of the number and 
    -> for the multiples of five output “Buzz”.
    -> for numbers which are multiples of both three and five output “FizzBuzz”.
       Ex. Input = 6
           Output = ["1","2","Fizz","4","Buzz","Fizz"]
  </pre> 
  </details>

  <details><summary> Program-131)  132 Pattern <b>#Stack</b> </summary>
  <pre>
    -> Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence ai, aj, ak such that 
       i < j < k and ai < ak < aj. Design an algorithm that takes a list of n numbers as input and checks 
       whether there is a 132 pattern in the list.
       Ex. Input = [3, 1, 4, 2]
           Output = True
  </pre> 
  </details>


  <details><summary> Program-132)  3Sum <b>#Array #Two Pointers</b> </summary>
  <pre>
    -> Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
       Find all unique triplets in the array which gives the sum of zero.
       Ex. Input = [-1, 0, 1, 2, -1, -4]
           Output = [[-1,0,1],[-1,-1,2]]
  </pre> 
  </details>

  <details><summary> Program-133)  Min Stack <b>#Stack #Design</b> </summary>
  <pre>
    -> Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    -> push(x) -- Push element x onto stack.
    -> pop() -- Removes the element on top of the stack.
    -> top() -- Get the top element.
    -> getMin() -- Retrieve the minimum element in the stack.
       Ex. Input  = ["MinStack","push","push","push","getMin","pop","top","getMin"][[],[-2],[0],[-3],[],[],[],[]]
           Output = [null,null,null,null,-3,null,0,-2]
  </pre> 
  </details>


  <details><summary> Program-134)  Build an Array With Stack Operations <b>#Stack</b> </summary>
  <pre>
    -> Given an array target and an integer n. In each iteration, you will read a number from  
       list = {1,2,3..., n}.
    -> Build the target array using the following operations:
          Push: Read a new element from the beginning list, and push it in the array.
          Pop: delete the last element of the array.
    -> If the target array is already built, stop reading more elements.
    -> You are guaranteed that the target array is strictly increasing, only containing numbers between 
       1 to n inclusive.
       Ex. target = [2,3,4], n = 4
           Output = ["Push","Pop","Push","Push","Push"]
  </pre> 
  </details>

  <details><summary> Program-135)  Implement Stack using Queues <b>#Stack #Design</b> </summary>
  <pre>
    -> Implement the following operations of a stack using queues.
        -> push(x) -- Push element x onto stack.
        -> pop() -- Removes the element on top of the stack.
        -> top() -- Get the top element.
        -> empty() -- Return whether the stack is empty.
       Ex. Input = ["MyStack","push","push","top","pop","empty"][[],[1],[2],[],[],[]]
           Output = [null,null,null,2,2,false]
  </pre> 
  </details>

  <details><summary> Program-136)  Implement Queue using Stacks <b>#Stack #Design</b> </summary>
  <pre>
    -> Implement the following operations of a queue using stacks.
      -> push(x) -- Push element x to the back of queue.
      -> pop() -- Removes the element from in front of queue.
      -> peek() -- Get the front element.
      -> empty() -- Return whether the queue is empty.
       Ex. Input = ["MyQueue","push","push","peek","pop","empty"][[],[1],[2],[],[],[]]
           Output = [null,null,null,1,1,false]
  </pre> 
  </details>

  <details><summary> Program-137)  Baseball Game <b>#Stack</b> </summary>
  <pre>
    -> You're now a baseball game point recorder.
    -> Given a list of strings, each string can be one of the 4 following types:
        -> Integer (one round's score): Directly represents the number of points you get in this round.
        -> "+" (one round's score): Represents that the points you get in this round are the sum of 
           the last two valid round's points.
        -> "D" (one round's score): Represents that the points you get in this round are the doubled 
            data of the last valid round's points.
        -> "C" (an operation, which isn't a round's score): Represents the last valid round's points 
            you get were invalid and should be removed.
      -> You need to return the sum of the points you could get in all the rounds.
       Ex. Input = ["5","-2","4","C","D","9","+","+"]
           Output = 27
  </pre> 
  </details>

  <details><summary> Program-138)  Remove All Adjacent Duplicates In String <b>#Stack</b> </summary>
  <pre>
    -> Given a string S of lowercase letters, a duplicate removal consists of choosing 
       two adjacent and equal letters, and removing them.
    -> We repeatedly make duplicate removals on S until we no longer can.
    -> Return the final string after all such duplicate removals have been made.  
    -> It is guaranteed the answer is unique.
       Ex. Input = "hhhqhfiabbtke"
           Output = "hqhfiatke"
  </pre> 
  </details>

  <details><summary> Program-139)  Backspace String Compare <b>#Stack #Two pointers</b> </summary>
  <pre>
    -> Given two strings S and T, return if they are equal when both are typed into empty text editors. 
       # means a backspace character.
    -> Note that after backspacing an empty text, the text will continue empty.
       Ex. S = "rd#dsc#ds" and T = "d###ds#sd"
           Output = false (Explanation : final string after removing backspace characters
                            S = [r, d, s, d, s] and T = [d, s, d])
  </pre> 
  </details>

  <details><summary> Program-140)  Remove Outermost Parentheses <b>#Stack</b> </summary>
  <pre>
    -> A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid 
       parentheses strings, and + represents string concatenation. For example, "", "()", "(())()", and 
       "(()(()))" are all valid parentheses strings.
    -> A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split 
       it into S = A+B, with A and B nonempty valid parentheses strings.
    -> Given a valid parentheses string S, consider its primitive decomposition: 
              S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
    -> Return S after removing the outermost parentheses of every primitive string in the primitive 
       decomposition of S.
       Ex. Input = "(()())(())(()(()))"
           Output = "()()()()(())"
  </pre> 
  </details>

  <details><summary> Program-141)  Design a Stack With Increment Operation <b>#Stack #Design</b> </summary>
  <pre>
    -> Design a stack which supports the following operations.
    -> Implement the CustomStack class:
        -> CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of 
           elements in the stack or do nothing if the stack reached the maxSize.
        -> void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.
        -> int pop() Pops and returns the top of stack or -1 if the stack is empty.
        -> void inc(int k, int val) Increments the bottom k elements of the stack by val. 
           If there are less than k elements in the stack, just increment all the elements in the stack.
       Ex. Input = ["CustomStack","push","push","pop","push","push","push","increment","increment","pop","pop","pop","pop"]
                   [[3],[1],[2],[],[2],[3],[4],[5,100],[2,100],[],[],[],[]]
           Output = [null,null,null,2,null,null,null,null,null,103,202,201,-1]
  </pre> 
  </details>

  <details><summary> Program-142)  Online Stock Span <b>#Stack</b> </summary>
  <pre>
    -> Write a class StockSpanner which collects daily price quotes for some stock, and returns the 
       span of that stock's price for the current day.
    -> The span of the stock's price today is defined as the maximum number of consecutive days (starting from 
       today and going backwards) for which the price of the stock was less than or equal to today's price.
    -> For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], 
       then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
       Ex. Input  = ["StockSpanner","next","next","next","next","next","next","next"]
                   [[],[100],[101],[102],[70],[90],[75],[85]]
           Output = [null,1,2,3,1,2,1,2]
  </pre> 
  </details>

  <details><summary> Program-143)  Kids With the Greatest Number of Candies <b>#Array</b> </summary>
  <pre>
    -> Given the array candies and the integer extraCandies, where candies[i] represents the number of candies 
       that the ith kid has.
    -> For each kid check if there is a way to distribute extraCandies among the kids such that he or she can 
       have the greatest number of candies among them. Notice that multiple kids can have the greatest 
       number of candies.
       Ex. Input  : candies = [2,3,5,1,3], extraCandies = 3
           Output : [true,true,true,false,true] 
  </pre> 
  </details>

  <details><summary> Program-144)  Number of Students Doing Homework at a Given Time <b>#Array</b> </summary>
  <pre>
    -> Given two integer arrays startTime and endTime and given an integer queryTime.
    -> The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
    -> Return the number of students doing their homework at time queryTime. More formally, return the number 
       of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
       Ex. Input  : startTime = [9,8,7,6,5,4,3,2,1], endTime = [10,10,10,10,10,10,10,10,10], queryTime = 5
           Output : 5
  </pre> 
  </details>

  <details><summary> Program-145)  Array Partition I <b>#Array</b> </summary>
  <pre>
    -> Given an array of 2n integers, your task is to group these integers into n pairs of integer, say 
       (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
       Ex. Input  : [4,30,20,10,50,45]
           Output : 69 (Explanation : (4,10), (20,30), (45,50) = 4 + 20 + 45 = 69)
  </pre> 
  </details>

  <details><summary> Program-146)  Duplicate Zeros <b>#Array</b> </summary>
  <pre>
    -> Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining 
       elements to the right.
    -> Note that elements beyond the length of the original array are not written.
    -> Do the above modifications to the input array in place, do not return anything from your function.
       Ex. Input  : [1,0,2,3,0,4,5,0]
           Output : [1,0,0,2,3,0,0,4]
  </pre> 
  </details>

  <details><summary> Program-147)  Can Place Flowers <b>#Array</b> </summary>
  <pre>
    -> Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, 
       flowers cannot be planted in adjacent plots - they would compete for water and both would die.
    -> Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), 
       and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
       Ex. Input  : [1,0,0,1,0,1,0,0,0,1,0,0,1] and n = 3
           Output : false
  </pre> 
  </details>

  <details><summary> Program-148)  Remove Duplicates from Sorted Array <b>#Array #Two pointers</b> </summary>
  <pre>
    -> Given a sorted array nums, remove the duplicates in-place such that each element appear only once and 
       return the new length.
    -> Do not allocate extra space for another array, you must do this by modifying the input array in-place 
       with O(1) extra memory.
       Ex. Input  : [1,1,2]
           Output : [1,2
  </pre> 
  </details>

  <details><summary> Program-149)  Valid Triangle Number <b>#Array</b> </summary>
  <pre>
    -> Given an array consists of non-negative integers, your task is to count the number of triplets chosen 
       from the array that can make triangles if we take them as side lengths of a triangle.
       Ex. Input  : [2,2,3,4]
           Output : 3
  </pre> 
  </details>

  <details><summary> Program-150)  Maximum Product of Two Elements in an Array <b>#Array</b> </summary>
  <pre>
    -> Given the array of integers nums, you will choose two different indices i and j of that array. 
    -> Return the maximum value of (nums[i]-1)*(nums[j]-1).
       Ex. Input  : [3,4,5,2]
           Output : 12 ( Explanation: (5-1)*(4-1) = 12)
  </pre> 
  </details>

  <details><summary> Program-151)  Distribute Candies <b>#Hash Table</b> </summary>
  <pre>
    -> Given an integer array with even length, where different numbers in this array represent 
       different kinds of candies. Each number means one candy of the corresponding kind. 
    -> You need to distribute these candies equally in number to brother and sister. 
    -> Return the maximum number of kinds of candies the sister could gain.
       Ex. Input  : candies = [1,1,2,2,3,3]
           Output : 3 ( Explanation: 3 kind of candies [1,2,3] ).
  </pre> 
  </details>

  <details><summary> Program-152)  Toeplitz Matrix <b>#Array</b> </summary>
  <pre>
    -> A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
    -> Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
       Ex. Input  : matrix = [
                               [1,2,3,4],
                               [5,1,2,3],
                               [9,5,1,2]
                             ]
           Output : ture
  </pre> 
  </details>

  <details><summary> Program-153)  Trim a Binary Search Tree <b>#Tree</b> </summary>
  <pre>
    -> Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that 
       all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result 
       should return the new root of the trimmed binary search tree.
       Ex. Input  :   3
                     / \
                    0   4
                     \
                      2
                     /
                    1

           Output :  3
                    / 
                   2   
                  /
                 1
  </pre> 
  </details>


  <details><summary> Program-154)  Ugly Number <b>#Math</b> </summary>
  <pre>
    -> Write a program to check whether a given number is an ugly number.
    -> Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
       Ex. Input  : 190
           Output : false
  </pre> 
  </details>

  <details><summary> Program-155)  Make Two Arrays Equal by Reversing Sub-arrays <b>#Array</b> </summary>
  <pre>
    -> Given two integer arrays of equal length target and arr.
    -> In one step, you can select any non-empty sub-array of arr and reverse it. You are allowed to make 
       any number of steps.
    -> Return True if you can make arr equal to target, or False otherwise.
       Ex. Input  : Target  : [3,7,9,4,5,4,3,5] and Arr : [3,7,11,5,4,3,2,2]
           Output : false
  </pre> 
  </details>

  <details><summary> Program-156)  Partition Array Into Three Parts With Equal Sum <b>#Array</b> </summary>
  <pre>
    -> Given an array A of integers, return true if and only if we can partition the array into three 
       non-empty parts with equal sums.
    -> Formally, we can partition the array if we can find indexes i+1 < j with 
       (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
       Ex. Input       : A = [0,2,1,-6,6,-7,9,1,2,0,1]
           Output      : true
           Explanation : 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
  </pre> 
  </details>

  <details><summary> Program-157)  Longest Continuous Increasing Subsequence <b>#Array</b> </summary>
  <pre>
    -> Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
       Ex. Input  : [1,3,5,4,7]
           Output : 3
  </pre> 
  </details>

  <details><summary> Program-158)  Rank Transform of an Array <b>#Array #HashMap</b> </summary>
  <pre>
    -> Given an array of integers arr, replace each element with its rank.
    -> The rank represents how large the element is. The rank has the following rules:
        -> Rank is an integer starting from 1.
        -> The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
        -> Rank should be as small as possible.
       Ex. Input  : [37,12,28,9,100,56,80,5,12]
           Output : [5,3,4,2,8,6,7,1,3]
  </pre> 
  </details>

  <details><summary> Program-159)  Shortest Unsorted Continuous Subarray <b>#Array</b> </summary>
  <pre>
    -> Given an integer array, you need to find one continuous subarray that if you only sort this subarray 
       in ascending order, then the whole array will be sorted in ascending order, too.
    -> You need to find the shortest such subarray and output its length.
       Ex. Input  : [2,6,8,7,6,78,89,990]
           Output : 3
  </pre> 
  </details>

  <details><summary> Program-160)  Transpose Matrix <b>#Array</b> </summary>
  <pre>
    -> Given a matrix A, return the transpose of A.
    -> The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column 
       indices of the matrix.
       Ex. Input  : [[1,2,3],[4,5,6],[7,8,9]]
           Output : [[1,4,7],[2,5,8],[3,6,9]]
  </pre> 
  </details>

  <details><summary> Program-161)  Sort Colors <b>#Array #Sort #Two Pointers</b> </summary>
  <pre>
    -> Given an array with n objects colored red, white or blue, sort them in-place so that objects of the 
       same color are adjacent, with the colors in the order red, white and blue.
    -> Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
    -> <b>Note: You are not suppose to use the library's sort function for this problem.</b>
       Ex. Input  : [2,0,2,1,1,0]
           Output : [0,0,1,1,2,2]
  </pre> 
  </details>

  <details><summary> Program-162)  Maximum Gap <b>#Sort</b> </summary>
  <pre>
    -> Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
    -> Return 0 if the array contains less than 2 elements.
       Ex. Input  : [3,9,12,15,23,45,32,12,9]
           Output : 13
  </pre> 
  </details>

  <details><summary> Program-163)  Two Sum IV - Input is a BST <b>#Tree</b> </summary>
  <pre>
    -> Given a Binary Search Tree and a target number, return true if there exist two elements in the BST 
       such that their sum is equal to the given target.
       Ex. Input  : 5         And target sum = 9
                   / \
                  3   6
                 / \   \
                2   4   7
           Output : true ( explanation : 3+6 = 9)
  </pre> 
  </details>

  <details><summary> Program-164)  Sort Array By Parity <b>#Array</b> </summary>
  <pre>
    -> Given an array A of non-negative integers, return an array consisting of all the even elements of A, 
       followed by all the odd elements of A.
    -> You may return any answer array that satisfies this condition.
       Ex. Input  : [3,1,2,4]
           Output : [2,4,3,1]
  </pre> 
  </details>

  <details><summary> Program-165)  Sort Array By Parity II <b>#Array #Sort</b> </summary>
  <pre>
    -> Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
    -> Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
    -> You may return any answer array that satisfies this condition.
       Ex. Input  : [4,2,5,7]
           Output : [4,5,2,7]
  </pre> 
  </details>

  <details><summary> Program-166)  Container With Most Water <b>#Array #Two Pointers</b> </summary>
  <pre>
    -> Given an array A of non-negative integers, half of the integers in A are odd, and half of the 
       integers are even.
    -> Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
    -> You may return any answer array that satisfies this condition.
       Ex. Input  : [1,8,6,10,7,4,8,13,16]
           Output : 56
  </pre> 
  </details>

  <details><summary> Program-167)  Arranging Coins <b>#Math #Binary Search</b> </summary>
  <pre>
    -> You have a total of n coins that you want to form in a staircase shape, where every k-th row must 
       have exactly k coins.
    -> Given n, find the total number of full staircase rows that can be formed.
    -> n is a non-negative integer and fits within the range of a 32-bit signed integer.
       Ex. Input  : 10
           Output : 4
  </pre> 
  </details>

  <details><summary> Program-168)  Range Addition II <b>#Math</b> </summary>
  <pre>
    -> Given an m * n matrix M initialized with all 0's and several update operations.
    -> Operations are represented by a 2D array, and each operation is represented by an array with two 
       positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
    -> You need to count and return the number of maximum integers in the matrix after performing all 
       the operations.
       Ex. Input  : m = 3, n = 3, Ops = [[2,2],[3,3],[1,2],[2,2]]
           Output : 2
  </pre> 
  </details>

  <details><summary> Program-169)  Binary Gap <b>#Math</b> </summary>
  <pre>
    -> Given a positive integer N, find and return the longest distance between two consecutive 1's in 
       the binary representation of N.
    -> If there aren't two consecutive 1's, return 0.
       Ex. Input  : 22
           Output : 2
  </pre> 
  </details>

  <details><summary> Program-170)  Set Mismatch <b>#Math #Hash Table</b> </summary>
  <pre>
    -> The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of 
       the numbers in the set got duplicated to another number in the set, which results in repetition of one 
       number and loss of another number.
    -> Given an array nums representing the data status of this set after the error. Your task is to firstly 
       find the number occurs twice and then find the number that is missing. Return them in the form of an array.
       Ex. Input  : [5,3,6,1,5,4,7,8]
           Output : [5,2]
  </pre> 
  </details>

  <details><summary> Program-171)  Find the Duplicate Number <b>#Array #Binary Search #Two Pointers</b> </summary>
  <pre>
    -> Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove 
       that at least one duplicate number must exist. Assume that there is only one duplicate number, 
       find the duplicate one.
       Ex. Input  : [1,2,3,4,5,5]
           Output : 5
  </pre> 
  </details>

  <details><summary> Program-172)  Valid Boomerang <b>#Math</b> </summary>
  <pre>
    -> A boomerang is a set of 3 points that are all distinct and not in a straight line.
    -> Given a list of three points in the plane, return whether these points are a boomerang.
       Ex. Input  : [[1,1],[2,3],[3,2]]
           Output : true
  </pre> 
  </details>

  <details><summary> Program-173)  Happy Number <b>#Math #Hash Table</b> </summary>
  <pre>
    -> Write an algorithm to determine if a number n is "happy".
    -> A happy number is a number defined by the following process: Starting with any positive integer, 
       replace the number by the sum of the squares of its digits, and repeat the process until the number 
       equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers 
       for which this process ends in 1 are happy numbers.
    -> Return True if n is a happy number, and False if not.
       Ex. Input  : 219
           Output : true (Explanation: 12 + 92 = 82
                                       82 + 22 = 68
                                       62 + 82 = 100
                                       12 + 02 + 02 = 1)
  </pre> 
  </details>

  <details><summary> Program-174)  Distribute Candies to People <b>#Math</b> </summary>
  <pre>
    -> We distribute some number of candies, to a row of n = num_people people in the following way:
    -> We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n 
       candies to the last person.
    -> Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to 
       the second person, and so on until we give 2 * n candies to the last person.
    -> This process repeats (with us giving one more candy each time, and moving to the start of the row after 
       we reach the end) until we run out of candies.  The last person will receive all of our remaining candies 
       (not  necessarily one more than the previous gift).
    -> Return an array (of length num_people and sum candies) that represents the final distribution of candies.
       Ex. Input  : candies = 10, num_people = 3
           Output : [5,2,3]
  </pre> 
  </details>

  <details><summary> Program-175)  Factorial Trailing Zeroes <b>#Math</b> </summary>
  <pre>
    -> Given an integer n, return the number of trailing zeroes in n!.
       Ex. Input  : 12
           Output : 2
  </pre> 
  </details>


  <details><summary> Program-176)  Sum of Nodes with Even-Valued Grandparent <b>#Tree #Depth-first Search</b> </summary>
  <pre>
    -> Given a binary tree, return the sum of values of nodes with even-valued grandparent. (A grandparent
       of a node is the parent of its parent, if it exists.)
    -> If there are no nodes with an even-valued grandparent, return 0.
       Ex. Input  : root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
           Output : 18  
  </pre> 
  </details>

  <details><summary> Program-177)  Find Elements in a Contaminated Binary Tree <b>#Tree #Hash Table</b> </summary>
  <pre>
    -> Given a binary tree with the following rules:
        -> root.val == 0
        -> If treeNode.val == x and treeNode.left != null, then treeNode.left.val == 2 * x + 1
        -> If treeNode.val == x and treeNode.right != null, then treeNode.right.val == 2 * x + 2
    -> Now the binary tree is contaminated, which means all treeNode.val have been changed to -1.
    -> You need to first recover the binary tree and then implement the FindElements class: 
          -> FindElements(TreeNode* root) Initializes the object with a contamined binary tree, 
             you need to recover it first.
          -> bool find(int target) Return if the target value exists in the recovered binary tree.
       Ex. Input  : ["FindElements","find","find","find"]
                    [[[-1,-1,-1,-1,-1]],[1],[3],[5]]
           Output : [null,true,true,false]
  </pre> 
  </details>

  <details><summary> Program-178)  Binary Tree Tilt <b>#Tree</b> </summary>
  <pre>
    -> Given a binary tree, return the tilt of the whole tree.
    -> The tilt of a tree node is defined as the absolute difference between the sum of all 
       left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
    -> The tilt of the whole tree is defined as the sum of all nodes' tilt.
       Ex. Input  : [7,6,1,2,3,4]
           Output : 11
  </pre> 
  </details>

  <details><summary> Program-179)  Construct String from Binary Tree <b>#Tree #String</b> </summary>
  <pre>
    -> You need to construct a string consists of parenthesis and integers from a binary tree with the 
       preorder traversing way.
    -> The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the 
       empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string 
       and the original binary tree.
       Ex. Input  : [1,2,3,4]
           Output : "1(2(4))(3)"
  </pre> 
  </details>

  <details><summary> Program-180)  Kth Smallest Element in a BST <b>#Tree #Binary Search</b> </summary>
  <pre>
    -> Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
       Ex. Input  : root = [5,3,6,2,4,null,null,1], k = 3
           Output : 3
  </pre> 
  </details>

  <details><summary> Program-181)  Shuffle the Array <b>#Array</b> </summary>
  <pre>
    -> Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    -> Return the array in the form [x1,y1,x2,y2,...,xn,yn].
       Ex. Input  : nums = [2,5,1,3,4,7], n = 3
           Output : [2,3,5,4,1,7] 
  </pre> 
  </details>

  <details><summary> Program-182)  Create Target Array in the Given Order <b>#Array</b> </summary>
  <pre>
    -> Given two arrays of integers nums and index. Your task is to create target array under the following rules:
      -> Initially target array is empty.
      -> From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
      -> Repeat the previous step until there are no elements to read in nums and index.
      -> Return the target array.
    -> It is guaranteed that the insertion operations will be valid.
       Ex. Input  : nums = [0,1,2,3,4], index = [0,1,2,2,1]
           Output : [0,4,1,3,2]
  </pre> 
  </details>

  <details><summary> Program-183)  Reverse Vowels of a String <b>#String #Two Pointers</b> </summary>
  <pre>
    -> Write a function that takes a string as input and reverse only the vowels of a string.
       Ex. Input  : "hello"
           Output : "holle"
  </pre> 
  </details>

  <details><summary> Program-184)  Longest Consecutive Sequence <b>#Array #Union Find</b> </summary>
  <pre>
    -> Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
    -> Your algorithm should run in O(n) complexity.
       Ex. Input  : [100, 4, 200, 1, 3, 2]
           Output : 4
  </pre> 
  </details>

  <details><summary> Program-185)  Flipping an Image <b>#Array</b> </summary>
  <pre>
    -> Given a binary matrix A, we want to flip the image horizontally, then invert it, and 
       return the resulting image.
       Ex. Input  : [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
           Output : [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
  </pre> 
  </details>

  <details><summary> Program-186)  Word Search <b>#Array #Backtracking</b> </summary>
  <pre>
    -> Given a 2D board and a word, find if the word exists in the grid.
    -> The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are 
       those horizontally or vertically neighboring. The same letter cell may not be used more than once.
       Ex. board =  [
                      ['A','B','C','E'],
                      ['S','F','C','S'],
                      ['A','D','E','E']
                    ]
          Given word = "ABCCED", return true.
          Given word = "SEE", return true.
          Given word = "ABCB", return false.
  </pre> 
  </details>

  <details><summary> Program-187)  Minimum Path Sum <b>#Array #Dynamic Programming</b> </summary>
  <pre>
    -> Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right 
       which minimizes the sum of all numbers along its path.
    -> Note: You can only move either down or right at any point in time.
       Ex. Input : [
                    [1,3,1],
                    [1,5,1],
                    [4,2,1]
                   ]
          Output : 7
  </pre>
  </details>

  <details><summary> Program-188)  Valid Palindrome <b>#String #Two Pointers</b> </summary>
  <pre>
    -> Given a string, determine if it is a palindrome, considering only alphanumeric characters 
       and ignoring cases.
    -> Note: For the purpose of this problem, we define empty string as valid palindrome.
       Ex. Input  : "A man, a plan, a canal: Panama"
           Output : true
  </pre>
  </details>

  <details><summary> Program-189)  Reverse Substrings Between Each Pair of Parentheses <b>#Stack</b> </summary>
  <pre>
    -> You are given a string s that consists of lower case English letters and brackets. 
    -> Reverse the strings in each pair of matching parentheses, starting from the innermost one. 
    -> Your result should not contain any brackets.
       Ex. Input  : s = "(u(love)i)"
           Output : "iloveu"
  </pre>
  </details>

  <details><summary> Program-190)  Spiral Matrix <b>#Array</b> </summary>
  <pre>
    -> Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
       Ex. Input  : [
                      [1, 2, 3, 4],
                      [5, 6, 7, 8],
                      [9,10,11,12]
                    ]
           Output: [1,2,3,4,8,12,11,10,9,5,6,7]
  </pre>
  </details>

  <details><summary> Program-191)  Spiral Matrix II <b>#Array</b> </summary>
  <pre>
    -> Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
       Ex. Input  : 3
           Output : [
                      [ 1, 2, 3 ],
                      [ 8, 9, 4 ],
                      [ 7, 6, 5 ]
                    ]  
  </pre>
  </details>

  <details><summary> Program-192)  Binary Tree Level Order Traversal <b>#Tree #Breadth-first Search</b> </summary>
  <pre>
    -> Given a binary tree, return the level order traversal of its nodes' values. 
       (ie, from left to right, level by level).
       Ex. Input  : [3,9,20,null,null,15,7]
           Output : [
                      [15,7],
                      [9,20],
                      [3]
                    ]
  </pre>
  </details>

  <details><summary> Program-193)  Binary Tree Level Order Traversal II <b>#Tree #Breadth-first Search</b> </summary>
  <pre>
    -> Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
       (ie, from left to right, level by level from leaf to root).
       Ex. Input  : [3,9,20,null,null,15,7]
           Output : [
                      [15,7],
                      [9,20],
                      [3]
                    ]
  </pre>
  </details>

  <details><summary> Program-194)  Binary Tree Zigzag Level Order Traversal <b>#Stack #Tree #Breadth-first Search</b> </summary>
  <pre>
    -> Given a binary tree, return the zigzag level order traversal of its nodes' values. 
       (ie, from left to right, then right to left for the next level and alternate between).
       Ex. Input  : [3,9,20,null,null,15,7]
           Output : [
                      [3],
                      [20,9],
                      [15,7]
                    ] 
  </pre>
  </details>

  <details><summary> Program-195)  Count Good Nodes in Binary Tree <b>#Tree #Depth-first Search</b> </summary>
  <pre>
    -> Given a binary tree root, a node X in the tree is named good if in the path from root to X there 
       are no nodes with a value greater than X.
    -> Return the number of good nodes in the binary tree.
       Ex. Input  : root = [3,1,4,3,null,1,5]
           Output : 4
  </pre>
  </details>

  <details><summary> Program-196)  Sum of Root To Leaf Binary Numbers <b>#Tree</b> </summary>
  <pre>
    -> Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number 
       starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then 
       this could represent 01101 in binary, which is 13.
    -> For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. 
    -> Return the sum of these numbers.
       Ex. Input  : [1,0,1,0,1,0,1]
           Output : 22  (Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22)
  </pre>
  </details>

  <details><summary> Program-197)  Largest Time for Given Digits <b>#Math</b> </summary>
  <pre>
    -> Given an array of 4 digits, return the largest 24 hour time that can be made.  
    -> The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger 
       if more time has elapsed since midnight.
    -> Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
       Ex. Input  : [1,2,3,4]
           Output : "23:41"
  </pre>
  </details>

  <details><summary> Program-198)  X of a Kind in a Deck of Cards <b>#Array #Math</b> </summary>
  <pre>
    -> In a deck of cards, each card has an integer written on it.  
    -> Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck 
       into 1 or more groups of cards, where:
    -> Each group has exactly X cards.
    -> All the cards in each group have the same integer.
       Ex. Input  : deck = [1,2,3,4,4,3,2,1]
           Output : true  (Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].)
  </pre>
  </details>

  <details><summary> Program-199)  Convert Integer to the Sum of Two No-Zero Integers <b>#Math</b> </summary>
  <pre>
    -> Given an integer n. No-Zero integer is a positive integer which doesn't contain any 0 in its 
       decimal representation.
    -> Return a list of two integers [A, B] where:
        -> A and B are No-Zero integers.
        -> A + B = n
    -> It's guarateed that there is at least one valid solution. If there are many valid solutions you 
       can return any of them.
       Ex. Input  : n = 10000
           Output : [1,9999]
  </pre>
  </details>

  <details><summary> Program-200)  Smallest Range I <b>#Math</b> </summary>
  <pre>
    -> Given an array A of integers, for each integer A[i] we may choose any x with 
       -K <= x <= K, and add x to A[i].
    -> After this process, we have some array B.  
    -> Return the smallest possible difference between the maximum value of B and the minimum value of B.
       Ex. Input  : A = [0,10], K = 2
           Output : 6   (Explanation: B = [2,8])
  </pre>
  </details>

  <details><summary> Program-201)  Four Divisors <b>#Math</b> </summary>
  <pre>
    -> Given an integer array nums, return the sum of divisors of the integers in that array that have 
       exactly four divisors.
    -> If there is no such integer in the array, return 0.
       Ex. Input  : nums = [21,4,7]
           Output : 32      Explanation:
                                21 has 4 divisors: 1, 3, 7, 21
                                4 has 3 divisors: 1, 2, 4
                                7 has 2 divisors: 1, 7
                                The answer is the sum of divisors of 21 only.
  </pre>
  </details>

  <details><summary> Program-202)  Clumsy Factorial <b>#Math</b> </summary>
  <pre>
    -> Normally, the factorial of a positive integer n is the product of all positive integers less than 
       or equal to n.  For example, factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1.
    -> We instead make a clumsy factorial: using the integers in decreasing order, we swap out the 
       multiply operations for a fixed rotation of operations: multiply (*), divide (/), add (+) and 
       subtract (-) in this order.
    -> For example, clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.  However, these operations are 
       still applied using the usual order of operations of arithmetic: we do all multiplication and division 
       steps before any addition or subtraction steps, and multiplication and division steps are processed 
       left to right.
    -> Additionally, the division that we use is floor division such that 10 * 9 / 8 equals 11.  This guarantees 
       the result is an integer.
    -> Implement the clumsy function as defined above: given an integer N, it returns the clumsy factorial of N.
       Ex. Input  : 10
           Output : 12    (Explanation: 12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1)
  </pre>
  </details>

  <details><summary> Program-203)  Linked List Cycle <b>#Linked List #Two Pointers</b> </summary>
  <pre>
    -> Given a linked list, determine if it has a cycle in it.
    -> To represent a cycle in the given linked list, we use an integer pos which represents 
       the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there 
       is no cycle in the linked list.
       Ex. Input  : head = [3,2,0,-4], pos = 1
           Output : true
  </pre>
  </details>

  <details><summary> Program-204)  Reverse Words in a String III <b>#String</b> </summary>
  <pre>
    -> Given a string, you need to reverse the order of characters in each word within a sentence 
       while still preserving whitespace and initial word order.
       Ex. Input  : "Let's take LeetCode contest"
           Output : "s'teL ekat edoCteeL tsetnoc"
  </pre>
  </details>

  <details><summary> Program-205)  Reverse Only Letters <b>#String</b> </summary>
  <pre>
    -> Given a string S, return the "reversed" string where all characters that are not a letter 
       stay in the same place, and all letters reverse their positions.
       Ex. Input  : "Test1ng-Leet=code-Q!"
           Output : "Qedo1ct-eeLg=ntse-T!"
  </pre>
  </details>

  <details><summary> Program-206)  Detect Capital <b>#String</b> </summary>
  <pre>
    -> Given a word, you need to judge whether the usage of capitals in it is right or not.
    -> We define the usage of capitals in a word to be right when one of the following cases holds:
        -> All letters in this word are capitals, like "USA".
        -> All letters in this word are not capitals, like "leetcode".
        -> Only the first letter in this word is capital, like "Google".
    -> Otherwise, we define that this word doesn't use capitals in a right way.
       Ex. Input: "FlaG"            Input: "USA"
           Output: False            Output: True    
  </pre>
  </details>
  
  <details><summary> Program-207)  Reverse Words in a String <b>#String</b> </summary>
  <pre>
    -> Given an input string, reverse the string word by word.
       Ex. Input  : "a good   example"
           Output : "example good a"   
  </pre>
  </details>
  
  <details><summary> Program-208)  Sort Integers by The Power Value <b>#Sort #Graph</b> </summary>
  <pre>
    -> The power of an integer x is defined as the number of steps needed to transform x into 1 
       using the following steps:
        -> if x is even then x = x / 2
        -> if x is odd then x = 3 * x + 1
    -> For example, the power of x = 3 is 7 because 3 needs 7 steps to become 1 
       (3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1).
    -> Given three integers lo, hi and k. The task is to sort all integers in the interval 
       [lo, hi] by the power value in ascending order, if two or more integers have the same 
       power value sort them by ascending order.
    -> Return the k-th integer in the range [lo, hi] sorted by the power value.
    -> Notice that for any integer x (lo <= x <= hi) it is guaranteed that x will transform into 
       1 using these steps and that the power of x is will fit in 32 bit signed integer.
       Ex. Input  : lo = 7, hi = 11, k = 4
           Output : 7     ( Explanation: The power array corresponding to the interval [7, 8, 9, 10, 11] 
                            is [16, 3, 19, 6, 14].
                          The interval sorted by power is [8, 10, 11, 7, 9].
                          The fourth number in the sorted array is 7. )
  </pre>
  </details>
  
  <details><summary> Program-209)  Sort Integers by The Number of 1 Bits <b>#Sort #Bit Manipulation</b> </summary>
  <pre>
    -> Given an integer array arr. You have to sort the integers in the array in ascending 
       order by the number of 1's in their binary representation and in case of two or more 
       integers have the same number of 1's you have to sort them in ascending order.
    -> Return the sorted array.
       Ex. Input  : arr = [0,1,2,3,4,5,6,7,8]
           Output : [0,1,2,4,8,3,5,6,7]
  </pre>
  </details>
  
  <details><summary> Program-210)  Running Sum of 1d Array <b>#Array</b> </summary>
  <pre>
    -> Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).  
    -> Return the running sum of nums.
       Ex. Input  : nums = [3,1,2,10,1]
           Output : [3,4,6,16,17]
  </pre>
  </details>
  
  <details><summary> Program-211)  Final Prices With a Special Discount in a Shop <b>#Array</b> </summary>
  <pre>
    -> Given the array prices where prices[i] is the price of the ith item in a shop. There is 
       a special discount for items in the shop, if you buy the ith item, then you will receive 
       a discount equivalent to prices[j] where j is the minimum index such that j > i and 
       prices[j] <= prices[i], otherwise, you will not receive any discount at all.
    -> Return an array where the ith element is the final price you will pay for the ith item 
       of the shop considering the special discount.
       Ex. Input  : prices = [10,1,1,6]
           Output : [9,0,1,6]
  </pre>
  </details>
  
  <details><summary> Program-212)  Lucky Numbers in a Matrix <b>#Array</b> </summary>
  <pre>
    -> Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    -> A lucky number is an element of the matrix such that it is the minimum element in its 
       row and maximum in its column.
       Ex. Input  : matrix = [[3,7,8],[9,11,13],[15,16,17]]
           Output : [15]
  </pre>
  </details>
  
  <details><summary> Program-213)  The K Weakest Rows in a Matrix <b>#Array #Binary Search</b> </summary>
  <pre>
    -> Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), 
       return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.
    -> A row i is weaker than row j, if the number of soldiers in row i is less than the number 
       of soldiers in row j, or they have the same number of soldiers but i is less than j. Soldiers 
       are always stand in the frontier of a row, that is, always ones may appear first and then zeros.
       Ex. Input: mat = 
                    [[1,1,0,0,0],
                     [1,1,1,1,0],
                     [1,0,0,0,0],
                     [1,1,0,0,0],
                     [1,1,1,1,1]], 
                    k = 3
           Output: [2,0,3]
  </pre>
  </details>
  
  <details><summary> Program-214)  Find Common Characters <b>#Array #Hash Table</b> </summary>
  <pre>
    -> Given an array A of strings made only from lowercase letters, return a list of all 
       characters that show up in all strings within the list (including duplicates).  
       For example, if a character occurs 3 times in all strings but not 4 times, you need to 
       include that character three times in the final answer.
    -> You may return the answer in any order.
       Ex. Input  : ["bella","label","roller"]
           Output : ["e","l","l"]
  </pre>
  </details>
  
  <details><summary> Program-215)  Maximum Frequency Stack <b>#Stack #Hash Table</b> </summary>
  <pre>
    -> Implement FreqStack, a class which simulates the operation of a stack-like data structure.
    -> FreqStack has two functions:
        -> push(int x), which pushes an integer x onto the stack.
        -> pop(), which removes and returns the most frequent element in the stack.
    -> If there is a tie for most frequent element, the element closest to the top of the 
       stack is removed and returned.
       Ex. Input  : ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
                    [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
           Output : [null,null,null,null,null,null,null,5,7,5,4]
  </pre>
  </details>
  
  <details><summary> Program-216)  Validate Stack Sequences <b>#Stack</b> </summary>
  <pre>
    -> Given two sequences pushed and popped with distinct values, return true if and only if 
       this could have been the result of a sequence of push and pop operations on an initially empty stack.
       Ex. Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
           Output: true
  </pre>
  </details>
  
  <details><summary> Program-217)  Minimum Add to Make Parentheses Valid <b>#Stack #Greedy</b> </summary>
  <pre>
    -> Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', 
       and in any positions ) so that the resulting parentheses string is valid.
    -> Formally, a parentheses string is valid if and only if:
        -> It is the empty string, or
        -> It can be written as AB (A concatenated with B), where A and B are valid strings, or
        -> It can be written as (A), where A is a valid string.
    -> Given a parentheses string, return the minimum number of parentheses we must add to make 
       the resulting string valid.
       Ex. Input  : "()))(("
           Output : 4
  </pre>
  </details>
  
  <details><summary> Program-218)  Binary Search Tree Iterator <b>#Stack #Tree #Design</b> </summary>
  <pre>
    -> Implement an iterator over a binary search tree (BST). Your iterator will be initialized 
       with the root node of a BST.
    -> Calling next() will return the next smallest number in the BST.
     Ex. Input : ["BSTIterator","next","next","hasNext","next","hasNext","next","hasNext","next","hasNext"]
                 [[[7,3,15,null,null,9,20]],[null],[null],[null],[null],[null],[null],[null],[null],[null]]
         Output: [null,3,7,true,9,true,15,true,20,false]
  </pre>
  </details>
  
  <details><summary> Program-219)  Next Greater Node In Linked List <b>#Stack #Linked List</b> </summary>
  <pre>
    -> We are given a linked list with head as the first node.  Let's number the nodes in the list: 
       node_1, node_2, node_3, ... etc.
    -> Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val 
       such that j > i, node_j.val > node_i.val, and j is the smallest possible choice.  If such a 
       j does not exist, the next larger value is 0.
    -> Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).
    -> Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the 
       serialization of a linked list with a head node value of 2, second node value of 1, and 
       third node value of 5.
       Ex. Input  : [1,7,5,1,9,2,5,1]
           Output : [7,9,9,9,0,5,0,0]
  </pre>
  </details>
  
  <details><summary> Program-220)  XOR Operation in an Array <b>#Array #Bit Manipulation</b> </summary>
  <pre>
    -> Given an integer n and an integer start.
    -> Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
    -> Return the bitwise XOR of all elements of nums.
       Ex. Input  : n = 4, start = 3
           Output : 8  (Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8)
  </pre>
  </details>
  
  <details><summary> Program-221)  K-diff Pairs in an Array <b>#Array #Two Pointers</b> </summary>
  <pre>
    -> Given an array of integers and an integer k, you need to find the number of unique k-diff 
       pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j
       are both numbers in the array and their absolute difference is k.
       Ex. Input  : [3, 1, 4, 1, 5], k = 2
           Output : 2
  </pre>
  </details>
  
  <details><summary> Program-222)  Count Largest Group <b>#Array</b> </summary>
  <pre>
    -> Given an integer n. Each number from 1 to n is grouped according to the sum of its digits. 
    -> Return how many groups have the largest size.
       Ex. Input  : n = 13
           Output : 4    (Explanation: There are 9 groups in total, they are grouped according 
                           sum of its digits of numbers from 1 to 13:
                           [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. 
                           There are 4 groups with largest size.)
  </pre>
  </details>
  
  <details><summary> Program-223)  Count Complete Tree Nodes <b>#Tree #Binary Search</b> </summary>
  <pre>
    -> Given a complete binary tree, count the number of nodes.
       Ex. Input:   1
                   / \
                  2   3
                 / \  /
                4  5 6
           Output: 6
  </pre>
  </details>
  
  <details><summary> Program-224)  Rotate Image <b>#Array</b> </summary>
  <pre>
    -> You are given an n x n 2D matrix representing an image.
    -> Rotate the image by 90 degrees (clockwise).
    -> Note: You have to rotate the image in-place, which means you have to modify the input 2D 
             matrix directly. DO NOT allocate another 2D matrix and do the rotation.
       Ex. Input :  [
                      [1,2,3],
                      [4,5,6],
                      [7,8,9]
                    ]
           Outpu :  [
                      [7,4,1],
                      [8,5,2],
                      [9,6,3]
                    ]
  </pre>
  </details>
  
  <details><summary> Program-225)  Shift 2D Grid <b>#Array</b> </summary>
  <pre>
    -> Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
    -> In one shift operation:
        -> Element at grid[i][j] moves to grid[i][j + 1].
        -> Element at grid[i][n - 1] moves to grid[i + 1][0].
        -> Element at grid[m - 1][n - 1] moves to grid[0][0].
    -> Return the 2D grid after applying shift operation k times.
       Ex. Input  : grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
           Output : [[9,1,2],[3,4,5],[6,7,8]]
  </pre>
  </details>
  
  <details><summary> Program-226)  Compare Strings by Frequency of the Smallest Character <b>#Array #String</b> </summary>
  <pre>
    -> Let's define a function f(s) over a non-empty string s, which calculates the frequency of the
       smallest character in s. For example, if s = "dcce" then f(s) = 2 because the smallest character 
       is "c" and its frequency is 2.
    -> Now, given string arrays queries and words, return an integer array answer, where each answer[i] 
       is the number of words such that f(queries[i]) < f(W), where W is a word in words.
       Ex. Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
           Output: [1,2]    (Explanation: On the first query only f("bbb") < f("aaaa"). On the second query 
                             both f("aaa") and f("aaaa") are both > f("cc").)
  </pre>
  </details>
  
  <details><summary> Program-227)  Fair Candy Swap <b>#Array</b> </summary>
  <pre>
    -> Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that 
       Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
    -> Since they are friends, they would like to exchange one candy bar each so that after the exchange, 
       they both have the same total amount of candy.  (The total amount of candy a person has is the sum 
       of the sizes of candy bars they have.)
    -> Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and 
       ans[1] is the size of the candy bar that Bob must exchange.
    -> If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
       Ex. Input  : A = [1,2,5], B = [2,4]
           Output : [5,4]
  </pre>
  </details>
  
  <details><summary> Program-228)  Pascal's Triangle <b>#Array</b> </summary>
  <pre>
    -> Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
       Ex. Input: 5
           Output: [
                    [1],
                    [1,1],
                    [1,2,1],
                    [1,3,3,1],
                    [1,4,6,4,1]
                   ]
  </pre>
  </details>
  
  <details><summary> Program-229)  Pascal's Triangle II <b>#Array</b> </summary>
  <pre>
    -> Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.  
    -> Note that the row index starts from 0.
       Ex. Input: 4
           Output: [1,4,6,4,1]
  </pre>
  </details>
  
  <details><summary> Program-230)  Check If It Is a Good Array <b>#Math</b> </summary>
  <pre>
    -> Given an array nums of positive integers. Your task is to select some subset of nums, multiply 
       each element by an integer and add all these numbers. The array is said to be good if you can obtain 
       a sum of 1 from the array by any possible subset and multiplicand.
    -> Return True if the array is good otherwise return False.
       Ex. Input  : nums = [29,6,10]
           Output : true     (Explanation: Pick numbers 29, 6 and 10.
                              29*1 + 6*(-3) + 10*(-1) = 1)
  </pre>
  </details>
  
  <details><summary> Program-231)  Prime Palindrome <b>#Math</b> </summary>
  <pre>
    -> Find the smallest prime palindrome greater than or equal to N.
    -> Recall that a number is prime if it's only divisors are 1 and itself, and it is greater than 1.  
    -> For example, 2,3,5,7,11 and 13 are primes.
    -> Recall that a number is a palindrome if it reads the same from left to right as it does from 
       right to left. 
    -> For example, 12321 is a palindrome.
       Ex. Input  : 9989900
           Output : 100030001
  </pre>
  </details>
  
  <details><summary> Program-232)  Evaluate Reverse Polish Notation <b>#Stack</b> </summary>
  <pre>
    -> Evaluate the value of an arithmetic expression in Reverse Polish Notation.
    -> Valid operators are +, -, *, /. Each operand may be an integer or another expression.
    -> Note:
        -> Division between two integers should truncate toward zero.
        -> The given RPN expression is always valid. That means the expression would always evaluate 
           to a result and there won't be any divide by zero operation.
       Ex. Input  : ["4", "13", "5", "/", "+"]
           Output : 6
  </pre>
  </details>
  
  <details><summary> Program-233)  Decode String <b>#Stack #Depth-first Search</b> </summary>
  <pre>
    -> Given an encoded string, return its decoded string.
    -> The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets 
       is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
    -> You may assume that the input string is always valid; No extra white spaces, square 
       brackets are well-formed, etc.
    -> Furthermore, you may assume that the original data does not contain any digits and that digits
       are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
       Ex. Input  : s = "3[a2[c]]"
           Output : "accaccacc"
  </pre>
  </details>
  
  <details><summary> Program-234)  Decoded String at Index <b>#Stack</b> </summary>
  <pre>
    -> An encoded string S is given.  To find and write the decoded string to a tape, the encoded 
       string is read one character at a time and the following steps are taken:
        -> If the character read is a letter, that letter is written onto the tape.
        -> If the character read is a digit (say d), the entire current tape is repeatedly written 
           d-1 more times in total.
    -> Now for some encoded string S, and an index K, find and return the K-th letter (1 indexed) in 
       the decoded string.
       Ex. Input  : S = "a2345678999999999999999", K = 1
           Output : "a"
  </pre>
  </details>
  
  <details><summary> Program-235)  Verify Preorder Serialization of a Binary Tree <b>#Stack</b> </summary>
  <pre>
    -> One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null 
       node, we record the node's value. If it is a null node, we record using a sentinel value such as #.
             _9_
            /   \
           3     2
          / \   / \
         4   1  #  6
        / \ / \   / \
        # # # #   # #
    -> For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", 
       where # represents a null node.
    -> Given a string of comma separated values, verify whether it is a correct preorder traversal 
       serialization of a binary tree. Find an algorithm without reconstructing the tree.
    -> Each comma separated value in the string must be either an integer or a character '#' 
       representing null pointer.
    -> You may assume that the input format is always valid, for example it could never contain 
       two consecutive commas such as "1,,3".
       Ex. Input  : "9,3,4,#,#,1,#,#,2,#,6,#,#"
           Output : true
  </pre>
  </details>
  
  <details><summary> Program-236)  Asteroid Collision <b>#Stack</b> </summary>
  <pre>
    -> We are given an array asteroids of integers representing asteroids in a row.
    -> For each asteroid, the absolute value represents its size, and the sign represents its direction 
       (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
    -> Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one 
       will explode. If both are the same size, both will explode. Two asteroids moving in the same 
       direction will never meet.
       Ex. Input  : asteroids = [10, 2, -5]
           Output : [10]
  </pre>
  </details>
  
  <details><summary> Program-237)  Excel Sheet Column Number <b>#Math</b> </summary>
  <pre>
    -> Given a column title as appear in an Excel sheet, return its corresponding column number.
    -> For example:
            A -> 1
            B -> 2
            C -> 3
            ...
            Z -> 26
            AA -> 27
            AB -> 28 
       Ex. Input  : "ZY"
           Output : 701
  </pre>
  </details>
  
  <details><summary> Program-238)  Excel Sheet Column Title <b>#Math</b> </summary>
  <pre>
    -> Given a positive integer, return its corresponding column title as appear in an Excel sheet.
    -> For example:
          1 -> A
          2 -> B
          3 -> C
          ...
          26 -> Z
          27 -> AA
          28 -> AB 
       Ex. Input  : 701
           Output : "ZY"
  </pre>
  </details>
  
  <details><summary> Program-239)  Minimum Index Sum of Two Lists <b>#Hash Table</b> </summary>
  <pre>
    -> Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of 
       favorite restaurants represented by strings.
    -> You need to help them find out their common interest with the least list index sum. If there 
       is a choice tie between answers, output all of them with no order requirement. You could 
       assume there always exists an answer.
       Ex. Input  : ["Shogun", "Tapioca Express", "Burger King", "KFC"]
                    ["KFC", "Shogun", "Burger King"]
           Output : ["Shogun"]
  </pre>
  </details>
  
  <details><summary> Program-240)  Subdomain Visit Count <b>#Hash Table</b> </summary>
  <pre>
    -> A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, 
       we have "com", at the next level, we have "leetcode.com", and at the lowest level, 
       "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also 
       visit the parent domains "leetcode.com" and "com" implicitly.
    -> Now, call a "count-paired domain" to be a count (representing the number of visits this domain 
       received), followed by a space, followed by the address. An example of a count-paired domain 
       might be "9001 discuss.leetcode.com".
    -> We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, 
       (in the same format as the input, and in any order), that explicitly counts the number of visits to 
       each subdomain.
       Ex. Input : ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
           Output: ["901 mail.com","50 yahoo.com","900 google.mail.com",
                    "5 wiki.org","5 org","1 intel.mail.com","951 com"]
  </pre>
  </details>
  
  <details><summary> Program-241)  Word Pattern <b>#Hash Table</b> </summary>
  <pre>
    -> Given a pattern and a string str, find if str follows the same pattern.
    -> Here follow means a full match, such that there is a bijection between a letter in pattern and a 
       non-empty word in str.
       Ex. Input  : pattern = "abba", str = "dog cat cat fish"
           Output : false
  </pre>
  </details>
  
  <details><summary> Program-242)  Isomorphic Strings <b>#Hash Table</b> </summary>
  <pre>
    -> Given two strings s and t, determine if they are isomorphic.
    -> Two strings are isomorphic if the characters in s can be replaced to get t.
    -> All occurrences of a character must be replaced with another character while preserving 
       the order of characters. No two characters may map to the same character but a character 
       may map to itself.
       Ex.  Input: s = "foo", t = "bar"
            Output: false
  </pre>
  </details>
  
  <details><summary> Program-243)  Average Salary Excluding the Minimum and Maximum Salary <b>#Array #Sort</b> </summary>
  <pre>
    -> Given an array of unique integers salary where salary[i] is the salary of the employee i.
    -> Return the average salary of employees excluding the minimum and maximum salary.
       Ex.  Input: salary = [8000,9000,2000,3000,6000,1000]
            Output: 4750.00000
  </pre>
  </details>
  
  <details><summary> Program-244)  Encode and Decode TinyURL <b>#Hash Table #Math</b> </summary>
  <pre>
    -> TinyURL is a URL shortening service where you enter a URL such as 
       https://leetcode.com/problems/design-tinyurl and it returns a short URL such as 
       http://tinyurl.com/4e9iAk.
    -> Design the encode and decode methods for the TinyURL service. There is no restriction 
       on how your encode/decode algorithm should work. You just need to ensure that a URL can 
       be encoded to a tiny URL and the tiny URL can be decoded to the original URL
  </pre>
  </details>
  
  <details><summary> Program-245)  Group Anagrams <b>#Hash Table #String</b> </summary>
  <pre>
    -> Given an array of strings, group anagrams together.
       Ex.  Input  : ["eat", "tea", "tan", "ate", "nat", "bat"],
            Output : [["ate","eat","tea"],["nat","tan"],["bat"]]
  </pre>
  </details>
  
  <details><summary> Program-246)  Island Perimeter <b>#Hash Table</b> </summary>
  <pre>
    -> You are given a map in form of a two-dimensional integer grid where 1 represents 
       land and 0 represents water.
    -> Grid cells are connected horizontally/vertically (not diagonally). The grid is 
       completely surrounded by water, and there is exactly one island (i.e., 
       one or more connected land cells).
    -> The island doesn't have "lakes" (water inside that isn't connected to the water 
       around the island). One cell is a square with side length 1. The grid is rectangular, 
       width and height don't exceed 100. Determine the perimeter of the island.
       Ex.  Input : [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
            Output: 16
  </pre>
  </details>
  
  <details><summary> Program-247)  Subrectangle Queries <b>#Array</b> </summary>
  <pre>
    -> Implement the class SubrectangleQueries which receives a rows x cols rectangle 
       as a matrix of integers in the constructor and supports two methods:
        1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
           Updates all values with newValue in the subrectangle whose upper left coordinate 
           is (row1,col1) and bottom right coordinate is (row2,col2).
        2. getValue(int row, int col) 
    -> Returns the current value of the coordinate (row,col) from the rectangle.
       Ex. Input  : ["SubrectangleQueries","getValue","updateSubrectangle","getValue",
                     "getValue","updateSubrectangle","getValue","getValue"]
                    [[[[1,2,1],[4,3,4],[3,2,1],[1,1,1]]],[0,2],[0,0,3,2,5],[0,2],[3,1],[3,0,3,2,10],[3,1],[0,2]]
           Output : [null,1,null,5,5,null,10,5]
  </pre>
  </details>
  
  <details><summary> Program-248)  Can Make Arithmetic Progression From Sequence <b>#Array #Sort</b> </summary>
  <pre>
    -> Given an array of numbers arr. A sequence of numbers is called an arithmetic progression 
       if the difference between any two consecutive elements is the same.
    -> Return true if the array can be rearranged to form an arithmetic progression, 
       otherwise, return false.
       Ex. Input  : arr = [3,5,1]
           Output : true
  </pre>
  </details>
  
  <details><summary> Program-249)  Queries on a Permutation With Key <b>#Array</b> </summary>
  <pre>
    -> Given the array queries of positive integers between 1 and m, you have to process 
       all queries[i] (from i=0 to i=queries.length-1) according to the following rules:
        -> In the beginning, you have the permutation P=[1,2,3,...,m].
        -> For the current i, find the position of queries[i] in the permutation P (indexing from 0) 
           and then move this at the beginning of the permutation P. Notice that the position of 
           queries[i] in P is the result for queries[i].
    -> Return an array containing the result for the given queries.
       Ex. Input  : queries = [3,1,2,1], m = 5
           Output : [2,1,2,1] 
  </pre>
  </details>
</details>  
