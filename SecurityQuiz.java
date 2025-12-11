/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.securityquiz;

//import scanner
import java.util.Scanner;
//import random class
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class SecurityQuiz {

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


    public static void main(String[] args) {            
        //initialize input, scanner
        Scanner scan = new Scanner(System.in);
        //initialize the random object
        SecureRandom rand = new SecureRandom();
        //Make an arrayList with the questions
        ArrayList<String> questions = new ArrayList<String>();
        //Make an arrayList with the answers
        ArrayList<String> answers = new ArrayList<String>();
        //make an object from the Questions class
        questionAnswer q = new questionAnswer();
        //boolean that determines whether or not to loop
        boolean whetherLoop = true;
        //int that corresponds to number of attempts
        int attemptNumber = 1;
        do {
        //make variable storing the score
        int score = 0;
            //Manually add the questions and answers
            questions.add("\nVPNs:\n" +
                          "a. Are only used by criminals, and you are a criminal if you use one\n" +
                          "b. Shift trust from your Internet Service Provider to the VPN provider, so choose VPNs wisely if you want to use one!\n" +
                          "c. Are the ultimate tool for your privacy and security, no government or time traveling robot from the future can track you!\n" +
                          "d. Don't do anything for your privacy or security, never use them ever.");
            answers.add("b");
            questions.add("\nWhat is the most secure authentication factor (ignoring 2FA)?\n" +
                          "a. Passkeys\n" +
                          "b. Passwords\n" +
                          "c. Email\n" +
                          "d. SMS");
            answers.add("a");
            questions.add("\nWhich type of online messaging has end-to-end encryption by default?\n" +
                          "a. SMS\n" +
                          "b. RCS\n" +
                          "c. Email\n" +
                          "d. Signal");
            answers.add("d");
            questions.add("\nWhat is the strongest type of memorable password?\n" +
                          "a. A randomly generated passphrase, meaning 6-8 random words\n" +
                          "b. Your home address\n" +
                          "c. \"Passwerd\"\n" +
                          "d. Your 5th favorite food");
            answers.add("a");
            questions.add("\nWhat is the most secure operating system out of these options?\n" +
                          "a. MacOS\n" +
                          "b. Windows\n" +
                          "c. GNU/Linux\n" +
                          "d. iOS or Google Pixel Android");
            answers.add("d");
            questions.add("\nWhat is the security issue that C and C++ have?\n" +
                          "a. They are not memory safe\n" +
                          "b. They look ugly\n" +
                          "c. They are slow\n" +
                          "d. They are closed source");
            answers.add("a");
            questions.add("\nWhat is the most reasonable way to deal with data brokers for most people?\n" +
                          "a. Give up and cry\n" +
                          "b. Periodically check data broker websites and opt out of having your information processed\n" +
                          "c. Live in the woods and don't touch computers\n" +
                          "d. Sell your own data so you can at least get money");
            answers.add("b");
            questions.add("\nWhat is a security downside of antivirus/antimalware?\n" +
                          "a. Malware is a made up concept by antivirus companies so they can get money\n" +
                          "b. It makes your computer way slower\n" +
                          "c. Looking for malware signatures can be misleading and even damaging, compared to more\n"
                    +     "   permanent solutions against malware like sandboxing to prevent malware from doing anything\n" +
                          "d. There are no downsides");
            answers.add("c");
            questions.add("\nOpen source software\n" +
                          "a. Is insecure because anyone can see the code\n" +
                          "b. Is the only software you can trust, proprietary software is the opposite\n" +
                          "c. Can have security advantages compared to proprietary software, but is not the only factor determining security\n" +
                          "d. Is not industry standard");
            answers.add("c");
            //create the switch statement
            System.out.println("\nThis is a quiz about online privacy and security!\n"
                    +          "It doesn't cover all essential concepts, and not\n"
                    +          "all these concepts are essential. I tried to \n"
                    +          "design it to address common misunderstandings\n"
                    +          "and less covered concepts.\n"
                    +          "Answer \"a\", \"b\", \"c\", or \"d\"!");
            //make a for loop that loops as much as there are questions, and organizes the questions randomly
            for (int i = 0; i < 9; i++) {
                //Prints number of current question
                //not according to arrayList order, but sequentially from 1 to 8
                //Make an int that corresponds to a random question out of the questions left
                var randVar = rand.nextInt(questions.size());
                q.setCurrentAnswer(answers.get(randVar));
                System.out.println(questions.get(randVar));
                String inputtedAnswer = scan.nextLine();
                System.out.println(q.evalAnswer(inputtedAnswer));
                if (q.getAddScore() == true) {
                    score++;
                }
                questions.remove(randVar);
                answers.remove(randVar);
                
            }   
            //Print the score and number of attempts
            System.out.println("\nYour score: " + score + " out of " + 9 + "\n"
                    +          "Number of attempts: " + attemptNumber);
            //Allows you to play again if you type y
            System.out.println("Want to try the quiz again? Type y");
            whetherLoop = scan.nextLine().equalsIgnoreCase("y");
            attemptNumber++;
        }
        while (whetherLoop);
    } 
}

//Make a class that helps evaluate the answer to each question
class questionAnswer {
    private String currentAnswer = "";
    private boolean addScore = false;
    //setter for current answer
    public void setCurrentAnswer (String inCurrentAnswer){
        currentAnswer = inCurrentAnswer;
    }
    //getter for score
    public boolean getAddScore(){
        return addScore;
    }
    
    //This method evaluates user input, and returns whether the inputted answer is correct
    //if incorrect, returns what the right answer is
    public String evalAnswer (String inEval){
        if (currentAnswer.equalsIgnoreCase(inEval)) {
            addScore = true;
            return "Correct!";
        } else {
            addScore = false;
        }
        return "Incorrect, the answer is " + currentAnswer;
    }
}
