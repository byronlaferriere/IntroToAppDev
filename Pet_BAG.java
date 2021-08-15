package project_1;

public class Pet_BAG {

	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue;
	
	public Pet_BAG() {
		System.out.println("Welcome to Pet Boarding & Grooming");
	}
	public Pet_BAG(String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
		this.petName = petName;
		this.petAge = petAge;
		this.dogSpace = dogSpace;
		this.catSpace = catSpace;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
	}	
	public String getPetName()
	{
	return petName;
	}
	public void setPetName(String petName)
	{
		this.petName = petName;
	}
	public int getPetAge()
	{
		return petAge;
	}
	public void setPetAge(int petAge)
	{
		this.petAge = petAge;	
	}
	public int getDogSpace()
	{
		return dogSpace;
	}
	public void setDogSpace(int dogSpace)
	{
		this.dogSpace = dogSpace;
	}
	public int getCatSpace()
	{
		return catSpace;
	}
	public void setCatSpace(int catSpace)
	{
		this.catSpace = catSpace;
	}
	public int getDaysStay()
	{
		return daysStay;
	}
	public void setDaysStay(int daysStay)
	{
		this.daysStay = daysStay;
	}
	public double getAmountDue()
	{
		return amountDue;
	}
	public void setAmountDue(double amountDue)
	{
		this.amountDue = amountDue;
	}
	
	
		
		
	

}
