public class FurnitureItem {
    int furnitureCode;
    String Types;
    String grade;
    String colour;
    String usage;
    double price;
    FurnitureItem(){
        furnitureCode = 0;
        Types = "Table";
        grade = "Grade 1";
        colour = "red";
        usage = "Indoor";
        price = 0.0;
    }
    double calculateDiscount(){
        double discountedPrice = price;
        if(Types == "outdoor"){
            discountedPrice = price * 0.95;
        }
        return discountedPrice;
    }

}