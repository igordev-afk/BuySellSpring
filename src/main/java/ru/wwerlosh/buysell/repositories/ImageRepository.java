package ru.wwerlosh.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wwerlosh.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
