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
        
        //Calculate t markshe mean (average)
        float total = 0;
        for(int j = 0; j<numberOfStudents; j++){
            total = total + mark[j];
        
        }
        float mean;
        mean = total / numberOfStudents;
        
        float totalsumdiff =0;
        for(int t = 0; t<numberOfStudents; t++){
            totalsumdiff = totalsumdiff + (mark[t]-mean)*(mark[t]-mean)/numberOfStudents;
        
        }
        
        float standardDeviation;
        standardDeviation = (float) Math.sqrt(totalsumdiff / (numberOfStudents-1));
        
        System.out.println("\nAssignment Name: "+ assignmentName);
        System.out.println("The mean value of total Mark is: " + mean);
        System.out.println("Standard Deviation: "+ standardDeviation); 
        
    }
}
