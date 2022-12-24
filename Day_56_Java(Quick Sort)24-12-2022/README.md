<h1>Quick Sort</h1>
QuickSort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
<Li>Always pick the first element as a pivot.</Li>
<Li>Always pick the last element as a pivot.</Li>
<Li>Pick a random element as a pivot.</Li>
<Li>Pick median as the pivot.</Li>
The key process in quickSort is a partition(). The target of partitions is, given an array and an element x of an array as the pivot, put x at its correct position in a sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.
