package rahul.help.towithown;

class vehicle{
	private String make;
	private int year;
	
	public vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	public int getYear() {
		return year;
	}
	public void displayDetails() {
		System.out.println("Make: " + make);
        System.out.println("Year: " + year);	
	}
	
}

class Car extends vehicle {
	private String model;

	public Car(String make, int year, String model) {
		super(make, year);
		this.model = model;
	}
	public String getModel() {
		return model;
	}

	
	 @Override
	    public void displayDetails() {
	        super.displayDetails(); 
	        System.out.println("Model: " + model); 
	    }
}

	 public class VehicalInformation {
	
		 public static void main(String[] args) {
			 Car car = new Car("Toyota", 2020, "Corolla");
			 car.displayDetails();
		 }
	 }

