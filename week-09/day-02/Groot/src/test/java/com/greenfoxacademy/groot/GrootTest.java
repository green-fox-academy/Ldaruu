package com.greenfoxacademy.groot;

import com.greenfoxacademy.groot.controllers.GuardianController;
import com.greenfoxacademy.groot.models.Groot;
import com.greenfoxacademy.groot.models.GrootError;
import com.greenfoxacademy.groot.services.GuardianServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)

public class GrootTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  // if an additional service layer is used
  // - meaning not all logic is added to the controller and you have Autowired fields in it -
  // then you have to mock out the service class like below
  //

  @MockBean
  private GuardianServices guardianServices;

  @Test
  public void returnGrootMessageIfWeHaveInput() throws Exception {
    String received = "hello";
    String translated = "I am Groot!";

    when(guardianServices.getmessage(received)).thenReturn(new Groot(received));

    mockMvc.perform(get("/groot?message=" + received))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(received)))
        .andExpect(jsonPath("$.translated", is(translated)))
        .andDo(print());
  }

  @Test
  public void getErrorMessageWhenNoInput() throws Exception {
    String error = "I am Groot!";

    when(guardianServices.errormessage()).thenReturn(new GrootError(error));

    mockMvc.perform(get("/groot" ))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is(error)))
        .andDo(print());
  }

}
