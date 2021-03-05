package model;

import java.io.Serializable;
import java.util.Objects;

public class AuthorAddressId implements Serializable {

    private Integer authorId;
    private Integer addressId;

    public AuthorAddressId() {
    }

    public AuthorAddressId(Integer authorId, Integer addressId) {
        this.authorId = authorId;
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorAddressId authorAddressId = (AuthorAddressId) o;
        return this.authorId.equals(authorAddressId.authorId) &&
                this.addressId.equals(authorAddressId.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.authorId, this.addressId);
    }
}
