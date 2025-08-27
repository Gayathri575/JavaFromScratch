package August26;
import java.util.stream.IntStream;

public class StringBufferDemo {

        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Hello");

            // append
            sb.append(" World");
            System.out.println("append(): " + sb);

            // appendCodePoint
            sb.appendCodePoint(33); // Unicode for '!'
            System.out.println("appendCodePoint(): " + sb);

            // length
            System.out.println("length(): " + sb.length());

            // capacity
            System.out.println("capacity(): " + sb.capacity());

            // ensureCapacity
            sb.ensureCapacity(50);
            System.out.println("ensureCapacity(50) → capacity: " + sb.capacity());

            // trimToSize
            sb.trimToSize();
            System.out.println("trimToSize() → capacity: " + sb.capacity());

            // charAt
            System.out.println("charAt(1): " + sb.charAt(1));

            // setCharAt
            sb.setCharAt(0, 'h');
            System.out.println("setCharAt(0,'h'): " + sb);

            // insert
            sb.insert(5, " Java");
            System.out.println("insert(5, \" Java\"): " + sb);

            // replace
            sb.replace(6, 10, "C++");
            System.out.println("replace(6,10,\"C++\"): " + sb);

            // delete
            sb.delete(6, 9);
            System.out.println("delete(6,9): " + sb);

            // deleteCharAt
            sb.deleteCharAt(0);
            System.out.println("deleteCharAt(0): " + sb);

            // reverse
            sb.reverse();
            System.out.println("reverse(): " + sb);
            sb.reverse(); // reverse back

            // getChars
            char[] arr = new char[5];
            sb.getChars(0, 5, arr, 0);
            System.out.println("getChars(0,5): " + new String(arr));

            // indexOf
            System.out.println("indexOf(\"World\"): " + sb.indexOf("World"));

            // lastIndexOf
            sb.append(" World");
            System.out.println("lastIndexOf(\"World\"): " + sb.lastIndexOf("World"));

            // substring
            System.out.println("substring(0,5): " + sb.substring(0, 5));

            // subSequence
            CharSequence seq = sb.subSequence(0, 5);
            System.out.println("subSequence(0,5): " + seq);

            // setLength
            sb.setLength(5);
            System.out.println("setLength(5): " + sb);

            // toString
            String str = sb.toString();
            System.out.println("toString(): " + str);

            // chars()
            IntStream stream1 = sb.chars();
            System.out.print("chars(): ");
            stream1.forEach(ch -> System.out.print((char) ch + " "));
            System.out.println();

            // codePoints()
            IntStream stream2 = sb.codePoints();
            System.out.print("codePoints(): ");
            stream2.forEach(cp -> System.out.print(cp + " "));
            System.out.println();

            // codePointAt
            System.out.println("codePointAt(0): " + sb.codePointAt(0));

            // codePointBefore
            System.out.println("codePointBefore(1): " + sb.codePointBefore(1));

            // codePointCount
            System.out.println("codePointCount(0, sb.length()): " + sb.codePointCount(0, sb.length()));

            // offsetByCodePoints
            int newIndex = sb.offsetByCodePoints(0, 1);
            System.out.println("offsetByCodePoints(0,1): " + newIndex);
        }
    }

