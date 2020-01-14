package com.wcl.gmall.pms;

import com.wcl.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {


    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
        System.out.println(productService.getById(1));
    }

}
