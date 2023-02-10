package com.fscut.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(appliesTo = "user_base",comment = "用户基础表")
@javax.persistence.Table(name = "user_base")
public class UserBase {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) NOT NULL COMMENT '主键'")
    private Integer id;

    @Column(columnDefinition = "varchar(30) DEFAULT '' COMMENT '姓名'")
    private String name;
}
