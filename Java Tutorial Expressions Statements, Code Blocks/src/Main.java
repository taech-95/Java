public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        calculateScore();
    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 200;
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static void calculateScore2( boolean gameOver, int score, int levelCompleted, int bonus){
        gameOver = true;
        score = 5000;
        levelCompleted = 5;
        bonus = 200;
        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static long toMilesPerHour(double km){
        if(km<0){
            return -1;
        }
        long miles = Math.round(km/1.609);
        return miles;
    }
    public static void printConversion (double km){
        if(km <0){
            System.out.println("Invalid Value");
        }
        else {
            long miles = toMilesPerHour(km);
            System.out.println(km + "km/h = " + miles + "mi/h");
        }

    }
    public static boolean bark(boolean barking,  int hourOfTheDay){
        if(hourOfTheDay<0||hourOfTheDay>24){
            return false;
        }
        else if(barking == false){
            return false;
        }
        else if(barking == true && (hourOfTheDay<8 || hourOfTheDay>22)) {
            return true;
        }
        else if(barking== true && (hourOfTheDay>=8 || hourOfTheDay<=22)) {
            return false;
        }

        else return false;
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = kiloBytes/1024;
            int remainderKB = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " +remainderKB +" KB");
        }
    }

    public static boolean isLeapYear (int year){
        if(year<1||year>9999){
            return false;
        }
        else if(year%100==0&& year%400!=0){
            return false;
        }
        else if(year%4==0){
            return true;
        }
        else return false;
    }

        public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
            return ((int)(firstNumber*1000)==(int)(secondNumber*1000));
        }

    public static boolean hasEqualSum(int first,int second,int sum){
        return (first+second)==sum;
    }
    public static boolean hasTeen (int first, int second, int third){
        if((first>=13&&first<=19)||(second>=13&&second<=19)||(third>=13&&third<=19)){
            return true;
        }
        else return false;
    }
    public static double area(double radius){
        if(radius<0) return -1;
        double areaCalc = radius*radius*Math.PI;
        return areaCalc;
    }
    public static double area(double x, double y){
        if(x<0||y<0) return -1;

        double areaCalc = x*y;
        return areaCalc;
    }
    public static void printYearsAndDays(long minutes){

        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else
        {
            long hours = minutes/60;
            long days = hours/24;
            long remainingHours = hours%24;
            long years = days/365;
            long remainingDays = days%365;
            System.out.println(minutes+" min = " + years + " y and " + remainingDays+" d");

        }
    }
    public static void printEqual(int a,int b,int c){
        if( a<0|| b<0||  c<0){
            System.out.println("Invalid Value");
        }
        else if( a== b&& b== c){
            System.out.println("All numbers are equal");
        }

        else if(  a ==  c||  a==  b ||  b== c){
            System.out.println("Neither all are equal or different");

        }
        else {
            System.out.println("All numbers are different");
        }

    }
    public static boolean isCatPlaying(boolean summer, int temperature){

        if(temperature>=25&&temperature <=35){
            return true;
        }

        else if(summer==true && (temperature>=25&&temperature<=45)){
            return true;
        }
        else{
            return false;
        }
    }
}
