package com.REST.cinema.features.pricelist;

import com.REST.cinema.features.show.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricelistRepository extends JpaRepository<Pricelist, Long> {
}
