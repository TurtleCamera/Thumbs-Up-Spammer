import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Spammer {
    public static void main(String [] args) throws InterruptedException, AWTException {
        // Instantiate variables for the rest of the program
        Robot bot = new Robot();
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Welcome to the :thumbsup: spammer!");
        System.out.println("Do you want to enable copy and paste mode (Y or N)?");
        boolean copy_mode = false;
        try {
            String response = input.nextLine();
            if(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes")) {
                copy_mode = true;
            }
            else if(response.equalsIgnoreCase("N") || response.equalsIgnoreCase("No")) {
                copy_mode = false;
            }
            else {
                System.err.println("Invalid input. Must be \"Y\" or \"N\".");
                System.exit(1);
            }
        }
        catch(Exception e) {
            System.err.println("Invalid input. Must be \"Y\" or \"N\".");
            System.exit(1);
        }

        System.out.println("Please enter the counter you want to start at: ");
        int start = -1;
        try {
            start = input.nextInt();
            if(start <= 0) {
                System.err.println("Invalid input. Must be a non-negative integer.");
                System.exit(1);
            }
        }
        catch(Exception e) {
            System.err.println("Invalid input. Must be an non-negative integer.");
            System.exit(1);
        }

        System.out.println("Please enter the number of times you wish to spam the :thumbsup: emoji: ");
        int count = -1;
        try {
            count = input.nextInt();
            if(start <= 0) {
                System.err.println("Invalid input. Must be a non-negative integer.");
                System.exit(1);
            }
        }
        catch(Exception e) {
            System.err.println("Invalid input. Must be an non-negative integer.");
            System.exit(1);
        }

        System.out.println("Spamming in...");
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Spamming -->");

        // Choose which mode to use and start spamming :thumbsup: emojis
        final int SLEEP_TIME = 15;
        for(int current = start; current < start + count; current ++) {
            if(copy_mode == false) {
                // :
                bot.keyPress(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);
                bot.keyPress(KeyEvent.VK_SEMICOLON);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SEMICOLON);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);

                // t
                bot.keyPress(KeyEvent.VK_T);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_T);  
                Thread.sleep(SLEEP_TIME);

                // h
                bot.keyPress(KeyEvent.VK_H);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_H);  
                Thread.sleep(SLEEP_TIME);

                // u
                bot.keyPress(KeyEvent.VK_U);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_U);  
                Thread.sleep(SLEEP_TIME);

                // m
                bot.keyPress(KeyEvent.VK_M);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_M);  
                Thread.sleep(SLEEP_TIME);

                // b
                bot.keyPress(KeyEvent.VK_B);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_B);  
                Thread.sleep(SLEEP_TIME);

                // s
                bot.keyPress(KeyEvent.VK_S);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_S);  
                Thread.sleep(SLEEP_TIME);

                // u
                bot.keyPress(KeyEvent.VK_U);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_U);  
                Thread.sleep(SLEEP_TIME);

                // P
                bot.keyPress(KeyEvent.VK_P);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_P);  
                Thread.sleep(SLEEP_TIME);

                // :
                bot.keyPress(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);
                bot.keyPress(KeyEvent.VK_SEMICOLON);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SEMICOLON);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);

                // SPACE
                bot.keyPress(KeyEvent.VK_SPACE);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SPACE);  
                Thread.sleep(SLEEP_TIME);

                // X
                bot.keyPress(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);
                bot.keyPress(KeyEvent.VK_X);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_X);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);
            }
            else {
                // CTRL + V
                bot.keyPress(KeyEvent.VK_CONTROL);  
                Thread.sleep(SLEEP_TIME);
                bot.keyPress(KeyEvent.VK_V);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_V);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_CONTROL);  
                Thread.sleep(SLEEP_TIME);

                // X
                bot.keyPress(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);
                bot.keyPress(KeyEvent.VK_X);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_X);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SHIFT);
                Thread.sleep(SLEEP_TIME);
            }

            // Parse each digit one by one
            String num_to_string = String.valueOf(current);
            for(char digit: num_to_string.toCharArray()) {
                if(digit == '0') {
                    // 0
                    bot.keyPress(KeyEvent.VK_0);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_0);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '1') {
                    // 
                    bot.keyPress(KeyEvent.VK_1);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_1);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '2') {
                    // 
                    bot.keyPress(KeyEvent.VK_2);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_2);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '3') {
                    // 
                    bot.keyPress(KeyEvent.VK_3);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_3);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '4') {
                    // 
                    bot.keyPress(KeyEvent.VK_4);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_4);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '5') {
                    // 
                    bot.keyPress(KeyEvent.VK_5);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_5);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '6') {
                    // 
                    bot.keyPress(KeyEvent.VK_6);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_6);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '7') {
                    // 
                    bot.keyPress(KeyEvent.VK_7);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_7);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '8') {
                    // 
                    bot.keyPress(KeyEvent.VK_8);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_8);  
                    Thread.sleep(SLEEP_TIME);
                }
                else if(digit == '9') {
                    // 
                    bot.keyPress(KeyEvent.VK_9);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_9);  
                    Thread.sleep(SLEEP_TIME);
                }
            }

            // Only type this out if this isn't the last :thumbsup: emoji
            if(current < start + count - 1) {
                // If the count is only 2, then don't type out this comma
                if(count != 2) {
                    // ,
                    bot.keyPress(KeyEvent.VK_COMMA);  
                    Thread.sleep(SLEEP_TIME);
                    bot.keyRelease(KeyEvent.VK_COMMA);  
                    Thread.sleep(SLEEP_TIME);
                }

                // SPACE
                bot.keyPress(KeyEvent.VK_SPACE);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SPACE);  
                Thread.sleep(SLEEP_TIME);
            }

            // If this is the last :thumbsup: emoji, then type out "and" as well
            if(current == start + count - 2) {
                // a
                bot.keyPress(KeyEvent.VK_A);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_A);  
                Thread.sleep(SLEEP_TIME);

                // n
                bot.keyPress(KeyEvent.VK_N);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_N);  
                Thread.sleep(SLEEP_TIME);

                // d
                bot.keyPress(KeyEvent.VK_D);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_D);  
                Thread.sleep(SLEEP_TIME);

                // SPACE
                bot.keyPress(KeyEvent.VK_SPACE);  
                Thread.sleep(SLEEP_TIME);
                bot.keyRelease(KeyEvent.VK_SPACE);  
                Thread.sleep(SLEEP_TIME);
            }
        }

        System.out.println("Finished!");
        input.close();
    }
}