package pl.pawelec.springmicroservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.pawelec.springmicroservices.controller.BasicController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BasicController.class)
public class BasicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void welcome() throws Exception{
        mockMvc.perform( MockMvcRequestBuilders.get("/welcome").accept(MediaType.APPLICATION_JSON) )
                .andExpect( status().isOk() )
                .andExpect( content().string("Hello World"));
    }
}
