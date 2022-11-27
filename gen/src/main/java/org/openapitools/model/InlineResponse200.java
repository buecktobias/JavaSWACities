package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-27T12:20:27.364887+01:00[Europe/Berlin]")
public class InlineResponse200   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Height")
  private BigDecimal height;

  @JsonProperty("Mountains")
  private String mountains;

  public InlineResponse200 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Berg", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse200 height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @ApiModelProperty(example = "120.3", value = "")

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public InlineResponse200 mountains(String mountains) {
    this.mountains = mountains;
    return this;
  }

  /**
   * Get mountains
   * @return mountains
  */
  @ApiModelProperty(example = "Bergkette", value = "")


  public String getMountains() {
    return mountains;
  }

  public void setMountains(String mountains) {
    this.mountains = mountains;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.name, inlineResponse200.name) &&
        Objects.equals(this.height, inlineResponse200.height) &&
        Objects.equals(this.mountains, inlineResponse200.mountains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, height, mountains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    mountains: ").append(toIndentedString(mountains)).append("\n");
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

