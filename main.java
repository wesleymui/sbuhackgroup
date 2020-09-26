import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        playMusic backgroundMusic = new playMusic();
        backgroundMusic.MusicPlayer("test.wav");
//        Scanner sc = new Scanner(System.in);
        int holes = 1;
        GUI game = new GUI(5);
//        game.setHole(holes);
        Fox newGame = new Fox("name", 1);
//        if (game.isEndGame()){
//            holes++;
//            game = new GUI(holes);
//        }

//        System.out.println("Input number of holes: ");

    }



//    public static void startGame()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input fox name: ");
//
//        String userInput = sc.nextLink();
//
//        int userInputFoxChoice;
//
//        Fox newGame = new Fox(userInput);
//
//        while (!newGame.getFoxFound())
//        {
//            System.out.println("Enter where you think the fox is: ");
//            try
//            {
//                userInputFoxChoice = Integer.parseInt(sc.nextLine());
//            }
//            catch (Exception e)
//            {
//                System.out.println("Invalid choice");
//                continue;
//            }
//
//            if (newGame.isCaught(userInputFoxChoice))
//            {
//                System.out.println("Congratulations, you caught the fox. ");
//                break;
//            }
//            else
//            {
//                System.out.println("The fox was not in that hole. It has run away into a different hole now. ");
//                newGame.move();
//            }
//        }
//        sc.close();
//    }
}
