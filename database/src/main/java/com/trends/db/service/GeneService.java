package com.trends.db.service;

import com.trends.db.model.Gene;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface GeneService {

  Optional<Gene> findGenesById(final String id);

  Set<Gene> findGenesByKeyword(final String keyword);

  List<Gene> findAllGenes();

  void saveGenes(final Set<Gene> genes);

  void saveGene(final Gene gene);

  void updateGene(final Gene gene);
}
