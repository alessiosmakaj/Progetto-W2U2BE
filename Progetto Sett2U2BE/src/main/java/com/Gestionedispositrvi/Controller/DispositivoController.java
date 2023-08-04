package com.GestioneDispositivi.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestioneDispositivi.Serivice.DispositivoService;
import com.GestioneDispositivi.model.Dispositivo;

@RestController
@RequestMapping("/dispositivi")
public class DispositivoController {
Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired DispositivoService dservice;

@GetMapping
public ResponseEntity<List<Dispositivo>> getAllDispositivi (){
	return new ResponseEntity<List<Dispositivo>>(dservice.getAlldispositivo(),HttpStatus.OK); 
		
}

@GetMapping("/id")
public ResponseEntity<Dispositivo> getDispositoid (Long id){
	return new ResponseEntity<Dispositivo>(dservice.getDispositivo(id),HttpStatus.OK); 
		
}


}
