public class Notebook {
    int weight, price, year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this. year = year;
    }
    public void checkPrice(){
        if(this.price < 600){
            System.out.println("This notebook is very cheap");
        } else if (this.price <= 1000) {
            System.out.println("This notebook is good ");
        } else {
            System.out.println("This notebook is expensive ");
        }
    }
    public void checkWeight (){
        if(this.weight < 2000){
            System.out.println("This notebook wieght is: light");
        }else if(this.weight <= 3500){
            System.out.println("This notebook weight is: normal");
        }
        else {
            System.out.println("This notebook weight is: heavy");
        }
    }
    public void comparePriceAndYear(){
        if(this.year < 2018 && this.price > 3000){
            System.out.println("This PC cost too much");
        }else if(this.year > 2019 && this.price < 2000){
            System.out.println("This PC cost is suspicious");
        }else {
            System.out.println("This PC price is ok in compare to year");
        }
    }
}
