
public class U1L08ChallengeTwo {

	public static void main(String[] args) {
		int[] randomArray = {7,2,1,8,10,3,6,4,5};
		int factorial = 55;
		//This is a constant (will work with anything)
		for(int i = 0; i < randomArray.length; i++) {
			factorial -= randomArray[i];
		}
		System.out.println("Missing Number: "+factorial);
			
		

	}

}
