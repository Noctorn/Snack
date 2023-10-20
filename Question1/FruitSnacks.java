package Day5.Assignment2.Question1;

public class FruitSnacks extends Snacks {
    boolean citrus_indication = false;

    // This is the FruitSnack constructor
    // wwithout cit choice:
    public FruitSnacks(String size,int cit_choice) {
        super(size);
        if (cit_choice== 0) {
            this.citrus_indication = false;
        } else if(cit_choice==1) {
            this.citrus_indication = true;
        }

    }
    public FruitSnacks(int choice,String size,int cit_choice,int count) {
        super(size);
        if (cit_choice == 0) {
            this.citrus_indication = false;
        } else if(cit_choice==1) {
            this.citrus_indication = true;
        }
    }
    void FruitSnacks_price(int citrus_count){
        if(citrus_indication==true){
            super.price*=citrus_count;
        }
        else{
            this.price+=0;
        }
    }
    void displayFruitySnacks(){
        System.out.println("Your Fruity snack will cost you around: "+this.price+" for the size "+this.size);
        System.out.println("Does it include citrus? "+this.citrus_indication);
     }
}
