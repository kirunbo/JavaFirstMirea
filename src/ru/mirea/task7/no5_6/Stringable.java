package ru.mirea.task7.no5_6;

public interface Stringable {
    int countSymbols(String string);
    String oddSymbols(String string);
    String reverseString(String string);
}

class ProcessStrings implements Stringable{
    @Override
    public int countSymbols(String string) {
        return string.length();
    }

    @Override
    public String oddSymbols(String string) {
        String result = "";
        char[] array = string.toCharArray();
        for (int i = 0; i < string.length(); i+=2) {
            result += array[i];
        }

        return result;
    }

    @Override
    public String reverseString(String string) {
        String result = "";
        char[] array = string.toCharArray();
        for (int i = string.length() - 1; i >= 0; i--) {
            result += array[i];
        }

        return result;
    }
}

class Main{
    public static void main(String[] args) {
        String test = "Hello";
        ProcessStrings process = new ProcessStrings();
        System.out.println(process.countSymbols(test));
        System.out.println(process.oddSymbols(test));
        System.out.println(process.reverseString(test));
    }
}
