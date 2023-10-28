import java.util.Arrays;
import java.util.Comparator;
/**
 * This class represents a cosmetic product.
 */
public class Cosmetic {
    private String name;
    private String brand;
    private double price;
    private int rating;
    private boolean organic;

    /**
     * Constructor for creating a cosmetic product.
     *
     * @param name    The name of the cosmetic product.
     * @param brand   The brand of the cosmetic product.
     * @param price   The price of the cosmetic product.
     * @param rating  The rating of the cosmetic product.
     * @param organic Whether the cosmetic product is organic.
     */

    public Cosmetic(String name, String brand, double price, int rating, boolean organic) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
        this.organic = organic;
    }
    // Getters and setters for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    /**
     * Sorts an array of cosmetic products by price in ascending order.
     *
     * @param cosmetics The array of cosmetic products to be sorted.
     */
    public static void sortByPriceAscending(Cosmetic[] cosmetics) {
        try {
            Arrays.sort(cosmetics, Comparator.comparingDouble(Cosmetic::getPrice)); 
        } catch (Exception e) {
            System.err.println("Sort by price error");
            e.printStackTrace();
        }

    }

    /**
     * Sorts an array of cosmetic products by rating in descending order.
     *
     * @param cosmetics The array of cosmetic products to be sorted.
     */

    public static void sortByRatingDescending(Cosmetic[] cosmetics) {
        try {
            Arrays.sort(cosmetics, (c1, c2) -> Double.compare(c2.getRating(), c1.getRating()));
        } catch (Exception e) {
            System.err.println("Sort by rating error");
            e.printStackTrace();
        }

    }

    /**
     * Returns a string representation of the cosmetic product.
     *
     * @return A string representing the cosmetic product.
     */
    
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", organic=" + organic +
                '}';
    }
}