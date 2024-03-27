package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ResponseDTO<T> { //자바 generic 이용함, 어떤 원소의 타입 리스트도 반환할 수 있도록 함.
    private String error;
    private List<T> data; //T 타입의 원소 여러 개를 담고 있음.
}
