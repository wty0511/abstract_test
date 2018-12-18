public class book extends  Book_abst{
    book(String name,double price){
        super();
        this.name=name;
        this.price=price;
    }
    void show(){
        System.out.println(price);
        System.out.println(name);

    }
}
