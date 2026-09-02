package com.javaintro;

public class Cricketer {

    // Static variables - common for all objects
    static int countryId;
    static String countryName;

    // Instance variables - separate for each object
    int jerseyNumber;
    String cricketerName;

    public static void main(String[] args) {

        System.out.println("main method started");
        System.out.println("Welcome to Indian cricketer team");

        // Initialization of static data
        countryId = 91;
        countryName = "India";

        // Accessing static data
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);

        // ================= OBJECT 1 =================
        System.out.println("\nOBJECT INFO 1");

        Cricketer msd = new Cricketer();

        msd.jerseyNumber = 7;
        msd.cricketerName = "Mahendra Singh Dhoni";
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);

        System.out.println("jerseyNumber  : " + msd.jerseyNumber);
        System.out.println("cricketerName : " + msd.cricketerName);

        // ================= OBJECT 2 =================
        System.out.println("\nOBJECT INFO 2");

        Cricketer vk = new Cricketer();
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);

        vk.jerseyNumber = 18;
        vk.cricketerName = "Virat Kohli";

        System.out.println("jerseyNumber  : " + vk.jerseyNumber);
        System.out.println("cricketerName : " + vk.cricketerName);

        // ================= OBJECT 3 =================
        System.out.println("\nOBJECT INFO 3");

        Cricketer rohit = new Cricketer();

        rohit.jerseyNumber = 45;
        rohit.cricketerName = "Rohit Sharma";
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);

        System.out.println("jerseyNumber  : " + rohit.jerseyNumber);
        System.out.println("cricketerName : " + rohit.cricketerName);

        // ================= OBJECT 4 =================
        System.out.println("\nOBJECT INFO 4");

        Cricketer bumrah = new Cricketer();

        bumrah.jerseyNumber = 93;
        bumrah.cricketerName = "Jasprit Bumrah";
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);

        System.out.println("jerseyNumber  : " + bumrah.jerseyNumber);
        System.out.println("cricketerName : " + bumrah.cricketerName);
        
        
        System.out.println("\nOBJECT INFO 5");

        Cricketer sachin = new Cricketer();

        sachin.jerseyNumber = 10;
        sachin.cricketerName = "Sachin Tendulkar";
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);
        System.out.println("jerseyNumber  : " + sachin.jerseyNumber);
        System.out.println("cricketerName : " + sachin.cricketerName);


        System.out.println("\nOBJECT INFO 6");

        Cricketer yuvi = new Cricketer();
        Cricketer.countryId=92;
        Cricketer.countryName ="bhart";
        yuvi.jerseyNumber = 12;
        yuvi.cricketerName = "Yuvraj Singh";
        System.out.println("countryId   : " + countryId);
        System.out.println("countryName : " + countryName);
        System.out.println("jerseyNumber  : " + yuvi.jerseyNumber);
        System.out.println("cricketerName : " + yuvi.cricketerName);

       
        System.out.println("\nmain method ended");
    }
}