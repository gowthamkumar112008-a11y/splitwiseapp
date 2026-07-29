package splitwiseapp.model;

public record ExpenseLine(String payerName, double amount) {

   public ExpenseLine{//compact const to reject negative amount
        if(amount<0)
            amount=0;
    }
    public double perpersonshare(int numfriends)
    {
        return amount/numfriends;
    }
    public ExpenseLine(double amount){      // calls when payer name is unknown
        this("unknown",amount);
    }
}
