package com.trends.db.service.impl;

import com.trends.db.dao.PublicationRepo;
import com.trends.db.model.Publication;
import com.trends.db.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PublicationServiceImpl implements PublicationService {

  @Autowired
  private PublicationRepo dao;

  @Override
  public Optional<Publication> findPublicationsById(final String id) {

    return dao.findById(id);
  }

  @Override
  public Set<Publication> findPublicationsByKeyword(final String keyword) {

    return dao.findPublicationsByKeywords(keyword);
  }

  @Override
  public List<Publication> findAllPublications() {

    return findAllPublications();
  }

  @Override
  public void savePublications(final Set<Publication> publications) {

    dao.insert(publications);
  }

  @Override
  public void savePublication(final Publication publication) {

    dao.insert(publication);
  }

  @Override
  public void updatePublication(final Publication publication) {

    dao.insert(publication);
  }
}
