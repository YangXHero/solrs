package com.solr.test.web;

import com.solr.test.model.SolrEntity;
import com.solr.test.repo.SolrEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    private final SolrEntityRepository solrEntityRepository;


    @GetMapping("/save")
    public SolrEntity doIt(@RequestParam String type){
        SolrEntity phone = new SolrEntity();
        phone.setId("P0001");
        phone.setType(type);
        return solrEntityRepository.save(phone);
    }



    @GetMapping("/find")
    public SolrEntity find(@RequestParam String id){
//        List<Product> byType = productRepository.findByType(type);

        Optional<SolrEntity> byId = solrEntityRepository.findById(id);
        System.out.println(byId);

        return byId.get();

    }
}
