package com.example.javaswacities.repositories;


import com.example.javaswacities.model.Mountain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountainRepository extends JpaRepository<Mountain, String> {

}
