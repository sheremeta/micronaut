package poc;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;

import javax.validation.constraints.NotBlank;

import static io.micronaut.http.MediaType.TEXT_PLAIN;

@Controller("/")
@Validated
public class HelloController {

    @Get(uri = "/hello/{name}", produces = TEXT_PLAIN)
    public Single<String> hello(@NotBlank String name) {
        return Single.just("Hello " + name + "!");
    }
}
