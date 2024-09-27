package bossCoderProblems.arrays;
import java.util.*;
public class p315_richestCustomerWealth {
    static int solve(List<List<Integer>> input) {
        int maxWealth = 0;
        for(int i = 0; i<input.size();i++){
            int currentWealth = 0;
            for(int j = 0; j<input.get(i).size();j++){
                currentWealth += input.get(i).get(j);
            }
            if(currentWealth>maxWealth){
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> accounts = new ArrayList<>();
        System.out.print("Enter the no. of customers: ");
        int numCustomers = input.nextInt();

        for(int i = 0; i<numCustomers;i++){
            List<Integer> customerAccounts = new ArrayList<>();
            System.out.print("Enter no. of accounts for customer "+(i+1)+": ");
            int numAccounts = input.nextInt();
            System.out.println("Enter account balances for customer: "+(i+1)+": ");
            for(int j = 0; j<numAccounts;j++){
                customerAccounts.add(input.nextInt());
            }
            accounts.add(customerAccounts);
        }
        System.out.println(solve(accounts));
    }
}
