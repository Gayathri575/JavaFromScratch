package August16;

public class AssignmentOperators {
    public static void main(String[] args) {

        int f = 7; // Initial value
        System.out.println("Initial f: " + f);

        // Arithmetic assignment operators
        System.out.println("f += 3  -> " + (f += 3));  // f = f + 3
        System.out.println("f -= 2  -> " + (f -= 2));  // f = f - 2
        System.out.println("f *= 4  -> " + (f *= 4));  // f = f * 4
        System.out.println("f /= 3  -> " + (f /= 3));  // f = f / 3
        System.out.println("f %= 2  -> " + (f %= 2));  // f = f % 2

        // Bitwise assignment operators
        System.out.println("f &= 0b1010  -> " + (f &= 0b1010)); // f = f & 1010 (binary)
        System.out.println("f |= 0b1100  -> " + (f |= 0b1100)); // f = f | 1100
        System.out.println("f ^= 0b1010  -> " + (f ^= 0b1010)); // f = f ^ 1010

        // Shift assignment operators
        System.out.println("f <<= 2  -> " + (f <<= 2)); // f = f << 2 (shift left)
        System.out.println("f >>= 1  -> " + (f >>= 1)); // f = f >> 1 (shift right)
        System.out.println("f >>>= 1 -> " + (f >>>= 1)); // f = f >>> 1 (logical shift right)
    }
}
