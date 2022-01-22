package Bill;
import Model.bookInLysanderModel;
public class BillCalc {

    public int finalcharge(bookInLysanderModel bookLysanderobj){

        int packageId=Integer.parseInt(bookLysanderobj.getPackages());
        int roomTypeId=Integer.parseInt(bookLysanderobj.getRoomType());
        int kidsCount=Integer.parseInt(bookLysanderobj.getKidsCount());
        int adultCount=Integer.parseInt(bookLysanderobj.getAdultsCount());
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
                totCharge=50000;
        }
        totCharge= (int) (((totCharge*0.5)*kidsCount)+(totCharge*adultCount));
        System.out.println("Booking cost: "+totCharge);
        return 0;
    }
}
