package org.example.myapi.models;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-02T09:27:41.846-04:00")

public class MySixthEntity extends ResourceSupport {
    private String primaryId = null;

    public MySixthEntity primaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MySixthEntity mySixthEntity = (MySixthEntity) o;
        return Objects.equals(this.primaryId, mySixthEntity.primaryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MySixthEntity {\n");

        sb.append("    primaryId: ").append(toIndentedString(primaryId)).append("\n");
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

