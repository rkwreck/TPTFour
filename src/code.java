//scenario: give information about the weather based on the temperature and whether it's breezy
//programmer: Rini K

//create a main class
public class code {

        //create an information method
        public void information (int temp, boolean breeze) {    //take two parameters
            if (temp > 70) {        //set up conditionals
                System.out.println("The weather is " + temp + " degrees. It's hot!");
            }

            else if (temp == 70 && breeze == true) {
                System.out.println("The weather is perfect today! It's 70 degrees and breezy.");
            }
            else if (!(temp == 70 || breeze == false)) {       //use de morgan's laws
                System.out.println("It's hot today! It's " + temp + " degrees and no breeze :(.");
            }
            else if (temp > 33) {
                System.out.println("The weather is kinda chilly today. It's " + temp + " degrees.");
            }
            else if (temp <= 33)
            {
                System.out.print("The weather is snowy and cold today. ");
                System.out.println("The weather is " + temp + " degrees.");
            }
            }

        //[one test case, not included in question]
        public static void main(String[] args) {
            code locationOne = new code();
          //  locationOne.information(32, false);
            locationOne.information(60, true);

        }
        }

/*
What will be the output when temp is 60 and breeze is true?
a. It's hot today! IT's 60 degrees and no breeze :(.
b. The weather is 60 degrees. It's hot!
c. The weather is kinda chilly today. It's 60 degrees.
d. Nothing will be printed because there is an error.
e. The weather is snowy and cold today. The weather is 60 degrees.
*/
