package com.hubspot.mesos;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.Beta;

import io.swagger.v3.oas.annotations.media.Schema;

@Beta
@Schema(description = "Describes a host path to be mounted in a docker container")
public class SingularityHostPath {
  private final String path;

  @JsonCreator
  public SingularityHostPath(@JsonProperty("path") String path) {
      this.path = path;
  }

  @Schema(description = "Host path to be mounted", example = "/var/run/docker.sock")
  public String getPath() {
      return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingularityHostPath that = (SingularityHostPath) o;
    return Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(path);
  }

  @Override
  public String toString() {
    return "SingularityHostPath{" +
      "path='" + path + '\'' +
      '}';
  }
}
