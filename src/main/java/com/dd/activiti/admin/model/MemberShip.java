package com.dd.activiti.admin.model;

import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

  class MemberIdClass implements Serializable  { private static final long serialVersionUID = 1L;
      //@Id
      @ApiModelProperty(value = "用户编号")
      @Column(name = "USER_ID_", nullable = true)
      private String userId;
      // @Id
      @ApiModelProperty(value = "角色编号")
      @Column(name = "GROUP_ID_", nullable = true)
      private String groupId;

    public MemberIdClass() {
    }

    public MemberIdClass(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
        //  this.timestamp = timestamp;
    }
}
@Entity
@Table(name = "ACT_ID_MEMBERSHIP")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Api("用户角色表")
//@IdClass(MemberIdClass.class)
public class MemberShip  {
    @ApiModelProperty(value = "编号")
    @Id
   // @Transient
    @Column(name = "ID_", nullable = true)
    private int id;

    @ApiModelProperty(value = "用户表")
    @Transient
    private User user; // 用户

    @ApiModelProperty(value = "角色表")
    @Transient
    private Group group; // 角色

   // @Id
    @ApiModelProperty(value = "用户编号")
    @Column(name = "USER_ID_", nullable = true)
    private String userId;
   // @Id
    @ApiModelProperty(value = "角色编号")
    @Column(name = "GROUP_ID_", nullable = true)
    private String groupId;
}
