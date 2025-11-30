package ma.ws.jaxrs.TP7.controllers;

import jakarta.ws.rs.*;                       // <- JAKARTA (pas javax)
import jakarta.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;
import ma.ws.jaxrs.TP7.repositories.CompteRepository;
import ma.ws.jaxrs.TP7.entities.Compte;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {

    @Autowired
    private CompteRepository repo;

    @GET @Path("/comptes")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Compte> getComptes() { return repo.findAll(); }
}