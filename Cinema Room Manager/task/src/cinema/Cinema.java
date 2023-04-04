package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInRow = s.nextInt();
        int allSeats = rows * seatsInRow;
        //int income = 0;

        /*if (allSeats <= 60) {
            income = allSeats * 10;
        } else {
            if (rows % 2 == 0){
                int halfSeats = allSeats / 2;
                income = halfSeats * 10 + halfSeats * 8;
            }   else {
                int firstHalfRows = rows / 2;
                int secondHalfRows = rows - rows / 2;
                income = firstHalfRows * seatsInRow * 10 + secondHalfRows * seatsInRow * 8;
            }
        }*/


        //String incomeString = "Total income:\n" + "$" + income;

        System.out.println("\nCinema:");

        firstLine(seatsInRow);

        for (int i = 0, n = 1; i < rows; i++, n++) {
            System.out.print(n + " ");

            for (int o = 1; o <= seatsInRow; o++) {
                if (o == seatsInRow) {
                    System.out.print("S\n");
                }else {
                    System.out.print("S ");
                }
            }
        }

        System.out.println("\nEnter a row number:");
        int row = s.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = s.nextInt();

        //System.out.println(incomeString);

        //calculate ticket price
        int ticketPrice = 0;
        if (allSeats <= 60 || (row <= rows / 2)) {
            ticketPrice = 10;
        }else {
            ticketPrice = 8;
        }

        System.out.println("\nTicket price: $" + ticketPrice);


        System.out.println("\nCinema:");
        firstLine(seatsInRow);

        for (int i = 0, n = 1; i < rows; i++, n++) {
            System.out.print(n + " ");

            for (int o = 1; o <= seatsInRow; o++) {
                if (i == row -1 && o == seat){
                    if (o == seatsInRow) {
                        System.out.print("B\n");
                    }else {
                        System.out.print("B ");
                    }
                }else {

                    if (o == seatsInRow) {
                        System.out.print("S\n");
                    } else {
                        System.out.print("S ");
                    }
                }
            }
        }

    }



    private static void firstLine(int seatsInRow) {
        for (int i = 0; i <= seatsInRow; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                if (i != seatsInRow) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + "\n");
                }
            }
        }
    }
}