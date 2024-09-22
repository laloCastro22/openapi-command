package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import uam.prueba.openapi.model.InfoBasicaLibro;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PaginaLibros
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class PaginaLibros {

  private Integer pagSiguiente;

  private Integer pagAnterior;

  private Integer resultados;

  @Valid
  private List<@Valid InfoBasicaLibro> libros = new ArrayList<>();

  public PaginaLibros() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaginaLibros(Integer pagSiguiente, Integer pagAnterior, Integer resultados, List<@Valid InfoBasicaLibro> libros) {
    this.pagSiguiente = pagSiguiente;
    this.pagAnterior = pagAnterior;
    this.resultados = resultados;
    this.libros = libros;
  }

  public PaginaLibros pagSiguiente(Integer pagSiguiente) {
    this.pagSiguiente = pagSiguiente;
    return this;
  }

  /**
   * Número de página siguiente
   * @return pagSiguiente
   */
  @NotNull 
  @Schema(name = "pagSiguiente", description = "Número de página siguiente", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pagSiguiente")
  public Integer getPagSiguiente() {
    return pagSiguiente;
  }

  public void setPagSiguiente(Integer pagSiguiente) {
    this.pagSiguiente = pagSiguiente;
  }

  public PaginaLibros pagAnterior(Integer pagAnterior) {
    this.pagAnterior = pagAnterior;
    return this;
  }

  /**
   * Número de página anterior
   * @return pagAnterior
   */
  @NotNull 
  @Schema(name = "pagAnterior", description = "Número de página anterior", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pagAnterior")
  public Integer getPagAnterior() {
    return pagAnterior;
  }

  public void setPagAnterior(Integer pagAnterior) {
    this.pagAnterior = pagAnterior;
  }

  public PaginaLibros resultados(Integer resultados) {
    this.resultados = resultados;
    return this;
  }

  /**
   * Número de resultados por página
   * @return resultados
   */
  @NotNull 
  @Schema(name = "resultados", description = "Número de resultados por página", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resultados")
  public Integer getResultados() {
    return resultados;
  }

  public void setResultados(Integer resultados) {
    this.resultados = resultados;
  }

  public PaginaLibros libros(List<@Valid InfoBasicaLibro> libros) {
    this.libros = libros;
    return this;
  }

  public PaginaLibros addLibrosItem(InfoBasicaLibro librosItem) {
    if (this.libros == null) {
      this.libros = new ArrayList<>();
    }
    this.libros.add(librosItem);
    return this;
  }

  /**
   * Get libros
   * @return libros
   */
  @NotNull @Valid 
  @Schema(name = "libros", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("libros")
  public List<@Valid InfoBasicaLibro> getLibros() {
    return libros;
  }

  public void setLibros(List<@Valid InfoBasicaLibro> libros) {
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
    PaginaLibros paginaLibros = (PaginaLibros) o;
    return Objects.equals(this.pagSiguiente, paginaLibros.pagSiguiente) &&
        Objects.equals(this.pagAnterior, paginaLibros.pagAnterior) &&
        Objects.equals(this.resultados, paginaLibros.resultados) &&
        Objects.equals(this.libros, paginaLibros.libros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagSiguiente, pagAnterior, resultados, libros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginaLibros {\n");
    sb.append("    pagSiguiente: ").append(toIndentedString(pagSiguiente)).append("\n");
    sb.append("    pagAnterior: ").append(toIndentedString(pagAnterior)).append("\n");
    sb.append("    resultados: ").append(toIndentedString(resultados)).append("\n");
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

