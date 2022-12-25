<h1>Bucket Sort</h1>
Bucket sort or bin sort is a sorting algorithm that works by distributing the elements into a number of buckets, homogenously. Each bucket is then sorted individually. In order to sort the bucket, we use the sort() method of the Arrays class. It is usually used to sort floating-point numbers.


<br>The basic idea to perform the bucket sort is:
<li>Partition the range into a fixed number of buckets.</li>
<li>Toss each element into its appropriate bucket.</li>
<li>Sort each bucket individually using insertion sort.</li>
<li>Concatenate all the sorted buckets.</li>
