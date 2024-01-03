package magic8ball;
    import java.util.Scanner;
    import java.util.Random;

public class Magic8ball {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random randomInt = new Random();
        
        System.out.println("Welcome to Oracle of Fate. Believe or not,  this magic ball knows all the answers.");
      
        System.out.print("Input your name: ");
        String name = scan.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        
        
        String question;   
        int random = randomInt.nextInt(20)+1;
        String answer;
        
        System.out.println("Hello " + name + "! Ask your question: ");
        question = scan.nextLine();  
        
        if (random  == 1) {
            answer = "\033[1;32mIT IS CERTAIN\033[0m";
        } else if (random == 2) {
            answer = "\033[1;32mIT IS DECIDEDLY SO\033[0m";
        } else if (random == 3) {
            answer = "\033[1;32mWITHOUT A DOUBT\033[0m";
        } else if (random == 4) {
            answer = "\033[1;32mYES, DEFINITELY\033[0m";
        } else if (random == 5) {
            answer = "\033[1;32mYOU MAY RELY ON IT\033[0m";
        } else if (random == 6) {
            answer = "\033[1;32mAS I SEE IT, YES\033[0m";
        } else if (random == 7) {
            answer = "\033[1;32mMOST LIKELY\033[0m";
        } else if (random == 8) {
            answer = "\033[1;32mOUTLOOK GOOD\033[0m";
        } else if (random == 9) {
            answer = "\033[1;32mYES\033[0m";
        } else if (random == 10) {
            answer = "\033[1;32mSIGNS POINT TO YES\033[0m";
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
            answer = "\033[1;31mDON'T COUNT ON IT\033[0m";
        } else if (random == 17) {
            answer = "\033[1;31mMY REPLY IS NO\033[0m";
        } else if (random == 18) {
            answer = "\033[1;31mMY SOURCES SAY NO\033[0m";
        } else if (random == 19) {
            answer = "\033[1;31mOUTLOOK NOT SO GOOD\033[0m";
        } else {
            answer = "\033[1;31mVERY DOUBTFUL\033[0m";
    }
        System.out.println(answer);
       
      
    }
    
}
        
    
    
