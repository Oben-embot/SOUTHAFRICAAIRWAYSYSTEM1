package com.flysaa.airway;

public class FlightTicket {

      private int ticketNo;
      private String destination;
      private int seatNo;
      private double price;
      private String type;


      public int getTicketNo(){
      return ticketNo;
    }
      public void setTicketNo(int ticketNo){
      this.ticketNo = ticketNo;
    }

      public String getDestination () {
      return destination;
    }
      public void setDestination (String destination) {
      this.destination = destination;
    }

    public int getSeatNo () {
    return seatNo;
    }
    public void setSeatNo (int seatNo){
    this.seatNo = seatNo;
    }

     public double getPrice() {
     return price;
    }
     public void setPrice (double price) {
     this.price = price;
    }

     public String getType () {
     return type;
    }
     public void setType (String type) {
     this.type = type;
    }     


}
