package api.log.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import api.log.services.CitasService;
import api.log.models.CitasModel;

import java.util.ArrayList;

@RestController
@RequestMapping("/citas")
public class CitasController {

    @Autowired
    CitasService citasService;

    @GetMapping("/all")
    public ArrayList<CitasModel> getAllCitas() {
        return citasService.getAllCitas();
    }

    @PostMapping("/save")
    public CitasModel saveCita(@RequestBody CitasModel cita) {
        return this.citasService.saveCita(cita);
    }
    
}
