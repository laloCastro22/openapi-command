package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Contiene el código requerido para completar un intercambio
 */

@Schema(name = "CodigoIntercambio", description = "Contiene el código requerido para completar un intercambio")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class CodigoIntercambio {

  private UUID codigo;

  public CodigoIntercambio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CodigoIntercambio(UUID codigo) {
    this.codigo = codigo;
  }

  public CodigoIntercambio codigo(UUID codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código requerido para completar un intercambio
   * @return codigo
   */
  @NotNull @Valid 
  @Schema(name = "codigo", description = "Código requerido para completar un intercambio", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("codigo")
  public UUID getCodigo() {
    return codigo;
  }

  public void setCodigo(UUID codigo) {
    this.codigo = codigo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodigoIntercambio codigoIntercambio = (CodigoIntercambio) o;
    return Objects.equals(this.codigo, codigoIntercambio.codigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoIntercambio {\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

