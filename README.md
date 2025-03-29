# Java Quiz Program

This is a simple Java-based console quiz application. The program asks the user a series of multiple-choice questions, validates their input, and calculates their final score based on correct answers.

## Features
- Displays a welcome message.
- Asks multiple-choice questions with four options each.
- Validates user input to ensure it is within the range of valid options (1-4).
- Provides feedback on whether the user's answer is correct or incorrect.
- Displays the final score at the end of the quiz.

## How It Works
1. The program initializes an array of questions, options, and correct answers.
2. It uses a `for` loop to iterate through each question.
3. For each question:
   - The question and its options are displayed.
   - The user is prompted to enter their answer.
   - If the user enters an invalid input (not between 1 and 4), they are prompted to try again.
   - The program checks if the user's answer matches the correct answer and provides feedback.
4. After all questions are answered, the program displays the user's final score.

## Code Structure
- **Questions Array**: Stores the quiz questions.
- **Options Array**: Stores the multiple-choice options for each question.
- **Answer Array**: Stores the correct answers for each question.
- **Score Variable**: Tracks the number of correct answers.
- **Input Validation**: Ensures the user enters a valid option.

## Example Output

Welcome to My Quiz!

WHAT IS 1+1

1. 2
2. 50
3. 569
4 .2424 Enter your answer: 5

## When the user input invalid number 
Invalid input. Please try Again!
## It will ask again..
Enter your answer again....
## It will loop and ask you again.
Enter your answer: 1

The answer is Correct!

...

Your final score is: 4 out of 5
