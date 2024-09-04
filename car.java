// public class carsdetails{
//     public static void main(String[] args){
//         char carname ="BMW";
//         if ( carname = "BMW"){
//             System.out.print("this is correct car");
//         }
//         else{
//             System.out.println("this is the not correct car");
//         }
//     }
// }

public class CarsDetails {
    public static void main(String[] args) {
        String carname = "BMW";  // Use String for multiple characters
        if (carname.equals("BMW")) {  // Use .equals() for string comparison
            System.out.print("This is the correct car");
        } else {
            System.out.println("This is not the correct car");
        }
    }
}
