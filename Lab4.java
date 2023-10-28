/**
 * This class demonstrates the sorting of cosmetic products.
 */
public class Lab4 {
    public static void main(String[] args) {
        try {
            int studentBook = 1106; 
            int C11 = studentBook % 11;
            System.out.println("C11:" + C11); // 6 => Визначити клас косметика, який складається як мінімум з 5-и полів
            Cosmetic[] cosmetics = {
                new Cosmetic("Lipstick", "BrandA", 10.99, 4, true),
                new Cosmetic("Mascara", "BrandB", 8.99, 3, false),
                new Cosmetic("Foundation", "BrandC", 15.99, 5, true),
                new Cosmetic("Eyeshadow", "BrandA", 12.99, 4, false),
                new Cosmetic("Blush", "BrandB", 9.99, 3, true)
            };

            System.out.println("Unsorted array:");
            for (Cosmetic cosmetic : cosmetics) {
                System.out.println(cosmetic);
            }

            Cosmetic.sortByPriceAscending(cosmetics);
            System.out.println("\nSort by price (ascending):");
            for (Cosmetic cosmetic : cosmetics) {
                System.out.println(cosmetic);
            }
            Cosmetic.sortByRatingDescending(cosmetics);
            System.out.println("\nSort by rating (descending):");
            for (Cosmetic cosmetic : cosmetics) {
                System.out.println(cosmetic);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}