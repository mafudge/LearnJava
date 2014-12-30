Challenge Activity 3 - Math Flash Cards

Math Flash Cards
Write a Swing Application to help kids learn to add numbers between 0 and 9.
It's a simple math quiz game where kids have to enter the answer to a random
math problem, like:  4 + 5 = ? Then you print out whether their answer is 
correct or incorrect.

Form setup:
- jLabelTitle to display "Math Flash Cards"
- jLabelQuestion to display the random math question for example "4 + 5 = "
- jTextFieldAnswer to allow you to enter the answer to the question. 
- jButtonGo which displays "Go!"
- jLabelAnswer to display "Correct" or "Incorrect"
- jLabelNextQuestion to display the next question
 
Code Events: 
When the program starts, after the components are initialized:
 - initialize the random number generator
 - perform the same code as when you click next question

When you click the Go button:
- if the number in the textbox equals the answer then
-   display "correct" on the answer label 
- else
-   display "incorrect" on the answer label

When you click the Next Question button:
- generate two random numbers between 0 and 9
- figure out the answer when they're added together
- print the question on the label 
- for example if the random #'s are 4 and 5 the answer would be 9 and the
  label would say "4 + 5 = "
- clear the results label
- empty out the text box
    

