package com.globallogic.manager.repository.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
public class UserPhoneEntityPK implements Serializable {
    private int idUserPhone;
    private UUID idUser;
    private int idPhone;

    @Column(name = "ID_USER_PHONE", nullable = false)
    @Id
    public int getIdUserPhone() {
        return idUserPhone;
    }

    public void setIdUserPhone(int idUserPhone) {
        this.idUserPhone = idUserPhone;
    }

    @Column(name = "ID_USER", nullable = false)
    @Id
    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }



    @Column(name = "ID_PHONE", nullable = false)
    @Id
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
        UserPhoneEntityPK that = (UserPhoneEntityPK) o;
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
}
