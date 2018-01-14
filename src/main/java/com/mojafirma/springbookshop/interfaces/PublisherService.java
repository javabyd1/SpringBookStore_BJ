package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> getAllPublishers();
    void savePublisher(Publisher publisher);
    Publisher getPublisher(Long id);
    Publisher findById(Long id);
}
