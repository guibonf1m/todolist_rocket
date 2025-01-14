package br.com.guibonfim.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findAllById(UUID id);

    List<TaskModel> findByIdUser(UUID idUser);
}