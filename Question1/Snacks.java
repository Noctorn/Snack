package Day5.Assignment2.Question1;

public class Snacks {
    String id;
    String size;
    float price;
    Snacks(String s){
        this.size=s;
        set_price(s);
        // set_id(s);
    }
    void set_price(String s){
        if((size=="S")||(size=="s")){
            this.price=19.99f;
        }else if((size=="M")||(size=="m")){
            this.price=29.99f;
        }else if((size=="L")||(size=="l")){
            this.price=39.99f;
        }
    }
    void set_id(int choice,String s){
        if(choice==0){
            if((size=="S")||(size=="s")){
                this.id="PROD-231020-0001"; 
            }else if((size=="M")||(size=="m")){
                this.id="PROD-231020-0002";
            }else if((size=="L")||(size=="l")){
                this.id="PROD-231020-0003";
            }
        }
        else{
            if((size=="S")||(size=="s")){
                this.id="PROD-231020-0004"; 
            }else if((size=="M")||(size=="m")){
                this.id="PROD-231020-0005";
            }else if((size=="L")||(size=="l")){
                this.id="PROD-231020-0006";
            }
        }
    }
    void display(){
        System.out.println(this.price);
    }
}
