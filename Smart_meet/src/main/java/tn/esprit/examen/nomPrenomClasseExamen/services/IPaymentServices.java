package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Payment;

import java.util.List;

public interface IPaymentServices {
    Payment addPayment(Payment payment);
    Payment retrievePayment(int id);
    List<Payment> retrieveAllPayments();
    void deletePayment(int id);
    void updatePayment(int id , Payment payment);
}