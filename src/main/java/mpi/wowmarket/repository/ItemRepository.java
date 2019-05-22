package mpi.wowmarket.repository;

import mpi.wowmarket.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
