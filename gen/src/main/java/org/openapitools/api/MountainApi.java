/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-27T14:51:34.315482300+01:00[Europe/Berlin]")
@Validated
@Api(value = "mountain", description = "the mountain API")
public interface MountainApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /mountain : Get All Mountains
     *
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Get All Mountains", nickname = "get", notes = "", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @GetMapping(
        value = "/mountain",
        produces = { "application/json" }
    )
    default ResponseEntity<List<String>> get() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /mountain/{name} : GET mountain by Name /{name}
     *
     * @param name  (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "GET mountain by Name /{name}", nickname = "getMountainByName", notes = "", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @GetMapping(
        value = "/mountain/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<String>> getMountainByName(@ApiParam(value = "",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /mountain/mountains/{mountains} : Search for a Mountain by Mountains, every Mountain with the Mountains are returned
     *
     * @param mountains  (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Search for a Mountain by Mountains, every Mountain with the Mountains are returned", nickname = "searchMountainByMountains", notes = "", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @GetMapping(
        value = "/mountain/mountains/{mountains}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<String>> searchMountainByMountains(@ApiParam(value = "",required=true) @PathVariable("mountains") String mountains) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /mountain/search/{name} : Search For a Mountain by a Search String, every mountain which name contains the search String is returned!
     *
     * @param name  (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Search For a Mountain by a Search String, every mountain which name contains the search String is returned!", nickname = "searchMountainByName", notes = "", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @GetMapping(
        value = "/mountain/search/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<String>> searchMountainByName(@ApiParam(value = "",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
