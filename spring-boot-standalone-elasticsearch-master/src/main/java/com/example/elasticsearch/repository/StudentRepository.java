package com.example.elasticsearch.repository;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.elasticsearch.model.Student;


@Repository
 public interface StudentRepository extends ElasticsearchRepository<Student, Integer> {

}
