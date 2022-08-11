public class FurnitureItemApplying {
    public static void main(String[] args){
        FurnitureItem obj = new FurnitureItem();
        obj.Types = "Stools";
        obj.usage = "outdoor";
        obj.colour = "green";
        obj.grade = "grade1";
        obj.price = 1000;

        System.out.println("type : " + obj.Types);
        System.out.println("usage : " + obj.usage);
        System.out.println("Colour : " + obj.colour);
        System.out.println("Grade : " + obj.grade);
        System.out.println("Price : " + obj.price);
        System.out.println("Discounted price : " + obj.calculateDiscount());
    }
}
