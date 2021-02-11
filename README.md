Test project for REI

## Problem Statement
Using Java, find all of the English words in a given String.  For example, if you are given the word WORKING, you can easily find WORK and KING, but ROW, RING and KNOW are also in there.  You have access to a utility class called Dictionary, which has one method, isEnglishWord(String word).  Dictionary.isEnglishWord(String word) connects to a (mocked) online dictionary and returns Boolean true if the String passed to it is an English word, return false otherwise.

## Prerequisites
1. Java 12
2. Maven 3.5.0+

## Assumptions 
 * Words are matched from Mock Dictionary with limited words and is not case sensitive.
 * Input string is limited to less than 10 characters.

## Steps:
* Import this project as maven project
* Run TestRunner.java that contains 10 test scenarios
* List of words found will be printed in the console in case of success
* Custom Message will be printed in the console in case of no words found
* Custom Message will be printed in the console in case of invalid input
