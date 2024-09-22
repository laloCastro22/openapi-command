package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidaPuedeIntercambiar200Response
 */

@JsonTypeName("validaPuedeIntercambiar_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ValidaPuedeIntercambiar200Response {

  private Boolean puedeIntercambiar;

  private String mensaje;

  public ValidaPuedeIntercambiar200Response puedeIntercambiar(Boolean puedeIntercambiar) {
    this.puedeIntercambiar = puedeIntercambiar;
    return this;
  }

  /**
   * Get puedeIntercambiar
   * @return puedeIntercambiar
   */
  
  @Schema(name = "puedeIntercambiar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("puedeIntercambiar")
  public Boolean getPuedeIntercambiar() {
    return puedeIntercambiar;
  }

  public void setPuedeIntercambiar(Boolean puedeIntercambiar) {
    this.puedeIntercambiar = puedeIntercambiar;
  }

  public ValidaPuedeIntercambiar200Response mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

  /**
   * Get mensaje
   * @return mensaje
   */
  
  @Schema(name = "mensaje", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mensaje")
  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidaPuedeIntercambiar200Response validaPuedeIntercambiar200Response = (ValidaPuedeIntercambiar200Response) o;
    return Objects.equals(this.puedeIntercambiar, validaPuedeIntercambiar200Response.puedeIntercambiar) &&
        Objects.equals(this.mensaje, validaPuedeIntercambiar200Response.mensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(puedeIntercambiar, mensaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaPuedeIntercambiar200Response {\n");
    sb.append("    puedeIntercambiar: ").append(toIndentedString(puedeIntercambiar)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
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

