package mpi.wowmarket.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum UserRole {
    BUYER,
    SELLER,
    PROFESSIONAL,
    ADMIN
}
