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
 * Libro que pertenece al usuario que recibe la oferta de intercambio
 */

@Schema(name = "LibroAceptante", description = "Libro que pertenece al usuario que recibe la oferta de intercambio")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class LibroAceptante {

  private Integer id;

  private String isbn;

  private String descripcion;

  public LibroAceptante() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LibroAceptante(Integer id, String isbn, String descripcion) {
    this.id = id;
    this.isbn = isbn;
    this.descripcion = descripcion;
  }

  public LibroAceptante id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID del libro
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "ID del libro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LibroAceptante isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * ISBN (International Standard Book Number) del lib
   * @return isbn
   */
  @NotNull 
  @Schema(name = "isbn", description = "ISBN (International Standard Book Number) del lib", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public LibroAceptante descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Descripción de la condición en la que se encuentra la copia del libro que posee el
   * @return descripcion
   */
  @NotNull 
  @Schema(name = "descripcion", description = "Descripción de la condición en la que se encuentra la copia del libro que posee el", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descripcion")
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibroAceptante libroAceptante = (LibroAceptante) o;
    return Objects.equals(this.id, libroAceptante.id) &&
        Objects.equals(this.isbn, libroAceptante.isbn) &&
        Objects.equals(this.descripcion, libroAceptante.descripcion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isbn, descripcion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibroAceptante {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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

