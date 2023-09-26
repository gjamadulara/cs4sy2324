/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise4rev2;

import java.util.Scanner;

public class Exercise4rev2 {

    public static void main(String[] args) {
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");
        Scanner scan = new Scanner(System.in);
        boolean gameStart = true;
        
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;
        
        do{
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: ");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            int option = Integer.parseInt(scan.nextLine());
            
            switch(option){
                case 1:
                    System.out.printf("\nThis match will have to %d  rounds%n", roundsToWin);
                    int compPoints = 0;
                    int playerPoints = 0;
                    for(int i = 0; i < roundsToWin; i++){
                        System.out.println("\nThe computer has selected its move. Select your move:\n"
                                + "1. Rock\n2. Paper\n3. Scissors");
                        int choice = Integer.parseInt(scan.nextLine());
                        int random = (int) Math.floor(Math.random()*3) + 1;
                        Move compMove = null;
                        Move playerMove = null;
                        
                        switch(random){
                            case 1: 
                                compMove = rock;
                                break;
                            case 2: 
                                compMove = paper;
                                break;
                            case 3: 
                                compMove = scissors;
                                break;
                        }
                        
                        switch(choice){
                            case 1:
                                playerMove = rock;
                                break;
                            case 2:
                                playerMove = paper;
                                break;
                            case 3:
                                playerMove = scissors;
                                break;
                        }
                        
                        int winState = Move.compareMoves(playerMove, compMove);
                        String playerMoveName = playerMove.getName();
                        String compMoveName = compMove.getName();
                        
                        switch(winState){
                            case 0:
                                System.out.printf("\nPlayer chose %s. Computer chose %s. Player wins round!\n", playerMoveName, compMoveName);
                                playerPoints++;
                                System.out.printf("Player: %d - Computer: %d\n", playerPoints, compPoints);
                                break;
                            case 1:
                                System.out.printf("\nPlayer chose %s. Computer chose %s. Computer wins round!\n", playerMoveName, compMoveName);
                                compPoints++;
                                System.out.printf("Player: %d - Computer: %d\n", playerPoints, compPoints);
                                break;
                            case 2:
                                System.out.printf("\nPlayer chose %s. Computer chose %s. Round is drawed!\n", playerMoveName, compMoveName);
                                System.out.printf("Player: %d - Computer: %d\n", playerPoints, compPoints);
                                break;
                        }
                    }
                    
                    
                    int playerTotalScore = playerPoints - compPoints;
                    
                    if (playerTotalScore > 0){
                        System.out.println("\nPlayer wins!\n");
                    }
                    else if (playerTotalScore < 0){
                        System.out.println("\nComputer wins!\n");
                    }
                    else{
                        System.out.println("\nGame is tied!\n");
                    }
                    break;
                    
                case 2:
                    System.out.print("\nPlease enter how many rounds you want to play: ");
                    roundsToWin = Integer.parseInt(scan.nextLine());
                    System.out.println("\nSaved!\n");
                    break;

                case 3:
                    System.out.println("\nThank you for playing :3c");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("\nPlease select a valid number!\n");
                    break;
            }
            
        }while(gameStart == true);
        

    }
    
}
    
