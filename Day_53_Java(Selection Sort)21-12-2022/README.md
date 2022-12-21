<h2>Selection Sort Algorithm</h2>
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning.

<br>The algorithm maintains two subarrays in a given array.

<br>The subarray which already sorted.
<br>The remaining subarray was unsorted.
<br>-->In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

<br>1.&nbsp;Initialize minimum value(min_idx) to location 0.
<br>2.&nbsp;Traverse the array to find the minimum element in the array.
<br>3.&nbsp;While traversing if any element smaller than min_idx is found then swap both the values.
<br>4.&nbsp;Then, increment min_idx to point to the next element.
<br>5.&nbsp;Repeat until the array is sorted.
