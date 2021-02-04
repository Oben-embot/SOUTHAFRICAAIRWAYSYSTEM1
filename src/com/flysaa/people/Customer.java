package com.flysaa.people;

import java.util.ArrayList;
import java.time.ZonedDateTime;
import com.flysaa.transaction.Payment;
import com.flysaa.airway.FlightTicket;
import com.flysaa.airway.Flight;

      public class Customer extends Person {
            
            private int numberOfTickets;
            private int emergencyContacts;
            private int pinCode;
            public FlightTicket ticket;
            public Flight flight;
            public Payment payment;

     public Customer () {
            }

            public int getNumberOfTickets() {
            return numberOfTickets;
           }
            public void setNumberOfTickets(int numberOfTickets){
            this.numberOfTickets = numberOfTickets;
           }

            public int getEmergencyContacts () {
            return emergencyContacts;
           }
            public void setEmergencyContacts (int emergencyContacts) {
            this.emergencyContacts = emergencyContacts; 
            }

            public int getPinCode(){
            return pinCode;
           }            
            public void setPinCode(int pinCode){
            this.pinCode = pinCode;
           }
 
              public void bookTicket(FlightTicket ticket, ArrayList<Flight> flights, int num, String surname, String lastName, String cellPhoneNumber, String dateOfBirth,                                                                     long idNumber, String nationality, String emailAddress, int numberOfTickets, int ticketEmergencyContacts, int pinCode, int flightFlightNo, String flightFlightName, String flightFrom, String flightTo, ZonedDateTime flightDepartureDate, ZonedDateTime flightArrivalDate, int ticketTicketNo, int ticketSeatNo, String ticketType) { 

             this.setSurname(surname);
             this.setLastName(lastName);
             this.setCellPhoneNumber(cellPhoneNumber);
             this.setDateOfBirth(dateOfBirth);
             this.setIdNumber(idNumber);
             this.setNationality(nationality);
             this.setEmailAddress(emailAddress);
             this.setNumberOfTickets(numberOfTickets);
             this.setEmergencyContacts(emergencyContacts);
		     this.setPinCode(pinCode);

        Flight flight = flights.get(num);
		
        flight.setFlightNo(flight.getFlightNo());
        flight.setFlightName(flight.getFlightName());
        flight.setFrom(flight.getFrom());
        flight.setTo(flight.getTo());
        flight.setDepartureDate(flight.getDepartureDate());
		flight.setArrivalDate(flight.getArrivalDate());
             ticket.setTicketNo(ticketTicketNo);
             ticket.setSeatNo(ticketSeatNo);
             ticket.setType(ticketType);

          if(ticketType.equals("economy")) {
             ticket.setPrice(1000.0);
            }else if(ticketType.equals("business")) {
             ticket.setPrice(2000.0);
            }else{
             if(ticketType.equals("firstClass")) {
             ticket.setPrice(4000.0);
            }//end of if block
        }//end of else block


    }//end ofregister method

              public static void availableSeats(ArrayList<Integer> seats) {
                     System.out.println("=====Available Seats=====");
                     for(int a = 0; a < seats.size(); a++){
                         if(seats.get(a) != 0){
                           System.out.print(seats.get(a) + " / s");
                            
            }//end of if block
       }//end of foor loop
 }//end of method

             public static String selectSeatNumber(ArrayList<Integer> seats, FlightTicket ticket, int seatNo){
                  for(int a = 0; a < seats.size(); a++){ 
                   if(seats.get(seatNo - 1) != 0){
                     ticket.setSeatNo(seatNo);
                      // seats(seatNo - 1) = 0;
                 break;
                         }else{
                               return "Seat already taken";
                          }//end of else block
                  }//end of for loop
                          return null;
                  }//end of method


             public void display () {
             System.out.println("========Customer Details========");
             System.out.println("Surname:" + this.getSurname());
             System.out.println("Last Name: " + this.getLastName());
             System.out.println("Cell Phone Number: " + this.getCellPhoneNumber());
             System.out.println("Date Of Birth: " + this.getDateOfBirth());
             System.out.println("Id Number: " + this.getIdNumber());
             System.out.println("Ticket Number: " + this.getNumberOfTickets());
             System.out.println("Emergency Contacts: " + this.getEmergencyContacts());
             System.out.println("Pin Code: " + this.getPinCode());
             System.out.println("Destination: " + ticket.getDestination());
             System.out.println("Ticket Number: " + ticket.getTicketNo());
             System.out.println("SeatNo: " + ticket.getSeatNo());
             System.out.println("Price: " + ticket.getPrice());
             System.out.println("Type: " + ticket.getType());

        }//end of display method

             

             public void cancelTicket(ArrayList<Customer> customers, int idNumber) {
             for(int i = 0; i < customers.size(); i++) {
             if(idNumber == customers.get(i).getIdNumber()) {
             System.out.println("Ticket successfully cancelled.");

                  break;
            }else{
             System.out.println("Incorrect idNumber.");
          }//end of else block

    }//end of for loop
}//end of cancel method



            public void checkin(ArrayList<Customer> customers, long idNumber) {
            for (int i = 0; i < customers.size(); i++) {//it gives the total length of the array & 
            if(idNumber == customers.get(i).getIdNumber()) {//compare id number with the one in the customers array
            System.out.println("Checkin successful.");
           break;//to break out from the loop if the condition is true
          }else{
           System.out.println("Checkin unsuccessful.");
         }//end of else block
      }//end of for loop
}//end of check method

            public void displayCustomersInAFlight(FlightTicket ticket, ArrayList<Customer> customers, int ticketNumber){      
                        for(int b = 0; b < customers.size(); b++){
                           if(customers.get(b) != null){
                            if(customers.get(b).ticket.getTicketNo() == ticketNumber){
                           System.out.println("LastName: " + customers.get(b).getLastName());
                           System.out.println("Pin Code: " + customers.get(b).getPinCode());
                                break;
                          }else{
                                System.out.println("Customer not Found.");
                      }//end of else block
                  }//end of first if block
               }//end of for loop
           }//end of method

             public String toString(){
                    return "Customer\nSurname: " + getSurname() + "\nLastName: " + getLastName() + "\nCell Phone Number: " + getCellPhoneNumber() + "\nDate Of Birth: " + getDateOfBirth() + "\nId Number: " + getIdNumber() + "\nNumber Of Tickets: " + getNumberOfTickets() + "\nEmmergency Contacts: " + getEmergencyContacts() + "\nPinCode: " + getPinCode() + "\nTicket Number: " + ticket.getTicketNo() + "\nSeat Number: " + ticket.getSeatNo() + "\nPrice: " + ticket.getPrice() + "\nType: " + ticket.getType();
      
             }//end of toString method.


     }//end of class
