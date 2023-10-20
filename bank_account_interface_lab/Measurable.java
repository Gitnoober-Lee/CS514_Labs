package bank_account_interface_lab;

public interface Measurable {

    default float getMeasure() {
        return -1;
    }

    default float getMeasure(String str, String... strs) {
        System.out.println(str);
        return -1;
    }

    static void main(String[] args) {
        Measurable m = new Measurable(){

        };
        m.getMeasure("1","2","3");
    }

    static void test(){}
}
