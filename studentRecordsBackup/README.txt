CS542 Design Patterns
Spring 2016
Assignment 3 README FILE

Due Date: <3/22/2016, IN FORMAT: Tuesday, March 22, 2016>
Submission Date: <3/22/2016, IN FORMAT: Tuesday, March 22, 2016>
Author(s): <Satya Komal Gutta> 
e-mail(s): <sgutta1@binghamton.edu> 


PURPOSE:

[
  To understand and implement the Observer Pattern design principles to a create two back up trees using a main binary search tree and to update the backup trees using Observer Pattern.
]

PERCENT COMPLETE:

[
  "I believe I have completed 100% of this project."
]

PARTS THAT ARE NOT COMPLETE:

[
  None
]

BUGS:

[
None
]

FILES:

[
README.txt
Diver.java, BST.java,BSTBuilder.java,EvenFilterImpl.java,Node.java,ObserverI.java,SubjectI.java,OddEvenFilterI.java,OddFilterImpl.java,build.xml
  
]

SAMPLE OUTPUT:

[
  if input.txt conatins:
 1
 2
 3
 and update value is 1

Then the output is as follows:

Inorder of main tree is
1 2 3 
Inorder of Backup1
1 2 3 
Inorder of Backup2
1 2 3 

Sum of all Bno's is :6
Sum of all Bno's in backup1 is :6
Sum of all Bno's in backup1 is :6

After passing the update value
Inorder of main tree is
2 3 5 
Inorder of Backup1
1 2 3 
Inorder of Backup2
2 3 4 

Sum of all Bno's is :10
Sum of all Bno's in backup1 is :6
Sum of all Bno's in backup1 is :9



]

TO COMPILE:

[
 ## To clean:
ant -buildfile src/build.xml clean

## To compile: 
ant -buildfile src/build.xml all
 
]

TO RUN:

[
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=1 
]


EXTRA CREDIT:

[
  "N/A"
]


BIBLIOGRAPHY:

[
  http://www.java2blog.com/2013/02/observer-design-pattern-in-java.html
  http://introcs.cs.princeton.edu/java/44st/IterativeBST.java.html

]

Choice of Data Structure in Results class

a).I used vector data structure to store the Observer objects because vectors can grow dynamically and can be used if the no of observers gets increased in the future.
b).Time Complexity: Adding the elements to the end of a Vector is O(1) and we are adding to the end in this assignment.
c).Space Complexity of Vector is O(1)