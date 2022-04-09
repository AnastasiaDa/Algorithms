package com.company;

public class Main {

    public static void main(String[] args) {

        int[] books = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        getNumberOfBook(books, 32);
        getNumberOfBook(books, 60);
        getNumberOfBook(books, 20);
        getNumberOfBook(books, 10);

    }

    public static void getNumberOfBook(int[] arr, int pages) {

        int firstBook = 0;
        int lastBook = arr.length - 1;
        int count = 0;

        while (firstBook < lastBook) {

            int middleBook = (int) Math.ceil((lastBook + firstBook) / 2);

            if (arr[middleBook] <= pages) {
                if (arr[middleBook + 1] > pages) {
                    count = arr.length - 1 - middleBook;
                    break;
                } else if (arr[middleBook + 1] <= pages) {
                    firstBook = middleBook;
                }
            } else if (arr[middleBook] > pages) {
                lastBook = middleBook;
            }

            if (arr[firstBook] > pages) {
                count = arr.length;
                break;
            }

            if (arr[lastBook] <= pages) {
                count = 0;
                break;
            }
        }
        System.out.println("The number of the books with more than " + pages + " pages - " + count);
    }
}
