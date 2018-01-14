package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Publisher;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import com.mojafirma.springbookshop.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/publishers")
public class PublisherRestController {

    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping
    public List<Publisher> getPublisherList() {
        return publisherService.getAllPublishers();
    }

    @PostMapping
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.savePublisher(publisher);
    };
}
