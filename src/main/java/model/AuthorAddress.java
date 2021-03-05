package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AuthorAddressId.class)
public class AuthorAddress {

    @Id
    private Integer authorId;

    @Id
    private Integer addressId;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer bookId) {
        this.addressId = bookId;
    }

    public AuthorAddress(Integer authorId, Integer addressId) {
        this.authorId = authorId;
        this.addressId = addressId;
    }

    public AuthorAddress() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorAddress authorAddress = (AuthorAddress) o;
        return this.authorId.equals(authorAddress.authorId) &&
                this.addressId.equals(authorAddress.addressId);

    }
}
