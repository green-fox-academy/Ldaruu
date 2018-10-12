package com.greenfoxacademy.advancedtodo;

import com.greenfoxacademy.advancedtodo.controllers.TodoRestController;
import com.greenfoxacademy.advancedtodo.models.Todo;
import com.greenfoxacademy.advancedtodo.repositories.TodoRepository;
import com.greenfoxacademy.advancedtodo.services.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.modelmapper.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({TodoRestController.class, TodoRepository.class})
public class AuthenticationTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Mock
  private TodoRepository todoRepository;

  @MockBean
  private TodoService todoService;

  @Test
  public void notExistingPage_shouldReturnWith401() throws Exception {

    mockMvc.perform(get("/index"))
        .andExpect(status().is(401));
  }

  @Test
  public void givenNoUser_shouldReturnWith401() throws Exception {

    mockMvc.perform(get("/api/add"))
        .andExpect(status().is(401));
  }
  @Test
  @WithMockUser(username = "ADMIN", password = "{noop}password")
  public void givenAdminUser_whenShowList_thenOkAndData() throws Exception {

    String title = "Work Please";

    Todo newTodo = new Todo(title);
    todoRepository.save(newTodo);
    List<Todo> todos = new ArrayList<>();
    todos.add(newTodo);

    List<Todo> todos1 = todoRepository.findAll();
    when(todoService.getAlltodos()).thenReturn(todos1);

    mockMvc.perform(MockMvcRequestBuilders.get("/api/list")
        .accept(MediaType.ALL))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect((ResultMatcher) jsonPath("$.title", is(title)))
        .andDo(print());


  }

}