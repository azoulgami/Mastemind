# MasterMind (Java Console)
A simple console implementation of the classic **Mastermind** game. Guess the secret **4-color** code in **10** tries. After each guess you’ll see feedback:
- `X` — right color in the right position
- `O` — right color in the wrong position
- `N/A` — color not present

## Features
- Randomly generated 4-slot answer from 6 colors
- Handles duplicates (e.g., `g g b b` is valid)
- Clear per-guess feedback (`X`, `O`, `N/A`)
- Simple, single-character input

## Color Codes
g = green  
k = black  
b = blue  
y = yellow  
w = white  
r = red  

## How to Run
1. Ensure you have Java (8+) installed.  
2. Save the source as `MasterMind.java`.  
3. Compile and run:  
   javac MasterMind.java  
   java MasterMind  

## How to Play
- You have **10 guesses**.  
- For each guess, enter **4 lines**, one character per line (e.g., `g` then `b` then `y` then `r`).  
- After submission, the game prints your guess and a row of feedback markers.  

## Example (trimmed)
WELCOME TO MASTERMIND by Ali Zoulgami  

A 4 Color Combination has been made  
These 6 colors can either be green, black, blue, yellow, white, or red  
...  
Enter a Guess  
g  
b  
y  
r  
Player Choice  
[g, b, y, r]   [X, O, N/A, O]  

## File Structure
MasterMind.java  

## Notes
- Feedback order does not imply position (i.e., `X`/`O` are not sorted by slot).  
- The game reveals the correct combination at the end.  

## License
MIT (or your preferred license)
