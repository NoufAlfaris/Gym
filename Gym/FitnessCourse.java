public class FitnessCourse{

private String name;
private int num;
private int numOfOW;
private String members; 
private int capacity;

public FitnessCourse(String n, int capa){

name = n;
capacity = capa;
numOfOW = 0;
num=0;
members = "";

}

public boolean addTrainee(Trainee t){
boolean canAdd = false;
if(!isMember(t) && !isFull()){
canAdd=true;
members += t.getName() + "_";
num++;
if(t.getWeight()>80)
numOfOW++;
}
return canAdd;
}

public boolean isMember(Trainee t){
boolean isMember = false;
int memberName = members.indexOf(t.getName());
if(memberName!=-1)
isMember = true;

return isMember;
}

public boolean isFull(){
boolean isFull = false;
if(num == capacity)
isFull = true;

return isFull;

}

public double calculateIncome(){
double totalCost = 0;
switch(name){
case "swimming": 
totalCost = (num*100) - (numOfOW*100*0.5);
break;
case "boxing":
totalCost = (num*120) - (numOfOW*120*0.5);
break;
case "yoga":
totalCost = (num*170) - (numOfOW*170*0.5);
break;
}
return totalCost;
}

public void display(){

System.out.printf("Name: %20s%n",name);
System.out.printf("Capacity: %10d%n", capacity);
System.out.println("Trainee name:");
System.out.print(members.replace('_','\n'));
if(isFull())
System.out.println("Availability: The course is full");
else
System.out.println("Availability: you can book this course");
System.out.println("**************************************");
}

public String getName(){
return name;
}


}