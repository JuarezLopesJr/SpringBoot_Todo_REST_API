package com.example.todo

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/* findAll(), save() and deleteById() are all methods from the CrudRepository that
*  the TaskRepository interface extends from
*/

@Service
@Transactional
class TaskService(val repository: TaskRepository) {
    fun getAll() = repository.findAll()

    fun save(task: Task) = repository.save(task)

    fun delete(id: Long): Boolean {
        val found = repository.existsById(id)
        if (found) {
            repository.deleteById(id)
        }
        return found
    }
}