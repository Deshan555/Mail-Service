package com.thaprobane.mailapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}


