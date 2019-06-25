package com.app.dto;


import java.util.List;

import com.app.model.Role;

import io.swagger.annotations.ApiModelProperty;


public class SearchDTO {
  
  private Integer userId;
  private String searchTerm;
  private Integer requestCount;
  
   
  public void setUserId(Integer userId){
     this.userId = userId;
  }
   public Integer getUserId(){
     return this.userId;
  }
  
  public void setSearchTerm(String searchTerm){
     this.searchTerm = searchTerm;
  }
   public String getSearchTerm(){
     return this.searchTerm;
  }
  
  public void setUserCount(Integer requestCount){
     this.requestCount = requestCount;
  }
   public Integer getUserCount(){
     return this.requestCount;
  }
}
