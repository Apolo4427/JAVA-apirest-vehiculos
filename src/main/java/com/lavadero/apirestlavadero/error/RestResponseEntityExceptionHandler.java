package com.lavadero.apirestlavadero.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lavadero.apirestlavadero.error.dto.ErrorMessage;

@ControllerAdvice //indicamos que esta clase manejara las exceptions glovales que puedan ocurrir en la aplicacion
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(VehiculoNoFundException.class)//manejos de: (no se ha encontrado un vehiculo en la base de datos), se hace:
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorMessage> vehiculoNoFundException(VehiculoNoFundException exception){//devolvemos un ResponseEntity<ErrorMessage> con nuestra platilla creada ("ErrorMessage")
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }


}
