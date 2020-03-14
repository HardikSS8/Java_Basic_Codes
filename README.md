# Java_Basic_Codes
In this repository, there are some basic programs that most companies ask during interview process in java language.

#### Program-1)   Median of two sorted arrays ( time complexity should be O(log(m+n)) )
                  
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
