## Spring HATEOAS Speed Sample

This sample illustrates issues with performance that I am seeing when using the Spring HATEOAS library to add HAL resource links to REST responses.

### Issue(s)

Here is the output I am seeing when using `ControllerLinkBuilder` versus creating resource links manually:

```
Running org.example.myapi.HypertextLinksTest
5194 milliseconds to add 3 Spring HATEOAS links to 200 items USING ControllerLinkBuilder
12486 milliseconds to add 3 Spring HATEOAS links to 200 items USING ControllerLinkBuilder
22206 milliseconds to add 3 Spring HATEOAS links to 200 items USING ControllerLinkBuilder
3 milliseconds to add 3 Spring HATEOAS links to 200 items NOT USING ControllerLinkBuilder
2 milliseconds to add 3 Spring HATEOAS links to 200 items NOT USING ControllerLinkBuilder
2 milliseconds to add 3 Spring HATEOAS links to 200 items NOT USING ControllerLinkBuilder
```

As you can see, the simple act of using `ControllerLinkBuilder` to add resource links to 200 items incurs a severe performance penalty that seems to compound.

### Steps

Simply run the included test with Maven, e.g.: `mvn test`
