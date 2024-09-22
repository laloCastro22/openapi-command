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
 * JSONPatchRequestAddReplaceTest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class JSONPatchRequestAddReplaceTest implements PatchRequestInner {

  private String path;

  private JsonNullable<Object> value = JsonNullable.<Object>undefined();

  /**
   * The operation to perform.
   */
  public enum OpEnum {
    ADD("add"),
    
    REPLACE("replace"),
    
    TEST("test");

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

  public JSONPatchRequestAddReplaceTest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JSONPatchRequestAddReplaceTest(String path, Object value, OpEnum op) {
    this.path = path;
    this.value = JsonNullable.of(value);
    this.op = op;
  }

  public JSONPatchRequestAddReplaceTest path(String path) {
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

  public JSONPatchRequestAddReplaceTest value(Object value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * The value to add, replace or test.
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "The value to add, replace or test.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public JsonNullable<Object> getValue() {
    return value;
  }

  public void setValue(JsonNullable<Object> value) {
    this.value = value;
  }

  public JSONPatchRequestAddReplaceTest op(OpEnum op) {
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
    JSONPatchRequestAddReplaceTest jsONPatchRequestAddReplaceTest = (JSONPatchRequestAddReplaceTest) o;
    return Objects.equals(this.path, jsONPatchRequestAddReplaceTest.path) &&
        Objects.equals(this.value, jsONPatchRequestAddReplaceTest.value) &&
        Objects.equals(this.op, jsONPatchRequestAddReplaceTest.op);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, value, op);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONPatchRequestAddReplaceTest {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

