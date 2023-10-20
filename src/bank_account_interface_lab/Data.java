package bank_account_interface_lab;

import QA_Inheritance_Lab.Son;

import java.util.List;

/**
 * @Description:
 * @Title: interface_lab.Data
 * @Package PACKAGE_NAME
 * @Author: lijunpeng
 * @CreateTime: 10/4/23 11:27 AM
 */
public class Data {

    public static float average(List<? extends Measurable> list) {
    // public static float average(List<? super BankAccount> list) {
        // public static <T extends Measurable> float average(List<T> list) {
        // public static float average(List<?> list) {
        float sum = 0;
        int cnt = 0;
        for (Measurable m : list) {
            sum += m.getMeasure();
            System.out.println();
            cnt++;
        }
        return sum / cnt;

    }
}











