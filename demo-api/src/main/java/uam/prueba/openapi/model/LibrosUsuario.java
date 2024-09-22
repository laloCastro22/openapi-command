package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import uam.prueba.openapi.model.LibroRegistradoConDetalles;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Libros que figuran dentro del catálogo de un usuario
 */

@Schema(name = "LibrosUsuario", description = "Libros que figuran dentro del catálogo de un usuario")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class LibrosUsuario {

  @Valid
  private List<LibroRegistradoConDetalles> libros = new ArrayList<>();

  public LibrosUsuario() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LibrosUsuario(List<LibroRegistradoConDetalles> libros) {
    this.libros = libros;
  }

  public LibrosUsuario libros(List<LibroRegistradoConDetalles> libros) {
    this.libros = libros;
    return this;
  }

  public LibrosUsuario addLibrosItem(LibroRegistradoConDetalles librosItem) {
    if (this.libros == null) {
      this.libros = new ArrayList<>();
    }
    this.libros.add(librosItem);
    return this;
  }

  /**
   * Los libros del usuario
   * @return libros
   */
  @NotNull @Valid 
  @Schema(name = "libros", description = "Los libros del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("libros")
  public List<LibroRegistradoConDetalles> getLibros() {
    return libros;
  }

  public void setLibros(List<LibroRegistradoConDetalles> libros) {
    this.libros = libros;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibrosUsuario librosUsuario = (LibrosUsuario) o;
    return Objects.equals(this.libros, librosUsuario.libros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibrosUsuario {\n");
    sb.append("    libros: ").append(toIndentedString(libros)).append("\n");
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

