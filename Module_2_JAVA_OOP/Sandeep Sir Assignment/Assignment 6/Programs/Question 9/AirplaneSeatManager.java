package com.in.RahulBharaskar;

public class AirplaneSeatManager {
    private SeatStatus[][] seats;
    private int rows;
    private int columns;

    public AirplaneSeatManager(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new SeatStatus[rows][columns];
        initializeSeats();
    }

    // Initialize all seats as available
    private void initializeSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = SeatStatus.AVAILABLE;
            }
        }
    }

    // Book a seat 
    public boolean bookSeat(int row, int column) {
        if (isValidSeat(row, column) && seats[row][column] == SeatStatus.AVAILABLE) {
            seats[row][column] = SeatStatus.BOOKED;
            return true;
        }
        return false;
    }

    public boolean cancelSeat(int row, int column) {
        if (isValidSeat(row, column) && seats[row][column] == SeatStatus.BOOKED) {
            seats[row][column] = SeatStatus.AVAILABLE;
            return true;
        }
        return false;
    }

    public boolean isSeatAvailable(int row, int column) {
        if (isValidSeat(row, column)) {
            return seats[row][column] == SeatStatus.AVAILABLE;
        }
        return false;
    }

   
    public void displaySeats() {
        System.out.println("\nCurrent Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j].getSymbol() + " ");
            }
            System.out.println();
        }
    }

    // Helper method to check if the seat is within valid range
    private boolean isValidSeat(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
}

