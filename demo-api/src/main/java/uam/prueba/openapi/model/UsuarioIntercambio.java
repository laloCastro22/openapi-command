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
 * Detalles de un usuario que participa en un intercambio
 */

@Schema(name = "UsuarioIntercambio", description = "Detalles de un usuario que participa en un intercambio")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UsuarioIntercambio {

  private Integer id;

  private String nombre;

  private String apellidos;

  private String telefono;

  private String correo;

  public UsuarioIntercambio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsuarioIntercambio(Integer id, String nombre, String apellidos, String telefono, String correo) {
    this.id = id;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.correo = correo;
  }

  public UsuarioIntercambio id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * El ID del usuario
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "El ID del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UsuarioIntercambio nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Nombre del usuario
   * @return nombre
   */
  @NotNull 
  @Schema(name = "nombre", description = "Nombre del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nombre")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public UsuarioIntercambio apellidos(String apellidos) {
    this.apellidos = apellidos;
    return this;
  }

  /**
   * Apellido o apellidos del usuario
   * @return apellidos
   */
  @NotNull 
  @Schema(name = "apellidos", description = "Apellido o apellidos del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("apellidos")
  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public UsuarioIntercambio telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Numero telefónico del usuario
   * @return telefono
   */
  @NotNull 
  @Schema(name = "telefono", description = "Numero telefónico del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("telefono")
  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public UsuarioIntercambio correo(String correo) {
    this.correo = correo;
    return this;
  }

  /**
   * Correo electrónico del usuario
   * @return correo
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "correo", description = "Correo electrónico del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correo")
  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioIntercambio usuarioIntercambio = (UsuarioIntercambio) o;
    return Objects.equals(this.id, usuarioIntercambio.id) &&
        Objects.equals(this.nombre, usuarioIntercambio.nombre) &&
        Objects.equals(this.apellidos, usuarioIntercambio.apellidos) &&
        Objects.equals(this.telefono, usuarioIntercambio.telefono) &&
        Objects.equals(this.correo, usuarioIntercambio.correo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, apellidos, telefono, correo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioIntercambio {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
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

