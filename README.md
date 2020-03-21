# Java_Basic_Codes
In this repository, there are some basic programs (only functions) that most companies ask during interview process in java language.

#### Program-1)   Median of two sorted arrays (time complexity should be O(log(m+n)))
                  
    Ex. nums1 = [1,2] and nums2 = [3,4]
        median = (2+3)/2 = 2.5
    
#### Program-2)   Merge two sorted linked lists

    Ex. lis1 = 1->4->5 and list2 = 1->6->8
      ans = 1->1->4->5->6->8
    
#### Program-3)   Search insert position

    -> Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    Ex. [1,3,5,6], 7
        ans = 4
        
#### Program-4)   Find First and Last Position of Element in Sorted Array        
    Ex. nums = [5,7,7,8,8,10], target = 8
        ans = [3,4]

#### Program-5)   Count of Smaller Numbers After Self
    Ex. nums = [5,2,6,1]
        ans = [2,1,1,0]

#### Program-6)   Boats to Save People (Return the minimum number of boats)
    -> The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
    -> Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.
    Ex. people = [3,2,2,1], limit = 3
        ans = 3   ( Explanation: 3 boats (1, 2), (2) and (3) )

#### Program-7)   Same Tree or not
     -> Given two binary trees, write a function to check if they are the same or not.
     Ex.    1         1
           / \       / \
          2   3     2   3 
     input = [1,2,3], [1,2,3]
     Ans = true 
           
#### Program-8)   Validate Binary Search Tree
    ->Given a binary tree, determine if it is a valid binary search tree (BST).
     *) The left subtree of a node contains only nodes with keys less than the node's key.
     *) The right subtree of a node contains only nodes with keys greater than the node's key.
     *) Both the left and right subtrees must also be binary search trees.
     Ex.     2    input = [2,1,3];
            / \
           1   3  Ans = true

#### Program-9)   Invert Binary Tree
       Ex. Input =    4           
                    /   \
                   2     7
                  / \   / \
                 1   3 6   9
         Output =      4
                     /   \
                    7     2
                   / \   / \
                  9   6 3   1
                  
#### Program-10)   Sum Root to Leaf Numbers (each path from root to leaf represents the number)
      Ex. [4,9,0,5,1]         
                  4
                 / \
                9   0     Ans = 495 + 491 + 40 = 1026
               / \
              5   1
              
 #### Program-11)   Path Sum (check if path exist in which sum of values of nodes equal to given target sum)
      Ex. Input = 22        
                5         Ans = 5->4->11->2 = 5+4+11+2 = 22  
               / \        Ans = true
              4   8
             /   / \
            11  13  4
           /  \      \
          7    2      1

 #### Program-12)   Binary search (time complexity O(log(n))
      Ex. nums = [-1,0,3,5,9,12], target = 9
          Ans = 4
          
 #### Program-13)   Search and return subtree of that node in Binary Search Tree
      Ex. input =    4      key = 2  Output =    2      else return [];
                    / \                         / \ 
                   2   7                       1   3
                  / \
                 1   3
         
 #### Program-14)   Symmetric Tree (mirror image concept can be applied here)
      Ex. input =     1         Output = true
                     / \
                    7   7
                   / \ / \
                  5  2 2  5

 #### Program-15)   Add Binary Strings
      Ex. string1 = "1010", string2 = "1011"
          Ans = "10101"
          
 #### Program-16)   Plus One (Add 1 in the given number in form of array)
      Ex. Input = [2,4,5,9]       Input = [9,9,9]
          Ans =   [2,4,6,0]       Input = [1,0,0,0]

#### Program-17)  Count no of 1 in given String (Concept of masking of bits in using AND operation)
      Ex. 11111111111111111111111111101101
          Ans = 30

#### Program-18)  Hamming Distance (Upto 32 bits) (Use of Integer.toBinaryString(int) function of java in-built function)
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

#### Program-19)  Total Hamming Distance (All pairs of numbers in given array) (time complexity must be taken care of because of  two for loops)
      Ex. Input => [5, 15, 20]
      Ans = hamming(5,15) + hamming(15,20) + hamming(5,20)
          = 2 + 4 + 2
          = 8
          
#### Program-20)  Reverse Integer (Constraint : 32-bit signed integer)
      Ex. Input  = 113      Input = -345    Input = 120
          Ans = 311         Ans = -543      Ans = 21
          
