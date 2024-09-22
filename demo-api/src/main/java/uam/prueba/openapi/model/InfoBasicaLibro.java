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
 * Información básica de un libro para ser mostrado en una lista
 */

@Schema(name = "InfoBasicaLibro", description = "Información básica de un libro para ser mostrado en una lista")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InfoBasicaLibro {

  private String isbn;

  private String autor;

  private String titulo;

  private URI urlPortada;

  public InfoBasicaLibro() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InfoBasicaLibro(String isbn, String autor, String titulo, URI urlPortada) {
    this.isbn = isbn;
    this.autor = autor;
    this.titulo = titulo;
    this.urlPortada = urlPortada;
  }

  public InfoBasicaLibro isbn(String isbn) {
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

  public InfoBasicaLibro autor(String autor) {
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

  public InfoBasicaLibro titulo(String titulo) {
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

  public InfoBasicaLibro urlPortada(URI urlPortada) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoBasicaLibro infoBasicaLibro = (InfoBasicaLibro) o;
    return Objects.equals(this.isbn, infoBasicaLibro.isbn) &&
        Objects.equals(this.autor, infoBasicaLibro.autor) &&
        Objects.equals(this.titulo, infoBasicaLibro.titulo) &&
        Objects.equals(this.urlPortada, infoBasicaLibro.urlPortada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn, autor, titulo, urlPortada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoBasicaLibro {\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    autor: ").append(toIndentedString(autor)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    urlPortada: ").append(toIndentedString(urlPortada)).append("\n");
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

