package io.swagger.api.factories;

import io.swagger.api.LocationApiService;
import io.swagger.api.impl.LocationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-08T12:34:19.815Z[GMT]")
public class LocationApiServiceFactory {

  private final static LocationApiService service = new LocationApiServiceImpl();

  public static LocationApiService getLocationApi() {
    return service;
  }
}
