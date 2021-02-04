package com.flysaa.people;

import java.util.ArrayList;

public class Employee extends Person {


private double salary;
private String position;
private String userName;
private int password;



public double getSalary () {
return salary;
}
public void setSalary (double salary){
this.salary = salary;
}


public String getPosition () {
return position;
}
public void setPosition (String position){
this.position = position;
}

public String getUserName(){
return userName;
}
public void setUserName(String userName){
this.userName = userName;
}

public int getPassword () {
return password;
}
public void setPassword(int password) { 
this.password = password;
}
      public void register (String surname, String lastName, String position, double salary, String cellPhoneNumber, String dateOfBirth, long idNumber, String nationality, String emailAddress, String userName, int password) {

this.setSurname(surname);
this.setLastName(lastName);
this.setPosition(position);
this.setSalary(salary);
this.setCellPhoneNumber(cellPhoneNumber);
this.setDateOfBirth(dateOfBirth);
this.setIdNumber(idNumber);
this.setNationality(nationality);
this.setEmailAddress(emailAddress);
this.setUserName(userName);
this.setPassword(password);

}

     public void display () {
System.out.println("Surname: " + getSurname());
System.out.println("Last Name: " + getLastName());
System.out.println("Position: " + getPosition());
System.out.println("Salary: " + getSalary());
System.out.println("Cell Phone Number: " + getCellPhoneNumber());
System.out.println("Date Of Birth: " + getDateOfBirth());
System.out.println("IdNumber: " + getIdNumber());
System.out.println("Nationality: " + getNationality());
System.out.println("Email Address: " + getEmailAddress());
System.out.println("User Name: " + getUserName());
System.out.println("Password: " + getPassword());                                        

}//end of display method.

public String toString(){
   return "Emoployee Surname: " + getSurname() + ",Last Name: " + getLastName() + ",Position: " + getPosition() + ",Salary: " + getSalary() + ",CellPhone Number: " + getCellPhoneNumber() + ",Date Of Birth: " + getDateOfBirth() + ",Id Number: " + getIdNumber() + ",Nationality: " + getNationality() + ",Email Address: " + getEmailAddress() + ",User Name: " + getUserName() + "Password: " + getPassword();

}//end of toString method.



}

