//1.Our Application's data must not go out directly
//2. It Should go after only Validation
//3. The Process of Hiding the data from direct access from other methods is called Data Hiding.

//   We acn Achieve this using Private Modifier

public class DataHiding {
    //This is a Customer's Bank Account Details
    private double balance;
    public void setBalance(int n)
    {
        balance = n;
    }

    public double getBalance()
    {
        //Only After Validation Process
        return balance;
    }
}

class main
{
    public static void main(String[] args)
    {
        DataHiding d = new DataHiding();
        d.setBalance(100);
        System.out.println(d.getBalance());
    }
}
