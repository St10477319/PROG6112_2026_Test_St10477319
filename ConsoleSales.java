import java.util.Scanner;

public class ConsoleSales extends Consoles {

    // Constructor
    public ConsoleSales(String consoleType, String storeName, double totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String storeName;
            String consoleType;
            double totalSales;
            
            // Display heading
            System.out.println("==============================================");
            System.out.println("       NUMBER ONE ELECTRONICS STORE");
            System.out.println("           CONSOLE SALES REPORT");
            System.out.println("==============================================");
            
            // Enter store name
            System.out.print("Enter the store name: ");
            storeName = input.nextLine();
            
            // Display console options
            System.out.println("\nSelect Console Device Type:");
            System.out.println("1. PS5");
            System.out.println("2. XBOX");
            System.out.println("3. Nintendo Switch");
            
            // Get console choice
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            
            // Determine console type
            consoleType = switch (choice) {
                case 1 -> "PS5";
                case 2 -> "XBOX";
                case 3 -> "Nintendo Switch";
                default -> "Invalid";
            };
            
            // Check if choice is valid
            if (choice >= 1 && choice <= 3) {
                
                // Enter total sales
                System.out.print("Enter the total amount of sales: R");
                totalSales = input.nextDouble();
                
                // Create ConsoleSales object
                ConsoleSales sales = new ConsoleSales(
                        consoleType,
                        storeName,
                        totalSales
                );
                
                // Display report
                System.out.println("\n==============================================");
                System.out.println("              CONSOLE SALES REPORT");
                System.out.println("==============================================");
                
                System.out.println(sales.getStoreName()
                        + "Store Name       : ");
                
                System.out.println("Console Type     : "
                        + sales.getConsoleType());
                
                System.out.printf("Total Sales      : R%.2f%n",
                        sales.getTotalSales());
                
                System.out.println("==============================================");
                
            } else {
                
                System.out.println("Invalid console choice.");
            }
        }
    }

    private Object[] getTotalSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getConsoleType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getStoreName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}