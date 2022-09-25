public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int  value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        }
        else {
            System.out.println("Value was not 1 or 2");
        }
        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
        printDayOfTheWeek(2);
        for (int i = 0; i < 10; i++){
            //System.out.println(i);
        }

        for (int i = 2; i < 9; i++ ){
            //System.out.println("10000 at " + i + " interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        for (int i = 8; i > 1; i-- ){
            //System.out.println("10000 at " + i + " interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        int count = 0;
        int sum = 0;
//        for (int i = 1; i<100; i++){
//            if(isPrime(i)){
//                //System.out.println(i + " is a Prime number");
//                count++;
//                //System.out.println(count);
//            }
//
//            if(count == 3) {
//                break;
//            }
//        }

        for (int i = 1; i <= 1000; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                //System.out.println("The sum is " + sum);
                count++;
                // System.out.println("The count is " + count);
                if (count == 5) {
                    System.out.println("The sum of the numbers met conditions is " + sum);
                    break;
                }
            }
        }


        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println(count);
            count++;
        }

        count = 1;
        do{
            System.out.println(count);
            count++;
            if(count == 6){
                break;
            }
        }while(true);

        int number = 4;
        int finishNumber = 20;

        count = 0;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("The even number is " + number);
            if(count == 5){
                System.out.println("Total count of even number is " + count);
                break;
            }

        }

    }


    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int number){
        if (number<0||number%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int sumOdd(int start, int end){
        if((start<0||end<0)||end<start){
            return -1;
        }
        int sum=0;
        for(int i =start; i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }


    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }

    public static boolean isLeapYear(int year){
        if(year<1||year >9999){
            return false;
        }

        else if( year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        else return false;

    }

    public static int getDaysInMonth(int month, int year){
        int dayInMonth =0;
        if((month<1||month>12)||(year<1||year>9999)){
            return dayInMonth=-1;
        }

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayInMonth =31;
                break;
            case 2:
                if(isLeapYear(year) ==true){
                    dayInMonth=29;
                }
                else
                    dayInMonth =28;
                break;
            case 4: case 6: case 9: case 11:
                dayInMonth =30;
                break;
        }
        return dayInMonth;
    }




}
