package Day5.Assignment2.Question1;

public class SaltySnacks extends Snacks {
    boolean nut_indication = false;
    
    public SaltySnacks(int nut_indication,String size) {
        super(nut_indication, size);
        if(nut_indication==0){
            this.nut_indication = false;
        }else{
            this.nut_indication = true;
        }
    }

    public void setNut_indication(int nut_indication) {
        if(nut_indication==0){
            this.nut_indication = false;
        }else{
            this.nut_indication = true;
        }
    }
    void SaltySnacks_price(int nut_count){
        if(nut_indication==true){
            price*=nut_count;
        }
    }
    void displaySaltySnacks(){
        System.out.println("Your salty snack will cost you around: "+this.price+" for the size "+this.size);
        System.out.println("Does it include nut?"+this.nut_indication);
    }

}
