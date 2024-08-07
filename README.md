# Sudoku-Solver-Project
 Hey There! I am Mainul. Here is a sudoku game, where you will get sudokus. you can solve them and see the answer after solving and examine yours :)

# How this project is useful:
 This game will help to improve your thinking ability, patience, problem solving ability for long time.
 
 # Steps to run the project-
  1. Paste this link on your browser:- https://sk-mainul-alam.github.io/Sudoku_Solver_project/
  2. Click on'GetPuzzle' to get a SUDOKU problem.
  3. After solving by yourself, you can see the answer by clicking on 'SolvePuzzle'.
  4. Repeat this and solve different puzzles everytime.

# How to validate a cell for a number
A number is valid in that cell if it doesn't repeat in it's row, column and it's submatrix(3X3).
We have implemented this logic in the 'isSafe' function.
 
 # How a sudoku is solved:
I have made the algorithm to solve a Sudoku by the concepts of Recursion and Backtracking. Here I am giving a simple pseudo code below to explain you the logic :

1. Start.
2. We start with the first cell.
3. If the cell is empty, we generate a list of possible valid values that can be filled in that cell.
4. We iterate over this list and start with the first value. This value is placed in the required cell.
5. We move on to the next cell. We again generate a list of possibilities. However, if no list can be generated, then this means that there is something wrong with the value of the previous cell. We then move back to the previous cell and place the next value on the generated list in the cell now. We repeat this step until the current cell has a valid value placed inside it.
6. We stop when we reach the last cell in a Sudoku puzzle and have placed a valid value.
7. The puzzle has now been solved.
8. Stop.

You can download the code and understand how these logics are implemented in the javascript code. The Java code is also given, which I had made before pushing the code into the javascript file.


