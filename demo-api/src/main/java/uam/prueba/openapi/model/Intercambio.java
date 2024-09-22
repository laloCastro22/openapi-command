package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import uam.prueba.openapi.model.Aceptante;
import uam.prueba.openapi.model.EstadoIntercambio;
import uam.prueba.openapi.model.LibroAceptante;
import uam.prueba.openapi.model.LibroRegistrado;
import uam.prueba.openapi.model.Ofertante;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Información relacionada con un intercambio de libros que realizará un par de usuarios
 */

@Schema(name = "Intercambio", description = "Información relacionada con un intercambio de libros que realizará un par de usuarios")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class Intercambio {

  private Integer id;

  private Ofertante ofertante;

  private Aceptante aceptante;

  private LibroAceptante libroAceptante;

  private JsonNullable<LibroRegistrado> libroOfertante = JsonNullable.<LibroRegistrado>undefined();

  private EstadoIntercambio estado;

  public Intercambio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Intercambio(Integer id, Ofertante ofertante, Aceptante aceptante, LibroAceptante libroAceptante, LibroRegistrado libroOfertante, EstadoIntercambio estado) {
    this.id = id;
    this.ofertante = ofertante;
    this.aceptante = aceptante;
    this.libroAceptante = libroAceptante;
    this.libroOfertante = JsonNullable.of(libroOfertante);
    this.estado = estado;
  }

  public Intercambio id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID del intercambio
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "ID del intercambio", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Intercambio ofertante(Ofertante ofertante) {
    this.ofertante = ofertante;
    return this;
  }

  /**
   * Get ofertante
   * @return ofertante
   */
  @NotNull @Valid 
  @Schema(name = "ofertante", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ofertante")
  public Ofertante getOfertante() {
    return ofertante;
  }

  public void setOfertante(Ofertante ofertante) {
    this.ofertante = ofertante;
  }

  public Intercambio aceptante(Aceptante aceptante) {
    this.aceptante = aceptante;
    return this;
  }

  /**
   * Get aceptante
   * @return aceptante
   */
  @NotNull @Valid 
  @Schema(name = "aceptante", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aceptante")
  public Aceptante getAceptante() {
    return aceptante;
  }

  public void setAceptante(Aceptante aceptante) {
    this.aceptante = aceptante;
  }

  public Intercambio libroAceptante(LibroAceptante libroAceptante) {
    this.libroAceptante = libroAceptante;
    return this;
  }

  /**
   * Get libroAceptante
   * @return libroAceptante
   */
  @NotNull @Valid 
  @Schema(name = "libroAceptante", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("libroAceptante")
  public LibroAceptante getLibroAceptante() {
    return libroAceptante;
  }

  public void setLibroAceptante(LibroAceptante libroAceptante) {
    this.libroAceptante = libroAceptante;
  }

  public Intercambio libroOfertante(LibroRegistrado libroOfertante) {
    this.libroOfertante = JsonNullable.of(libroOfertante);
    return this;
  }

  /**
   * Get libroOfertante
   * @return libroOfertante
   */
  @NotNull @Valid 
  @Schema(name = "libroOfertante", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("libroOfertante")
  public JsonNullable<LibroRegistrado> getLibroOfertante() {
    return libroOfertante;
  }

  public void setLibroOfertante(JsonNullable<LibroRegistrado> libroOfertante) {
    this.libroOfertante = libroOfertante;
  }

  public Intercambio estado(EstadoIntercambio estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
   */
  @NotNull @Valid 
  @Schema(name = "estado", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("estado")
  public EstadoIntercambio getEstado() {
    return estado;
  }

  public void setEstado(EstadoIntercambio estado) {
    this.estado = estado;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intercambio intercambio = (Intercambio) o;
    return Objects.equals(this.id, intercambio.id) &&
        Objects.equals(this.ofertante, intercambio.ofertante) &&
        Objects.equals(this.aceptante, intercambio.aceptante) &&
        Objects.equals(this.libroAceptante, intercambio.libroAceptante) &&
        Objects.equals(this.libroOfertante, intercambio.libroOfertante) &&
        Objects.equals(this.estado, intercambio.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ofertante, aceptante, libroAceptante, libroOfertante, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intercambio {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ofertante: ").append(toIndentedString(ofertante)).append("\n");
    sb.append("    aceptante: ").append(toIndentedString(aceptante)).append("\n");
    sb.append("    libroAceptante: ").append(toIndentedString(libroAceptante)).append("\n");
    sb.append("    libroOfertante: ").append(toIndentedString(libroOfertante)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

