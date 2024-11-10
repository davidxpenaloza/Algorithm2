import java.util.Scanner; //import the Scanner class for user input

/**
 * Write a description of class Marks here.
 *
 * @author (David Penaloza)
 * @version (V1.0)
 */
public class Marks //A pucblic class named Marks is defined
{

    /**
     * Constructor for objects of class Marks
     */
    public static void main(String[] args) //The main method, is the entry point of Java application.
    {
        int numberOfStudents = 30; //The number of students to 30 is inicializated.
        float[] mark = new float[numberOfStudents];//An array is created to store marks for each student, where each value is float.
        Scanner scanner = new Scanner(System.in);//A scanner object was created for user input
        
        System.out.println("Give marks to 30 students");//Prompt user to enter marks
        System.out.println("Enter the assignment name: "); //Prompt user to enter the assignment name
        String assignmentName = scanner.nextLine(); //Read the assigenment name from user input
        System.out.println("Enter the marks: \n"); //Prompt user to enter marks for the students and change of Line to the next
        
        //Get marks from the user with validation
        for(int i=0; i<numberOfStudents; i++){//create variable i as a counter, the next condition is a loop's condition, finally is a increment the value of i by 1 after each iteration.
            
            float temp; //The temporary variable temp is defined to store current input
            //Started to create do-while loop, the code block will excecute once, before analizing if condition is not false.
            do{
                temp = scanner.nextFloat(); //read float input for the marks
                if(temp<0 || temp>30){ //Condition

                   System.out.println("Invalide marks,please enter again"); //inform user wrong value started     
                }
                } while (temp<0 || temp>30); //Condition is repeated until correct input is started
                mark[i] = temp; // In the array is store the valid mark
            
            }
        //Showed user marks
        System.out.println("Entered marks"); //Is the header for marks put on view
        for(int i=0; i<numberOfStudents; i++){ //create variable "j" as a counter, the next condition is a loop's condition, finally is a increment the value of "j" by 1 after each iteration.
            System.out.println(mark[i]); //The mark of each student is printed
            
        }
        
        //Calculate of mean (average)
        float total = 0; // The variable total is initialize in cero and defined as float
        for(int j = 0; j<numberOfStudents; j++){ //create variable "j" as a counter, the next condition is a loop's condition, finally is a increment the value of "j" by 1 after each iteration.
            total = total + mark[j]; // Add the mark of the current student to "total"
        
        }
        float mean;//Declare a variable "mean" to store the average of the marks
        mean = total / numberOfStudents; //Calculate the mean 
        
        float totalsumdiff =0; //Initialize totalsumdiff to 0
        for(int t = 0; t<numberOfStudents; t++){ //Create a counter t and a loop through all students
            totalsumdiff = totalsumdiff + (mark[t]-mean)*(mark[t]-mean)/numberOfStudents;//Calculate the squared difference from the mean for each mark, then accumulate.
        
        }
        
        float standardDeviation; //Declare the variable standardDeviation as float
        standardDeviation = (float) Math.sqrt(totalsumdiff / (numberOfStudents-1));//Calculate standard deviation
        
        System.out.println("\nAssignment Name: "+ assignmentName); //The assignment name is printed
        System.out.println("The mean value of total Mark is: " + mean); //The mean value is printed
        System.out.println("Standard Deviation: "+ standardDeviation); //The minimun value is printed
        
    }
}
