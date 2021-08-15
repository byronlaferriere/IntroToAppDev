package project_1;

public class Dog extends Pet_BAG {
	private int dogSpaceNumber;
	private float dogWeight;
	private boolean grooming;
	
	public Dog(String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue, int dogSpaceNumber, float dogWeight, boolean grooming)
	{
		super(petName, petAge, dogSpace, catSpace, daysStay, amountDue);
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
		
	}
	public int getDogSpaceNumber()
	{
		return dogSpaceNumber;
	}
	public void setDogSpaceNumber(int dogSpaceNumber)
	{
		this.dogSpaceNumber = dogSpaceNumber;
	}
	public float getDogWeight()
	{
		return dogWeight;
	}
	public void setDogWeight(float dogWeight)
	{
		this.dogWeight = dogWeight;
	}
	public boolean isGrooming()
	{
		return grooming;
	}
	public void setGrooming(boolean grooming)
	{
		this.grooming = grooming;
	}
}
