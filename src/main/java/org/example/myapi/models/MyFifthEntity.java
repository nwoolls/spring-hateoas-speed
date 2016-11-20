package org.example.myapi.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-02T09:27:41.846-04:00")

public class MyFifthEntity extends ResourceSupport {
    private MySecondEntity location = null;

    private List<String> values = new ArrayList<String>();

    public MyFifthEntity location(MySecondEntity location) {
        this.location = location;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    public MySecondEntity getLocation() {
        return location;
    }

    public void setLocation(MySecondEntity location) {
        this.location = location;
    }

    public MyFifthEntity values(List<String> values) {
        this.values = values;
        return this;
    }

    public MyFifthEntity addValuesItem(String valuesItem) {
        this.values.add(valuesItem);
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "")
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyFifthEntity myFifthEntity = (MyFifthEntity) o;
        return Objects.equals(this.location, myFifthEntity.location) &&
                Objects.equals(this.values, myFifthEntity.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyFifthEntity {\n");

        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

