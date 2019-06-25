package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SearchDTO;
import com.app.service.SearchService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.mappers.ModelMapper;


@RestController
public class SearchController {

  @Autowired
  private SearchService searchService;

  @Autowired
  private ModelMapper modelMapper;

  @PostMapping("/search")
  @ApiOperation(value = "Search")
  @ApiResponses(value = {//
      @ApiResponse(code = 400, message = "Something went wrong"), //
      @ApiResponse(code = 422, message = "Invalid Request submitted")})
  public void search(//
      @ApiParam("Search") @RequestBody SearchDTO searchRequest) {
    searchService.saveSearch(searchRequest);
  }



}

