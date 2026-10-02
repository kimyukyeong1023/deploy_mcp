package com.yonsai.deploy_mcp.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
    name ="jsonplaceholderTest", // 코드를 자동으로 만들어주담당자이름
    url ="https://jsonplaceholder.typicode.com"
)
public interface TestClient {

}