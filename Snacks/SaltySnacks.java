package Snacks;

public class SaltySnacks extends Snacks {
    boolean nutIndication = false;
    int count = 0;

    SaltySnacks(int i, char size, int flag_cit, int count) {
        super(i, size);
        setIndication(flag_cit);
        setCount(count);
        calculatePrice(size, nutIndication);
    }

    public void setIndication(int flag_cit) {
        if (flag_cit == 1) {
            this.nutIndication = false;
        } else if (flag_cit == 2) {
            this.nutIndication = true;
        }
    }

    public void setCount(int count) {
        // System.out.println("Do you want Citrus? Enter the count: ");
        this.count = count;
    }

    public void calculatePrice(char sizee, boolean citrusIndication) {
        if (citrusIndication == true) {
            super.price += 5.99f * (float) count;
        } else if (citrusIndication == false) {
            super.price += 0 * (float) count;
        }
    }

    public void display() {
        System.out.println(super.price + " " + size + " " + nutIndication + " " + id + " " + count);
    }
}
