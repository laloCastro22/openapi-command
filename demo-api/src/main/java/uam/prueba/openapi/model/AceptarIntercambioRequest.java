package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AceptarIntercambioRequest
 */

@JsonTypeName("aceptarIntercambio_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class AceptarIntercambioRequest {

  private BigDecimal idLibro;

  public AceptarIntercambioRequest idLibro(BigDecimal idLibro) {
    this.idLibro = idLibro;
    return this;
  }

  /**
   * Get idLibro
   * @return idLibro
   */
  @Valid 
  @Schema(name = "idLibro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idLibro")
  public BigDecimal getIdLibro() {
    return idLibro;
  }

  public void setIdLibro(BigDecimal idLibro) {
    this.idLibro = idLibro;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AceptarIntercambioRequest aceptarIntercambioRequest = (AceptarIntercambioRequest) o;
    return Objects.equals(this.idLibro, aceptarIntercambioRequest.idLibro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLibro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AceptarIntercambioRequest {\n");
    sb.append("    idLibro: ").append(toIndentedString(idLibro)).append("\n");
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

