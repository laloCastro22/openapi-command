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
 * Detalles de un usuario que es dueño de un libro
 */

@Schema(name = "Dueno", description = "Detalles de un usuario que es dueño de un libro")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class Dueno {

  private Integer id;

  private String nombre;

  private String apellido;

  private JsonNullable<URI> foto = JsonNullable.<URI>undefined();

  private Integer idLibro;

  public Dueno() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Dueno(Integer id, String nombre, String apellido, URI foto, Integer idLibro) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.foto = JsonNullable.of(foto);
    this.idLibro = idLibro;
  }

  public Dueno id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID del usuario
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "ID del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Dueno nombre(String nombre) {
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

  public Dueno apellido(String apellido) {
    this.apellido = apellido;
    return this;
  }

  /**
   * Apellido o apellidos del usuario
   * @return apellido
   */
  @NotNull 
  @Schema(name = "apellido", description = "Apellido o apellidos del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("apellido")
  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Dueno foto(URI foto) {
    this.foto = JsonNullable.of(foto);
    return this;
  }

  /**
   * Foto de perfil del usuario
   * @return foto
   */
  @NotNull @Valid 
  @Schema(name = "foto", description = "Foto de perfil del usuario", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("foto")
  public JsonNullable<URI> getFoto() {
    return foto;
  }

  public void setFoto(JsonNullable<URI> foto) {
    this.foto = foto;
  }

  public Dueno idLibro(Integer idLibro) {
    this.idLibro = idLibro;
    return this;
  }

  /**
   * Get idLibro
   * @return idLibro
   */
  @NotNull 
  @Schema(name = "idLibro", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idLibro")
  public Integer getIdLibro() {
    return idLibro;
  }

  public void setIdLibro(Integer idLibro) {
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
    Dueno dueno = (Dueno) o;
    return Objects.equals(this.id, dueno.id) &&
        Objects.equals(this.nombre, dueno.nombre) &&
        Objects.equals(this.apellido, dueno.apellido) &&
        Objects.equals(this.foto, dueno.foto) &&
        Objects.equals(this.idLibro, dueno.idLibro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, apellido, foto, idLibro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dueno {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido: ").append(toIndentedString(apellido)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
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

