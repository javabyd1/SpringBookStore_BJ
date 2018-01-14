package com.mojafirma.springbookshop.service;

import com.mojafirma.springbookshop.exception.CategoryNotFoundException;
import com.mojafirma.springbookshop.interfaces.AuthorService;
import com.mojafirma.springbookshop.interfaces.PublisherService;
import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Category;
import com.mojafirma.springbookshop.model.Publisher;
import com.mojafirma.springbookshop.repository.AuthorRepository;
import com.mojafirma.springbookshop.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    @Override
    public void savePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public Publisher getPublisher(Long id) {
        return publisherRepository.findOne(id);
    }

    @Override
    public Publisher findById(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(
                () -> new CategoryNotFoundException(id)
        );
        return publisher;
    }
}
