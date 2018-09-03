#Whiteboard Challenge 37
Which sort is fastest between Merge & Selection Sort?

https://en.wikipedia.org/wiki/Selection_sort

https://www.tutorialspoint.com/java/lang/system_currenttimemillis.htm 

https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextDouble-- 

##Challenge Part 1 - Selection Sort
Implement SelectionSort to sort numbers of type double.

Use: 

`Random r = new Random();`

`double dd = r.nextDouble();`

Write tests to verify it works. 

##Challenge Part 2 - Verify an array is Sorted
Write a function called isSorted to verify an array is sorted.

##Challenge Part 3 - Generate random numbers in an array
Write a function called "randomN" that generates an array of size N filled with random double numbers. Write another function called "copy" that takes an array and produces and exact copy. Write a program that times out how long it takes to sort an array. Sort arrays of the following sizes:

10,000

100,000

1,000,000 (size possible on my machine)

##Challenge Part 4 - Sorting challenge by time
Write a program that generates a random array of those sizes, copies the array so there's two copies, and then sort the array with two sorting algorithms: SelectionSort and Merge Sort. Time how long they take to look and record the results in a README.md file.

Time them by using System.currentTimeMillis()

###Example use of currentTimeMillis use:
`long start = System.currentTimeMillis()`

`long delta = System.currentTimeMillis() - start;`

##RESULTS FROM PART 4 of CHALLENGE

Print out from main class where "arrayTimeSort" method is called:


###Test 1
Testing random number double integer array of 10,000 numbers sort:

`Selection sort of 10000 random array takes: 119 milliseconds`
 
 `Merge sort of 10000 random array takes: 18 milliseconds`
 
 ###Test 2
 Testing random number double integer array of 100,000 numbers sort:

 `Selection sort of 100000 random array takes: 8698 milliseconds`
 
 `Merge sort of 100000 random array takes: 64 milliseconds`

 ###Test 3
 Testing random number double integer array of 1,000,000 numbers sort:
 
 `Selection sort of 1000000 random array takes: 666252 milliseconds`
 
 `Merge sort of 1000000 random array takes: 343 milliseconds`

 **Total Time** for all 3 tests: **11m 30s** 
 
 ###WINNER IS MERGE SORT FOR FASTEST SORT!