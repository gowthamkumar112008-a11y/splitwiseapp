package splitwiseapp;

record ExpenseLine(String payerName, double amount) {

    ExpenseLine{//compact const to reject negative amount
        if(amount<0)
            amount=0;
    }
    double perpersonshare(int numfriends)
    {
        return amount/numfriends;
    }
    ExpenseLine(double amount){      // calls when payer name is unknown
        this("unknown",amount);
    }
}
