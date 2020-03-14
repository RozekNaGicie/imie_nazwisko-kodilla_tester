public class LeapYear {
    int year;
    boolean isTheYear;
    public LeapYear (int year) {
        this.year = year;
    }
    public boolean isYear(){
        if(this.year % 4 != 0){
            this.isTheYear = false;
        }else if (this.year % 100 != 0){
            this.isTheYear = true;
        }else if(this.year % 400 != 0){
            this.isTheYear = false;
        }else{
            this.isTheYear = true;
        }
        return isTheYear;
    }
}
