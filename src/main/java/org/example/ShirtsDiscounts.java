package org.example;

public class ShirtsDiscounts {
    public static void main(String[] args) {
        int oneShirtPriceWithoutDiscount = 1500;
        int selectedShirtsNumber = 3;
        int shirtsNumberForDiscount = 4;
        int shirtsNumberAddForDiscount = shirtsNumberForDiscount - selectedShirtsNumber;
        if (shirtsNumberAddForDiscount < 0) {
            shirtsNumberAddForDiscount = 0;
        }
        int totalPriceWithoutDiscountSelected = oneShirtPriceWithoutDiscount * selectedShirtsNumber;
        int totalPriceWithoutDiscountAdd = oneShirtPriceWithoutDiscount * shirtsNumberAddForDiscount;
        double discount = 0.05;
        double totalPriceWithDiscount = (totalPriceWithoutDiscountSelected + totalPriceWithoutDiscountAdd) * (1 - discount);
        double oneShirtPriceWithDiscount = oneShirtPriceWithoutDiscount *(1 - discount);
        double savedMoneyAmount = (totalPriceWithoutDiscountSelected + totalPriceWithoutDiscountAdd) - totalPriceWithDiscount;
        double donatedShirtsNumber = savedMoneyAmount / oneShirtPriceWithDiscount;
    }
}
