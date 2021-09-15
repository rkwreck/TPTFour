//purpose: give information about the weather based on the temperature and whether it's breezy
//programmer: Rini K

//create a main class
public class code {

        //create an information method
        public void information (int temp, boolean breeze) {
            if (temp > 70) {
                System.out.println("The weather is " + temp + ". It's hot!");
            }

            else if (temp == 70 && breeze == true) {
                System.out.println("The weather is perfect today! It's 70 degrees and breezy.");
            }
            else if (temp == 70 && breeze == false) {
                System.out.println("It's hot today! It's 70 degrees and no breeze :(.");
            }
            else if (temp > 33) {
                System.out.println("The weather is kinda chilly today. It's " + temp + " degrees.");
            }
            else if (temp <= 33)
            {
                System.out.print("The weather is snowy and cold today. ");
                System.out.println("The weather is " + temp + ".");
            }
            }

        //inside Main, call the methods on five new objects that test all if statement cases
        public static void main(String[] args) {
            code locationOne = new code();
            locationOne.information(32, false);
            code locationTwo = new code();
            locationTwo.information(60, true);
            code locationThree = new code();
            locationThree.information(70, true);
            code locationFour = new code();
            locationFour.information(70, false);
            code locationFive = new code();
            locationFive.information(90, false);

        }
        }

