public class ShippingQuote {

    public static void main(String[] args) {
        // Constants 
        int weight = 10;
        int length = 12;
        int height = 8;
        int width = 6;

        int maxWeight = 50;
        double weightRate = 0.75;
        double sizeRate = 0.60;


        int volume = volume(length, height, width);
        double sizeFactor = sizeFactor(volume);
        double weightCost = weightCost(weight, weightRate);
        double sizeCost = sizeCost(sizeFactor, sizeRate);
        double finalCost = finalCost(weightCost, sizeCost);

        // checks to see if package is overweight then adds 10 to final cost if true
        boolean isOverWeight = overWeight(weight, maxWeight);
        if (isOverWeight) {
            finalCost += 10.0;
        }

    
        //Output
        System.out.println("Volume: " + volume);
        System.out.println("Size Factor (sqrt volume): " + sizeFactor);
        System.out.println("Over Weight limit? " + isOverWeight);
        System.out.println("Final Shipping Cost: $" + finalCost);
    
    }

    // Method 1: Weight * Weight Rate = Weight Cost 
    public static double weightCost(int weight, double weightRate) {
        return weight * weightRate;
    }

    // Method 2; length * height * width = volume
    public static int volume(int length, int height, int width) {
        return length * height * width;
    }
    
    // Method 3: sqrt(volume) = sizeFactor
    public static double sizeFactor(int volume) {
        return Math.sqrt(volume); 
    }

    // Method 4: sqrt(volume) * size rate = size cost 
    public static double sizeCost(double sizeFactor, double sizeRate) {
        return sizeFactor * sizeRate;
    }

    // Method 5: weight cost + size cost = final cost
    public static double finalCost(double weightCost, double sizeCost) {
        return weightCost + sizeCost;
    }

    // Method 6: a boolean method to check if the box is over max weight or not
    public static boolean overWeight(int weight, int maxWeight) {
        return weight > maxWeight;
    }
}