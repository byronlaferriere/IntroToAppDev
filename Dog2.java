public class Dog {
		private String type;
		private String breed;
		private String name;
		private String topTrick;
	

    // class variables


    // constructor
	public Dog(String type, String breed, String name) {
		type = "No type";
		breed = "No breed";
		name = "No name";
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTopTrick() {
		return topTrick;
	}
	public void setTopTrick(String topTrick) {
		this.topTrick = topTrick;
	}
    // methods


    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
