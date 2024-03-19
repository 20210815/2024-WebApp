package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
//퍼시스턴스 계층, 비즈니스 계층에서 사용되는 데이터
public class TodoEntity {
  private String id;
  private String userId;
  private String title;
  private boolean done;
}
