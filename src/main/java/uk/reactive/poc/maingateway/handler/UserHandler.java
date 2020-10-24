package uk.reactive.poc.maingateway.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uk.reactive.poc.maingateway.model.GatewayResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class UserHandler {

    public Mono<ServerResponse> handle(ServerRequest request) {
        Flux<GatewayResponse> flux = Flux.just(new GatewayResponse("something"));
        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(flux, GatewayResponse.class)
                .onErrorResume(Exception.class, e -> ServerResponse.notFound().build());
    }
}
