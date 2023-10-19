import java.util.*;


class User{
    int balance;
    int accountnum;
    int pin;

    User(int balance,int accountnum,int pin){
        this.balance=balance;
        this.accountnum=accountnum;
        this.pin=pin;
    }
    
}






public class ATMsimulator{
    
    int Maxlimit=10000;
    User user;
    int accoutnum;
    Scanner sc=new Scanner(System.in);

    ATMsimulator(User user){
        this.user=user;
    }

    void start(){
       // System.out.println("acc "+this.user.accountnum+" pin "+this.user.pin+" bal "+this.user.balance );
        System.out.println("Please verify your account number.");
        int accountnum=sc.nextInt();
        

        if(accountnum==this.user.accountnum){
            System.out.println("Please enter 4 digit PIN.");
            int pin=sc.nextInt();
            if(pin==this.user.pin){
                System.out.println("Welcome!");
                System.out.println("Choose the action you want to perform:");
                System.out.println("1.Witdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Checkbalance");
                System.out.println("4.End Transaction");
                
                int option=sc.nextInt();
                
                if(option==1){
                    //Withdraw();
                    int withdraw=sc.nextInt();

                    if(withdraw>Maxlimit ){
                        System.out.println("Ammount greater than withdraw limit!");
                       
                        System.out.println("Do you wish to continue?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        int reply=sc.nextInt();
                        if(reply==1){
                            continuet();
                        }
                        else{
                            System.out.println("Thank You!!");
                        }
                    }
                    else if(withdraw>this.user.balance){
                        System.out.println("Insufficient Balance!");
                        
                        System.out.println("Do you wish to continue?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        int reply=sc.nextInt();
                        if(reply==1){
                            start();
                        }
                        else{
                            System.out.println("Thank You!!");
                        }
                    }
                    else{
                        this.user.balance=this.user.balance-withdraw;
                        System.out.println("Withdrawal Successful!");
                        
                        System.out.println("Do you wish to continue?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        int reply=sc.nextInt();
                        if(reply==1){
                            continuet();
                        }
                        else{
                            System.out.println("Thank You!!");
                        }
                    }
                }
                else if(option==2){
                    //Deposit();
                    int deposit=sc.nextInt();
                    this.user.balance+=deposit;
                    
                    System.out.println("Do you wish to continue?");
                    System.out.println("1.yes");
                    System.out.println("2.no");
                    int reply=sc.nextInt();
                    if(reply==1){
                        continuet();
                    }
                    else{
                        System.out.println("Thank You!!");
                    }
                   
                }
                else if(option==3){
                    //Checkbal();
                    System.out.println("Curr Balance: "+this.user.balance);
                    start();
                }
                else if(option==4){
                    System.out.println("Thank you!!");
                }

            }
            else{
                System.out.println("Incorrect pin!");
                start();
            }
        }
        else{
            System.out.println("Incorrect account number!");
            start();
        }
        

    }

    void continuet(){
        System.out.println("Choose the action you want to perform:");
                System.out.println("1.Witdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Checkbalance");
                System.out.println("4.End Transaction");
                int option=sc.nextInt();

                if(option==1){
                    //Withdraw();
                    int withdraw=sc.nextInt();

                    if(withdraw>Maxlimit ){
                        System.out.println("Ammount greater than withdraw limit!");
                       
                        System.out.println("Do you wish to continue?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        int reply=sc.nextInt();
                        if(reply==1){
                            continuet();
                        }
                        else{
                            System.out.println("Thank You!!");
                        }
                    }
                    else if(withdraw>this.user.balance){
                        System.out.println("Insufficient Balance!");
                        
                        System.out.println("Do you wish to continue?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        int reply=sc.nextInt();
                        if(reply==1){
                            continuet();
                        }
                        else{
                            System.out.println("Thank You!!");
                        }
                    }
                    else{
                        this.user.balance=this.user.balance-withdraw;
                        System.out.println("Withdrawal Successful!");
                        
                        System.out.println("Do you wish to continue?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        int reply=sc.nextInt();
                        if(reply==1){
                            continuet();
                        }
                        else{
                            System.out.println("Thank You!!");
                        }
                    }
                }
                else if(option==2){
                    //Deposit();
                    int deposit=sc.nextInt();
                    this.user.balance+=deposit;
                    
                    System.out.println("Do you wish to continue?");
                    System.out.println("1.yes");
                    System.out.println("2.no");
                    int reply=sc.nextInt();
                    if(reply==1){
                        continuet();
                    }
                    else{
                        System.out.println("Thank You!!");
                    }
                   
                }
                else if(option==3){
                    //Checkbal();
                    System.out.println("Curr Balance: "+this.user.balance);
                    continuet();
                }
                else if(option==4){
                    System.out.println("Thank you!!");
                }
    }





    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int accountnum=sc.nextInt();
        int pin=sc.nextInt();
        User user1=new User(balance,accountnum,pin);
        ATMsimulator atm=new ATMsimulator(user1);
        atm.start();
    }
}


