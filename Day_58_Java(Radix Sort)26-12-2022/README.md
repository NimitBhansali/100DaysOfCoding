<h1>Radix Sort</h1>
Radix sort is the linear sorting algorithm that is used for integers. In Radix sort, there is digit by digit sorting is performed that is started from the least significant digit to the most significant digit.
<br>The process of radix sort works similar to the sorting of students names, according to the alphabetical order. In this case, there are 26 radix formed due to the 26 alphabets in English. In the first pass, the names of students are grouped according to the ascending order of the first letter of their names. After that, in the second pass, their names are grouped according to the ascending order of the second letter of their name. And the process continues until we find the sorted list.

<br><b>Algorithm: RadixSort(arr)</b>
<br>1. &nbsp;max = largest element in the given array
<br>2. &nbsp;d = number of digits in the largest element (or, max)
<br>3. &nbsp;Now, create d buckets of size 0 - 9
<br>4. &nbsp;for i -> 0 to d
<br>5. &nbsp;sort the array elements using counting sort (or any stable sort) according to the digits at the ith place
