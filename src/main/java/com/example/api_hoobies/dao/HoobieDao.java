package com.example.api_hoobies.dao;
import com.example.api_hoobies.models.Hoobie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoobieDao extends JpaRepository<Hoobie, Long> {

}
