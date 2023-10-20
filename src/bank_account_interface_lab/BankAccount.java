package bank_account_interface_lab;

import QA_Inheritance_Lab.Son;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Title: interface_lab.BankAccount
 * @Package PACKAGE_NAME
 * @Author: lijunpeng
 * @CreateTime: 9/20/23 6:17 PM
 */
public class BankAccount extends Son implements Comparable<BankAccount>, Measurable {


    public float balance;
    public float rate;

    public BankAccount(float balance, float rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public BankAccount(float rate) {
        this.balance = 0;
        this.rate = rate;
    }

    public static void main(String[] args) {
        // interface_lab.BankAccount account = new interface_lab.BankAccount(1000, .1f);
        // account.processNYears(2);
        // System.out.println("balance after two years is: " + account.balance);
        BankAccount account0 = new BankAccount(100, .1f);
        BankAccount account1 = new BankAccount(108, .1f);
        BankAccount account2 = new BankAccount(101, .1f);
        List<BankAccount> list = new ArrayList<>();
        list.add(account0);
        list.add(account1);
        list.add(account2);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        float avg = Data.average(list);
        System.out.println(avg);
        "".charAt(1);
    }

    private void processNYears(int n) {
        int i = 0;
        while (i < n) {
            processYear();
            i = i + 1;
        }
    }

    private void processYear() {
        float interest = balance * rate;
        balance += interest;
    }

    @Override
    public String toString() {
        return "interface_lab.BankAccount{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(BankAccount o) {
        return (int) (this.balance - o.balance);
        // return 0;
    }

    @Override
    public float getMeasure() {
        return this.balance;
    }
}










