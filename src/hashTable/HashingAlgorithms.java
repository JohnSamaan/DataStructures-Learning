package hashTable;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class HashingAlgorithms {
    public static <T> long FNV_a(T input){
        String newInput = (String) input;
        byte[] inputBytes = newInput.getBytes(StandardCharsets.UTF_8);
            long hash=2166136261L;
            long prime=16777619;

        for (byte inputByte : inputBytes) {
            hash = hash ^ inputByte;
            hash = hash * prime;
        }
        return hash;
    }
} // class
