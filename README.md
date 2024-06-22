# Character Sorting and PSBB Bus Simulation Using Java

This project contains Java programs for two distinct problems: character sorting and a simulation of a PSBB bus scenario. Each problem is implemented in its own directory with detailed explanations and instructions for running the programs.

## Sort Characters
This Java program SortCharacter is designed to analyze a given input string, classify characters into vowels and consonants, count their occurrences, and then sort and display them accordingly. It includes functionality to read input, process characters, and utilize maps for counting and sorting.
### Features
- *Input Handling*: Reads a single line of input from the user.
- *Character Classification*: Determines if each character is a vowel or consonant (ignores spaces).
- *Counting*: Uses TreeMap to count occurrences of each vowel and consonant.
- *Sorting*: Sorts characters alphabetically based on their natural order.
- *Output*: Prints sorted lists of vowel and consonant characters along with their counts.

### Usage
1. Input Format:
   - Enter a single line of words or characters when prompted.
2. Output:
   - The program will output two sections:
       - *Vowel Characters*: Sorted list of vowels and their counts.
       - *Consonant Characters*: Sorted list of consonants and their counts.

### Example
If you input "Sample case", the program will output:
java
Vowel Characters:
aaee

Consonant Characters:
clmpss


## PSBB Bus Simulation
This Java program Psbb is designed to simulate a scenario where families need to be transported using minibuses under PSBB (Pembatasan Sosial Berskala Besar) restrictions. The goal is to minimize the number of minibuses required by efficiently combining family members, adhering to a maximum capacity of 4 members per minibus.
### Features
- *Input Handling*: Reads the number of families and the number of members in each family.
- *Family Size Validation*: Ensures the input for the number of family members matches the number of families.
- *Efficient Combination*: Uses a greedy algorithm to minimize the number of minibuses required by combining smaller families.
- *Output*: Displays the minimum number of minibuses required.

### Usage
1. Input Format:
   - Enter the number of families.
   - Enter the number of members in each family, separated by spaces.
2. Output:
   - The program will output the minimum number of minibuses required.

### Example
If you input:
java
Input the number of families : 5
Input the number of members in the family (separated by a space) : 1 2 4 3 3

The program will output:
java
Minimum bus required is : 4
