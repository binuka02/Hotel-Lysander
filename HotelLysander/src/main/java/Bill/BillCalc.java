package Bill;
import Model.bookInLysanderModel;

import java.time.LocalDate;

public class BillCalc {

    public int finalcharge(bookInLysanderModel bookLysanderobj){

        int packageId=Integer.parseInt(bookLysanderobj.getPackages());
        int roomTypeId=Integer.parseInt(bookLysanderobj.getRoomType());
        int kidsCount=Integer.parseInt(bookLysanderobj.getKidsCount());
        int adultCount=Integer.parseInt(bookLysanderobj.getAdultsCount());

        LocalDate cIn=LocalDate.parse(bookLysanderobj.getCheckInDate());
        LocalDate cOut=LocalDate.parse(bookLysanderobj.getCheckOutDate());


        int noOfDays =cOut.getDayOfYear()-cIn.getDayOfYear();
        int totCharge;

        switch (packageId*roomTypeId){
            case 5:

                totCharge=80;
                break;
            case 6:
                totCharge=110;
                break;
            case 7:
                totCharge=150;
                break;
            case 10:
                totCharge=140;
                break;
            case 12:
                totCharge=190;
                break;
            case 14:
                totCharge=240;
                break;
            case 15:
                totCharge=180;
                break;
            case 18:
                totCharge=260;
                break;
            case 21:
                totCharge=320;
                break;
            default:
                totCharge=400;
        }

        totCharge= (int) (((totCharge*0.5)*kidsCount)+(totCharge*adultCount));
        totCharge=totCharge*noOfDays;
        System.out.println("Booking cost: "+totCharge);
        return totCharge;
    }
}
