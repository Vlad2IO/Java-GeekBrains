import java.util.HashSet;
import java.util.Set;

public class Filter {

    public static Set<Laptop> filterByRAM(Set<Laptop> notebooks, int minRAM) {
        Set<Laptop> filteredNotebooks = new HashSet<>();
        for (Laptop notebook : notebooks) {
            if (notebook.getRam() >= minRAM) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public static Set<Laptop> filterByHDD(Set<Laptop> notebooks, int minHDD) {
        Set<Laptop> filteredNotebooks = new HashSet<>();
        for (Laptop notebook : notebooks) {
            if (notebook.getHdd() >= minHDD) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public static Set<Laptop> filterByOperatingSystem(Set<Laptop> notebooks, String operatingSystem) {
        Set<Laptop> filteredNotebooks = new HashSet<>();
        for (Laptop notebook : notebooks) {
            if (notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public static Set<Laptop> filterByColor(Set<Laptop> notebooks,
            String color) {
        Set<Laptop> filteredNotebooks = new HashSet<>();
        for (Laptop notebook : notebooks) {
            if (notebook.getColor().equalsIgnoreCase(color)) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}
