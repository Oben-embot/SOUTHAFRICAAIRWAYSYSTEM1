package com.flysaa.app;

import java.util.ArrayList;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;
import com.flysaa.people.Customer;
import com.flysaa.people.Employee;
import com.flysaa.people.Person;
import com.flysaa.airway.FlightTicket;
import com.flysaa.airway.Flight;
import com.flysaa.transaction.Payment;

                   public class Application {//class

                   Application () {// constructor same as the class name

                  }//end of construtor

                   //static int post = 0;//a static variable for the employee object & zero been asign to it
                   public static void main(String[] args) {
                   Scanner scan = new Scanner(System.in);//to ask input from the user

                   ArrayList<Integer> seats =  new ArrayList<Integer>(15);//an array of seats
                   ArrayList<Employee> employees = new ArrayList<Employee>();//an array of employee of length 4
                   ArrayList<Customer> customers = new ArrayList<Customer>();// array of customer of length 4
                   ArrayList<Flight> flights = new ArrayList<Flight>();//array of flights of length 4

                   Employee employee = null;
                   Customer customer = null;//we used null for each so that we dont get to create so many objects each time 
                   FlightTicket ticket = null;
                   Flight flight = null;
                   ZonedDateTime departureDate = null;
                   ZonedDateTime arrivalDate = null;

                   for(int a = 0; a < 50; a++) {
                  // int add = 0;
                   int option = 0;//for the variable to be vinsible out of the for block
                   for(;;){ //this type of for loop is always true
                   scan.nextLine();//to privent the program from mis behaving after compiliation

                  try{
                  System.out.println("======Welcom to flysaa======");
                  System.out.println("Select from the options below. ");
                  System.out.println("1. To register: ");
                  System.out.println("2. To login: ");

                  option = scan.nextInt();

                  break;//to from the try block
                  }catch(Exception ex){ // if an exception occur its gox to be caught here for our code to cratch gracefully

                  System.out.println("Select from option below.");
                 }//end of catch block
              }// for the for loop before the try block

                  switch(option) {
                case 1:
                  System.out.println("Option register");
                  employee = new Employee();
                  System.out.println("\nFor Employee to Register: ");
                  scan.nextLine();
                  System.out.println("Enter surname: ");
                  String surname = scan.nextLine();
                  System.out.println("Enter lastName: ");
                  String lastName = scan.nextLine();
                  System.out.println("Enter position: ");
                  String position = scan.nextLine();
                   double salary = 0;
              for(;;){
                scan.nextLine();
                try{
                  System.out.println("Enter salary: ");
                 salary = scan.nextDouble();
                break;
             }catch(Exception ex){
                           System.out.println("Enyter slaray: ");
                       }
              } 
                  scan.nextLine();
                  System.out.println("Enter cellPhoneNumber: ");
                  String cellPhoneNumber = scan.nextLine();
                  System.out.println("Enter date of birth: ");
                  String dateOfBirth = scan.nextLine();
                  long idNumber = 0;
               for(;;){
                  scan.nextLine();
                        try{
                  System.out.println("Enter idNumber: ");
                   idNumber = scan.nextLong();
                     break;
                  }catch(Exception ex){
                    System.out.println("Enter idNumber: ");
              }//end of catch block
         }//end of infinite loop
                  scan.nextLine();
                  System.out.println("Enter your nationality: ");
                  String nationality = scan.nextLine();
                  System.out.println("Enter your emailAddress: ");
                  String emailAddress = scan.nextLine();
                  System.out.println("Enter userName: ");
                  String userName = scan.nextLine();
                      int password = 0;
               for(;;){
                      scan.nextLine();
                      try{
                  System.out.println("Enter password: ");
                  password = scan.nextInt();
                     break;
               }catch(Exception ex){
                     System.out.println("Enter password: ");
           }//end of catch block
       }//end of infinite loop
                  employee.register(surname, lastName, position, salary, cellPhoneNumber, dateOfBirth, idNumber, nationality, emailAddress, userName, password);
                 employees.add(employee);//assign the reference of employee to the array(position of post)
                  System.out.println(employee);
                   // post++;//to incriment the number by 1 each time an employee register
                 System.out.println("----------------------------");
                 System.out.println();
              employee.display();//the display method is being called
                         System.out.println();//to create space
                 break;//to break from reading case one immediately

               case 2:
                    for (int k = 0; k < 100; k++) {
                    String userName1 = null;//for the variabe to be vincible out of the for block
                    int password1 = 0;//for the variable to be vincible out of the for block

                            for(;;) {//this type of for loop is always true
                                  scan.nextLine();//to privent the loop from repeating itself multiple times
                                    try{//what we want to monitor is within the try block
                              System.out.println(" Option login");
                              System.out.println("\nFor Employee to Login. ");

                              System.out.println ("Enter userName: ");
                              userName1 = scan.nextLine();
                               System.out.println("Enter password: ");
                                password1 = scan.nextInt();
                                         break;//to bring from the try block
                                }catch(Exception ex){//catch block is for are code to cratch gracefully instead of violently
                                  System.out.println("Incorrect userName or password. Please try again.");
                          }//end of catch block
                     }//end of loop before the try block
                   for (int c = 0; c < employees.size(); c++) {
                   if(userName1.equals(employees.get(c).getUserName()) && password1 == employees.get(c).getPassword()) {

                     System.out.println("login successfull");

                      int abc = 0;//a variable call abc of type and zero assigned to it 
                      for (int b = 0; b < 60; b++) {
                   int choice = 0;
                      for(;;){//this type of for loop(infinite loop) is always true
                       scan.nextLine();
                      try{
                       System.out.println("                  Select from the option below");
                       System.out.println("                        1. Add flight: ");
                       System.out.println("                        2. To Book ticket: ");
                       System.out.println("                        3. To Checkin: ");
                       System.out.println("                        4. To Exit. ");
                       System.out.println("                        5. To Cancel Ticket.");
                       System.out.println("                        6. To Customers in A Particular Flight.");

                          choice = scan.nextInt();
                      break;//to exit from the try block
                    }catch(Exception ex){
                       System.out.println("Select from the option below");
                 }//end of catch block
        }//end of for loop before the try block

                        switch (choice) {
                           case 1:
                              flight = new Flight();
                            System.out.println("=========Option to Add flight=========");
                                   int flightNo = 0;
                            for(;;){//an in finite loop that is always true
                                   scan.nextLine();
                                   try{//try block
                            System.out.println("Enter flight number: ");
                                 flightNo = scan.nextInt();
                            break;//break out from the try block
                       }catch(Exception ex){
                             System.out.println("Enter Flight Number: ");
                    }//end of catch block     
            }//end of for loop
                            System.out.println("Enter flight name: ");
                            String flightName = scan.nextLine();
                            scan.nextLine();
                            System.out.println("flight From: ");
                            String from = scan.nextLine();
                            System.out.println("flight To: ");
                            String to = scan.nextLine();
                          
                            System.out.println("\nEnter for Destination: ");
                                  int year = 0;
                          for(;;){//infinite loop
                                  scan.nextLine();
                                  try{//try block
                            System.out.println("Enter the Year: ");
                                year = scan.nextInt();
                                   break;
                           }catch(Exception ex){
                                  System.out.println("Enter the Year: ");
                          }//end of catch block
                  }//end of the infinite loopt
                           
                          int month = 0;
                            for(;;){//for loop
                                   scan.nextLine();
                                   try{//try block
                            System.out.println("Enter the Month: ");
                                  month = scan.nextInt();
                            break;
                       }catch(Exception ex){
                           System.out.println("Enter the Month: ");
                       }//end of catch block
                }//end of inifite loop
                   
                                      int dayOfMonth = 0;
                               for(;;){//for loop
                                   scan.nextLine();
                                   try{//try block
                            System.out.println("Enter the day of Month: ");
                                dayOfMonth = scan.nextInt();
                                      break;
                               }catch(Exception ex){
                                 System.out.println("Enter the day of Month: ");
                            }//end of catch block
                       }//end of loop

                                         int hour = 0;
                                 for(;;){//for loop
                                   scan.nextLine();
                                   try{//try block
                           System.out.println("Enter the Hours: ");
                               hour = scan.nextInt();
                                break;
                         }catch(Exception ex){
                                System.out.println("Enter the Hours: ");
                       }//end of catch block
                   }//end of for loop

                                         int minute = 0;
                                 for(;;){//for loop
                                   scan.nextLine();
                                   try{//try block
                            System.out.println("Enter the minutes: ");
                                minute = scan.nextInt();
                                    break;
                        }catch(Exception ex){
                               System.out.println("Enter the minutes: ");
                          }//end of catch block
                   }//end of for loop

                                         int second = 0;
                                 for(;;){//for loop
                                   scan.nextLine();
                                   try{//try block
                            System.out.println("Enter the second: ");
                                second = scan.nextInt();
                                     break;
                         }catch(Exception ex){
                                System.out.println("Enter the second: ");
                     }//end of catch block
                   }//end of for loop

                                        int nanoOfSecond = 0;
                                 for(;;){//for loop
                                   scan.nextLine();
                                   try{//try block
                            System.out.println("Enter nano of second: ");
                               nanoOfSecond = scan.nextInt();
                                break;
                         }catch(Exception ex){
                          System.out.println("Enter nano of second: ");
                         }//end of catch block
                     }//end of loop
                            scan.nextLine();
                            System.out.println("Enter the Continent: ");
                            String continent = scan.nextLine();
                            System.out.println("Enter the city: ");
                            String city = scan.nextLine();
                          
  departureDate  = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, ZoneId.of(continent + "/" + city));
                                 System.out.println("Departure date: " + departureDate);   

                             System.out.println("\nEnter for Arrival : ");
                            System.out.println("Enter the Year: ");
                             year = scan.nextInt();
                            System.out.println("Enter the Month: ");
                             month = scan.nextInt();
                            System.out.println("Enter the day of Month: ");
                             dayOfMonth = scan.nextInt();
                            System.out.println("Enter the Hours: ");
                            hour = scan.nextInt();
                            System.out.println("Enter the minutes: ");
                             minute = scan.nextInt();
                            System.out.println("Enter the second: ");
                             second = scan.nextInt();
                            System.out.println("Enter nano of second: ");
                             nanoOfSecond = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter the Continent: ");
                             continent = scan.nextLine();
                            System.out.println("Enter the city: ");
                              city = scan.nextLine();
                             
       arrivalDate = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, ZoneId.of(continent + "/" + city));
                           System.out.println("arrival date:" + arrivalDate); 
                           System.out.println(" ");
                           flight.addFlight(flightNo, flightName, from, to, departureDate, arrivalDate);
                           flights.add(flight);
                           System.out.println(flight);
                        flight.display();
                           break;
 
                     case 2:
                          customer = new Customer();//customer object
                          ticket = new FlightTicket();//flightTicket object
                          flight = new Flight();//flight object
                          customer.ticket = ticket;//we want to make use of ticket from the flightTicket class inside the customer class
                         
                           System.out.println("======To book ticket======");
                         
                           System.out.println("Enter surname: ");
                           String ticketSurname =  scan.nextLine();
                           scan.nextLine();
                           System.out.println("Enter lastName: ");
                           String ticketLastName = scan.nextLine();
                           System.out.println("Enter cellPhoneNumber: ");
                           scan.nextLine();
                           String ticketCellPhoneNumber = scan.nextLine();
                           System.out.println("Enter date of birth: ");
                           String ticketDateOfBirth = scan.nextLine();
                                  long ticketIdNumber = 0;
                  for(;;){
                          scan.nextLine();
                           try{
                           System.out.println("Enter idNumber: ");
                              ticketIdNumber = scan.nextLong();
                            break;
                    }catch(Exception ex){
                           System.out.println("Enter idNumber: ");
                  }//end of catch bloop
              }//end of infinite loop
                           System.out.println("Enter your nationality: ");
                           String ticketNationality = scan.nextLine();
                           scan.nextLine();
                           System.out.println("Enter emailAddress: ");
                           String ticketEmailAddress = scan.nextLine();
                                  int ticketNumberOfTickets = 0;
                 for(;;){
                       scan.nextLine();
                        try{
                           System.out.println("Enter Number Of Tickets: ");
                               ticketNumberOfTickets = scan.nextInt();
                           break;
                     }catch(Exception ex){
                            System.out.println("Enter Number Of Tickets: ");
             }//end of catch block
      }//end of inifite loop
                                   int ticketEmergencyContacts = 0;
                  for(;;){
                         scan.nextLine();
                         try{
                           System.out.println("Enter emergency contacts: ");
                            ticketEmergencyContacts = scan.nextInt();
                             break;
                     }catch(Exception ex){
                            System.out.println("Enter emergency contacts: ");
                }//end of catch block
         }//end of infinite loo

                                  int pinCode = 0;
                            for(;;){
                                  scan.nextLine();
                                  try{
                      System.out.println("Enter Pin Code: ");
                            pinCode = scan.nextInt();
                              break;
                         }catch(Exception ex){
                                 System.out.println("Enter Pin Code: ");
                           }//end of catch block
                        }//end of loop 

                              int num = 0;
                      for(;;){
                             scan.nextLine();
                             try{
                      num = scan.nextInt();
                        break;
                 }catch(Exception ex){
                     System.out.println("Enter Flight Number: ");
                }//end of catch block
            }//end of for loop         
                          flight.aviableFlight(flights);
  
                               System.out.println("======Choose from the Aviable Flights======");  
                                  System.out.println();//to create space
                        
                               System.out.println("Enter number: ");
                                num = scan.nextInt();
                               int flightFlightNo = flights.get(num).getFlightNo();
                               flightName = flights.get(num).getFlightName();
                               from = flights.get(num).getFrom();
                               to = flights.get(num).getTo();
                               ZonedDateTime departuredate = flights.get(num).getDepartureDate();
                               arrivalDate = flights.get(num).getArrivalDate();
                                
                              System.out.println("Enter Ticket Number: ");
                               int ticketNo = scan.nextInt();
                                
                                     int ticketSeatNo = 0;                                     
                                      for (int i = 0; i < 20; i++) {
                                 customer.availableSeats(seats);
                           for(;;){
                                   scan.nextLine();
                             try{     
                                   System.out.println("Select seat number: ");
                                     ticketSeatNo = scan.nextInt();
                                       break;//To exit fron the from the loop when the codition is true
                                   }catch(Exception ex){
                                         System.out.print("Select seat number: ");
                                   }
                         }
                                       String result = customer.selectSeatNumber(seats, ticket, ticketSeatNo);
                              if(result != null){
                                 System.err.println(result);
                                  continue;
                        }
                                    System.out.println("After continue: ");
                              break;
               }

                              
                        String type = null;
                            int list = 0;//for this variable to be vinsible out of the block
                            for(;;) {//this type of for loop is always true
                                    scan.nextLine();
                                try{

                           System.out.println ("\n            Select from the type below:");
                           System.out.println ("1.            economy");
                           System.out.println ("2.            business");
                           System.out.println ("3.            firstClass");

                          break;//to bring from the try block
                       }catch(Exception ex) {
                          System.out.println("Select from the numbers below: ");
                   }//end of catch block
           }//end of the for loop before the try block
                               list = scan.nextInt();
                       switch(list) {
                    case 1:
                         type = "economy";
                     break;

                   case 2:
                        type = "business";
                     break;

                    case 3:
                         type = "firstClass";
                     break;//to break after reading the three types
           } //end of switch for ticket type
              
      customer.bookTicket(ticket, flights, num, ticketSurname, ticketLastName, ticketCellPhoneNumber, ticketDateOfBirth, ticketIdNumber, ticketNationality, ticketEmailAddress, ticketNumberOfTickets, ticketEmergencyContacts, pinCode, flights.get(num).getFlightNo(), flights.get(num).getFlightName(), flights.get(num).getFrom(), flights.get(num).getTo(), flights.get(num).getDepartureDate(), flights.get(num).getArrivalDate(), ticketNo, ticketSeatNo, type);

           customers.add(customer); 
                    System.out.println(customer);
        customer.display();
       // flight.display();                          
           
           c = 90;
          System.out.println("price: " + ticket.getPrice());
          System.out.println("Ticket booked Successfull");
          //System.out.println(customer.toString());
        break;

              case 3:
                   System.out.println("=====For Customer to be Checked in=====");
                   long idNumber1 = 0;
                   for(;;){
                   scan.nextLine();
                try{
                   System.out.println("Enter idNumber: ");
                  idNumber1 = scan.nextLong();
                break;//to break from the try block
             }catch(Exception ex){
                  System.out.println("Enter idNumber: ");
       }//end of catch block
  }//end of for loop before the try block
                   customer.checkin(customers, idNumber1);
               break;

                        case 4:
                             System.out.println("=====Option To Exit=====");
                             System.exit(0);
                         break;//to break after after exitting

                        case 5:
                             System.out.println("=====Option To Cancel Your Ticket=====");
                             int ticIdNumber = 0;// for the variable to be vensible out of the for block
                             for(;;){
                             scan.nextLine();
                          try{
                              System.out.println("Enter ticket idnumber: ");
                              ticIdNumber = scan.nextInt();

                                   customer.cancelTicket(customers, ticIdNumber);
                           break;//to break from the try block
                         }catch(Exception ex){
                                System.out.println("Enter ticket idNumber: ");
                     }//end of the catch block
             }//end of for loop before the try block
                    
                    break;

                            case 6:
                                   System.out.println("=====Display Customers In This Flight=====");
                                   int ticketNumber = 0;
                                   for(;;){
                                    scan.nextLine();
                                 try{
                                   System.out.println("Enetr Flight Number: ");
                                    ticketNumber = scan.nextInt();
                                      break;
                                   }catch(Exception ex){
                                          System.out.println("Enter Flight Number: ");
                                         }//end of catch block
                              }//end of infinite loop
                           customer.displayCustomersInAFlight(ticket, customers, ticketNumber);
                                 break; 
                        
                             default :
                                   System.out.println(" Option not found");
        }//end of inner switch or login switch

}//end of inner loop


                   }else {
                                    System.out.println("login unsuccessfull");
break;
          }//login ends heres

       }
    }// main loop in login

                       break;

                   }// first switch

            }//end of main loop

         }//end of main method
  }//end of class
