public class Trainee{

private String name;
private double weight;
private char sex;
private String courseName;
public static int numOfFemale;

public Trainee(String name, double w, char sex){
this.name = name;
weight = Math.abs(w);
this.sex = sex;
if(sex =='F')
numOfFemale++;
courseName = "";
}

public String getName(){
return name;
}

public double getWeight(){
return weight;
}

}