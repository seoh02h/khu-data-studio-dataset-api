package com.seoh.khudatastudiomanageapi.dto;

import com.seoh.khudatastudiomanageapi.model.Dataset;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.simple.JSONArray;

public class DatasetResponse {

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Get {

    private Long id;

    private String name;

    private String host;

    private String port;

    private String db;

    private String userName;

    private String password;

    private String tableName;

    public static Get of(Dataset dataset) {
      return Get.builder()
          .id(dataset.getId())
          .name(dataset.getName())
          .host(dataset.getHost())
          .port(dataset.getPort())
          .userName(dataset.getUserName())
          .password(dataset.getPassword())
          .db(dataset.getDb())
          .tableName(dataset.getTableName())
          .build();
    }
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class GetId {

    private Long id;

    public static GetId of(Dataset dataset) {
      return GetId.builder()
          .id(dataset.getId())
          .build();
    }
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class GetList {

    private Long id;

    private String name;

    private String host;

    private String port;

    private String db;

    private String tableName;

    public static GetList of(Dataset dataset) {
      return GetList.builder()
          .id(dataset.getId())
          .name(dataset.getName())
          .host(dataset.getHost())
          .port(dataset.getPort())
          .db(dataset.getDb())
          .tableName(dataset.getTableName())
          .build();
    }
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Connect {

    private Boolean isConnected;

    private String message;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class GetData {

    private List<ColumnInfo> column;

    private JSONArray data;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ColumnInfo {
    private String name;
    private String type;
  }


}
