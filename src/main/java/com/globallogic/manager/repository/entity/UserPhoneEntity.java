package com.globallogic.manager.repository.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "USER_PHONE")
@IdClass(UserPhoneEntityPK.class)
@EntityListeners(AuditingEntityListener.class)
public class UserPhoneEntity {
    private int idUserPhone;
    private UUID idUser;
    private int idPhone;
    private UserEntity userByIdUser;
    private PhoneEntity phoneByIdPhone;

    @Id
    @Column(name = "ID_USER_PHONE", nullable = false)
    public int getIdUserPhone() {
        return idUserPhone;
    }

    public void setIdUserPhone(int idUserPhone) {
        this.idUserPhone = idUserPhone;
    }

    @Id
    @Column(name = "ID_USER", nullable = false)
    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }


    @Id
    @Column(name = "ID_PHONE", nullable = false)
    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPhoneEntity that = (UserPhoneEntity) o;
        return idUserPhone == that.idUserPhone &&
                idPhone == that.idPhone &&
                idUser == that.idUser;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idUserPhone, idPhone);
        result = 31 * result + Objects.hash(idUser);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ID_USER", referencedColumnName = "ID_USER", nullable = false, insertable=false,
            updatable=false)
    public UserEntity getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(UserEntity userByIdUser) {
        this.userByIdUser = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "ID_PHONE", referencedColumnName = "ID_PHONE", nullable = false, insertable=false,
            updatable=false)
    public PhoneEntity getPhoneByIdPhone() {
        return phoneByIdPhone;
    }

    public void setPhoneByIdPhone(PhoneEntity phoneByIdPhone) {
        this.phoneByIdPhone = phoneByIdPhone;
    }
}
