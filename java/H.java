import java.util.*;

class Hotel{
    String hname;
    double roomrent;
    
    // void Hotel(String hname, double roomrent){
    //     this.hname = hname;
    //     this.roomrent = roomrent;
    // }

    void display(){
        System.out.println("Hotel name : " + hname);
        System.out.println("RoomRent : " + roomrent);
    }
}


class Customer extends Hotel{
    String cname;
    int days;
    String roomtype;
    double superCharge;
    double amt;

    // void Customer(String hname, double roomrent){
    //     this.hname = hname;
    //     this.roomrent = roomrent;
    // }
    void compute(){
        if(roomtype == "Executive"){
            superCharge = roomrent * (0.1);
            amt = superCharge * days;
        }else if(roomtype == "Suite"){
            superCharge = roomrent * (0.2);
            amt = superCharge * days;
        }
    }
    void show(){
        System.out.println("Hotel name : " + hname);
        System.out.println("Customer name : " + cname);
        System.out.println("Roomtype : " + roomrent);
        System.out.println("Roomtype : " + roomtype);
        System.out.println("No. of days : " + days);
        System.out.println("Total Amount : " + amt);
    }
}




public class H{
    public static void main(String args[]){
        System.out.println("");
        Customer cus = new Customer();

        cus.cname = "Shlok";
        cus.hname = "";
        cus.days = 7;
        cus.roomrent = 1000.0;
        cus.roomtype = "Executive";
        cus.show();
    }
}