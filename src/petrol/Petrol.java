package petrol;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase("Sabo-yaba", "PMS", 120, 1200, 5.0);
        System.out.println("Location: " + purchase.getStationLocation());
        System.out.println("Type: " + purchase.getTypeOfPetrol());
        System.out.println("Quantity: " + purchase.getPurchaseQuantity() + " liters");
        System.out.println("Price per liter: #" + purchase.getPricePerLiter());
        System.out.println("Discount percentage: " + purchase.getPercentageDiscount() + "%");
        System.out.println("Purchase amount: #" + purchase.getPurchaseAmount());

    }

}
