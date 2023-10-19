import java.util.*;

public class randomnumgame{

    public static void game(int guesses,int difflevel,int score,int rounds){
        
        Random number = new Random();
        int r1=-1;
        if(difflevel==1){
            r1=1 + (int)(10*Math.random());
        }

        else if(difflevel==2){
            r1=1 + (int)(100*Math.random());
        }

        else if(difflevel==3){
            r1=1 + (int)(1000*Math.random());
        }
        
        System.out.println("r1 "+r1);
        
        Scanner sc=new Scanner(System.in);
        int guess;
        int i;
        
        

        for(i=1;i<=guesses;i++){
           
            System.out.println("Guess!");
            guess=sc.nextInt();
            if(guess==r1){
                System.out.println("Great!! Thats the right answer!");
                score++;
                break;
            }
            else if(i==guesses){
                System.out.println("Thats not the right answer.");
            }
            else{
                System.out.println("Incorrect,try again!");
            }
        }

        if(score>0 && i<=guesses){
            System.out.println("Well done! You guessed the right answer in "+i+" attempts! You won the round!");
        }
        
        sc.nextLine();
        System.out.println("You want to play another round?");
        String reply=sc.nextLine();

        if((reply.equals("yes")!=true) && (reply.equals("no")!=true) ){
            while(reply.equals("yes")!=true){
                System.out.println("invalid option");
                reply=sc.nextLine();
                if(reply.equals("yes")|| reply.equals("no")){
                    break;
                }
            }
           
        }

       if(reply.equals("yes")){
            game(guesses,difflevel,score,rounds+1);
       } 

       else if(reply.equals("no")){
            System.out.println("Thanks for playing!");
       }
       

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many guesses you want ?");
        int guesses=sc.nextInt();
        
        System.out.println("Enter difficulty level from 1 to 3.");
        int difflevel=sc.nextInt();
        if(difflevel>3){
            //System.out.println("Invalid level.Enter again!");
            while(difflevel>3){
                System.out.println("Invalid level.Enter again!");
                difflevel=sc.nextInt(); 
            }

        }
        
        
        int score=0;
        int rounds=1;
        
        

        game(guesses,difflevel,score,rounds);
    }
}