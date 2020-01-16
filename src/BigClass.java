public class BigClass {
    public int number;
    public String text;

    BigClass() {
        this.number= 0;
        this.text = null;
    }
    BigClass(int number){
        setNumber(number);
        this.text = null;

    }
    BigClass(String text){
        this.number =  0;
        this.text = text;
    }
    BigClass(int number, String text){
        setNumber(number);
        this.text=text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number  < 0){
            System.out.println("number cant be zero");
        }
        else{
            this.number = number;

        }

    }
}
