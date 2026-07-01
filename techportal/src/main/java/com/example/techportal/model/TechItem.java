package com.example.techportal.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechItem {
    private Long recordId;
    private String moduleName;
    private String moduleDescription;
    private String currentStatus;
}