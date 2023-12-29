package magiceightball;

import java.util.Scanner;
import java.util.Random;

public class Magiceightball {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random randomInt = new Random();
        
        String question;   
        int random = randomInt.nextInt(20)+1;
        String answer;
        
        System.out.println("Ask your question: ");
        question = scan.nextLine();  
        
        if (random  == 1) {
            answer = "IT IS CERTAIN";
        } else if (random == 2) {
            answer = "IT IS DECIDEDLY SO";
        } else if (random == 3) {
            answer = "WITHOUT A DOUBT";
        } else if (random == 4) {
            answer = "YES, DEFINITELY";
        } else if (random == 5) {
            answer = "YOU MAY RELY ON IT";
        } else if (random == 6) {
            answer = "AS I SEE IT, YES";
        } else if (random == 7) {
            answer = "MOST LIKELY";
        } else if (random == 8) {
            answer = "OUTLOOK GOOD";
        } else if (random == 9) {
            answer = "YES";
        } else if (random == 10) {
            answer = "SIGNS POINT TO YES";
        } else if (random == 11) {
            answer = "REPLY HAZY TRY AGAIN";
        } else if (random == 12) {
            answer = "ASK AGAIN LATER";
        } else if (random == 13) {
            answer = "BETTER NOT TELL YOU NOW";
        } else if (random == 14) {
            answer = "CANNOT PREDICT NOW";
        } else if (random == 15) {
            answer = "CONCENTRATE AND ASK AGAIN";
        } else if (random == 16) {
            answer = "DON'T COUNT ON IT";
        } else if (random == 17) {
            answer = "MY REPLY IS NO";
        } else if (random == 18) {
            answer = "MY SOURCES SAY NO";
        } else if (random == 19) {
            answer = "OUTLOOK NOT SO GOOD";
        } else {
            answer = "VERY DOUBTFUL";
    }
        System.out.println(answer);
       
      
    }
    
}
