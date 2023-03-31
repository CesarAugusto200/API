package api.log.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import api.log.services.CitasService;
import api.log.models.CitasModel;

import java.util.ArrayList;

@RestController
@RequestMapping("/citas")
public class CitasController {

    @Autowired
    CitasService citasService;

    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @GetMapping("/all")
    public ArrayList<CitasModel> getAllCitas() {
        return citasService.getAllCitas();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @PostMapping("/save")
    public CitasModel saveCita(@RequestBody CitasModel cita) {
        return this.citasService.saveCita(cita);
    }
    
}
