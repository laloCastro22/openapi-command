package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import uam.prueba.openapi.model.Intercambio;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetIntercambios200Response
 */

@JsonTypeName("getIntercambios_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class GetIntercambios200Response {

  @Valid
  private List<@Valid Intercambio> intercambios = new ArrayList<>();

  public GetIntercambios200Response intercambios(List<@Valid Intercambio> intercambios) {
    this.intercambios = intercambios;
    return this;
  }

  public GetIntercambios200Response addIntercambiosItem(Intercambio intercambiosItem) {
    if (this.intercambios == null) {
      this.intercambios = new ArrayList<>();
    }
    this.intercambios.add(intercambiosItem);
    return this;
  }

  /**
   * Get intercambios
   * @return intercambios
   */
  @Valid 
  @Schema(name = "intercambios", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intercambios")
  public List<@Valid Intercambio> getIntercambios() {
    return intercambios;
  }

  public void setIntercambios(List<@Valid Intercambio> intercambios) {
    this.intercambios = intercambios;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIntercambios200Response getIntercambios200Response = (GetIntercambios200Response) o;
    return Objects.equals(this.intercambios, getIntercambios200Response.intercambios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intercambios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIntercambios200Response {\n");
    sb.append("    intercambios: ").append(toIndentedString(intercambios)).append("\n");
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

