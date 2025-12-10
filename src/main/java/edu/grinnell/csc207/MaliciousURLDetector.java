package edu.grinnell.csc207;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.function.Function;

/**
 * A simple malicious URL detector program that utilizes a Bloom Filter and a
 * dataset of known malicious URLs to efficiently check whether a URL is
 * potentially malicious.
 */
public class MaliciousURLDetector {
    // From: https://www.kaggle.com/datasets/sid321axn/malicious-urls-dataset
    public static final String DATA_PATH = "data/malicious_phish.csv";



    /**
     * Creates a list of <code>num</code> string hash functions utilizing the
     * Murmur3 hashing algorithm.
     * @param num the number of hash functions
     * @return a list of <code>num</code> string hash functions
     */
    public static List<Function<String, Integer>> makeStringHashFunctions(int num) {
        // TODO: implement me!
        return null;
    }

    /**
     * @param numBits the number of bits dedicated to the filter
     * @param numHashFunctions the number of hash functions to use
     * @return a Bloom filter for detecting malicious URLs.
     */
    public static BloomFilter<String> makeURLFilter(
            int numBits, int numHashFunctions) throws FileNotFoundException {
        // TODO: implement me!
        return null;
    }

    /**
     * The main method for the program.
     * @param args the arguments to the program
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.err.println("Usage: java MaliciousURLDetector <numBits> <numHashFunctions>");
            return;
        }

        // TODO: implement me!
    }
}
