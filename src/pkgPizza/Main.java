package pkgPizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pkgPizza.Topping.*;
public class Main {

    private String name;
    //Creamos una lista de toppings donde se agregaran y removeran cada uno de ellos
    private List<Topping> toppings = new ArrayList<>();

    // Constructor
    public Main(String name, Topping... toppings) {
        this.name = name;
        for (Topping tp : toppings) {
            this.toppings.add(tp);
        }

    }
    //Un metodo para establecer el precio del topping
    public void setToppingPrice(String toppingName, double newPrice) {
        for (Topping topping : toppings) {
            if (topping.getName().equals(toppingName)) {
                topping.setPrice(newPrice);
                break;
            }
        }
    }

    //Un metodo para agregar el topping
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    //Un metodo para retirar el topping
    public void removeTopping(int index) {
        this.toppings.remove(index);
    }


    private double total;
    //Un metodo para obtener el precio total de la pizza
    public double getTotalPrice() {
        double total = 0;
        for (Topping tp : toppings) {
            total += tp.getPrice();
        }
        return total;
    }

    //Un metodo para preparar la pizza
    public void preparePizza() {
        System.out.println("Preparando la pizza...");
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("La pizza estará lista en: "+i+"s");
                Thread.sleep(500);  // Pausa de 0.5 segundos (500 ms)
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    //Un metodo para terminar de preparar la pizza
    public void finishPreparingPizza() {

        System.out.println("La preparación de la pizza ha terminado!!!");
        System.out.println("Disfruta tu nueva y deliciosa pizza.");

    }

    //Un metodo para imprimir los detalles de la pizza
    @Override
    public String toString() {
        return "Pizza{" + name + " Toppings: " + toppings + "}";
    }

    //El metodo main en el que estan los toppings y la pizza, junto con la impresion de los datos de la misma
    public static void main(String[] args) {
//        Main pizza = new Main("Pepperoni Deluxe", Topping.tomate, Topping.queso, Topping.pepperoni);
////        System.out.println("\nDetalles de la pizza:");
////        System.out.println(pizza);
////        System.out.println("Precio total: Q" + pizza.getTotalPrice());
////        System.out.println("\n───────────────────────────────");
////        //Cambio de precio del queso
////        pizza.setToppingPrice("Queso", 14.5);
////        System.out.println("\nDetalles de la Pizza con precio final:");
////        System.out.println(pizza);
////        System.out.println("Precio total: Q" + pizza.getTotalPrice());
////
////        pizza.preparePizza();
////        pizza.finishPreparingPizza();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Selecciona una opción:");
            System.out.println("1. Pizza de Pepperoni");
            System.out.println("2. Pizza de Queso");
            System.out.println("3. Pizza Hawaiana");
            System.out.println("4. Pizza Personalizada");
            System.out.println("5. Salir");

            //Se lee la opcion que el usuario ingresa
            int choice = scanner.nextInt();
            scanner.nextLine();

            //Se crea un switch para que el usuario pueda elegir la pizza que desea
            switch (choice) {
                case 1:
                    Main pizzaPeperoniDeLuxe = new Main("Pepperoni Deluxe", Topping.base, Topping.tomate, Topping.queso, Topping.pepperoni);
                    System.out.println("\nDetalles de la pizza:");
                    System.out.println(pizzaPeperoniDeLuxe);
                    System.out.println("Precio total: Q" + pizzaPeperoniDeLuxe.getTotalPrice());
                    System.out.println("\n───────────────────────────────");
                    //Cambio de precio del tomate
                    pizzaPeperoniDeLuxe.setToppingPrice("Tomate", 6.5);
                    System.out.println("\nDetalles de la Pizza con precio final:");
                    System.out.println(pizzaPeperoniDeLuxe);
                    System.out.println("Precio total: Q" + pizzaPeperoniDeLuxe.getTotalPrice());
                    pizzaPeperoniDeLuxe.preparePizza();
                    pizzaPeperoniDeLuxe.finishPreparingPizza();
                    break;
                case 2:
                    Main pizzaCheeseLovers = new Main("Pepperoni Deluxe",Topping.base, Topping.queso);
                    System.out.println("\nDetalles de la pizza:");
                    System.out.println(pizzaCheeseLovers);
                    System.out.println("Precio total: Q" + pizzaCheeseLovers.getTotalPrice());
                    System.out.println("\n───────────────────────────────");
                    //Cambio de precio del queso
                    pizzaCheeseLovers.setToppingPrice("Queso", 14.5);
                    System.out.println("\nDetalles de la Pizza con precio final:");
                    System.out.println(pizzaCheeseLovers);
                    System.out.println("Precio total: Q" + pizzaCheeseLovers.getTotalPrice());
                    pizzaCheeseLovers.preparePizza();
                    pizzaCheeseLovers.finishPreparingPizza();

                    break;
                case 3:
                    Main pizzaHawaianaSupreme = new Main("Pepperoni Deluxe", Topping.base, Topping.pinia);
                    System.out.println("\nDetalles de la pizza:");
                    System.out.println(pizzaHawaianaSupreme);
                    System.out.println("Precio total: Q" + pizzaHawaianaSupreme.getTotalPrice());
                    System.out.println("\n───────────────────────────────");
                    //Cambio de precio de la piña
                    pizzaHawaianaSupreme.setToppingPrice("Piña", 7.0);
                    System.out.println("\nDetalles de la Pizza con precio final:");
                    System.out.println(pizzaHawaianaSupreme);
                    System.out.println("Precio total: Q" + pizzaHawaianaSupreme.getTotalPrice());
                    pizzaHawaianaSupreme.preparePizza();
                    pizzaHawaianaSupreme.finishPreparingPizza();

                    break;
                case 4:
                    createCustomPizza(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del menu.");
                    System.out.println("Gracias por su tiempo!!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Selección invalida, por favor intentalo de nuevo.");
            }
        }
    }
    public static void createCustomPizza(Scanner scanner) {
        System.out.println("\nToppings actualmente disponibles:");

        int toppingNumber = 1;
        for (Topping topping : Topping.getAllToppings()) {
            System.out.println(toppingNumber + ". " + topping.getName() + " (Q" + topping.getPrice() + ")");
            toppingNumber++;
        }
        System.out.println("\nRecuerda siempre agregar la base de la Pizza (Q30.0)");
        System.out.println("Introduce el numero de los toppings que deseas agregar (Separados por una coma):");
        String toppingsInput = scanner.nextLine();
        String[] selectedToppingsNumbers = toppingsInput.split(",");

        double totalPrice = 0.0;
        Topping[] chosenToppings = new Topping[selectedToppingsNumbers.length];
        for (int i = 0; i < selectedToppingsNumbers.length; i++) {
            int toppingIndex = Integer.parseInt(selectedToppingsNumbers[i].trim()) - 1;
            if (toppingIndex >= 0 && toppingIndex < Topping.getAllToppings().length) {
                Topping chosenTopping = Topping.getAllToppings()[toppingIndex];
                chosenToppings[i] = chosenTopping;
                totalPrice += chosenTopping.getPrice();
            } else {
                System.out.println("\nHas intentado un numero de topping invalido, por favor intentalo de nuevo. ");
                System.exit(0);
            }
        }

        Main customPizza = new Main("Pizza personalizada", chosenToppings);
        System.out.println("\nTu pizza personalizada:");
        System.out.println(customPizza);
        customPizza.preparePizza();
        customPizza.finishPreparingPizza();
        System.out.println("Precio total de los toppings de tu pizza: Q" + totalPrice);
    }
}
