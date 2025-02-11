// 💡 Task:
// 1️⃣ Create a Bank class with a method getInterestRate().
// 2️⃣ Create three child classes: SBI, HDFC, ICICI, each overriding getInterestRate().
// 3️⃣ Print the interest rates for each bank using method overriding.

class Bank {
    double getInterestRate() {
        return 0.0;  // Default rate if no bank is selected
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 5.4;  // SBI's interest rate
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 6.2;  // HDFC's interest rate
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 5.9;  // ICICI's interest rate
    }
}

public class Main {
    public static void main(String args[]) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
