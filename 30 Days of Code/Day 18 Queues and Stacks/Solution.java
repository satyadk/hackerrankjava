import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.

//Two instance variables: one for your , and one for your .
    Queue queue = new LinkedList();
    Stack st = new Stack();
//A void pushCharacter(char ch) method that pushes a character onto a stack.
    void pushCharacter(char ch) {
        st.add(ch);
        
    }
//A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }
//A char popCharacter() method that pops and returns the character at the top of the  instance variable.
    char popCharacter() {
        return (char) st.pop();
    }
//A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.
    char dequeueCharacter() {
        return (char) queue.remove();
    }


public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}