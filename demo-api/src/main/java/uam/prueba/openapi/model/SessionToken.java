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
 * Token de inicio de sesión de un usuario
 */

@Schema(name = "SessionToken", description = "Token de inicio de sesión de un usuario")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class SessionToken {

  private Integer idUsuario;

  private String token;

  public SessionToken() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SessionToken(Integer idUsuario, String token) {
    this.idUsuario = idUsuario;
    this.token = token;
  }

  public SessionToken idUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * ID del usuario
   * @return idUsuario
   */
  @NotNull 
  @Schema(name = "idUsuario", description = "ID del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idUsuario")
  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public SessionToken token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token de inicio de sesión
   * @return token
   */
  @NotNull 
  @Schema(name = "token", description = "Token de inicio de sesión", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionToken sessionToken = (SessionToken) o;
    return Objects.equals(this.idUsuario, sessionToken.idUsuario) &&
        Objects.equals(this.token, sessionToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionToken {\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

