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
        LocalDate  cOut=LocalDate.parse(bookLysanderobj.getCheckOutDate());


        int noOfDays =cOut.getDayOfYear()-cIn.getDayOfYear();
        int totCharge;

        switch (packageId*roomTypeId){
            case 5:
                totCharge=8000;
                break;
            case 6:
                totCharge=11000;
                break;
            case 7:
                totCharge=15000;
                break;
            case 10:
                totCharge=14000;
                break;
            case 12:
                totCharge=19000;
                break;
            case 14:
                totCharge=24000;
                break;
            case 15:
                totCharge=18000;
                break;
            case 18:
                totCharge=26000;
                break;
            case 21:
                totCharge=32000;
                break;
            default:
                totCharge=40000;
        }

        totCharge= (int) (((totCharge*0.5)*kidsCount)+(totCharge*adultCount));
        totCharge=totCharge*noOfDays;
        System.out.println("Booking cost: "+totCharge);
        return totCharge;
    }
}
