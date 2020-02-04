package com.globallogic.manager.repository.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "PHONE")
@EntityListeners(AuditingEntityListener.class)
public class PhoneEntity {
    private int idPhone;
    private String number;
    private String cityCode;
    private String countryCode;
    private Collection<UserPhoneEntity> userPhonesByIdPhone;

    @Id
    @Column(name = "ID_PHONE", nullable = false)
    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    @Basic
    @Column(name = "NUMBER", nullable = false, length = 50)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "CITY_CODE", nullable = false, length = 2)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "COUNTRY_CODE", nullable = false, length = 2)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntity that = (PhoneEntity) o;
        return idPhone == that.idPhone &&
                Objects.equals(number, that.number) &&
                Objects.equals(cityCode, that.cityCode) &&
                Objects.equals(countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPhone, number, cityCode, countryCode);
    }

    @OneToMany(mappedBy = "phoneByIdPhone")
    public Collection<UserPhoneEntity> getUserPhonesByIdPhone() {
        return userPhonesByIdPhone;
    }

    public void setUserPhonesByIdPhone(Collection<UserPhoneEntity> userPhonesByIdPhone) {
        this.userPhonesByIdPhone = userPhonesByIdPhone;
    }
}
