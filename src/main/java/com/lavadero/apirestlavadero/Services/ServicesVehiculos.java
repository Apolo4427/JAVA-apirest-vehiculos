package com.lavadero.apirestlavadero.Services;

import java.util.List;
//import java.util.Optional;


import com.lavadero.apirestlavadero.Entities.Vehiculo;

public interface ServicesVehiculos {

    List<Vehiculo> findAllVehiculos();
    Vehiculo saveVehiculo(Vehiculo vehiculo);
    Vehiculo updateVehiculo(String Placa, Vehiculo vehiculo);
    //String deleteVehiculo(String placa);
    //Optional<Vehiculo> findVehiculoByPlaca(String placa);
    String deleteVehiculoByPlaca(String placa);

}
