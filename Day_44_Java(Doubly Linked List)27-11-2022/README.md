<h2>Doubly Linked List</h2>
<br>A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list
<h3>Advantages of DLL over the singly linked list:</h3>
<br>1.&nbsp;&nbsp;A DLL can be traversed in both forward and backward directions. 
<br>2.&nbsp;&nbsp;The delete operation in DLL is more efficient if a pointer to the node to be deleted is given. 
<br>3.&nbsp;&nbsp;We can quickly insert a new node before a given node. 
<br>4.&nbsp;&nbsp;In a singly linked list, to delete a node, a pointer to the previous node is needed. To get this previous node, sometimes the list is traversed. In DLL, we can get the previous node using the previous pointer. 
<h3>Disadvantages of DLL over the singly linked list:</h3>
<br>1.&nbsp;&nbsp;Every node of DLL Requires extra space for a previous pointer. It is possible to implement DLL with a single pointer though. 
<br>2.&nbsp;&nbsp;All operations require an extra pointer previous to be maintained. For example, in insertion, we need to modify previous pointers together with the next pointers.
