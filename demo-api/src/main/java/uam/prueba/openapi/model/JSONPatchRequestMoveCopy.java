package uam.prueba.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JSONPatchRequestMoveCopy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class JSONPatchRequestMoveCopy implements PatchRequestInner {

  private String path;

  /**
   * The operation to perform.
   */
  public enum OpEnum {
    MOVE("move"),
    
    COPY("copy");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpEnum op;

  public JSONPatchRequestMoveCopy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JSONPatchRequestMoveCopy(String path, OpEnum op) {
    this.path = path;
    this.op = op;
  }

  public JSONPatchRequestMoveCopy path(String path) {
    this.path = path;
    return this;
  }

  /**
   * A JSON Pointer path.
   * @return path
   */
  @NotNull 
  @Schema(name = "path", description = "A JSON Pointer path.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JSONPatchRequestMoveCopy op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * The operation to perform.
   * @return op
   */
  @NotNull 
  @Schema(name = "op", description = "The operation to perform.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONPatchRequestMoveCopy jsONPatchRequestMoveCopy = (JSONPatchRequestMoveCopy) o;
    return Objects.equals(this.path, jsONPatchRequestMoveCopy.path) &&
        Objects.equals(this.op, jsONPatchRequestMoveCopy.op);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, op);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONPatchRequestMoveCopy {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
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

