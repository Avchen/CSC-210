package hw;

/**
 * Created by averychen on 4/18/17.
 */
public class Food {

    // name of food
    private String name;

    // calories per serving // must be >= 0
    private int calPerServing;

    // min storage temperature // must be >= 0.
    private float minTemp;

    // max storage temperature // must be <= 100.
    private float maxTemp;


    // Constructor method for the food class
    Food() {

        // Default name of food object
        this.name = "pie";

        // Default value for calories per serving
        this.calPerServing = 500;

        // Default value for minimum temperature
        this.minTemp = 25;

        // Default value for maximum temperature
        this.maxTemp = 75;
    }

   // This method assigns new values for the food object and checks if newCal is >= 0, newMin >= 0, and newMax <= 100.
   void set(String newName, int newCal, float newMin, float newMax) {

       // Sets the current name to newName.
       this.name = newName;

       // Sets the current calories to newCal.
       this.calPerServing = newCal;

       // Sets the current minimum temperature to newMin.
       this.minTemp = newMin;

       // Sets the current maximum temperature to newMax.
       this.maxTemp = newMax;

       // This if-statement checks if the new values for newCal, newMin, and newMax are within correct range.
       if (newCal < 0 || newMin < 0 || newMax > 100) {

           // Prints out an error message if the one of the values are not in correct range.
           System.out.println("error");
           return;
       }

    }

    // This method sets the name of the food object.
    public void setName(String name){

        // Sets a new name for name.
        this.name = name;
    }

    // This method sets the minimum temperature of the food object.
    public void setMinTemp(float minTemp){

        // Sets a new number for minTemp.
        this.minTemp = minTemp;
    }

    // This method sets the maximum temperature of the food object.
    public void setMaxTemp(float maxTemp){

        // Sets a new number for maxTemp.
        this.maxTemp = maxTemp;
    }

    // Get method for name.
    String getName() {

        // Returns the name of the food.
        return name;
    }

    // Get method for minTemp.
    float getMinTemp() {

        // Returns the minimum temperature.
        return minTemp;
    }

    // Get method for maxTemp.
    float getMaxTemp() {

        // Returns the maximum temperature.
        return maxTemp;
    }

    // Get method for calPerServing.
    int getCalories() {

        // Returns the number of calories per serving.
        return calPerServing;
    }

}

// Main method to create a food object.
class TestFoodClass {

    public static void main(String[] args) {

        // Create new food object.
        Food myFavDish = new Food();

        // Sets new values for name, calPerServing, minTemp, and maxTemp.
        myFavDish.set("Gelato",400,0,4);

        // Prints the number of calories using the getCalories method.
        System.out.println(myFavDish.getCalories());
    }
}




