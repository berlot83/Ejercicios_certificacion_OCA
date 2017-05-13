package certificacion;

public class TypeOfTheWeekSwitch {

	public static void main(String[] args){
		
		TypeOfTheWeekSwitch switch_test= new TypeOfTheWeekSwitch();
		System.out.println(switch_test.getTypeOfDayWithSwitchStatement("Sunday"));
		
	}
	
	//As of JDK 7 release, you can use a String object in the expression of a switch statement:
		public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
		     String typeOfDay;
		     switch (dayOfWeekArg) {
		         case "Monday":
		             typeOfDay = "Start of work week";
		             break;
		         case "Tuesday":
		         case "Wednesday":
		         case "Thursday":
		             typeOfDay = "Midweek";
		             break;
		         case "Friday":
		             typeOfDay = "End of work week";
		             break;
		         case "Saturday":
		         case "Sunday":
		             typeOfDay = "Weekend";
		             break;
		         default:
		             throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
		     }
		     return typeOfDay;
		}
	
}
