/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package uam.prueba.openapi.api;

import uam.prueba.openapi.model.DetallesLibro;
import uam.prueba.openapi.model.Error;
import uam.prueba.openapi.model.LibroConDuenos;
import uam.prueba.openapi.model.PaginaLibros;
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
@Tag(name = "libros", description = "the libros API")
public interface LibrosApi {

    /**
     * GET /libros/{isbn}/detalles : Recuperar información de un libro
     * Recupera información detallada de un libro mediante su ISBN
     *
     * @param isbn ISBN del libro (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "getDetallesLibro",
        summary = "Recuperar información de un libro",
        description = "Recupera información detallada de un libro mediante su ISBN",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DetallesLibro.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/libros/{isbn}/detalles",
        produces = { "application/json" }
    )
    
    ResponseEntity<DetallesLibro> getDetallesLibro(
        @Parameter(name = "isbn", description = "ISBN del libro", required = true, in = ParameterIn.PATH) @PathVariable("isbn") String isbn
    );


    /**
     * GET /libros/{isbn} : Recuperar libro
     * Recupera un la información de un libro
     *
     * @param isbn ISBN del libro (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "getLibro",
        summary = "Recuperar libro",
        description = "Recupera un la información de un libro",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LibroConDuenos.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/libros/{isbn}",
        produces = { "application/json" }
    )
    
    ResponseEntity<LibroConDuenos> getLibro(
        @Parameter(name = "isbn", description = "ISBN del libro", required = true, in = ParameterIn.PATH) @PathVariable("isbn") String isbn
    );


    /**
     * GET /libros : Recuperar libros
     * Recupera una lista de todos los libros ofrecidos por usuarios
     *
     * @param pagina Página a recuperar (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getLibros",
        summary = "Recuperar libros",
        description = "Recupera una lista de todos los libros ofrecidos por usuarios",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PaginaLibros.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/libros",
        produces = { "application/json" }
    )
    
    ResponseEntity<PaginaLibros> getLibros(
        @Parameter(name = "pagina", description = "Página a recuperar", in = ParameterIn.QUERY) @Valid @RequestParam(value = "pagina", required = false) Integer pagina
    );

}