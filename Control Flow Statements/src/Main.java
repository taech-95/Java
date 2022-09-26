import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        inputThenPrintSumAndAverage();


        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 1;
//        System.out.println("Enter year of your birth: ");

//        while(counter<=10){
//            System.out.println("Enter number #"+counter);
//            boolean hasNextNumber = scanner.hasNextInt();
//            if(!hasNextNumber){
//                System.out.println("Invalid number");
//            } else {
//                int number = scanner.nextInt();
//                sum+=number;
//                counter++;
//            }
//        scanner.nextLine();
//        }
//        System.out.println(sum);



        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                if(number>max){
                    max = number;
                } else if(number<min){
                    min = number;
                }
            }
            else{
                break;
            }
        }
        System.out.println("Minimal value: " + min);
        System.out.println("Maximum Value: " + max );

        System.out.println("Enter year of your birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022-year;
            System.out.println(age);
            if(age>=0 || age<=100){
                System.out.println("Your name is " + name);
                System.out.println("Your age is "+ age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();


        String numberAsString = "2022";
        int number1 = Integer.parseInt(numberAsString);


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
        sum = 0;
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

        System.out.println(sumDigits(555));

    }


    public static void inputThenPrintSumAndAverage(){
        int sum = 0; long average = 0;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean hasNextInt = scanner.hasNextInt();
        if(!hasNextInt){
            System.out.println("SUM = "+ sum + " AVG = "+average);
        }
        else {
            while(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                average = Math.round((double)sum/counter);
            }
            }
        System.out.println("SUM = "+ sum + " AVG = "+average);
    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket <=0 || extraBuckets<0){
            return -1;
        }
        double area = width * height;
        //(area - (area*extra))/math.round(area
        double buckets = Math.ceil(((area - (areaPerBucket*extraBuckets))/areaPerBucket));
        return (int)buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket <=0 ){
            return -1;
        }
        double area = width * height;
        double buckets = Math.ceil(area /areaPerBucket);
        return (int)buckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket <=0 ){
            return -1;
        }
        double buckets = Math.ceil(area /areaPerBucket);
        return (int)buckets;
    }



    public static void printSquareStar(int number){
        if(number<5) {
            System.out.println("Invalid Value");
        }
        else{

            for(int i=0;i<number;i++){
                for(int j=0;j<number; j++){
                    if(i==0||i== number-1) System.out.print("*");
                    else if(j==i||j==number-1-i) System.out.print("*");
                    else if(j==0||j==number-1) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static int getLargestPrime(int number) {
        int x = number;
        if (number <= 0) {
            return -1;
        }
        for (int i = 2; i <= number; i ++) {   // i=2 since "2" is the lowest prime number
            if (x % i == 0) {
                do {
                    x = x / i;
                } while (x % i == 0);
            }
            if (x == 1) {
                return i;
            }
        }
        return -1;
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }
        int result = bigCount*5 + smallCount*1;
        if(result<goal) return false;
        return ((goal%5)<=smallCount) ;


    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num=number;
        while(number!=0){
            int lastDigit= number%10;
            reverse*=10;
            reverse+=lastDigit;
            number/=10;

        }
        return num == reverse;
    }

    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        int lastDigit,firstDigit;
        if(number>=0){
            lastDigit = number%10;
            while(number/10>=1){
                number/=10;
            }
            firstDigit = number;
            sum = firstDigit + lastDigit;
            return sum;
        }
        return -1;
    }


        public static boolean hasSharedDigit(int first, int last){
            if((first<10||last < 10) || (first>=100||last>=100))
            {
                return false;
            }

            int rem1,rem2,rem12,rem22;
            rem1 = first%10;
            first/=10;
            rem12=first%10;
            rem2 = last%10;
            last/=10;
            rem22=last%10;

            return rem1 == rem2 || rem1 == rem22 || rem12 == rem2 || rem12 == rem22;

        }

    public static boolean hasSameLastDigit(int first, int second, int third){
        int firstRemainder,secondRemainder,thirdRemainder;
        if((first>=1000||first<10)||(second>=1000||second<10)||(third>=1000||third<10)){
            return false;
        }
        firstRemainder = first%10;
        secondRemainder = second%10;
        thirdRemainder = third%10;
        return (firstRemainder == secondRemainder) || (firstRemainder == thirdRemainder) || (secondRemainder == thirdRemainder);
    }
    public static void printFactors(int number){
        if(number<1) System.out.print ("Invalid Value");

        for(int i =1; i<=number; i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number<=1){
            return false;
        }
        int perfect=0;

        for(int i=1; i<number; i++){
            if(number%i==0){
                perfect+=i;

            }
        }
        return perfect == number;
    }

    public static void numberToWords(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        int initialCount = getDigitCount(number);
        int reversedNum = reverse(number);
        int newCount = getDigitCount(reversedNum);
        int lastDigit;

        while (reversedNum > 0) {
            lastDigit = reversedNum % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNum /= 10;
        }

        if (initialCount != newCount) {
            int countDiff = initialCount - newCount;
            while (countDiff > 0) {
                System.out.println("Zero");
                countDiff--;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }

        return count;
    }

    public static int reverse(int number) {
        int reversedNum = 0;
        if (number < 0) {
            number *= -1;
            while (number > 0) {
                reversedNum = (reversedNum * 10) + (number % 10);
                number /= 10;
            }

            reversedNum *= -1;
        } else {
            while (number > 0) {
                reversedNum = (reversedNum * 10) + (number % 10);
                number /= 10;
            }
        }

        return reversedNum;
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10||second<10) return -1;
        int greatest=0, max;

        if(first<second){
            max=second;
        }
        else max = first;
        for(int i =1; i<max;i++){
            if(first%i==0&&second%i==0){
                greatest =i;
            }
        }
        return greatest;
    }


    public static int getEvenDigitSum(int number){

        int lastNumber,sum =0;
        if(number<0) return -1;
        while (number!=0){
            lastNumber = number %10;
            number/=10;
            if(lastNumber%2==0){
                sum+=lastNumber;
            }
        }
        return sum;
    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number <10 ){
            return -1;
        }
        else {
            while (number>=1){
                sum+=number%10;
                System.out.println(number);
                number=number/10;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static boolean isOdd(int number){
        return number >= 0 && number % 2 != 0;
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

        else return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

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
