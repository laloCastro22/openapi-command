package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Informacińo requerida para crear un nuevo intercambio
 */

@Schema(name = "CreacionIntercambio", description = "Informacińo requerida para crear un nuevo intercambio")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class CreacionIntercambio {

  private Integer idAceptante;

  private Integer idLibroAceptante;

  public CreacionIntercambio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreacionIntercambio(Integer idAceptante, Integer idLibroAceptante) {
    this.idAceptante = idAceptante;
    this.idLibroAceptante = idLibroAceptante;
  }

  public CreacionIntercambio idAceptante(Integer idAceptante) {
    this.idAceptante = idAceptante;
    return this;
  }

  /**
   * ID del usuario que recibe la oferta de intercambio
   * @return idAceptante
   */
  @NotNull 
  @Schema(name = "idAceptante", description = "ID del usuario que recibe la oferta de intercambio", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idAceptante")
  public Integer getIdAceptante() {
    return idAceptante;
  }

  public void setIdAceptante(Integer idAceptante) {
    this.idAceptante = idAceptante;
  }

  public CreacionIntercambio idLibroAceptante(Integer idLibroAceptante) {
    this.idLibroAceptante = idLibroAceptante;
    return this;
  }

  /**
   * ID del libro que pertenece al usuario que recibe la oferta de intercambio
   * @return idLibroAceptante
   */
  @NotNull 
  @Schema(name = "idLibroAceptante", description = "ID del libro que pertenece al usuario que recibe la oferta de intercambio", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idLibroAceptante")
  public Integer getIdLibroAceptante() {
    return idLibroAceptante;
  }

  public void setIdLibroAceptante(Integer idLibroAceptante) {
    this.idLibroAceptante = idLibroAceptante;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreacionIntercambio creacionIntercambio = (CreacionIntercambio) o;
    return Objects.equals(this.idAceptante, creacionIntercambio.idAceptante) &&
        Objects.equals(this.idLibroAceptante, creacionIntercambio.idLibroAceptante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAceptante, idLibroAceptante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreacionIntercambio {\n");
    sb.append("    idAceptante: ").append(toIndentedString(idAceptante)).append("\n");
    sb.append("    idLibroAceptante: ").append(toIndentedString(idLibroAceptante)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

