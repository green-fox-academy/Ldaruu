import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Which year have you born: ");
            int amount = input.nextInt();
            int YearsOld =  (2018 - amount);
            System.out.println("You are: " + YearsOld + " years old");
            if (YearsOld >= 31 && YearsOld<=59) {
                System.out.println("You are not the youngest lets be honest!");
            }
            else if (YearsOld >= 60) {
                System.out.println("Please take a sit Sir!");
        }
            else {
                System.out.println("Hello Sexy! ");
            }

        }
    }
        