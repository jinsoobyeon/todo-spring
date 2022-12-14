package com.server.todo.dao;

import java.util.List;

import com.server.todo.dto.TodoDto;

public interface ITodoDao {
	int todoInsert(TodoDto todoDto);
	List<TodoDto> todoSelect(TodoDto todoDto);
	List<TodoDto> todosSelect();
	int todoDelete(TodoDto todoDto);
	int todosDelete();
}
