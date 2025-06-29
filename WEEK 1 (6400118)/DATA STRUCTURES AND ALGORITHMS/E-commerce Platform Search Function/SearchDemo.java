
public class SearchDemo {

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Notebook", "Stationery"),
            new Product(4, "Backpack", "Accessories"),
            new Product(5, "Headphones", "Electronics")
        };

        Product result1 = linearSearch(products, "Shoes");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        Product result2 = binarySearch(products, "Backpack");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        java.util.Arrays.sort(products, java.util.Comparator.comparing(Product::getProductName));
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = name.compareToIgnoreCase(products[mid].getProductName());
            if (cmp == 0) {
                return products[mid]; 
            }else if (cmp < 0) {
                right = mid - 1; 
            }else {
                left = mid + 1;
            }
        }
        return null;
    }
}
