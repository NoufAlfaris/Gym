import java.util.*;
public class Gym{


public static void main(String[] args){
Scanner input = new Scanner(System.in);
FitnessCourse f1 = new FitnessCourse("swimming", 15);
FitnessCourse f2 = new FitnessCourse("boxing", 10);
FitnessCourse f3 = new FitnessCourse("yoga", 6);

Trainee t1 = new Trainee("Maha Saad", 60, 'F');
Trainee t2 = new Trainee ("Malak Ali", 52, 'F');
Trainee t3 = new Trainee ("Hala Mohammed", 88, 'F');
if(f1.addTrainee(t1))
System.out.println("The trainee is added succesufully to " + f1.getName());
else
System.out.println("cannot add trainee");

if(f1.addTrainee(t2))
System.out.println("The trainee is added succesufully to " + f1.getName());
else
System.out.println("cannot add trainee");

if(f1.addTrainee(t3))
System.out.println("The trainee is added succesufully to " + f1.getName());
else
System.out.println("cannot add trainee");

f1.display();

double swimmingTotal = f1.calculateIncome();
System.out.println("The income for swimming course is " + swimmingTotal);


System.out.println("Enter info for the boxing trainee");
System.out.println("Name:");
String boxingName = input.nextLine();
System.out.println("weight:");
double boxingWeight = input.nextDouble();
System.out.println("sex:");
char boxingSex = input.next().charAt(0);
while(boxingSex!='F' && boxingSex!='M'){
System.out.println("wrong entry it should be M or F try again");
boxingSex = input.next().charAt(0);
}

Trainee t4 = new Trainee(boxingName, boxingWeight, boxingSex);

if(f2.addTrainee(t4))
System.out.println("The trainee is added succesufully to " + f2.getName());
else
System.out.println("cannot add trainee");

f2.display();

Trainee t5 = new Trainee("Gus Fring", 77, 'M');
Trainee t6 = new Trainee ("Kim Wex", 59, 'F');

if(f3.addTrainee(t5))
System.out.println("The trainee is added succesufully to " + f3.getName());
else
System.out.println("cannot add trainee");

if(f3.addTrainee(t6))
System.out.println("The trainee is added succesufully to " + f3.getName());
else
System.out.println("cannot add trainee");

f3.display();


if(f3.addTrainee(t6))
System.out.println("The trainee is added succesufully to " + f3.getName());
else
System.out.println("cannot add trainee");

System.out.println("Number Of female members: " + Trainee.numOfFemale);

System.out.println("total income of f2 and f3 is "+ calcuTotalIncome(f2,f3));
}//end main


public static double calcuTotalIncome(FitnessCourse fc1, FitnessCourse fc2){

double totalIncome = fc1.calculateIncome() + fc2.calculateIncome();
return totalIncome;
}
}