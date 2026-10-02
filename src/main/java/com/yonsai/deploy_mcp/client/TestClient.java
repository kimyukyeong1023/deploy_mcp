package com.yonsai.deploy_mcp.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// @FeignClient 스프링아! 자동으로 코드만들어주는 것!

@FeignClient(name = "jsonplaceholderTest", // 코드를 자동으로 만들어주담당자이름
    url = "https://jsonplaceholder.typicode.com")
public interface TestClient {

  // 추가 경로 
  @GetMapping("/posts/1")
  Map<String,Object> getPosts();


}