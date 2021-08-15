public class Corgi extends Dog {

    // additional class variables
	int weight;
	int age;

    // constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
    }

    // mutator methods
    public int getWeight() {
    	return weight;
    }
    public void setWeight(int weight) {
    	this.weight = weight;
    }
    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	this.age = age;
    }

    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}
