package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-27T14:51:34.315482300+01:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.mountain.base-path:}")
public class MountainApiController implements MountainApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MountainApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
