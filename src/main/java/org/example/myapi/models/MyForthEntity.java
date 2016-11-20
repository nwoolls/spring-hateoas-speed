package org.example.myapi.models;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-14T10:16:53.755-05:00")

public class MyForthEntity extends ResourceSupport {
    private MySecondEntity location = null;

    public MyForthEntity location(MySecondEntity location) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyForthEntity myForthEntity = (MyForthEntity) o;
        return Objects.equals(this.location, myForthEntity.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyForthEntity {\n");

        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

