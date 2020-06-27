package com.example.todo

import org.springframework.data.repository.CrudRepository

/* Task is the type of the entity and Long is the type of the primary key */
interface TaskRepository : CrudRepository<Task, Long>