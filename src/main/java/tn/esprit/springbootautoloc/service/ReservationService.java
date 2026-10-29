package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation saveReservation(Reservation reservation);

    void deleteReservation(Long idReservation);
    Reservation getReservationById(Long idReservation);

    List<Reservation> getAllReservations();

}
