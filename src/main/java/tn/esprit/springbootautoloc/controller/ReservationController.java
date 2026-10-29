package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Reservation;
import tn.esprit.springbootautoloc.service.ReservationService;
import tn.esprit.springbootautoloc.service.ReservationServiceImp;

import java.util.List;

@Tag(name="Gestion des reservations" , description = "CRUD des Reservations")
@RestController
@RequestMapping("/Reservation")

public class ReservationController {

    private ReservationServiceImp reservationService;
    public ReservationController(ReservationServiceImp reservationService) {
        this.reservationService = reservationService;
    }

    @Operation(summary = "AJOUT RESERVATION")
    @PostMapping("/ajouterReservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    @Operation(summary = "SUPPRIMER RESERVATION")
    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping("/getById/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
}