#### Program-21)  Move Zeros to end of the array (Without using another array and min no of operations)
      Ex. Input = [0,56,3,2,4,0,2]
          Ans = [56,3,2,4,2,0,0]
          
#### Program-22)  Subtract the Product and Sum of Digits of an Integer
      Ex. N = 453
      Product = 4*5*3 = 60
      Sum = 4 + 5 + 3 = 12
      Result = 60 - 12 = 48
      
#### Program-23)  Number of Steps to Reduce a Number to Zero (If n is even divide by 2 otherwise reduce 1 from n at each operation until zero)
      Ex. Num = 6;
      Ops = (6/2) = (3-2) = (2/2) = (1-1) = 0.
      No of Ops = 1 + 1 + 1 + 1 = 4
     
#### Program-24)  Intersection of Two Arrays
      Ex. Input1 = [4,7,6]  Input2 = [6,32,23,7,8]
          Ans = [7,6]
       
#### Program-25)  Replace Elements with Greatest Element on Right Side (Last element = -1)
      Ex. arr = [17,18,5,4,6,1]
          Ans = [18,6,6,6,1,-1]
          
#### Program-26)  Find Numbers with Even Number of Digits
      Ex. Input = [34,5,4,345,6785]
          Ans = 2

#### Program-27)  Merge Sorted Array (Assume : array one is large enough to hold both array)
      Ex. Input1 = [1,5,4,0,0,0]
          Input2 = [3,2,7]
          Ans = [1,2,3,4,5,7]
         
#### Program-28)  Two Sum
    -> Given an array of integers, return indices of the two numbers such that they add up to a specific target.
      Ex. Input = [7,8,45,32] Target = 15
          Ans = Input[0] + Input[1] = 7+8 = 15
          Ans = [0,1]

#### Program-29)  Single Number
    -> Given a non-empty array of integers and Frequency of all elements except one, find that number
      Ex. Input = [5,6,7,7,5,8,6,4,8]
          Ans = 4
          
#### Program-30)  Power (x,n) (Only for 32 bit range [-2^32, 2^31 - 1]
      Ex. Input -> X = 2.0, n = 10
          Ans = 1024.0

#### Program-31)  Max Consecutive Ones (Input string of 0 and 1s)
      Ex. Input = [1,1,0,0,0,1,1,1,1,1]
          Ans = 5
          
#### Program-32)  Palindrome Number (Negative number also) (Without converting to string)
      Ex. Input = 565     Input = -565
          Ans = true      Ans = false
          
#### Program-33)  Find First and Last Position of Element in Sorted Array (O(log(n))
      Ex. Input = [5,4,6,8,6,5,3]       Input = [3,4,5,2,4,5,6]
          Target = 6                    Target = 8
          Ans = [2,4]                   Ans = [-1,-1]
       
#### Program-34)  Edit Distance (One of the useful similarity measure in data science)(Using Dynamic Approach)
      -> The minimum edit distance is the minimum number of editing operations (insert, delete, replace) to transform one string into the other.
        Ex. "sunday" and "saturday"
            Edit distance = 3
            -> Last three and first characters are same.
            -> convert "un" to "atur".
            -> Replace 'n' with 'r', insert t, insert a
            
For reference check out this link: [Edit distance](https://en.wikipedia.org/wiki/Edit_distance)            

#### Program-35)  Integer Replacement
    ->  Given a positive integer n and you can do operations as follow:
        Until n = 1; do
    -> If n is even, replace n with n/2.
    -> If n is odd, you can replace n with either n+1 or n-1. (Choose by which min no of operations can be obtained)
      Ex. Input = 12
          12 -> 6 -> 3 -> 2 -> 1  Opes = 4      (at 3 -> N = N-1)
          12 -> 6 -> 3 -> 4 -> 2 -> 1 Opes = 5  (at 3 -> N = N+1)
          Ans = 4

#### Program-36)  Missing Number (first missing number from 0,1,2... n where n = array length)
      Ex. Input = [0,1,2]   Input = [6,7,8,9]
          Ans = 3           Ans = 4
          
#### Program-37)  First Missing Positive (find the first positive number in unsorted array)
      Ex. Input = [-5,-3,1,3]           Input = [4,3,5,2]       Input = [-5,-4,-9,-10,-11]   
          Ans   = 2                     Ans   = 1               Ans   = 1
          
