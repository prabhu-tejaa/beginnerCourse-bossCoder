public class testing {
            static int digitsPresent(int value){
                int returnNoOfDigitsPresent = 0;
                for(int i = value; i != 0; i=i/10){
                    returnNoOfDigitsPresent++;
                }
                return returnNoOfDigitsPresent;
            }

            static int power(int number, int power){
                int totalPower = 1;
                for(int i = 1; i<=power;i++){
                    totalPower *= number;
                }
                return totalPower;
            }
    public static void main(String[] args){
                int n = 371;
                int originalNumber = n, armStrong = 0, lastDigit =0;
                int digitsGivenByTheUser = digitsPresent(originalNumber);
                for(int i = 1; i <= digitsGivenByTheUser; i++){
                    lastDigit = originalNumber%10;
                    armStrong += power(lastDigit, digitsGivenByTheUser);
                    originalNumber = originalNumber/10;

                }

        System.out.println(armStrong);

            }
        }
