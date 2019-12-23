package com.hwua.domain;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foods {
    private Integer id;
    private String foodnames;
}