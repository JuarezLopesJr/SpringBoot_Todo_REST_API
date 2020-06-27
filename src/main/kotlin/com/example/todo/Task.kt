package com.example.todo

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue

@Entity(name = "task")
data class Task(
        @Id
        @GeneratedValue
        val id: Long,

        val description: String
)