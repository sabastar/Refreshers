import java.util.*;
public class Animal {
	public static final double FAVNUM = 1.6180; // static = shared by every animal object created
	// final = constant, cant be changed
	
	private String name; // accessible by methods in class ONLY
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;// only accessible by classes in same package
	
	static Scanner userInput = new Scanner(System.in);
	
	// constructor
	
	public Animal() {
		//super(); // calls whatever superclass was for this animal to be executed
		// animal is superclass of dog and cat
		numberOfAnimals++;
		int sumOfNumbers = 5+1;
		System.out.println("5+1 =" + sumOfNumbers);
		int diffOfNumbers = 5-1;
		System.out.println("5+1 =" + diffOfNumbers);
		int multOfNumbers = 5*1;
		System.out.println("5+1 =" + multOfNumbers);
		int divOfNumbers = 5/1;
		System.out.println("5+1 =" + divOfNumbers);
		int modOfNumbers = 5%3;
		System.out.println("5+1 =" + modOfNumbers);
		
		System.out.print("Enter the name of the animal: \n");
		
		if(userInput.hasNextLine()){ //hasNextInt, hasNextFloat, hasNextDouble, hasNextByte
			
			// user entered some string in the keyboard, only executes if true
			
			//this.setName(userInput.nextLine()); // object that was just created (theanimal)
		} // nextInt, nextFloat, nextDouble
		
 
		
	}
	
	public static void main(String[] args) {
		Animal theAnimal = new Animal(); 
		
		int[] favNums = new int[20];
		favNums[0] = 100;
		
		String[] stringArray = {"Random","Words", "Here"};
		
		for(String word : stringArray){ // cycle through each, store temporarily in word 
			// print out all strings
			System.out.println(word);
		}
		String[][][] arrayName = { { { "000" }, { "100" }, { "200" }, { "300" } },
				{ { "010" }, { "110" }, { "210" }, { "310" } }, 
				{ { "020" }, { "120" }, { "220" }, { "320" } }};
		}
	
	
	public String getName(){
		return name;
	}
	public void setName(){
		this.name = name; //this refers to the object
	}
	public int getWeight(){
		return weight;
	}
	public void setWeight(){
		this.weight = weight;
	}
	public boolean getHasOwner(){
		return hasOwner;
	}
	public void setHasOwner(){
		this.hasOwner= hasOwner;
	}
	public byte getAge(){
		return age;
	}
	public void setAge(){
		this.age = age;
	}
	public long getUniqueID(long uniqueID){
		return uniqueID;
	}
	public void setUniqueID(long uniqueID){
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to"+ this.uniqueID);
	}
	public void setUniqueID(){
		long minNumber = 1;
		long maxNumber = 1000000;
		
		this.uniqueID= minNumber + (long) (Math.random() * ((maxNumber - minNumber) +1));
		String stringNumber = Long.toString(maxNumber); // long to string
		int numberString = Integer.parseInt(stringNumber); // string to int
		System.out.println("Unique ID set to" + this.uniqueID);
		
	}
	public char getFavoriteChar(){
		return favoriteChar;
	}
	public void setFavoriteChar(){
		int randomNumber = (int) (Math.random() * 126) + 1;
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber == 32){
			System.out.println("Favourite character set to Space");
			
		}
		else if(randomNumber == 10){
			System.out.println("Favorite character set to Newline");
		
		}
		else{
			System.out.println("Favorite character set to" + this.favoriteChar);
		}
		if((randomNumber >97) && (randomNumber < 122)){
			System.out.println("Favorite character is a lowercase");
		}
		if(((randomNumber > 97) && (randomNumber < 122) || ((randomNumber >  64) && (randomNumber < 91)))){
			System.out.println("Favorite character is a letter");
		}
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber; // if less than 50, = 50, else it will be the bigger
		
		switch(randomNumber){
		case 8: // if random Number has value of 8 then
			System.out.println("Favorite character set to backspace");
			break; // get out, done, want to leave
		case 10:
		case 11:
		case 12:
			System.out.println("Fav char is ");
		default:
			System.out.println();
			break;
		}
	}
	public double getSpeed(){
		return speed;
	}
	public void setSpeed(){
		this.speed = speed;
	}
	public float getHeight(){
		return height;
	}
	public void setHeight(){
		this.height= height;
	}
	
	protected static void countTo(int startingNumber){
		for(int i = startingNumber; i<=100; i++){
			
			if(i == 90) continue; // jumps out of iteration and increments
			System.out.println(i);
			
		}
	}
	protected static String printNumbers(int maxNumbers){
		int i=1;
		while(i<(maxNumbers /2)){
			System.out.println(i);
			i++;
			
			if(i==(maxNumbers/2))
				break; // jump out of the loop
		}
		 Animal.countTo(maxNumbers/2);
		 return "End of printNumbers";
	}
	
	protected static void guessMyNumber(){
		int number;
		do{
			System.out.println("Guess number up to 100");
			while(!userInput.hasNextInt()) {
				String numberEntered = userInput.next();
				System.out.printf("%s is not a number \n" , numberEntered);
				
			}
			number = userInput.nextInt();
		}while(number!= 50);
	}
	public String makeSound(){
		return "Grrr";
	}
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says" + randAnimal.makeSound());
	}
}// end of class
