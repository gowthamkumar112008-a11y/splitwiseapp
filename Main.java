package splitwiseapp;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Splitwise Console===");
        Scanner input=new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        boolean start=true;
        while(start) {
            System.out.println("    ==menu==");
            System.out.println("1.Record Expense");
            System.out.println("2.Add friends");
            System.out.println("3.List friends");
            System.out.println("0.Quit");
            System.out.print("Enter choice : ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    if(friends.isEmpty())
                    {
                        System.out.println("no friends added yet");
                    }
                    else {
                        System.out.print("Who paid? ");
                        String payerName = input.nextLine();
                        System.out.print("Total amount Rs ? ");
                        double totalAmount = input.nextDouble();
                        int numFriends = friends.size();
                        double perPersonShare = totalAmount / numFriends;
                        String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
                        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
                        System.out.println(expenseLine);
                        System.out.println(shareLine);
                    }
                }
                 case 2 ->{
                     System.out.print("Friend name: ");
                     String friendName = input.nextLine();
                     friends.add(friendName);
                     System.out.println("Added " + friendName + ".");
                 }
                 case 3 ->{
                    if(friends.isEmpty())
                    {
                        System.out.println("no friends yet.");
                    }
                    else {
                        for (String name : friends) {
                            System.out.println("- " + name);
                        }
                    }
                 }
                case 0 ->{
                    System.out.println("Good bye....!!");
                    start=false;
                }
                default -> {
                    System.out.println("Invalid Choice.Try again");
                }
            }
        }

    }
}