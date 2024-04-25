package com.lavadero.apirestlavadero.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lavadero.apirestlavadero.Entities.Vehiculo;
import com.lavadero.apirestlavadero.Services.ServicesVehiculosImpl;

import java.util.List;
import java.util.Objects;

@RestController
public class VehiculoController {

    @Autowired//inject services
    ServicesVehiculosImpl servicesVehiculosImpl;

    @GetMapping("/vehiculos")
    public List<Vehiculo> findAllVehiculos(){
        return servicesVehiculosImpl.findAllVehiculos();
    }

    @PostMapping("/registrar")
    public Vehiculo registerVehiculo(@RequestBody Vehiculo vehiculo){
        if(Objects.nonNull(vehiculo.getPlaca()) && !vehiculo.getPlaca().isEmpty()){
            if(vehiculo.getPlaca().contains("-")){
                return servicesVehiculosImpl.saveVehiculo(vehiculo);
            }
        }
        return null;
    }

    @PutMapping("/actualizar/{placa}")
    public Vehiculo actualizarVehiculo(@PathVariable String placa, @RequestBody Vehiculo vehiculo){
        return servicesVehiculosImpl.updateVehiculo(placa, vehiculo);
    }

    @DeleteMapping("/{placa}")
    public String eliminarVehiculo(@PathVariable String placa){
       // return    servicesVehiculosImpl.deleteVehiculo(id);
       return servicesVehiculosImpl.deleteVehiculoByPlaca(placa);
    }

    
}
