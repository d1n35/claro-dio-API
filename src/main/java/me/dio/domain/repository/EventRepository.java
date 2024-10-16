package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.domain.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
