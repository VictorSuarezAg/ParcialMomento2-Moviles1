package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        List<Watchman> watchmans = new ArrayList<>();
        List<CleaningStaff> cleanningStaffs = new ArrayList<>();
        List<Accountant> accountants = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();

        String carryOn = "y";
        int option;

        while (carryOn.equals("y") || carryOn.equals("Y")) {
            System.out.println("What profile do you want to add? \n" +
                    "1. Watchman \n" +
                    "2. Cleaning Staff \n" +
                    "3. Accountant \n" +
                    "4. Admin");
            option = inputInt.nextInt();
            switch (option) {
                case 1:
                    Watchman watchman = new Watchman();
                    System.out.println("Insert name");
                    watchman.setName(input.nextLine());
                    System.out.println("Insert Identification");
                    watchman.setIdentification(input.nextLine());
                    System.out.println("Insert age");
                    watchman.setAge(inputInt.nextInt());
                    System.out.println("Insert weapon");
                    watchman.setWeapon(input.nextLine());
                    System.out.println("Insert day off");
                    watchman.setDayOff(input.nextLine());
                    watchmans.add(watchman);
                    break;
                case 2:
                    CleaningStaff cleaningStaff = new CleaningStaff();
                    System.out.println("Insert name");
                    cleaningStaff.setName(input.nextLine());
                    System.out.println("Insert Identification");
                    cleaningStaff.setIdentification(input.nextLine());
                    System.out.println("Insert age");
                    cleaningStaff.setAge(inputInt.nextInt());
                    System.out.println("Insert day off");
                    cleaningStaff.setDayOff(input.nextLine());
                    cleanningStaffs.add(cleaningStaff);
                    break;
                case 3:
                    Accountant accountant = new Accountant();
                    System.out.println("Insert name");
                    accountant.setName(input.nextLine());
                    System.out.println("Insert Identification");
                    accountant.setIdentification(input.nextLine());
                    System.out.println("Insert age");
                    accountant.setAge(inputInt.nextInt());
                    System.out.println("Insert leader");
                    accountant.setLeader(input.nextLine());
                    System.out.println("Insert parking");
                    accountant.setParking(input.nextLine());
                    accountants.add(accountant);
                    break;
                case 4:
                    Admin admin = new Admin();
                    System.out.println("Insert name");
                    admin.setName(input.nextLine());
                    System.out.println("Insert Identification");
                    admin.setIdentification(input.nextLine());
                    System.out.println("Insert age");
                    admin.setAge(inputInt.nextInt());
                    System.out.println("Insert leader");
                    admin.setLeader(input.nextLine());
                    System.out.println("Insert parking");
                    admin.setParking(input.nextLine());
                    admins.add(admin);
                    break;
            }
            System.out.println("Do you want to enter another profile? (Y/N)");
            carryOn = input.nextLine();
        }
        System.out.println("Do you want to consult a profile?");
        carryOn = input.nextLine();

        while (carryOn.equals("y") || carryOn.equals("Y")) {
            System.out.println("Do you want to see the stored records of which category? \n" +
                    "1. Watchman \n" +
                    "2. Cleaning Staff \n" +
                    "3. Accountant \n" +
                    "4. Admin \n" +
                    "5. View All");
            option = inputInt.nextInt();
            switch (option) {
                case 1:
                    for (int w = 0; w < watchmans.size(); w++) {
                        System.out.println("The profiles created for watchman are...\n" +
                                watchmans.get(w).showWatchman() + "\n");
                    }
                    break;
                case 2:
                    for (int cs = 0; cs < cleanningStaffs.size(); cs++) {
                        System.out.println("The profiles created for cleaning staffs are...\n" +
                                cleanningStaffs.get(cs).showCleaningStaff() + "\n");
                    }
                    break;
                case 3:
                    for (int ac = 0; ac < accountants.size(); ac++) {
                        System.out.println("The profiles created for accountats are...\n" +
                                accountants.get(ac).showAccountant() + "\n");
                    }
                    break;
                case 4:
                    for (int ad = 0; ad < admins.size(); ad++) {
                        System.out.println("The profiles created for admins are...\n" +
                                admins.get(ad).showAdmin() + "\n");
                    }
                    break;
                case 5:
                    for (int w = 0; w < watchmans.size(); w++) {
                        System.out.println("Watchmans: \n" +
                                watchmans.get(w).showWatchman() + "\n");
                    }
                    for (int cs = 0; cs < cleanningStaffs.size(); cs++) {
                        System.out.println("Cleaning Staffs: \n" +
                                cleanningStaffs.get(cs).showCleaningStaff() + "\n");
                    }
                    for (int ac = 0; ac < accountants.size(); ac++) {
                        System.out.println("Accountats: \n" +
                                accountants.get(ac).showAccountant() + "\n");
                    }
                    for (int ad = 0; ad < admins.size(); ad++) {
                        System.out.println("Admins: \n" +
                                admins.get(ad).showAdmin() + "\n");
                    }
                    break;
            }
            System.out.println("Do you want to consult another profile?");
            carryOn = input.nextLine();
        }
    }
}
