package tech.jhipster.lite.generator.history.domain;

import tech.jhipster.lite.generator.project.domain.Project;

public interface GeneratorHistoryService {
  GeneratorHistoryData getHistoryData(Project project);

  void addHistoryValue(Project project, GeneratorHistoryValue generatorHistoryValue);
}
