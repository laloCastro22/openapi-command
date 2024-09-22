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
 * Contiene un código usado para validar un correo electrónico
 */

@Schema(name = "CodigoVerificacion", description = "Contiene un código usado para validar un correo electrónico")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class CodigoVerificacion {

  private String codigo;

  public CodigoVerificacion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CodigoVerificacion(String codigo) {
    this.codigo = codigo;
  }

  public CodigoVerificacion codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de verificación
   * @return codigo
   */
  @NotNull 
  @Schema(name = "codigo", description = "Código de verificación", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
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
    CodigoVerificacion codigoVerificacion = (CodigoVerificacion) o;
    return Objects.equals(this.codigo, codigoVerificacion.codigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoVerificacion {\n");
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

