<h1>Insertion Sort</h1>
<br>Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

<h3>Characteristics of Insertion Sort:</h3>
<li>This algorithm is one of the simplest algorithm with simple implementation</li>
<li>Basically, Insertion sort is efficient for small data values</li>
<li>Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.</li>
<h3>Insertion Sort Algorithm-</h3>
To sort an array of size N in ascending order:
<li>Iterate from arr[1] to arr[N] over the array.</l>
<li>Compare the current element (key) to its predecessor.</li>
<li>If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.</li>
