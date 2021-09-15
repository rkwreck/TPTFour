public class code {

        public void information (int temp, boolean breeze) {
            if (temp > 70) {
                System.out.println("The weather is " + temp + ".");
            }

            else if (temp == 70 && breeze == true) {
                System.out.println("The weather is perfect today!");
            }
            else if (temp == 70 && breeze == false) {
                System.out.println("It's hot today!");
            }
            else if (temp > 33) {
                System.out.println("The weather is kinda chilly today.");
            }
            else if (temp <= 33)
            {
                System.out.print("The weather is snowy and cold today. ");
                System.out.println("The weather is " + temp + ".");
            }
            }

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

