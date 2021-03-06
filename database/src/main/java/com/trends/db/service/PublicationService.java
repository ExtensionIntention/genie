package com.trends.db.service;

import com.trends.db.model.Publication;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface PublicationService {

  Optional<Publication> findPublicationsById(final String id);

  Set<Publication> findPublicationsByKeyword(final String keyword);

  List<Publication> findAllPublications();

  void savePublications(final Set<Publication> publications);

  void savePublication(final Publication publication);

  void updatePublication(final Publication publication);
}
