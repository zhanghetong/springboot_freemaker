package com.example.springboot_freemaker.entity;

import lombok.*;

/**
 * @author hetong.zhang
 * @version 1.0
 * @date 2021/1/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private int id;
    private String name;
    private int age;
}
