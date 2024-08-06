package Z_Java_Day_to_Day.day_16_switch;

public class NumberOfBedrooms {
    public static void main(String []args){
        int numberOfBedrooms = 12222;
        System.out.println("###### Welcome To Abu skr skr Apartments ######");
        switch (numberOfBedrooms){
            case 0:
                System.out.println(" Studio Apartment Selected ");
                System.out.println(" Starting Price --- 1454 $ ");
            break;
            case 1:
                System.out.println(" One Bedroom Apartment Selected ");
                System.out.println(" Starting Price --- 1725 $ ");
                break;
            case 2:
                System.out.println(" Two Bedroom Apartment Selected ");
                System.out.println(" Starting Price --- 2899 $ ");
                break;
            case 3:
                System.out.println(" Three Bedroom Apartment Selected ");
                System.out.println(" Starting Price --- 3699 $ ");
                break;
            default:
                System.out.println(" We don't have it fk offffff");
                System.out.println(" go get me some DOUBLE-DOUBLE® with FRENCH FRIES from In-And-Out");




        }
    }
}
