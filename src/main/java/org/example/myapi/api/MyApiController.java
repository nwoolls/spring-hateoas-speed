package org.example.myapi.api;

import io.swagger.annotations.ApiParam;
import org.example.myapi.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-01T09:28:42.544-04:00")

@Controller
public class MyApiController implements MyApi {

    @Override
    public ResponseEntity<MyFirstEntity> apiV1Get() {
         return new ResponseEntity<>(new MyFirstEntity(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MyThirdEntity> apiV1MyApiGet() {
        return new ResponseEntity<>(new MyThirdEntity(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<MyForthEntity>> apiV1MyApiOrangesGet(
            @ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails
    ) {
        final List<MyForthEntity> results = new ArrayList<>();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<MyFifthEntity>> apiV1MyApiBananasGet(
            @ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails
    ) {
        final List<MyFifthEntity> results = new ArrayList<>();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> apiV1MyApiBananasPut(
            @ApiParam(value = "", required = true) @RequestBody List<MyFifthEntity> myFifthEntities
    ) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<MySixthEntity>> apiV1MyApiApplesGet() {
        final List<MySixthEntity> results = new ArrayList<>();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MySixthEntity> apiV1MyApiApplesPrimaryIdGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId
    ) {
        final MySixthEntity result = new MySixthEntity();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<MyForthEntity>> apiV1MyApiApplesPrimaryIdOrangesGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId,
            @ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails
    ) {
        final List<MyForthEntity> results = new ArrayList<>();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MyForthEntity> apiV1MyApiApplesPrimaryIdOrangesSecondaryIdGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId
    ) {
        return apiV1MyApiApplesPrimaryIdBananasSecondaryIdOrangeGet(primaryId, secondaryId);
    }

    @Override
    public ResponseEntity<List<MyFifthEntity>> apiV1MyApiApplesPrimaryIdBananasGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId,
            @ApiParam(value = "") @RequestParam(value = "include-details", required = false) Boolean includeDetails
    ) {
        final List<MyFifthEntity> results = new ArrayList<>();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MyFifthEntity> apiV1MyApiApplesPrimaryIdBananasSecondaryIdGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId
    ) {
        final MyFifthEntity result = new MyFifthEntity();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> apiV1MyApiApplesPrimaryIdBananasSecondaryIdPut(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId,
            @ApiParam(value = "", required = true) @RequestBody MyFifthEntity myFifthEntity
    ) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MyForthEntity> apiV1MyApiApplesPrimaryIdBananasSecondaryIdOrangeGet(
            @ApiParam(value = "", required = true) @PathVariable("primaryId") String primaryId,
            @ApiParam(value = "", required = true) @PathVariable("secondaryId") String secondaryId
    ) {
        final MyForthEntity result = new MyForthEntity();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
