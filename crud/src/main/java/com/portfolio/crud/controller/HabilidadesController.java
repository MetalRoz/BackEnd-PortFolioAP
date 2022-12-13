package com.portfolio.crud.controller;

import com.portfolio.crud.dto.HabilidadesDto;
import com.portfolio.crud.dto.Mensaje;
import com.portfolio.crud.entity.Habilidades;
import com.portfolio.crud.service.HabilidadesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadesController {

    @Autowired
    HabilidadesService habilidadesService;

    @GetMapping("/listahab")
    public ResponseEntity<List<Habilidades>> list() {
        List <Habilidades> list = habilidadesService.list();
        return  new ResponseEntity<List<Habilidades>>(list, HttpStatus.OK);
    }

    @GetMapping("/listahab/{id}")
    public ResponseEntity<Habilidades> getById(@PathVariable("id") int id){
        if (!habilidadesService.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        Habilidades habilidades = habilidadesService.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }

    @GetMapping("/detailhab/{titulo}")
    public ResponseEntity<Habilidades> getByNombre(@PathVariable("Nombre") String nombre){
        if (!habilidadesService.existsByNombre(nombre))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        Habilidades habilidades = habilidadesService.getByNombre(nombre).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }

    @PostMapping("/createhab")
    public ResponseEntity<?> create(@RequestBody HabilidadesDto habilidadesDto){
        if (StringUtils.isBlank(habilidadesDto.getUrlimagen()))
            return new ResponseEntity(new Mensaje("La URL de la imagen es obligatorio"), HttpStatus.BAD_REQUEST);
        if (StringUtils.isBlank(habilidadesDto.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if (StringUtils.isBlank(habilidadesDto.getDescripcion()))
            return new ResponseEntity(new Mensaje("La descripción es obligatoria"), HttpStatus.BAD_REQUEST);
        Habilidades habilidades = new Habilidades(habilidadesDto.getUrlimagen(), habilidadesDto.getNombre(), habilidadesDto.getDescripcion());
        habilidadesService.save(habilidades);
        return new ResponseEntity(new Mensaje("Se ha creado exitosamente"), HttpStatus.OK);

    }

    @PutMapping("/updatehab/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody HabilidadesDto habilidadesDto){
        if(StringUtils.isBlank(habilidadesDto.getUrlimagen()))
            return new ResponseEntity(new Mensaje("La URL de la imagen es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(habilidadesDto.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(habilidadesDto.getDescripcion()))
            return new ResponseEntity(new Mensaje("La descripción es obligatoria"), HttpStatus.BAD_REQUEST);

        Habilidades habilidades = habilidadesService.getOne(id).get();
        habilidades.setUrlimagen(habilidadesDto.getUrlimagen());
        habilidades.setNombre(habilidadesDto.getNombre());
        habilidades.setDescripcion(habilidades.getDescripcion());
        habilidadesService.save(habilidades);
        return new ResponseEntity(new Mensaje("Se ha actualizado existosamente"), HttpStatus.OK);
    }

    @DeleteMapping("/deletehab/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!habilidadesService.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        habilidadesService.delete(id);
        return new ResponseEntity(new Mensaje("Eliminado exitosamente"), HttpStatus.OK);
    }
}