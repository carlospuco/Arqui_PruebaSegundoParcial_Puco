package com.pucoexamen.pruebaparcial2carlos.Controller;

import javax.xml.crypto.dsig.TransformService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pucoexamen.pruebaparcial2carlos.Model.Turno;
import com.pucoexamen.pruebaparcial2carlos.Service.TurnoSetvice;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {
    
    private final TurnoSetvice turnoService;

    
    public TurnoController(TurnoSetvice turnoService) {
        this.turnoService = turnoService;
    }

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    public ResponseEntity<String> saveAssociatedService(@RequestBody Turno turno) {
        try{
            this.turnoService.crearTurno(turno);   
            return ResponseEntity.ok().build();
        }catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<String> updateTurno(@RequestBody Turno turnoEntity) {
		this.turnoService.updateTurno(turnoEntity);
		return ResponseEntity.ok("Informacion del turno fue actulizada correctamente");
	}







}
