package certificacion;

interface PremiumAccount extends Account {

	default String getId(){
		return "1111";
	}
	
}
