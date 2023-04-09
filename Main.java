public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("bread", 35, 10))
                .addProduct(new Milk("moloko", 50, 2))
                .addProduct(new Product("cheese", 100.2, 5))
                .addProduct(new ConcentrateMilk("Советская", 150, 1))
                .addProduct(new Chocolate("Шоколад ", "Аленка", 35.20,3, "Ореховый"))
                .addProduct(new Juice("Добрый", 99, 5, "Яблоко"));

        System.out.println("До продажи");
        System.out.println(mart);
        PrintSell(mart,"moloko");
        PrintSell(mart,"moloko");
        PrintSell(mart,"Добрый");
        System.out.println();
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart,"Советская");
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}