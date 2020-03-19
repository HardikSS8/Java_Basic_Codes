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
          
 #### Program-16)   Plus One ( Add 1 in the given number in form of array )
      Ex. Input = [2,4,5,9]       Input = [9,9,9]
          Ans =   [2,4,6,0]       Input = [1,0,0,0]
