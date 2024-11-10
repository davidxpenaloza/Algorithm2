import java.util.Scanner;

/**
 * Write a description of class Marks here.
 *
 * @author (David Penaloza)
 * @version (V1.0)
 */
public class Marks
{
    // instance variables 

    /**
     * Constructor for objects of class Marks
     */
    public static void main(String[] args)
    {
        int numberOfStudents = 30;
        float[] mark = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks to 30 students");
        
        //assignment name
        System.out.println("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();
        System.out.println("Enter the marks: \n");
        //Code for avoid the loop from the use the sentence "continue". 
        //The user needs to write the adequate value. When users execute the true value according the problem condition. 
        //Then, they can entered the next value. Otherwise a message will be displayed: "invalide mark, please enter again"
        
        //Get marks from the user with validation
        for(int i=0; i<numberOfStudents; i++){
            
            float temp;

            do{
                temp = scanner.nextFloat();
                if(temp<0 || temp>30){
                   
                    System.out.println("Invalide marks,please enter again");    
                }
                } while (temp<0 || temp>30);
                mark[i] = temp;
            
            }
        //Showed user marks
        System.out.println("Entered marks");
        for(int i=0; i<numberOfStudents; i++){
            System.out.println(mark[i]);
            
        }
        
        //Calculate the mean (average)
        float total = 0;
        for(int i = 0; i<numberOfStudents; i++){
            total = total + mark[i];
        
        }
        float mean =0;
        mean = total / numberOfStudents;
        
        //Calculate standard deviation
        float sumdiff;
        for(int i =0; i<numberOfStudents; i++) {
            sumdiff = (mark[i]-mean)*(mark[i]-mean);
            sumdiff = sumdiff / numberOfStudents;
            //System.out.println(sumdiff);
        
        }
        float totalsumdiff =0;
        for(int i = 0; i<numberOfStudents; i++){
            totalsumdiff = totalsumdiff + (mark[i]-mean)*(mark[i]-mean)/numberOfStudents;
        
        }
        
        float standardDeviation = (float) Math.sqrt(totalsumdiff / (numberOfStudents-1));
        
        System.out.println("\nAssignment Name: "+ assignmentName);
        System.out.println("The mean value of total Mark is: " + mean);
        System.out.println("Standard Deviation: "+ standardDeviation); 
        
    }
}
