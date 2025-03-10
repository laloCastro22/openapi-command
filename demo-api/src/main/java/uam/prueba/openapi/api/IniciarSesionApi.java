/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package uam.prueba.openapi.api;

import uam.prueba.openapi.model.Credenciales;
import uam.prueba.openapi.model.Error;
import uam.prueba.openapi.model.SessionToken;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "iniciarSesion", description = "the iniciarSesion API")
public interface IniciarSesionApi {

    /**
     * POST /iniciarSesion : Iniciar sesión
     * Recupera el token de inicio de sesión de un usuario
     *
     * @param credenciales  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     */
    @Operation(
        operationId = "iniciarSesion",
        summary = "Iniciar sesión",
        description = "Recupera el token de inicio de sesión de un usuario",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SessionToken.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/iniciarSesion",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<SessionToken> iniciarSesion(
        @Parameter(name = "Credenciales", description = "") @Valid @RequestBody(required = false) Credenciales credenciales
    );

}
