import java.util.*;

public class markscalculator{

    public static int marks(int subjects,int maxmarks){
        Scanner sc=new Scanner(System.in);
        int marks=0;
        int result=0;
        int i;
        int submarks=0;

        for(i=1;i<=subjects;i++){
            System.out.println("enter subject "+i+" marks");
            submarks=sc.nextInt();
            marks=marks+submarks;
        }

        System.out.println("Total marks obtained: "+marks);

        result=((marks*100)/(subjects*maxmarks));
        System.out.println("Percentage obtained: "+result+"%");
        
        
        if(result>=90 && result<=100){
            System.out.println("Grade Obtained: A");
        }
        else if(result>=80 && result<90){
            System.out.println("Grade Obtained: B");
        }
        else if(result>=70 && result<80){
            System.out.println("Grade Obtained: C");
        }
        else if(result>=60 && result<70){
            System.out.println("Grade Obtained: D");
        }
        else if(result<60){
            System.out.println("Grade Obtained: E");
        }
        
        
        
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of subjects");
        int subjects=sc.nextInt();
        
        System.out.println("Enter maximum marks for subjects");
        int maxmarks=sc.nextInt();

        marks(subjects,maxmarks);
    }
}