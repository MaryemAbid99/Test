package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Document;

import java.util.List;

public interface IDocumentServices {
    Document addDocument(Document document);
    List<Document> retrieveAllDocuments();
    Document retrieveDocument(Integer id);
    void deleteDocument(Integer id);
    void updateDocument(int id , Document document);
}
