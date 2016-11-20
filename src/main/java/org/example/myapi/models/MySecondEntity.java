package org.example.myapi.models;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-14T10:16:53.755-05:00")

public class MySecondEntity {
    private String primaryId = null;

    private String secondaryId = null;

    public MySecondEntity primaryId(String primaryId) {
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

    @ApiModelProperty(hidden = true) // otherwise documented as a setter for "tingId"
    public MySecondEntity secondaryId(String secondaryId) {
        this.secondaryId = secondaryId;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    public String getSecondaryId() {
        return secondaryId;
    }

    public void setSecondaryId(String secondaryId) {
        this.secondaryId = secondaryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MySecondEntity mySecondEntity = (MySecondEntity) o;
        return Objects.equals(this.primaryId, mySecondEntity.primaryId) &&
                Objects.equals(this.secondaryId, mySecondEntity.secondaryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryId, secondaryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MySecondEntity {\n");

        sb.append("    primaryId: ").append(toIndentedString(primaryId)).append("\n");
        sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

