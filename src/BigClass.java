public class BigClass {
    private int number;
    private String text;

    BigClass() {
        this.number= 0;
        this.text = null;
    }
    BigClass(int number){
        this.number = number;
        this.text = null;

    }
    BigClass(String text){
        this.number =  0;
        this.text = text;
    }
    BigClass(int number, String text){
        this.number=number;
        this.text=text; 
    }

}
