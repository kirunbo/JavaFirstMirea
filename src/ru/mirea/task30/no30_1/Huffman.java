package ru.mirea.task30.no30_1;

import java.util.PriorityQueue;
import java.util.Comparator;

class HuffmanNode {
    int data;
    char ch;
    HuffmanNode left, right;
}

public class Huffman {
    public void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isDefined(root.ch)) {
            System.out.println(root.ch + ": " + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public HuffmanNode buildHuffmanTree(char[] charArray, int[] charFreq) {
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.data));

        for (int i = 0; i < charArray.length; i++) {
            HuffmanNode node = new HuffmanNode();
            node.ch = charArray[i];
            node.data = charFreq[i];
            node.left = null;
            node.right = null;
            queue.add(node);
        }

        while (queue.size() > 1) {
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();
            HuffmanNode newNode = new HuffmanNode();
            newNode.data = left.data + right.data;
            newNode.ch = '-';
            newNode.left = left;
            newNode.right = right;
            queue.add(newNode);
        }
        return queue.poll();
    }
}

class HuffmanExample {
    public static void main(String[] args) {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        int[] charFreq = { 12, 40, 15, 8, 25 };

        Huffman huffman = new Huffman();
        HuffmanNode root = huffman.buildHuffmanTree(charArray, charFreq);

        System.out.println("Huffman codes:");
        huffman.printCode(root, "");
    }
}
