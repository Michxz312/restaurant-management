package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Reservations {
    final private List<String> columns;
    private List<Vector<Object>> tuples;

    public Reservations() {
        columns = new ArrayList<>();
        columns.add("Reservation ID");
        columns.add("Customer ID");
        columns.add("Branch ID");
        columns.add("Host");
        columns.add("Date");
        columns.add("Time");
        columns.add("Number of People");
        columns.add("Reservation Name");

        tuples = new ArrayList<>();
    }

    public List<String> getColumns() {
        return Collections.unmodifiableList(columns);
    }

    public List<Vector<Object>> getTuples() {
        return Collections.unmodifiableList(tuples);
    }

    public void addReservation(Reservation reservation) {
        Vector<Object> tuple = new Vector<>();
        tuple.add(0, reservation.getRId());
        tuple.add(1, reservation.getCId());
        tuple.add(2, reservation.getLocId());
        tuple.add(3, reservation.getWId());
        tuple.add(4, reservation.getDate());
        tuple.add(5, reservation.getTime());
        tuple.add(6, reservation.getNumOfPeople());
        tuple.add(7, reservation.getReservationName());
        
        tuples.add(tuple);
    }
}
