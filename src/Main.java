public class Main
{
    public static void main(String[] args)
    {
       double startBalance = 5000.00;
       double monthlyInterest = 0.17;
       double interest = 0.00;
       double firstMonth = 0.00;
       double secondMonth = 0.00;
       double thirdMonth = 0.00;

       interest = startBalance * monthlyInterest;
       firstMonth = startBalance + interest;
       secondMonth = firstMonth + interest;
       thirdMonth = secondMonth + interest;

        System.out.println("Your interest balance for the first month is $" + firstMonth + ", second month $" + secondMonth + ", and third month $" + thirdMonth + ".");

    }
}