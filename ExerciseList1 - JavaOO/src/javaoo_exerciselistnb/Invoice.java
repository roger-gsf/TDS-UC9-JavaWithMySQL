package javaoo_exerciselistnb;

/*
EXERCISE 1:
Create a class called Invoice that can be used by a cash store
computer supplies to represent an invoice for an item sold in the store.
An invoice must include the following information as attributes:

- Invoiced item number;
- Description of the item;
- Purchased quantity of the item;
- Unit price of the item.

Your class must have a constructor that initializes the four attributes. If the
quantity purchased is not positive, it must be set to 0.
If the price per item is not positive, it should be set to 0.0.
Provide a set method and a get method for each instance variable.
Additionally, provide a method called getInvoiceAmount that calculates the invoice amount
(that is, it multiplies the quantity by the price per item) and then returns the value as a double.
Write a test application that demonstrates the capabilities of the Invoice class.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public final class Invoice {

    private int invoicedItemNumber;
    private String itemDescription;
    private int qttPurchased;
    private double unitPrice;

    public Invoice(int invoicedItemNumber, String itemDescription, int qttPurchased, double unitPrice) {
        this.invoicedItemNumber = invoicedItemNumber;
        this.itemDescription = itemDescription;
        this.setQttPurchased(qttPurchased);
        this.setUnitPrice(unitPrice);
    }

    public int getInvoicedItemNumber() {
        return invoicedItemNumber;
    }

    public void setInvoicedItemNumber(int invoicedItemNumber) {
        this.invoicedItemNumber = invoicedItemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDesciption) {
        this.itemDescription = itemDescription;
    }

    public int getQttPurchased() {
        return qttPurchased;
    }

    public void setQttPurchased(int qttPurchased) {
        if (qttPurchased > 0) {
            this.qttPurchased = qttPurchased;
        } else {
            this.qttPurchased = 0;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0.0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return qttPurchased * unitPrice;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type the item number: ");
            int itemNumber = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o nextInt()
            System.out.print("Type the item description: ");
            String itemDescription = scanner.nextLine();
            System.out.print("Type the quantity purchased: ");
            int qttPurchased = scanner.nextInt();
            System.out.print("Type the unit price: ");
            double unitPrice = scanner.nextDouble();

            Invoice invoice = new Invoice(itemNumber, itemDescription, qttPurchased, unitPrice);

            System.out.println("\nInvoice details:");
            System.out.println("Item number: " + invoice.getInvoicedItemNumber());
            System.out.println("Item description: " + invoice.getItemDescription());
            System.out.println("Quantity purchased: " + invoice.getQttPurchased());
            System.out.println("Unit price: " + invoice.getUnitPrice());
            System.out.println("Total invoice amount: " + invoice.getInvoiceAmount());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter a valid number.");
        }
    }
}
