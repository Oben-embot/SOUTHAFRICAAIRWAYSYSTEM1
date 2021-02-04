package com.flysaa.people;

public class Person {
public Person () {
}

private String surname;
private String lastName;
private String cellPhoneNumber;
private String dateOfBirth;
private long idNumber;
private String nationality;
private String emailAddress;


public String getSurname () {
return surname;
}
public void setSurname (String surname) { 
this.surname = surname;
}
public String getLastName () {
return lastName;
}
public void setLastName (String lasName) {
this.lastName = lasName;
}

public String getCellPhoneNumber () {
return cellPhoneNumber;
}
public void setCellPhoneNumber(String cellPhoneNumber) {
this.cellPhoneNumber = cellPhoneNumber;
}

public String getDateOfBirth () {
return dateOfBirth ;
}
public void setDateOfBirth(String dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public long getIdNumber() {
return idNumber;
}
public void setIdNumber(long idNumber) {
this.idNumber = idNumber;
}

public String getNationality () {
return nationality;
}
public void setNationality(String nationality) {
this.nationality = nationality;
}

public String getEmailAddress () {
return emailAddress ;
}
public void setEmailAddress (String emailAddress) {
this.emailAddress = emailAddress;
}



}












