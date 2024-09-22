package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Un libro registrado como parte de la biblioteca de un usuario junto con algunos detalles del libro
 */

@Schema(name = "LibroRegistradoConDetalles", description = "Un libro registrado como parte de la biblioteca de un usuario junto con algunos detalles del libro")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class LibroRegistradoConDetalles {

  private String isbn;

  private String autor;

  private String titulo;

  private URI urlPortada;

  private Integer id;

  public LibroRegistradoConDetalles() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LibroRegistradoConDetalles(String isbn, String autor, String titulo, URI urlPortada, Integer id) {
    this.isbn = isbn;
    this.autor = autor;
    this.titulo = titulo;
    this.urlPortada = urlPortada;
    this.id = id;
  }

  public LibroRegistradoConDetalles isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * ISBN (International Standard Book Number) del libro
   * @return isbn
   */
  @NotNull 
  @Schema(name = "isbn", description = "ISBN (International Standard Book Number) del libro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public LibroRegistradoConDetalles autor(String autor) {
    this.autor = autor;
    return this;
  }

  /**
   * Autor del libro
   * @return autor
   */
  @NotNull 
  @Schema(name = "autor", description = "Autor del libro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("autor")
  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public LibroRegistradoConDetalles titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

  /**
   * Título del libro
   * @return titulo
   */
  @NotNull 
  @Schema(name = "titulo", description = "Título del libro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("titulo")
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public LibroRegistradoConDetalles urlPortada(URI urlPortada) {
    this.urlPortada = urlPortada;
    return this;
  }

  /**
   * URL de la portada del libro
   * @return urlPortada
   */
  @NotNull @Valid 
  @Schema(name = "urlPortada", description = "URL de la portada del libro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("urlPortada")
  public URI getUrlPortada() {
    return urlPortada;
  }

  public void setUrlPortada(URI urlPortada) {
    this.urlPortada = urlPortada;
  }

  public LibroRegistradoConDetalles id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID del libro
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "ID del libro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibroRegistradoConDetalles libroRegistradoConDetalles = (LibroRegistradoConDetalles) o;
    return Objects.equals(this.isbn, libroRegistradoConDetalles.isbn) &&
        Objects.equals(this.autor, libroRegistradoConDetalles.autor) &&
        Objects.equals(this.titulo, libroRegistradoConDetalles.titulo) &&
        Objects.equals(this.urlPortada, libroRegistradoConDetalles.urlPortada) &&
        Objects.equals(this.id, libroRegistradoConDetalles.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn, autor, titulo, urlPortada, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibroRegistradoConDetalles {\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    autor: ").append(toIndentedString(autor)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    urlPortada: ").append(toIndentedString(urlPortada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

