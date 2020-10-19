# Merge Sort!

Merge Sort like Quick Sort is an algorithm from the Divide and Conquer group.
It picks an element as pivot and partitions the given array around the picked pivot.  There are many different versions of quickSort that pick pivot in different ways.

1.  Always pick first element as pivot.
2.  Always pick last element as pivot (implemented below)
3.  Pick a random element as pivot.
4.  Pick median as pivot.

Key process of Quick Sort is the partition moment. Pivot ( no matter which method we choose ) divides array to two sub-arrays. The left one has element smaller than pivot and the right one greater. That means the pivot is on correct position. As you might've noticed our output sorted array will be collect of every pivot our algorithm chose.
# Conclusion
Quick Sort is recursive algorithm.
Quick Sort is in-place sorting algorithm because it uses extra space only for storing recursively calls but not manipulating input.
Time complexity:
-Best case and average O(n log n), because we always divide array to possible the most equal 	sub-arrays.
-Worst case O(n*n)  when we get the most unbalanced sub-arrays, pivot is the smallest or largest element. That means we always get n-1 size of array, and we do It n times.
Feel free to download the code and try, but I suggest you to implement it by yourself first.
