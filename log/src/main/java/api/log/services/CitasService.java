package api.log.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import api.log.repositories.CitasRepository;
import api.log.models.CitasModel;
import java.util.ArrayList;

@Service
public class CitasService {
    
    @Autowired
    CitasRepository citasRepository;
    
    public ArrayList<CitasModel> getAllCitas() {
        return (ArrayList<CitasModel>) citasRepository.findAll();
    }

    public CitasModel saveCita(CitasModel cita) {
        return citasRepository.save(cita);
    }
}
