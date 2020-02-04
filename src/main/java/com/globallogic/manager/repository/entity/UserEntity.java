package com.globallogic.manager.repository.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "USER")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
    private UUID idUser;
    private String name;
    private String email;
    private String password;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date modified;

    private Date lastLogin;
    private String token;
    private String active;

    private Collection<UserPhoneEntity> userPhonesByIdUser;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ID_USER", updatable = false, nullable = false)
    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "CREATED", nullable = false)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Basic
    @Column(name = "MODIFIED", nullable = false)
    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Basic
    @Column(name = "LAST_LOGIN", nullable = false)
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "TOKEN", nullable = false, length = 200)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "ACTIVE", nullable = false, length = 1)
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(idUser, that.idUser) &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(lastLogin, that.lastLogin) &&
                Objects.equals(token, that.token) &&
                Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, email, password, created, modified, lastLogin, token, active);
        result = 31 * result + Objects.hashCode(idUser);
        return result;
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<UserPhoneEntity> getUserPhonesByIdUser() {
        return userPhonesByIdUser;
    }

    public void setUserPhonesByIdUser(Collection<UserPhoneEntity> userPhonesByIdUser) {
        this.userPhonesByIdUser = userPhonesByIdUser;
    }
}
