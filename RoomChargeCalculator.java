import java.util.*;

public class RoomChargeCalculator{
	
/* ----- Declare the veriable -----*/
	
//Room type with fixed price
public static int DeluxDouble = 5000;
public static int StandardFamily = 3000;
public static int StandardSingle = 2000;
		
//Room facilities
public static int balcony = 500;
public static int parking = 200;
public static int tv = 200;
public static int dKitchen = 1000 ;
public static int wifi = 100;
public static int fKitchen = 500;
public static int garden = 200;
public static int ac = 500;
		
//declare the string veriable for get the answer from user
public static String TrueFalse;

	
	/*--------- Start Main Method ---------*/
	
	public static void main (String args[]){
		
	//display menu
		System.out.println();
		System.out.println("----CHOOSE THE ROOM TYPE----");
		System.out.println("1. Delux-Double");
		System.out.println("2. Standard-Family");
		System.out.println("3. Standard-Single");
		System.out.println("4. Quit");
		System.out.println();
		
		Scanner rd = new Scanner(System.in);
		System.out.print("Enter your choice (1-4): ");
		int RoomType = rd.nextInt();
		
		
	//user choose
	
		switch (RoomType){
			
			//Delux-Double Room
			case 1 :
			
			 System.out.println();
			 System.out.println("Delux-Double Room Fixed Price is " + DeluxDouble);
			 System.out.println();
			 
			 System.out.println("---- WE ARE PROVIDING FOLLOWING FACILITIES ----");
			 System.out.println("        *Including Additional Chargers*        ");
			 System.out.println("");
			 
			 System.out.println("Balcony	: " + balcony);
			 System.out.println("Parking	: " + parking);
			 System.out.println("TV	: " + tv);
			 System.out.println("Kitchen	: " + dKitchen);
			 System.out.println("WiFi	: " + wifi);
			 System.out.println("");
			 
			 System.out.print("You are required additional facilities ? (True/False) : ");
			 TrueFalse = rd.next();
			 System.out.println("");
			 
			 // select additional facilities
			 if(TrueFalse.toString().equals("True")|| TrueFalse.toString().equals("true")){
				 
				System.out.print("You are reqied Balcony facilities? (True/False): ");
				String BalconyP = rd.next();
				boolean bal = answer(BalconyP);
				
				System.out.print("You are reqied Parking facilities? (True/False): ");
				String ParkingP = rd.next();
				boolean park = answer(ParkingP);
				
				System.out.print("You are reqied Tv facilities? (True/False): ");
				String TvP = rd.next();
				boolean tvAns = answer(TvP);
				
				System.out.print("You are reqied Kitchen facilities? (True/False): ");
				String dKitchenP = rd.next();
				boolean kitch = answer(dKitchenP);
				
				System.out.print("You are reqied Wifi facilities? (True/False): ");
				String WifiP = rd.next();
				boolean WifiAns = answer(WifiP);
				System.out.println(""); 
				
				//Call method
				getChargeDeluxDouble(bal, park, tvAns, kitch, WifiAns);
				 
			 }
			 else if(TrueFalse.toString().equals("False") || TrueFalse.toString().equals("false")){
				 System.out.println("Total Amount of Delux-Double Room : "  + DeluxDouble);
			 }
			 else{
				 System.out.println("Invalid Input");
			 }
			 
			break;	
			
			// Standard Famil Room
			
			case 2 :
			
			 System.out.println();
			 System.out.println("Standard Famil Room Fixed Price is " + StandardFamily);
			 System.out.println();
			 
			 System.out.println("---- WE ARE PROVIDING FOLLOWING FACILITIES ----");
			 System.out.println("        *Including Additional Chargers*        ");
			 System.out.println("");
			 
			 System.out.println("Parking	: " + parking);
			 System.out.println("Kitchen	: " + fKitchen);
			 System.out.println("Garden	: " + garden);
			 System.out.println("");
			 
			 System.out.print("You are required additional facilities ? (True/False) : ");
			 TrueFalse = rd.next();
			 System.out.println("");
			 
			 if(TrueFalse.toString().equals("True")|| TrueFalse.toString().equals("true")){
				 
				
				System.out.print("You are reqied Parking facilities? (True/False): ");
				String ParkingP = rd.next();
				boolean park = answer(ParkingP);
				
				System.out.print("You are reqied Kitchen facilities? (True/False): ");
				String fKitchenP = rd.next();
				boolean fkitch = answer(fKitchenP);
				
				System.out.print("You are reqied Garden facilities? (True/False): ");
				String GardenP = rd.next();
				boolean grdn = answer(GardenP);
				System.out.println(""); 
				
				//Call method
				getChargeStandardFamily(park,fkitch, grdn);
				 
			 }
			 else if(TrueFalse.toString().equals("False") || TrueFalse.toString().equals("false")){
				 System.out.println("Total Amount of Delux-Double Room : "  + StandardFamily);
			 }
			 else{
				 System.out.println("Invalid Input");
			 }
			break; 
			 
			// Standard Single Room
			 
			case 3 :
			
			 System.out.println();
			 System.out.println("Standard Single Room Fixed Price is " + StandardSingle);
			 System.out.println();
			 
			 System.out.println("---- WE ARE PROVIDING FOLLOWING FACILITIES ----");
			 System.out.println("        *Including Additional Chargers*        ");
			 System.out.println("");
			 
			 System.out.println("Parking	: " + parking);
			 System.out.println("A/C	: " + ac);
			 System.out.println("Wifi	: " + wifi);
			 System.out.println("");
			 
			 System.out.print("You are required additional facilities ? (True/False) : ");
			 TrueFalse = rd.next();
			 System.out.println("");
			 
			 if(TrueFalse.toString().equals("True")|| TrueFalse.toString().equals("true")){
				 
				
				System.out.print("You are reqied Parking facilities? (True/False): ");
				String ParkingP = rd.next();
				boolean park = answer(ParkingP);
				
				System.out.print("You are reqied A/C facilities? (True/False): ");
				String AcP = rd.next();
				boolean acf = answer(AcP);
				
				System.out.print("You are reqied Wifi facilities? (True/False): ");
				String WifiP = rd.next();
				boolean WifiAns = answer(WifiP);
				System.out.println(""); 
				
				//Call method
				getChargeStandardSingle(park, acf, WifiAns);
				 
			 }
			 else if(TrueFalse.toString().equals("False") || TrueFalse.toString().equals("false")){
				 System.out.println("Total Amount of Delux-Double Room : "  + StandardSingle);
			 }
			 else{
				 System.out.println("Invalid Input");
			 } 
			break;

			case 4 :
			
			 System.out.println ("Thank You");
			 
			break; 
			
			default:
			 
			 System.out.println ("Sorry! The Number is outside the range");
			 
			break; 
			
		}// Switch
			
		
	}//main method
	
	
	
/* --------- Assume value from user input-------- */
	
// Covert to String input to Boolean value
 public static boolean answer(String input) {
	 
  boolean ans;
  if (input.toString().equals("True")|| input.toString().equals("true")) {
   ans = true;
  } 
  else {
   ans = false;
  }

  return ans;

 }//end of boolean method
 
 
 //assume price in to user choise
 public static int getCost(boolean request, int cost) {

  if (request == true) {
	  
   return cost;
  } 
  else {
	  
   cost = 0;
   return cost;
  }
  
 }//end of getCost method
		
		

/* ------------- Calculate Total Room Cost ---------- */

//Delux-Double Room charge calculation

public static void getChargeDeluxDouble(boolean BalconyP, boolean ParkingP, boolean TvP, boolean dKitchenP, boolean WifiP){
	
	int BalconyFees  = getCost (BalconyP, balcony);
	int ParkingFees  = getCost (ParkingP, parking);
	int TvFees		 = getCost (TvP, tv);
	int dKitchenFees = getCost (dKitchenP, dKitchen);
	int WifiFees	 = getCost (WifiP, wifi);
	
	int TotalAmount	 = DeluxDouble + BalconyFees + ParkingFees + TvFees + dKitchenFees + WifiFees;
	
	System.out.println("Total Amount of Delux-Double Room : "+ TotalAmount);
	
}//End of Delux-Double Room charge calculation


//StandardFamily Room charge calculation

public static void getChargeStandardFamily(boolean ParkingP,boolean fKitchenP, boolean GardenP){
	
	int ParkingFees  = getCost (ParkingP, parking);
	int fKitchenFees = getCost (fKitchenP, fKitchen);
	int GardenFees	 = getCost (GardenP, garden);
	
	int TotalAmount	 = StandardFamily + ParkingFees + fKitchenFees + GardenFees;
	
	System.out.println("Total Amount of Standard Family Room : "+ TotalAmount);
	
	
}// End of the StandardFamily room charge calculation

//StandardSingle Room charge calculation

public static void getChargeStandardSingle(boolean ParkingP, boolean AcP, boolean WifiP){
	
	int ParkingFees  = getCost (ParkingP, parking);
	int AcFees  	 = getCost (AcP, ac);
	int WifiFees	 = getCost (WifiP, wifi);
	
	int TotalAmount	 = StandardSingle + ParkingFees + AcFees + WifiFees;
	
	System.out.println("Total Amount of Standard Single Room : "+ TotalAmount);
	
	
}// End of the StandardSingle room charge calculation

		
}	
 
