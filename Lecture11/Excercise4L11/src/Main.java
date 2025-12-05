import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String bank = "";
    int amountacc = 0;
    Account myAccount;

    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    try {
        System.out.println("Enter bank name: ");
        bank = bufferedReader.readLine();
        System.out.println("Enter initial value: ");
        amountacc = Integer.parseInt(bufferedReader.readLine());

        myAccount = new Account(bank,amountacc);
        int option;
        double amount;
        while (myAccount.getAmount()>0){
            System.out.println("Chose option");
            System.out.println("1 - Overview Account");
            System.out.println("2 - Amount Overview");
            System.out.println("3 - Add Cash");
            System.out.println("4 - Withdraw Cash");
            System.out.println("5 - Clear Account");
            option = Integer.parseInt(bufferedReader.readLine());

            switch (option){
                case 1:
                    System.out.println("Bank name: " + myAccount.getBank());
                case 2:
                    System.out.println("Amount: " + myAccount.getAmount());
                case 3:
                    System.out.println("Enter value: ");
                    amount = Double.parseDouble(bufferedReader.readLine());
                    myAccount.add(amount);

                case 4:
                    System.out.println("Enter value: ");
                    amount = Double.parseDouble(bufferedReader.readLine());
                    myAccount.withdraw(amount);

                case 5:
                    System.out.println("Clearing Account!");
                    myAccount.withdraw(myAccount.getAmount());
                default:
                    System.out.println("Invalid Amount!");
            }
        }
    }catch (IOException e){
        System.out.println("Invalid Exception!");
    }catch (NumberFormatException e){
        System.out.println("Invalid ");
    }


}
