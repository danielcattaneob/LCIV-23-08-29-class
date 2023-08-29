package ar.edu.utn.frc.tup.lciii.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testFirstEndpointCase1() throws Exception {
        String expectedResponse_1 = """
                {
                  "model": "Gol",
                  "brand": "Volkswagen",
                  "local_price": 7300000
                }
                """;

        mockMvc.perform(get("/api/v1/cars/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expectedResponse_1));
    }

    @Test
    public void testFirstEndpointCase2() throws Exception {
        String expectedResponse_2 = """
                {
                  "model": "Gol",
                  "brand": "Volkswagen",
                  "local_price": 7300000
                }
                """;

        mockMvc.perform(get("/api/v1/cars/2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expectedResponse_2));
    }

    @Test
    public void testFirstEndpointCase3() throws Exception {
        String expectedResponse_3 = """
                {
                  "model": "Uno",
                  "brand": "Fiat",
                  "local_price": 6075000
                }
                """;

        mockMvc.perform(get("/api/v1/cars/3"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(expectedResponse_3));
    }
}
