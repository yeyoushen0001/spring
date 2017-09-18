package com.wang.study.api;

import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wordnik.swagger.annotations.Api;

/**
 * 产品资源服务API
 */
@Component
@Path("/products")
@Api(value = "/products", description = "core product")
public class ProductResource {
    @Autowired
    private ProductDAO productDAO;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_HTML})
    @ApiOperation(value = "create product", notes = "More notes about this method", response = String.class, httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Product not found")
    })
    public Response createProduct(Product product) {
        //TODO create
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Find product by ID", notes = "More notes about this method", response = Product.class, httpMethod = "GET")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Product not found")
    })
    public Response getProduct(@ApiParam(value = "Resource identifier", required = false) @QueryParam("id") Integer id) {
        if(id ==null){
            //TODO getAll
            return Response.status(Response.Status.NO_CONTENT).allow("OPTIONS").build();
        }else {
            //TODO getById
            return Response.status(Response.Status.NO_CONTENT).allow("OPTIONS").build();
        }
    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_HTML})
    @ApiOperation(value = "update product", notes = "More notes about this method", response = String.class, httpMethod = "PUT")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Product not found")
    })
    public Response updateProduct(Product product) {
        //TODO update
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Produces({MediaType.TEXT_HTML})
    @ApiOperation(value = "remove product by ID", notes = "More notes about this method", response = String.class, httpMethod = "DELETE")
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Product not found")
    })
    public Response removeProductById(@ApiParam(value = "ID values must", required = true)
                                      @QueryParam("id") Integer id) {
        //TODO remove
        return Response.status(Response.Status.OK).build();
    }
}
