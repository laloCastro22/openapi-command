package uam.prueba.controller;

import org.springframework.http.ResponseEntity;
import uam.prueba.openapi.api.IniciarSesionApi;
import uam.prueba.openapi.model.Credenciales;
import uam.prueba.openapi.model.SessionToken;

public class LoginController implements IniciarSesionApi {
    @Override
    public ResponseEntity<SessionToken> iniciarSesion(Credenciales credenciales) {
        return null;
    }
}
