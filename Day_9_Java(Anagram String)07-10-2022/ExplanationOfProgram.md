<h3>Explanation-</h3> 
<br>1. We took String in a,b with help of scanner class then passed it to isAnagram() function.
<br>2. isAnagram() is boolean function that means it has to return the value as true or false.
<br>3. first condition is to check that if the length is not same of the string it can not be anagrams.
<br>4. Now we created two Char arrays with each and every character in lower case.
<br>5. then made an array (count[]) to counter add and subtract the values in the array at specific index.
<br>6. then we use loop as the length of both the string is same we make loop run till anyone string's length.
<br>7. count[chr_a[i]]++  this line will increment the counter of that specific index in count array i.e.. Count[<Any alphabetic or index counting> of a array] will be incremented from 0 to 1 or -1 to 0.
<br>8. count[chr_b[i]]--  this line will decrement the counter of that specific index in count array i.e.. Count[<Any alphabetic or index counting> of b array] will be decremented from 1 to 0 or 0 to -1.
<br>9. now we traverse the count array and checking if any value of element in count array is non zero, if its non zero somewhere that means one letter/ character is not present in one of the two string
