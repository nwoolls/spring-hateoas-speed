package org.example.myapi.api;

import io.swagger.annotations.*;
import org.example.myapi.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-14T10:16:53.755-05:00")

@Api(value = "api", description = "")
public interface MyApi {

    @ApiOperation(value = "", notes = "", response = MyThirdEntity.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyThirdEntity.class),
            @ApiResponse(code = 200, message = "", response = MyThirdEntity.class)})
    @RequestMapping(value = "/api/v1/myapi",
            method = RequestMethod.GET)
    ResponseEntity<MyThirdEntity> apiV1MyApiGet();


    @ApiOperation(value = "", notes = "", response = MyForthEntity.class, responseContainer = "List", authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = MyForthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyForthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/oranges",
            method = RequestMethod.GET)
    ResponseEntity<List<MyForthEntity>> apiV1MyApiOrangesGet(@ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails


    );


    @ApiOperation(value = "", notes = "", response = MyFifthEntity.class, responseContainer = "List", authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyFifthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyFifthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/bananas",
            method = RequestMethod.GET)
    ResponseEntity<List<MyFifthEntity>> apiV1MyApiBananasGet(@ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails


    );


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Void.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Void.class)})
    @RequestMapping(value = "/api/v1/myapi/bananas",
            method = RequestMethod.PUT)
    ResponseEntity<Void> apiV1MyApiBananasPut(

            @ApiParam(value = "", required = true) @RequestBody List<MyFifthEntity> myFifthEntities

    );


    @ApiOperation(value = "", notes = "", response = MySixthEntity.class, responseContainer = "List", authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MySixthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MySixthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples",
            method = RequestMethod.GET)
    ResponseEntity<List<MySixthEntity>> apiV1MyApiApplesGet();


    @ApiOperation(value = "", notes = "", response = MySixthEntity.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MySixthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MySixthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId:.+}",
            method = RequestMethod.GET)
    ResponseEntity<MySixthEntity> apiV1MyApiApplesPrimaryIdGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId
    );


    @ApiOperation(value = "", notes = "", response = MyForthEntity.class, responseContainer = "List", authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyForthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyForthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId}/oranges",
            method = RequestMethod.GET)
    ResponseEntity<List<MyForthEntity>> apiV1MyApiApplesPrimaryIdOrangesGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId


            , @ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails


    );


    @ApiOperation(value = "", notes = "", response = MyForthEntity.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyForthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyForthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId}/oranges/{secondaryId:.+}",
            method = RequestMethod.GET)
    ResponseEntity<MyForthEntity> apiV1MyApiApplesPrimaryIdOrangesSecondaryIdGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId


            ,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId


    );


    @ApiOperation(value = "", notes = "", response = MyFifthEntity.class, responseContainer = "List", authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyFifthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyFifthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId}/bananas",
            method = RequestMethod.GET)
    ResponseEntity<List<MyFifthEntity>> apiV1MyApiApplesPrimaryIdBananasGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId


            , @ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails


    );


    @ApiOperation(value = "", notes = "", response = MyFifthEntity.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyFifthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyFifthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId}/bananas/{secondaryId:.+}",
            method = RequestMethod.GET)
    ResponseEntity<MyFifthEntity> apiV1MyApiApplesPrimaryIdBananasSecondaryIdGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId


            ,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId


    );


    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Void.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Void.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId}/bananas/{secondaryId:.+}",
            method = RequestMethod.PUT)
    ResponseEntity<Void> apiV1MyApiApplesPrimaryIdBananasSecondaryIdPut(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId


            ,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId


            ,

            @ApiParam(value = "", required = true) @RequestBody MyFifthEntity myFifthEntity

    );


    @ApiOperation(value = "", notes = "", response = MyForthEntity.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyForthEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyForthEntity.class)})
    @RequestMapping(value = "/api/v1/myapi/apples/{primaryId}/bananas/{secondaryId}/orange",
            method = RequestMethod.GET)
    ResponseEntity<MyForthEntity> apiV1MyApiApplesPrimaryIdBananasSecondaryIdOrangeGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId


            ,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId


    );


    @ApiOperation(value = "", notes = "", response = MyFirstEntity.class, authorizations = {
            @Authorization(value = "oauthSecurity", scopes = {
                    @AuthorizationScope(scope = "sysadmin", description = "System Administrator")
            })
    }, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = MyFirstEntity.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = MyFirstEntity.class)})
    @RequestMapping(value = "/api/v1",
            method = RequestMethod.GET)
    ResponseEntity<MyFirstEntity> apiV1Get();

}
