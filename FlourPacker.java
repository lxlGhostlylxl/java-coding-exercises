public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigBags, int smallBags, int goal) {

        if (bigBags < 0 || smallBags < 0 || goal < 0) {
            return false;
        }

        int bigBagSum = bigBags * 5;

        if (bigBagSum + smallBags >= goal) {
            // Enough bags exist, but can they be evenly divided?
            if ((bigBagSum + smallBags) % goal == 0) {
                // Exactly enough bags exist
                return true;
            } else if ((goal - bigBagSum) <= 0 && (goal % 5) <= smallBags) {
                // If we have more then enough big bags that are required and a small amount of
                // small bags to cover the differnce (I.E: (6,2,17)
                return true;
            } else if ((goal - bigBagSum) > 0 && (goal - bigBagSum) - smallBags <= 0) {
                // If we dont have enough big bags, but we have plenty of small ones
                return true;
            } else {
                // Can't divide bags evenly
                return false;
            }
        } else {
            // Not enough bags exist
            return false;
        }

    }
}
