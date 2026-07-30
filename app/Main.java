package splitwiseapp.app;
import splitwiseapp.model.ExpenseLine;
import splitwiseapp.model.Friend;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Splitwise Console===");
        Scanner input=new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<>();
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
                        ExpenseLine expense = new ExpenseLine(payerName, totalAmount);
                        int numFriends = friends.size();
                        double perPersonShare = expense.perpersonshare(numFriends);
                        String expenseLine = "%s paid ₹%.2f".formatted(expense.payerName(), expense.amount());
                        String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
                        System.out.println(expenseLine);
                        System.out.println(shareLine);
                    }
                }
                 case 2 ->
                    Main.addfriends(friends);

                 case 3 ->{
                    if(friends.isEmpty())
                    {
                        System.out.println("no friends yet.");
                    }
                    else {
                        System.out.println("  Id  Friends : ");
                        for (Friend name : friends) {
                            System.out.println(Main.FriendDisplay.listLine(name));//same as FriendDisplay.listLine(name)
                        }
                    }
                 }
                case 0 ->{
                    System.out.println("Good bye....!!");
                    start=false;
                }
                default ->
                    System.out.println("Invalid Choice.Try again");

            }
        }

    }
    public static void addfriends(ArrayList<Friend> friends)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Friend name: ");
        String friendName = input.nextLine();
        Friend f=new Friend(friendName);
        friends.add(f);
        System.out.println(FriendDisplay.addedMessage(f));//same as Main.FriendDisplay.addedMessage(f)
    }


    private static class FriendDisplay {//fr.
        static String listLine(Friend friend) {
            return "- %d: %s".formatted(friend.getId(), friend.getName());
        }
        static String addedMessage(Friend friend) {
            return "Added %s (id %d).".formatted(friend.getName(), friend.getId());
        }
    }
}