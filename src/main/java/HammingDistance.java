public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // Perform bitwise XOR to find the positions where bits are different
        int distance = 0;

        // Count the number of set bits (1s) in the XOR result
        while (xor != 0) {
            // Increment the distance when the least significant bit is set (equals 1)
            distance += xor & 1;
            // Right shift the XOR result to check the next bit
            xor >>= 1;
        }

        return distance;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        System.out.println("Hamming distance between " + x + " and " + y + ": " + hammingDistance(x, y));
    }
}
